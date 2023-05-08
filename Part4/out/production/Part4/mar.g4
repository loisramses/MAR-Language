grammar mar;

prog: inst+ EOF;

inst:
	CPARENTL inst* CPARENTR					# Block
	| ID AFFECT expr ENDLINE				# Assign
	| PRINT expr ENDLINE					# Print
	| 'if' expr 'then' inst ('else' inst)?	# If
	| 'while' expr 'do' inst				# While
	| varDecl                               # Declare;

type: 'number' | 'string' | 'bool' | 'nil';

varDecl: type ID (AFFECT expr)? ENDLINE;

expr:
	PARENTL expr PARENTR					# HandleParen
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