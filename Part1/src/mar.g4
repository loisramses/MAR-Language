grammar mar;

prog: inst+;

inst: PRINT expr ENDLINE;

expr:
	SUB expr				# Negative
	| expr MULT expr		# Mult
	| expr DIV expr			# Div
	| expr ADD expr			# Add
	| expr SUB expr			# Sub
	| NUMBER				# Number
	| PARENTL expr PARENTR	# HandleParen;

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