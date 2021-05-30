grammar Gramatica;

@header{
    import especificacion.*;
    import java.util.*;
    import java.io.*;
}

@parser::members{
    private Program programa;
    private boolean tieneErrores = false;
    private int numPrincipal = 0;
    private Part metodoPrincipal;
    public GramaticaParser (TokenStream input, Program prog){
        this(input);
        programa = prog;
    }
}

// Caracteres unicode usados en los Strings
// \u00e1 = á
// \u00e9 = é
// \u00ed = í
// \u00f3 = ó
// \u+00fa = ú

r: program[programa]{
    if(!tieneErrores && (numPrincipal <= 1)){
        File file = new File("salida.html");
        try{
            file.createNewFile();
        }catch (IOException e1){
            e1.printStackTrace();
        }
        try{
            PrintWriter pw = new PrintWriter(file);
            if(numPrincipal == 1){
                LinkedList<Part> listaPart = (LinkedList)$program.s.getSubprogramas();
                listaPart.addFirst(metodoPrincipal);
            }
            pw.println($program.s.toString());
            pw.flush();
            pw.close();
        }catch (IOException e){
          e.printStackTrace();
        }
    }
    else if (numPrincipal > 1){
        notifyErrorListeners("El programa contiene m" + "\u00e1" +"s de un subprograma denominado Principal");
    }
};

// Estas reglas son las que obtuvimos al aplicar el algoritmo para quitar la ambigüedad:
/*
program : part programPrima;

programPrima : program | ;
*/

// Sin embargo, nos dimos cuenta de que
// el árbol sintáctico resultante con las siguientes reglas
// se ajustaba adecuadamente a nuestra jerarquía de clases:

program [Program h] returns [Program s]:
    part programPrima {
        $programPrima.s.addFirst($part.s);
        $h.setSubprogramas($programPrima.s);
        $s = $h;
    }
    ;

programPrima returns [LinkedList<Part> s]:
    part programPrima {
    if($part.s.getIdentificador().getTexto().equals("Principal")){
        metodoPrincipal = $part.s;
    }
    else{
        $programPrima.s.addFirst($part.s);
    }
        $s = $programPrima.s;
    }
    |
    {$s = new LinkedList<Part>();}
    ;

part returns [Part s]:
    'funcion' type restpart [new Funcion(new PalabraReservada($type.s))]{$s = $restpart.s;}
    |
    'procedimiento' restpart [new Procedimiento()]{$s = $restpart.s;}
    ;

restpart [Part h] returns [Part s]:
    IDENTIFICADOR '('{$h.setIdentificador(new Identificador($IDENTIFICADOR.text)); if($IDENTIFICADOR.text.equals("Principal")) numPrincipal++; } restpartPrima[$h]{$s = $restpartPrima.s;}
    ;

//--------------------------------------------------------------------------------------------------

// Tratamiento del primer error sintáctico (Más de 1 paréntesis)

// Regla original

//restpartPrima: listparam ')' blq | ')' blq;

restpartPrima [Part h] returns [Part s]:
    ')' masDeUnParentesis blq[1] {
        $h.setListParam(new LinkedList<Param>());
        $h.setCuerpo($blq.s);
        $s = $h;
    }
    |
    listparam ')' masDeUnParentesis blq[1]{
        $h.setListParam($listparam.s);
        $h.setCuerpo($blq.s);
        $s = $h;
    }
    ;

masDeUnParentesis:
    ')' masDeUnParentesis{
        notifyErrorListeners("Demasiados par" + "\u00e9" + "ntesis"); tieneErrores = true;}
    |

    ;

//--------------------------------------------------------------------------------------------------

listparam returns [LinkedList<Param> s]:
    type IDENTIFICADOR listparamPrima {
        $listparamPrima.s.addFirst(new Param(new PalabraReservada($type.s), new Identificador($IDENTIFICADOR.text)));
        $s = $listparamPrima.s;
    }
    ;

listparamPrima returns [LinkedList<Param> s]:
    ',' type IDENTIFICADOR listparamPrima {
        $listparamPrima.s.addFirst(new Param(new PalabraReservada($type.s), new Identificador($IDENTIFICADOR.text)));
        $s = $listparamPrima.s;
    }
    |
    {$s =  new LinkedList<Param>();}
    ;

type returns [String s]:
     ent = 'entero'{$s = $ent.text;}
     |
     real = 'real'{$s = $real.text;}
     |
     letra = 'caracter'{$s = $letra.text;}
     ;

blq [int h] returns [Blq s]:
    'inicio' sentlist[$h] 'fin' {$s = new Blq($sentlist.s, $h);}
    ;

sentlist[int h] returns [LinkedList<Sent> s]:
    sent[$h+1] sentlistPrima[$h+1] {
        try{
            $sentlistPrima.s.addFirst($sent.s);
            $s = $sentlistPrima.s;
        }catch(NullPointerException e){ // Se lanza una excepción cuando se producen errores léxicos
            tieneErrores = true; // No se genera el HTML
            $s = new LinkedList<Sent>(); // El atributo sintetizado pasa a ser la lista vacía
        }
    }
    ;

sentlistPrima[int h] returns [LinkedList<Sent> s]:
    sent[$h] sentlistPrima[$h] {
        try{
            $sentlistPrima.s.addFirst($sent.s);
            $s = $sentlistPrima.s;
        }catch(NullPointerException e){ // Se lanza una excepción cuando se producen errores léxicos
            tieneErrores = true; // No se genera el HTML
            $s = new LinkedList<Sent>(); // El atributo sintetizado pasa a ser la lista vacía
        }
    }
    |
    {$s = new LinkedList<Sent>();}
    ;

//----------------------------------------------------------------------------------------------------

// Tratamiento del tercer error sintáctico (Falta punto y coma)

// Reglas originales

// sent : type lid ';'

// sent : 'return' exp ';'

// sent : 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')' blq ;

// sentPrima: asig exp ';'

// sentPrimaPrima : lid ')' ';' | ')' ';'

// Tratamiento:

// Creamos una nueva regla

faltaPuntoYComa : ';' | {
        notifyErrorListeners("Falta punto y coma"); tieneErrores = true;};

// Sustituimos en todas las apariciones del ;

//----------------------------------------------------------------------------------------------------

sent[int h] returns [Sent s]:
    type lid faltaPuntoYComa {$s = new DeclaracionVariable(new PalabraReservada($type.s), $lid.s);}
    |
    IDENTIFICADOR sentPrima[new Identificador($IDENTIFICADOR.text)] {$s = $sentPrima.s;}
    |
    'return' exp faltaPuntoYComa {$s = new Return($exp.s);}
    |
    'bifurcacion' '(' lcond ')' faltaPalabraReservadaEntonces blq1=blq[$h] 'sino' blq2=blq[$h] {$s = new Bifurcacion($lcond.s, $blq1.s, $blq2.s);}
    |
    'bifurcacio' '(' lcond ')' faltaPalabraReservadaEntonces blq[$h] 'sino' blq[$h] { notifyErrorListeners("Palabra reservada 'bifurcaci" + "\u00f3" + "n' mal escrita"); tieneErrores = true;}
    |
    'buclepara' '(' id1=IDENTIFICADOR asig1=asig exp1=exp faltaPuntoYComa lcond faltaPuntoYComa id2=IDENTIFICADOR asig2=asig exp2=exp ')' blq[$h]{$s = new Buclepara(new Identificador($id1.text), $asig1.s, $exp1.s, $lcond.s, new Identificador($id2.text), $asig2.s, $exp2.s, $blq.s);}
    |
    'buclemientras' '(' lcond ')' blq[$h] {$s = new Buclemientras($lcond.s, $blq.s);}
    |
    'bucle' blq[$h] 'hasta' '(' lcond ')' {$s = new Bucle($blq.s, $lcond.s);}
    |
    blq[$h] {$s = $blq.s;}
    ;

//----------------------------------------------------------------------------------------------------

// Tratamiento del cuarto error sintáctico (Palabra bifurcación mal escrita)

// Regla original (No desaparece):

// 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq

// Se añade : 'bifurcacio' '(' lcond ')' 'entonces' blq 'sino' blq entre los consecuentes de 'sent'

//----------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------

// Tratamiento del quinto error sintáctico (Falta palabra reservada 'entonces')

// Reglas originales

// 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq

// 'bifurcacio' '(' lcond ')' 'entonces' blq 'sino' blq {notifyErrorListeners("Palabra reservada 'bifurcacion' mal escrita");}

// Tenemos que crear una regla:

faltaPalabraReservadaEntonces : 'entonces' | {notifyErrorListeners("Falta la palabra reservada entonces"); tieneErrores = true;};

//----------------------------------------------------------------------------------------------------

sentPrima [Identificador h] returns [Sent s]:
    asig exp faltaPuntoYComa {$s = new Asignacion($h, $asig.s, $exp.s);}
    |
    '(' sentPrimaPrima {
        $sentPrimaPrima.s.addFirst($h);
        $s = new LlamadaProcedimientoSent($sentPrimaPrima.s);
    }
    ;

sentPrimaPrima returns [LinkedList<Identificador> s]:
    lid ')' faltaPuntoYComa {$s = $lid.s;}
    |
    ')' faltaPuntoYComa {$s = new LinkedList<Identificador>();}
    ;

lid returns [LinkedList<Identificador> s]:
    IDENTIFICADOR lidPrima{
        $lidPrima.s.addFirst(new Identificador($IDENTIFICADOR.text));
        $s = $lidPrima.s;
    }
    ;

lidPrima returns [LinkedList<Identificador> s]:
    ',' lid {$s = $lid.s;}
    |
    {$s = new LinkedList<Identificador>();}
    ;

asig returns [String s]:
    eq = '='{$s = $eq.text;}
     |
    sumAsig = '+='{$s = $sumAsig.text;}
     |
    subAsig = '-='{$s = $subAsig.text;}
     |
    mulAsig = '*='{$s = $mulAsig.text;}
     |
    divAsig = '/='{$s = $divAsig.text;}
     ;

exp returns [Exp s]:
    IDENTIFICADOR expPrima expPrimaPrima {
        $expPrima.s.addFirst(new Identificador($IDENTIFICADOR.text));
        $s = new Exp(new LlamadaProcedimientoExp($expPrima.s), $expPrimaPrima.s);
    }
    |
    '(' exp ')' expPrimaPrima {$s = new Exp(new ExpConParentesis($exp.s), $expPrimaPrima.s);}
    |
    CONSTENTERO expPrimaPrima {$s = new Exp(new Constante($CONSTENTERO.text), $expPrimaPrima.s);}
    |
    CONSTREAL expPrimaPrima {$s = new Exp(new Constante($CONSTREAL.text), $expPrimaPrima.s);}
    |
    CONSTLIT expPrimaPrima {$s = new Exp(new Constante($CONSTLIT.text), $expPrimaPrima.s);}
    ;

expPrima returns [LinkedList<Identificador> s, boolean s2]:
    '(' lid ')' {$s = $lid.s;}
     |
     {$s = new LinkedList<Identificador>();}
     ;

expPrimaPrima returns [LinkedList<ExpRecursivo> s]:
    op exp expPrimaPrima {
        $expPrimaPrima.s.addFirst(new ExpRecursivo($op.s, $exp.s));
        $s = $expPrimaPrima.s;
    }
    |
    {$s = new LinkedList<ExpRecursivo>();}
    ;

op returns [String s]:
    sum = '+' {$s = $sum.text;}
     |
    sub = '-'{$s = $sub.text;}
     |
    mul = '*'{$s = $mul.text;}
     |
    div = '/'{$s = $div.text;}
     ;

lcond returns [Lcond s]:
    cond lcondPrima {$s = new Lcond(false, $cond.s, $lcondPrima.s);}
    |
    'no' cond lcondPrima {$s = new Lcond(true, $cond.s, $lcondPrima.s);}
    ;

lcondPrima returns [LcondPrima s]:
    opl lcond lcondPrima {
        $lcondPrima.s.getLcondprima().addFirst(new LcondRecursivo($opl.s, $lcond.s));
        $s = $lcondPrima.s;
    }
    |
    {$s = new LcondPrima(new LinkedList<LcondRecursivo>());};

cond returns [Cond s]:
    e1=exp opr e2=exp{$s = new CondBooleanaCompleja($e1.s, $opr.s, $e2.s);}
    |
    c='cierto'{$s = new CondBooleanaSimple($c.text);}
    |
    f='falso'{$s = new CondBooleanaSimple($f.text);};

opl returns [String s]:
    y='y'{$s = $y.text;}
    |
    o='o'{$s = $o.text;};

//----------------------------------------------------------------------------------------------------

// Tratamiento del segundo error sintáctico (Operador relacional de igualdad incorrecto)

// Regla original

// opr: '==' | '<>' | '<' | '>' | '>=' | '<=';

opr returns [String s]:
    '=' operadorIgualdadErroneo {$s = "==";}
    |
    '<>' {$s = "<>";}
    |
    '<' {$s = "<";}
    |
    '>' {$s = ">";}
    |
    '>='{$s = ">=";}
    |
    '<='{$s = "<=";}
    ;

operadorIgualdadErroneo : '=' | {notifyErrorListeners("No es un operador relacional"); tieneErrores = true;};

//----------------------------------------------------------------------------------------------------

IDENTIFICADOR : ([a-zA-Z]|'_')([a-zA-Z]|'_'|[0-9])*;

CONSTENTERO : (([+-]?[0-9]+)|('$'[+-]?[0-9A-F]+));

CONSTREAL : ([+-]?[0-9]+'.'[0-9]+)|('$'[+-]?[0-9A-F]+'.'[0-9A-F]+);

CONSTLIT: (('"' ('""'|~'"')* '"' )| (['](~[']|[']['])*[']));

WS: (' ' | '\n' | '\r' | '\t' | ('%%' ~('\n')* '\n') | ('%-' ((~('-')) | '-'~('%'))* '-%')) -> skip;

ERRORCOMENT: ('%-' ((~('-')) | '-'~('%'))*) EOF{
    System.err.println("Error l"+ "\u00e9" + "xico: Comentario multil" + "\u00ed" + "nea sin cierre");
};

ERRORLIT: (('"' ('""'|~'"')*)| (['](~[']|[']['])*) EOF){
    System.err.println("Error l"+ "\u00e9" + "xico: Cadena sin cerrar");
};

ERRORNUM: ('.' ([+-]?[0-9]+) | ('$'[+-]?[0-9A-F]+)){
    System.err.println("Error l"+ "\u00e9" + "xico: " + getText() + " no es un n" + "\u00fa" + "mero");
};