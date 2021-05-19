grammar Gramatica;

r: program+;

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

sent: type lid faltaPuntoYComa
|
IDENTIFICADOR sentPrima
|
'return' exp ';'
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

lid : IDENTIFICADOR lidPrima;

lidPrima : | ',' lid;

asig : '=' | '+=' | '-=' | '*=' | '/=';

exp :
IDENTIFICADOR expPrima expPrimaPrima
|
'(' exp ')' expPrimaPrima
|
CONSTENTERO expPrimaPrima
|
CONSTREAL expPrimaPrima
|
CONSTLIT expPrimaPrima;

expPrima: '(' lid ')' | ;

expPrimaPrima: op exp expPrimaPrima | ;

op : '+' | '-' | '*' | '/';

lcond : cond lcondPrima | 'no' cond lcondPrima;

lcondPrima: opl lcond lcondPrima | ;

cond : exp opr exp | 'cierto' | 'falso';

opl : 'y' | 'o';

//----------------------------------------------------------------------------------------------------

// Tratamiento del segundo error sintáctico (Operador relacional de igualdad incorrecto)

// Regla original

// opr: '==' | '<>' | '<' | '>' | '>=' | '<=';

opr: '=' operadorIgualdadErroneo | '<>' | '<' | '>' | '>=' | '<=';

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