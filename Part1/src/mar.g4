grammar mar;

prog: inst+;

inst: PRINT expr ENDLINE;

expr:
	SUB expr					# Negative
	| expr (MULT | DIV) expr	# MultOrDiv
	| expr (ADD | SUB) expr		# AddOrSub
	| NUMBER					# Number
	| PARENTL expr PARENTR		# HandleParen;
	
ENDLINE: ';';
ADD: '+';
MULT: '*';
DIV: '/';
SUB: '-';
PRINT: 'print';
PARENTL: '(';
PARENTR: ')';
NUMBER: DIGIT+ ('.' DIGIT+)?;
DIGIT: [0-9];
WS: [ \t\r\n]+ -> skip;