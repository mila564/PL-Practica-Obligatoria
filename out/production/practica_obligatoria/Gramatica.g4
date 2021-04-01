grammar Gramatica;

r: program+;

program : part programPrima;

programPrima : program | ;

part :  'funcion' type restpart | 'procedimiento' restpart;

restpart : IDENTIFICADOR '(' restpartPrimaIntermedia;

restpartPrimaIntermedia : (listparam | ) ')' (restpartPrima | frestpartPrima);

restpartPrima :  blq | fblqFaltaInicio | fblqFaltaFin;

frestpartPrima : ')'+ restpartPrima{
    notifyErrorListeners("Demasiados paréntesis");
};

listparam : type IDENTIFICADOR listparamPrima;

listparamPrima : ',' type IDENTIFICADOR listparamPrima	| ;

type : 'entero' | 'real' | 'caracter';

blq : 'inicio' sentlist 'fin';

fblqFaltaInicio : sentlist 'fin'{
    notifyErrorListeners("Falta palabra reservada inicio");
};

fblqFaltaFin : 'inicio' sentlist{
    notifyErrorListeners("Falta palabra reservada fin");
};

sentlist : sent sentlistPrima;

sentlistPrima : sent sentlistPrima | ;

sent
    : type lid fsent
    | IDENTIFICADOR sentPrima
    | 'return' exp fsent
    |'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
    |'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')'blq
    |'buclemientras' '(' lcond ')' blq
    | 'bucle' blq 'hasta' '(' lcond ')'
    | blq
    ;

fsent
    : ';'
    | {notifyErrorListeners("Falta punto y coma");}
    ;

sentPrima : asig exp ';' | '(' sentPrimaPrima;

sentPrimaPrima : lid ')' ';'| ')' ';';

lid : IDENTIFICADOR lidPrima;

lidPrima : | ',' lid;

asig : '=' | '+=' | '-=' | '*=' | '/=';

exp : CONSTENTERO expPrima | CONSTREAL expPrima | CONSTLIT expPrima | '(' exp ')' expPrima | IDENTIFICADOR expPrimaPrima expPrima;

expPrima : op exp | ;

expPrimaPrima :	'(' lid ')'	| ;

op : '+' | '-' | '*' | '/';

lcond : (cond | 'no' cond) lcondPrima;

lcondPrima : opl lcond lcondPrima | ;

cond : exp opr exp | 'cierto' | 'falso';

opl : 'y' | 'o';

opr : '==' | '<>' | '<' | '>' | '>=' | '<=';

IDENTIFICADOR : ([a-zA-Z]|'_')([a-zA-Z]|'_'|[0-9])*;

CONSTENTERO : (([+-]?[0-9]+)|('$'[+-]?[0-9A-F]+));

CONSTREAL : ([+-]?[0-9]+'.'[0-9]+)|('$'[+-]?[0-9A-F]+'.'[0-9A-F]+);

CONSTLIT: (('"' ('""'|~'"')* '"' )| (['](~[']|[']['])*[']));

WS: (' ' | '\n' | '\r' | '\t' | ('%%' ~('\n')* '\n') | ('%-' ((~('-')) | '-'~('%'))* '-%')) -> skip;

ERRORCOMENT: ('%-' ((~('-')) | '-'~('%'))*) EOF{
    System.err.println("Comentario multilinea sin cierre");
};

ERRORLIT: (('"' ('""'|~'"')*)| (['](~[']|[']['])*) EOF){
    System.err.println("Cadena sin cerrar");
};

ERRORNUM: ('.' ([+-]?[0-9]+) | ('$'[+-]?[0-9A-F]+)){
    System.err.println("No es un número");
};