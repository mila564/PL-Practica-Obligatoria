grammar Gramatica;

r: program+;

program : part programPrima;

programPrima : program | ;

part :  'funcion' type restpart | 'procedimiento' restpart;

restpart : IDENTIFICADOR '(' restpartPrimaIntermedia;

restpartPrimaIntermedia : (listparam | ) ')' (restpartPrima | frestpartPrima);

restpartPrima :  blq | fblqFaltaInicio;

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

sentlist : sent sentlistPrima;

sentlistPrima : sent sentlistPrima | ;

sent
    : type lid fsent
    | IDENTIFICADOR sentPrima
    | 'return' exp fsent
    |'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
    |'buclepara' '(' IDENTIFICADOR asig exp fsent lcond fsent IDENTIFICADOR asig exp ')' blq
    |'buclemientras' '(' lcond ')' blq
    | 'bucle' blq 'hasta' '(' lcond ')'
    | blq
    ;

fsent
    : ';'
    | {notifyErrorListeners("Falta punto y coma");}
    ;

sentPrima : asig exp fsent | '(' sentPrimaPrima;

sentPrimaPrima : lid ')' fsent | ')' fsent;

lid : IDENTIFICADOR lidPrima;

lidPrima : | ',' lid;

asig : '=' | '+=' | '-=' | '*=' | '/=';

exp : CONSTENTERO expPrimaPrima | CONSTREAL expPrimaPrima | CONSTLIT expPrimaPrima | '(' exp ')' expPrimaPrima | IDENTIFICADOR expPrima expPrimaPrima;

expPrima : | '(' lid ')';

expPrimaPrima : op exp expPrima | ;

op : '+' | '-' | '*' | '/';

lcond :  lcondPrima lcondPrimaPrima;

lcondPrima : cond | 'no' cond;

lcondPrimaPrima : opl lcond lcondPrima | ;

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
    System.err.println(getText() + " no es un número");
};