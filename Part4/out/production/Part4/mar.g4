grammar mar;

prog: varDecl* functions inst+ EOF;

inst:
	block								# InstBlock
	| ID AFFECT expr ENDLINE			# Assign
	| PRINT expr ENDLINE				# Print
	| 'if' ifCond 'then' inst elseInst?	# If
	| 'while' whileCond 'do' inst		# While
	| 'return' expr? ENDLINE			# Return
	| expr ENDLINE						# Useless;

ifCond: expr;

whileCond: expr;

functions: functionDecl*;

elseInst: 'else' inst;

type: 'number' | 'string' | 'bool';

block: CPARENTL varDecl* inst* CPARENTR;

varDecl: type ID (AFFECT expr)? ENDLINE;

functionDecl: type? ID PARENTL formalParams? PARENTR block;

formalParams: formalParam (',' formalParam)*;

formalParam: type ID;

expr:
	ID PARENTL exprList? PARENTR			# Call
	| PARENTL expr PARENTR					# HandleParen
	| op = (SUB | NOT) expr					# Unary
	| expr op = (MULT | DIV) expr			# BinMulDiv
	| expr op = (ADD | SUB) expr			# BinAddSub
	| expr op = (LT | GT | LEQ | GEQ) expr	# Relational
	| expr op = (EQ | NEQ) expr				# InEquality
	| expr AND expr							# LogicAnd
	| expr OR expr							# LogicOr
	| op = (TRUE | FALSE)					# Boolean
	| STRING								# String
	| NUMBER								# Number
	| T_NIL									# Nil
	| ID									# Id;

exprList: expr (',' expr)*;

ENDLINE: ';';
ADD: '+';
MULT: '*';
DIV: '/';
SUB: '-';
NOT: 'not';
PRINT: 'print';
PARENTL: '(';
PARENTR: ')';
CPARENTL: '{';
CPARENTR: '}';
NUMBER: DIGIT+ ('.' DIGIT+)?;
DIGIT: [0-9];
DQ: '"';
STRING: DQ .*? DQ;
TRUE: 'true';
FALSE: 'false';
OR: 'or';
AND: 'and';
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
AFFECT: '=';
T_NUMBER: 'number';
T_STRING: 'string';
T_BOOL: 'bool';
T_NIL: 'nil';
ID: LETTER (LETTER | [_0-9])*;
LETTER: [a-zA-Z_];

SL_COMMENT: '//' .*? (EOF | '\n') -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;