grammar JavaBean;
file : pack?  importExpr* clazz*  ;
clazz :   classModifer 'class' ID  classExtend? classImplements? '{' ignore '}' ;
ignore : (field|method|clazz|.)*? ;
method :modifier? type? ID '(' methodParam? ')' block ;
methodParam: ID ID (',' ID ID)*;
field : classModifer ID ID ('=' VALUE)? ';';
//initializeBlock: 'static'? '{' '}';
type : ID | 'void' ;
block : '{' (block | .)*? '}' ;
pack: 'package' (ID|'.')+ ';';
importExpr: 'import' (ID|'.')+ ';';
classModifer: modifier? 'static'? 'final'? ;
modifier:'public'| 'private' | 'protected';
classImplements: 'implements' ID  (',' ID)* ;
classExtend: 'extends' ID  ;
ID : [a-zA-Z] [a-zA-Z0-9_]* ;
VALUE: 'null'|[a-zA-Z0-9_]+;
WS : [ \r\t\n]+ -> skip ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;
LINE_COMMENT
    : '//' ~[\r\n]* -> channel(HIDDEN)
    ;

ANY : . ;