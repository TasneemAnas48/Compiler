lexer grammar  DSLLexer;

PAGE_WORD:'page' -> pushMode(PAGE);

CONTROLLER_WORD: 'controller' ->pushMode(CONTROLLER);

COMMENT
    : '/*' .*? '*/'
    ;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+
    ;

// PAGE declarations
mode PAGE;

PAGE_OPEN: '{' ;

HEADER : 'header' ;

BODY :  'body' ;

OPEN_BREAKET : '[' ->pushMode(PAGECONTENT);

PAGE_CLOSE : '}' ->popMode ;


PAGE_COMMENT
    : '/*' .*? '*/'
    ;


NAME
    : TAG_NameStartChar ID*
    ;
PAGE_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;


// Page_Content declarations
mode PAGECONTENT ;

INPUT:'input' | 'output' | 'title' | 'language'  | 'Start Form' | 'End Form' | 'Enter' | 'get';

TWO_POINT:':' ->pushMode(TYPE);

CLOSED_BREAKET : ']' ->popMode;

CONTENT_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;


// type declarations
mode TYPE;


TYPE_NAME : 'radio' | 'text' | 'number' | 'password' | 'email' | 'checkbox' | 'image_in' |
'submit' | 'image_out' | 'paragraph' | 'link' | 'header1' | 'header2' | 'header3' | 'button' | 'action'| 'data';

OPEN_BR : '(' ;

ATTRIBUTE : 'label' | 'name' | 'width' | 'height' | 'placeholder' | 'src' |
 'url' | 'alt' | 'max' | 'min' | 'maxlength' | 'minlength' | 'step' | 'required' | 'readonly' | 'controller';

GET: 'getVar' | 'getList';

COMA : ',' ;

CLOSE_BR : ')' ;

SIMICOLON: ';' ->popMode ;

STRING : '"' ~'"'* '"' ;

TYPE_SEA
    :  [ \t\r\n] -> channel(HIDDEN)
    ;

TYPE_DIGIT
    : DIGIT+
    ;


// controller declarations
mode CONTROLLER;

CONTROL:'control';

CONTROLLER_OPEN: '{' -> pushMode(LOGIC) ;


CONTROLLER_NAME
    : TAG_NameStartChar ID*
    ;
CONTROLLER_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;


// logic declarations
mode LOGIC;

POST: 'post';

SINGLE: '\'';

LIST :'list';

IF: 'if';

FOR : 'for';

VAR : 'var';

LIST_ADD: 'add';

LIST_DELETE: 'delete';

LIST_SIZE: 'size';

LIST_GET: 'get';

SESSION: 'session';

DOT:'.';

FUNCTION :'function';

PRINT : 'print';

RETURN : 'return' ;

DART:'->';

LOGIC_COMMENT
    : '/*' .*? '*/'
    ;

LOGIC_NAME
    : TAG_NameStartChar ID*
    ;

CONTROLLER_CLOSE : '}' ->popMode,popMode ;

ASSIGNMENT: '=';

OPERAND: '+' | '-' | '*' | '/' | '%' ;

LOGICAL : '&&' |'||' ;

BOOLEN : '>' | '<' | '!=' | '>=' | '<=' |'==' ;





LOGIC_SIMICOLON: ';' ;

LOGIC_COMMA: ',' ;

LOGIC_OPEN:'(';

LOGIC_CLOSE:')';

LOGIC_BR_OPEN:'[' ;

LOGIC_BR_COLSE: ']';

LOGIC_STRING : '"' ~'"'* '"' ;



LOGIC_DIGIT
          : DIGIT+
          ;

LOGIC_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;


fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;
fragment
DIGIT
          : [0-9]
          ;

fragment
ID
    : TAG_NameStartChar
    | '-'
    | '_'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

