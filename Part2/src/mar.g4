grammar mar;

prog: inst+ EOF;

inst: PRINT expr ENDLINE;

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
	| NIL									# Nil;

ENDLINE: ';';
ADD: '+';
MULT: '*';
DIV: '/';
SUB: '-';
NOT: 'not';
PRINT: 'print';
PARENTL: '(';
PARENTR: ')';
NUMBER: DIGIT+ ('.' DIGIT+)?;
DIGIT: [0-9];
DQ: '"';
STRING: DQ .*? DQ;
TRUE: 'true';
FALSE: 'false';
NIL: 'nil';
OR: 'or';
AND: 'and';
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';

WS: [ \t\r\n]+ -> skip;