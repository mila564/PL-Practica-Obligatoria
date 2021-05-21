grammar Gramatica;

@header{
    package especificacion;
}

@parser::members{
    private Program programa;

    public GramaticaParser (TokenStream input, Program prog){
        this(input);
        programa = prog;
    }
}

r: program;

program returns [Program s]:
    part programPrima {$s = $programPrima.s.getSubprogramas().add($part.s);}
    ;

programPrima returns [Program s]:
    program {$s = $program.s;}
    |

    ;

part returns [Part s]:
    'funcion' type restpart [new Funcion(new PalabraReservada($type.s))]{$s = $restpart.s;}
    |
    'procedimiento' restpart [new Procedimiento();]{$s = $restpart.s;}
    ;

restpart [Part h] returns [Part s]:
    IDENTIFICADOR '(' restpartPrima[$h.setIdentificador(new Identificador($IDENTIFICADOR.text))]{$s = $restpartPrima.s;}
    ;

//--------------------------------------------------------------------------------------------------

// Tratamiento del primer error sintáctico (Más de 1 paréntesis)

// Regla original

//restpartPrima: listparam ')' blq | ')' blq;

restpartPrima [Part h] returns [Part s]:
    listparam ')' masDeUnParentesis blq{
        $h.setListParam($listparam.s);
        $h.setCuerpo($blq.s);
        $s = $h;
    }
    |
    ')' masDeUnParentesis blq {
        $h.setListParam(new ArrayList<Param>());
        $h.setCuerpo($blq.s);
        $s = $h;
    }
    ;

masDeUnParentesis:
    ')' masDeUnParentesis{notifyErrorListeners("Demasiados paréntesis");}
    |

    ;

//--------------------------------------------------------------------------------------------------

listparam returns [List<Param> s]:
    type IDENTIFICADOR listparamPrima {$s = $listparamPrima.s.addFirst(new Param(new PalabraReservada($type.s), new Identificador($IDENTIFICADOR.text)));}
    ;

listparamPrima returns [List<Param> s]:
    ',' type IDENTIFICADOR listparamPrima {$s = $listparamPrima.s.addFirst(new Param(new PalabraReservada($type.s), new Identificador($IDENTIFICADOR.text)));}
    |
    {$s =  new ArrayList<Param>();}
    ;

type returns [String s]:
     ent = 'entero'{$s = $ent.text;}
     |
     real = 'real'{$s = $real.text;}
     |
     letra = 'caracter'{$s = $letra.text;}
     ;

blq returns [Blq s]:
    'inicio' sentlist 'fin' {$s = new Blq($sentlist.s);}
    ;

sentlist returns [List<Sent> s]:
    sent sentlistPrima {$s = $sentlistPrima.s.addFirst($sent.s);}
    ;

sentlistPrima returns [List<Sent> s]:
    sent sentlistPrima {$s = $sentlistPrima.s.addFirst($sent.s);}
    |
    {$s = new ArrayList<Sent>();}
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

faltaPuntoYComa : ';' | {notifyErrorListeners("Falta punto y coma.");};

// Sustituimos en todas las apariciones del ;

//----------------------------------------------------------------------------------------------------

sent returns [Sent s]:
    type lid faltaPuntoYComa {$s = new DeclaracionVariable(new PalabraReservada($type.s), $lid.s);}
    |
    IDENTIFICADOR sentPrima {
        if($sentPrima.s instanceOf Asignacion){
            Asignacion asig = (Asignacion)$sentPrima.s;
            asig.setIdentificador(new Identificador($IDENTIFICADOR.text));
            $s = asig;
        }
        else{
            LlamadaProcedimientoSent llamada = (LlamadaProcedimientoSent) $sentPrima.s;
            llamada.getIdentificadores().addFirst(new Identificador($IDENTIFICADOR.text));
            $s = llamada;
        }
    }
    |
    'return' exp faltaPuntoYComa {$s = new Return($exp.s);}
    // Falta explicar en la memoria que en error3.txt da error porque interpreta hasta el ; sin cerrar
    |
    'bifurcacion' '(' lcond ')' faltaPalabraReservadaEntonces blq1=blq 'sino' blq2=blq {$s = new Bifurcacion($lcond.s, $blq1.s, $blq2.s);}
    |
    'bifurcacio' '(' lcond ')' faltaPalabraReservadaEntonces blq1=blq 'sino' blq2=blq {$s = new Bifurcacion($lcond.s, $blq1.s, $blq2.s); notifyErrorListeners("Palabra reservada 'bifurcacion' mal escrita");}
    |
    'buclepara' '(' id1=IDENTIFICADOR asig1=asig exp1=exp faltaPuntoYComa lcond faltaPuntoYComa id2=IDENTIFICADOR asig2=asig exp2=exp ')' blq{$s = new Buclepara(new Identificador($id1.text), $asig1.s, $exp1.s, $lcond.s, new Identificador($id2.text), $asig2.s, $exp2.s, $blq.s);}
    |
    'buclemientras' '(' lcond ')' blq {$s = new Buclemientras($lcond.s, $blq.s);}
    |
    'bucle' blq 'hasta' '(' lcond ')' {$s = new Bucle($blq.s, $lcond.s);}
    |
    blq {$s = $blq.s;}
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

faltaPalabraReservadaEntonces : 'entonces' | {notifyErrorListeners("Falta la palabra reservada entonces");};

//----------------------------------------------------------------------------------------------------

sentPrima returns [Sent s]:
    asig exp faltaPuntoYComa {$s = new Asignacion(null, $asig.s, $exp.s);}
    |
    '(' sentPrimaPrima {$s = new LlamadaProcedimientoSent($sentPrimaPrima.s);}
    ;

sentPrimaPrima returns [List<Identificador> s]:
    lid ')' faltaPuntoYComa {$s = $lid.s;}
    |
    ')' faltaPuntoYComa {$s = new ArrayList<Identificador>();}
    ;

lid returns [List<Identificador> s]:
    IDENTIFICADOR lidPrima {$s = $lidPrima.s.addFirst(new Identificador($IDENTIFICADOR.text));}
    ;

lidPrima returns [List<Identificador> s]:
    ',' lid {$s = $lid.s;}
    |
    {$s = new ArrayList<Identificador>();}
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
    IDENTIFICADOR expPrima expPrimaPrima {$s = new Exp(new LlamadaProcedimientoExp($expPrima.s.addFirst(new Identificador($IDENTIFICADOR.text)), $expPrimaPrima.s));}
    |
    '(' exp ')' expPrimaPrima {$s = new Exp(new ExpConParentesis($exp.s), $expPrimaPrima.s);}
    |
    CONSTENTERO expPrimaPrima {$s = new Exp(new Constante($CONSTENTERO.text), $expPrimaPrima.s);}
    |
    CONSTREAL expPrimaPrima {$s = new Exp(new Constante($CONSTREAL.text), $expPrimaPrima.s);}
    |
    CONSTLIT expPrimaPrima {$s = new Exp(new Constante($CONSTLIT.text), $expPrimaPrima.s);}
    ;

expPrima returns [List<Identificador> s]:
    '(' lid ')' {$s = $lid.s;}
     |
     {$s = new ArrayList<Identificador>();}
     ;

expPrimaPrima returns [List<ExpRecursivo> s]:
    op exp expPrimaPrima {$s = $expPrimaPrima.s.addFirst(new ExpRecursivo($op.s, $exp.s));}
    |
    {$s = new ArrayList<ExpRecursivo>();}
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

lcond returns [LCond s]:
    cond lcondPrima {$s = new Lcond(false, $cond.s, $lcondPrima.s);}
    |
    'no' cond lcondPrima {$s = new Lcond(true, $cond.s, $lcondPrima.s);}
    ;

lcondPrima returns [LcondRecursivo s]:
    opl lcond lcondPrima {$s = new LcondRecursivo ($opl.s, $lcond.s, $lcondPrima.s);}
    |
    {$s = null;};

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

operadorIgualdadErroneo : '=' | {notifyErrorListeners("No es un operador relacional");};

//----------------------------------------------------------------------------------------------------

IDENTIFICADOR : ([a-zA-Z]|'_')([a-zA-Z]|'_'|[0-9])*;

CONSTENTERO : (([+-]?[0-9]+)|('$'[+-]?[0-9A-F]+));

CONSTREAL : ([+-]?[0-9]+'.'[0-9]+)|('$'[+-]?[0-9A-F]+'.'[0-9A-F]+);

CONSTLIT: (('"' ('""'|~'"')* '"' )| (['](~[']|[']['])*[']));

WS: (' ' | '\n' | '\r' | '\t' | ('%%' ~('\n')* '\n') | ('%-' ((~('-')) | '-'~('%'))* '-%')) -> skip;

ERRORCOMENT: ('%-' ((~('-')) | '-'~('%'))*) EOF{
    System.err.println("Error léxico: Comentario multilinea sin cierre");
};

ERRORLIT: (('"' ('""'|~'"')*)| (['](~[']|[']['])*) EOF){
    System.err.println("Error léxico: Cadena sin cerrar");
};

ERRORNUM: ('.' ([+-]?[0-9]+) | ('$'[+-]?[0-9A-F]+)){
    System.err.println("Error léxico: " + getText() + " no es un número");
};