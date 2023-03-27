grammar mar;

prog: (inst NEWLINE)+;

inst: PRINT expr ENDLINE;

expr:
	SUB expr				# Negative
	| PARENTL expr PARENTR	# HandleParen
	| expr MULT expr		# Mult
	| expr DIV expr			# Div
	| expr ADD expr			# Add
	| expr SUB expr			# Sub
	| NUMBER				# Number;

ENDLINE: ';';
ADD: '+';
MULT: '*';
DIV: '/';
SUB: '-';
PRINT: 'print';
PARENTL: '(';
PARENTR: ')';
NEWLINE: '\n';
NUMBER: DIGIT+ ('.' DIGIT+)?;
DIGIT: [0-9];
WS: [ \t\r]+ -> skip;