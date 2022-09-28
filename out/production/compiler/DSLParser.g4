parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

program :  lang_Misc*  program_design* ;

program_design: page lang_Misc* controller lang_Misc*;

page : PAGE_WORD NAME PAGE_OPEN  (header body)? PAGE_CLOSE;

header : HEADER OPEN_BREAKET (attribute_header)*  CLOSED_BREAKET;

attribute_header : INPUT  TWO_POINT  STRING SIMICOLON ;

body: BODY OPEN_BREAKET  in_out* CLOSED_BREAKET;

in_out:INPUT  (TWO_POINT TYPE_NAME OPEN_BR ((attribute | get_data) (COMA (attribute | get_data))*) CLOSE_BR  SIMICOLON)?;

attribute:  ATTRIBUTE OPEN_BR (STRING  (COMA STRING)*| TYPE_DIGIT) CLOSE_BR ;

get_data: ATTRIBUTE OPEN_BR GET OPEN_BR STRING CLOSE_BR CLOSE_BR;


controller: CONTROLLER_WORD CONTROLLER_NAME CONTROL CONTROLLER_NAME CONTROLLER_OPEN ( function | logic | LOGIC_COMMENT|session)* CONTROLLER_CLOSE ;

//
logic : (if | for) | ((variables | assignment | print | list | call_function | list_use) LOGIC_SIMICOLON)    ;

//
session: SESSION VAR LOGIC_NAME ASSIGNMENT (type | ( LOGIC_NAME DOT (list_size | list_get) )| call_function ) LOGIC_SIMICOLON ;

if: IF LOGIC_OPEN compare (LOGICAL compare)* LOGIC_CLOSE  LOGIC_BR_OPEN logic_body LOGIC_BR_COLSE ;

compare : ((LOGIC_NAME DOT (list_size | list_get)) | type) BOOLEN ((LOGIC_NAME DOT (list_size | list_get) |type)) ;

post : LOGIC_NAME ASSIGNMENT POST LOGIC_BR_OPEN  SINGLE LOGIC_NAME  SINGLE LOGIC_BR_COLSE;

//if : IF LOGIC_OPEN type BOOLEN type (LOGICAL type BOOLEN type)* LOGIC_CLOSE;

//
var : LOGIC_NAME | assignment | post;

variables: VAR  var  (LOGIC_COMMA (var))*;

list: LIST  (post | (LOGIC_NAME ASSIGNMENT LOGIC_OPEN (type | (type (LOGIC_COMMA type)+) )?  LOGIC_CLOSE));

//
assignment: LOGIC_NAME ASSIGNMENT ( (type (OPERAND type )*) |  (LOGIC_NAME DOT (list_size | list_get)) | call_function) ;

//  الليست ما بصير نحطها هون لان هي ما بيتخزن فيها
for : FOR LOGIC_OPEN (LOGIC_NAME) DART (type|(LOGIC_NAME DOT (list_size | list_get))) LOGIC_COMMA OPERAND LOGIC_DIGIT LOGIC_CLOSE LOGIC_BR_OPEN logic_body LOGIC_BR_COLSE;

call_function: LOGIC_NAME LOGIC_OPEN (type | (type (LOGIC_COMMA type)+) )? LOGIC_CLOSE;

//
function : FUNCTION LOGIC_NAME LOGIC_OPEN  parameter? LOGIC_CLOSE  LOGIC_BR_OPEN logic_body (RETURN type LOGIC_SIMICOLON)? LOGIC_BR_COLSE;

parameter : LOGIC_NAME | (LOGIC_NAME (LOGIC_COMMA LOGIC_NAME)+) ;

print : PRINT LOGIC_OPEN type (LOGIC_COMMA type)* LOGIC_CLOSE;

logic_body: logic*  ;

type:(LOGIC_NAME |  LOGIC_DIGIT | LOGIC_STRING );

list_use: LOGIC_NAME DOT (list_add | list_delete |list_size | list_get);

list_add: LIST_ADD LOGIC_OPEN type LOGIC_CLOSE;

list_delete: LIST_DELETE LOGIC_OPEN (LOGIC_DIGIT|LOGIC_NAME) LOGIC_CLOSE;

list_size: LIST_SIZE LOGIC_OPEN LOGIC_CLOSE;

list_get: LIST_GET LOGIC_OPEN (LOGIC_DIGIT|LOGIC_NAME) LOGIC_CLOSE;

lang_Misc
    : COMMENT
    | SEA_WS
    ;


