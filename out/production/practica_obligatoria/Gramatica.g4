grammar Gramatica;

r: (IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT |  WS)+;

IDENTIFICADOR : ([a-zA-Z]|'_')([a-zA-Z]|'_'|[0-9])*{
    System.out.println(getText());
};

CONSTENTERO : (([+-]?[0-9]+)|('$'[+-]?[0-9A-F]+)){
    System.out.println(getText());
};

CONSTREAL : ([+-]?[0-9]+'.'[0-9]+)|('$'[+-]?[0-9A-F]+'.'[0-9A-F]+){
    System.out.println(getText());
};

CONSTLIT: (('"' ('""'|~'"')* '"' )| (['](~[']|[']['])*['])){
    System.out.println(getText());
};

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
