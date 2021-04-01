grammar Gramatica;

r: program+;

program : (part | fpart) programPrima;

programPrima : program | ;

part :  'funcion' type restpart | 'procedimiento' restpart;

fpart: 'funcion' 'funcion' type restpart | 'procedimiento' 'procedimiento' restpart{
    notifyErrorListeners("You repeated funcion keyword.");
};

restpart : IDENTIFICADOR '(' restpartPrima;

restpartPrima :	listparam ')' blq 	| ')' blq;

listparam : type IDENTIFICADOR listparamPrima;

listparamPrima : ',' type IDENTIFICADOR listparamPrima	| ;

type : 'entero' | 'real' | 'caracter';

blq : 'inicio' sentlist 'fin';

sentlist : sent sentlistPrima;

sentlistPrima : sent sentlistPrima | ;

sent : type lid ';'	| IDENTIFICADOR sentPrima | 'return' exp ';';

sentPrima : asig exp ';' | '(' sentPrimaPrima;

sentPrimaPrima : lid ')' ';'| ')' ';';

lid : IDENTIFICADOR lidPrima;

lidPrima : | ',' lid;

asig : '=' | '+=' | '-=' | '*=' | '/=';

exp : CONSTENTERO expPrima | CONSTREAL expPrima | CONSTLIT expPrima | '(' exp ')' expPrima | IDENTIFICADOR expPrimaPrima expPrima;

expPrima : op exp | ;

expPrimaPrima :	'(' lid ')'	| ;

op : '+' | '-' | '*' | '/';

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