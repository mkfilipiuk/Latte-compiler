// This Antlr4 file was machine-generated by the BNF converter
lexer grammar latteLexer;
// Predefined regular expressions in BNFC
fragment LETTER  : CAPITAL | SMALL ;
fragment CAPITAL : [A-Z\u00C0-\u00D6\u00D8-\u00DE] ;
fragment SMALL   : [a-z\u00DF-\u00F6\u00F8-\u00FF] ;
fragment DIGIT   : [0-9] ;
Surrogate_id_SYMB_0 : '(' ;
Surrogate_id_SYMB_1 : ')' ;
Surrogate_id_SYMB_2 : ',' ;
Surrogate_id_SYMB_3 : '{' ;
Surrogate_id_SYMB_4 : '}' ;
Surrogate_id_SYMB_5 : ';' ;
Surrogate_id_SYMB_6 : '=' ;
Surrogate_id_SYMB_7 : '++' ;
Surrogate_id_SYMB_8 : '--' ;
Surrogate_id_SYMB_9 : '-' ;
Surrogate_id_SYMB_10 : '!' ;
Surrogate_id_SYMB_11 : '&&' ;
Surrogate_id_SYMB_12 : '||' ;
Surrogate_id_SYMB_13 : '+' ;
Surrogate_id_SYMB_14 : '*' ;
Surrogate_id_SYMB_15 : '/' ;
Surrogate_id_SYMB_16 : '%' ;
Surrogate_id_SYMB_17 : '<' ;
Surrogate_id_SYMB_18 : '<=' ;
Surrogate_id_SYMB_19 : '>' ;
Surrogate_id_SYMB_20 : '>=' ;
Surrogate_id_SYMB_21 : '==' ;
Surrogate_id_SYMB_22 : '!=' ;
Surrogate_id_SYMB_23 : 'boolean' ;
Surrogate_id_SYMB_24 : 'else' ;
Surrogate_id_SYMB_25 : 'false' ;
Surrogate_id_SYMB_26 : 'if' ;
Surrogate_id_SYMB_27 : 'int' ;
Surrogate_id_SYMB_28 : 'return' ;
Surrogate_id_SYMB_29 : 'string' ;
Surrogate_id_SYMB_30 : 'true' ;
Surrogate_id_SYMB_31 : 'void' ;
Surrogate_id_SYMB_32 : 'while' ;
COMMENT_antlr_builtin
: (
'#' ~[\r\n]* (('\r'? '\n')|EOF)|
'//' ~[\r\n]* (('\r'? '\n')|EOF)
) -> skip;
MULTICOMMENT_antlr_builtin
: (
'/*' (.)*? '*/'
) -> skip;

// String token type
STRING : '"' -> more, mode(STRINGMODE);


//Integer predefined token type
INTEGER : DIGIT+;
// Identifier token type
fragment
IDENTIFIER_FIRST : LETTER | '_';
IDENT : IDENTIFIER_FIRST (IDENTIFIER_FIRST | DIGIT)*;
// Whitespace
WS : (' ' | '\r' | '\t' | '\n' | '\f')+ ->  skip;
// Escapable sequences
fragment
Escapable : ('"' | '\\' | 'n' | 't' | 'r' | 'f');
ErrorToken : . ;
mode STRESCAPE;
STRESCAPED : Escapable  -> more, popMode ;
mode STRINGMODE;
STRINGESC : '\\' -> more , pushMode(STRESCAPE);
STRINGEND : '"' ->  type(STRING), mode(DEFAULT_MODE);
STRINGTEXT : ~["\\] -> more;
