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

program : part programPrima;

programPrima : program | ;

part : 'funcion' type restpart | 'procedimiento' restpart;

restpart: IDENTIFICADOR '(' restpartPrima;

//--------------------------------------------------------------------------------------------------

// Tratamiento del primer error sintáctico (Más de 1 paréntesis)

// Regla original

//restpartPrima: listparam ')' blq | ')' blq;

restpartPrima: listparam ')' masDeUnParentesis blq | ')' masDeUnParentesis blq;

masDeUnParentesis :  | ')' masDeUnParentesis{notifyErrorListeners("Demasiados paréntesis");};

//--------------------------------------------------------------------------------------------------

listparam : type IDENTIFICADOR listparamPrima;

listparamPrima : ',' type IDENTIFICADOR listparamPrima	| ;

type : 'entero' | 'real' | 'caracter';

blq : 'inicio' sentlist 'fin';

sentlist : sent sentlistPrima;

sentlistPrima : sent sentlistPrima | ;

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

sent: type lid faltaPuntoYComa //  1_ Declaraciones de variables
|
IDENTIFICADOR sentPrima // 2_ Sentencias de asignación y 3_ Llamadas a procedimientos
|
'return' exp faltaPuntoYComa  // 4_ especificacion.Return
// Falta explicar en la memoria que en error3.txt da error porque interpreta hasta el ; sin cerrar
|
'bifurcacion' '(' lcond ')' faltaPalabraReservadaEntonces blq 'sino' blq
|
'bifurcacio' '(' lcond ')' faltaPalabraReservadaEntonces blq 'sino' blq {notifyErrorListeners("Palabra reservada 'bifurcacion' mal escrita");}
|
'buclepara' '(' IDENTIFICADOR asig exp faltaPuntoYComa lcond faltaPuntoYComa IDENTIFICADOR asig exp ')' blq
|
'buclemientras' '(' lcond ')' blq
|
'bucle' blq 'hasta' '(' lcond ')'
|
blq;

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

sentPrima: asig exp faltaPuntoYComa | '(' sentPrimaPrima;

sentPrimaPrima : lid ')' faltaPuntoYComa | ')' faltaPuntoYComa;

lid returns [List<Identificador> s]:
    IDENTIFICADOR lidPrima {$s = $lidPrima.s.addFirst(new Identificador($IDENTIFICADOR.text));}
    ;

lidPrima returns [List<Identificador> s]:
    ',' lid {$s = $lid.s;}
    |
    {$s = new ArrayList<Identificador>();}
    ;

asig : '=' | '+=' | '-=' | '*=' | '/=';

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

op : '+' | '-' | '*' | '/';

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