// Generated from c:\Users\luisr\OneDrive - Universidade do Algarve\u005Cuni\3º Ano\2º SEMESTRE\Compiladores\Trabalho\Part4\src\mar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class marLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ENDLINE=10, ADD=11, MULT=12, DIV=13, SUB=14, NOT=15, PRINT=16, PARENTL=17, 
		PARENTR=18, CPARENTL=19, CPARENTR=20, NUMBER=21, DIGIT=22, DQ=23, STRING=24, 
		TRUE=25, FALSE=26, OR=27, AND=28, EQ=29, NEQ=30, GT=31, LT=32, GEQ=33, 
		LEQ=34, AFFECT=35, T_NUMBER=36, T_STRING=37, T_BOOL=38, T_NIL=39, ID=40, 
		LETTER=41, SL_COMMENT=42, ML_COMMENT=43, WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ENDLINE", "ADD", "MULT", "DIV", "SUB", "NOT", "PRINT", "PARENTL", "PARENTR", 
			"CPARENTL", "CPARENTR", "NUMBER", "DIGIT", "DQ", "STRING", "TRUE", "FALSE", 
			"OR", "AND", "EQ", "NEQ", "GT", "LT", "GEQ", "LEQ", "AFFECT", "T_NUMBER", 
			"T_STRING", "T_BOOL", "T_NIL", "ID", "LETTER", "SL_COMMENT", "ML_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'while'", "'do'", "'return'", "'b'", "'aa'", 
			"'else'", "','", "';'", "'+'", "'*'", "'/'", "'-'", "'not'", "'print'", 
			"'('", "')'", "'{'", "'}'", null, null, "'\"'", null, "'true'", "'false'", 
			"'or'", "'and'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'='", 
			"'number'", "'string'", "'bool'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ENDLINE", 
			"ADD", "MULT", "DIV", "SUB", "NOT", "PRINT", "PARENTL", "PARENTR", "CPARENTL", 
			"CPARENTR", "NUMBER", "DIGIT", "DQ", "STRING", "TRUE", "FALSE", "OR", 
			"AND", "EQ", "NEQ", "GT", "LT", "GEQ", "LEQ", "AFFECT", "T_NUMBER", "T_STRING", 
			"T_BOOL", "T_NIL", "ID", "LETTER", "SL_COMMENT", "ML_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public marLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\6\26\u009d\n\26\r\26\16\26\u009e\3\26\3\26\6\26\u00a3"+
		"\n\26\r\26\16\26\u00a4\5\26\u00a7\n\26\3\27\3\27\3\30\3\30\3\31\3\31\7"+
		"\31\u00af\n\31\f\31\16\31\u00b2\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3)\3)\3)\7)\u00f4\n)\f)\16)\u00f7\13)\3*\3*\3+\3+\3+\3+\7+\u00ff\n"+
		"+\f+\16+\u0102\13+\3+\5+\u0105\n+\3+\3+\3,\3,\3,\3,\7,\u010d\n,\f,\16"+
		",\u0110\13,\3,\3,\3,\3,\3,\3-\6-\u0118\n-\r-\16-\u0119\3-\3-\5\u00b0\u0100"+
		"\u010e\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\7\3\2\62;\4\2\62;aa\5"+
		"\2C\\aac|\3\3\f\f\5\2\13\f\17\17\"\"\2\u0125\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\3[\3\2\2\2\5^\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13l\3\2\2\2\rs\3\2"+
		"\2\2\17u\3\2\2\2\21x\3\2\2\2\23}\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2"+
		"\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2\2\37\u0089\3\2\2\2"+
		"!\u008d\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u0099\3"+
		"\2\2\2+\u009c\3\2\2\2-\u00a8\3\2\2\2/\u00aa\3\2\2\2\61\u00ac\3\2\2\2\63"+
		"\u00b5\3\2\2\2\65\u00ba\3\2\2\2\67\u00c0\3\2\2\29\u00c3\3\2\2\2;\u00c7"+
		"\3\2\2\2=\u00ca\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C\u00d1\3\2\2\2E"+
		"\u00d4\3\2\2\2G\u00d7\3\2\2\2I\u00d9\3\2\2\2K\u00e0\3\2\2\2M\u00e7\3\2"+
		"\2\2O\u00ec\3\2\2\2Q\u00f0\3\2\2\2S\u00f8\3\2\2\2U\u00fa\3\2\2\2W\u0108"+
		"\3\2\2\2Y\u0117\3\2\2\2[\\\7k\2\2\\]\7h\2\2]\4\3\2\2\2^_\7v\2\2_`\7j\2"+
		"\2`a\7g\2\2ab\7p\2\2b\6\3\2\2\2cd\7y\2\2de\7j\2\2ef\7k\2\2fg\7n\2\2gh"+
		"\7g\2\2h\b\3\2\2\2ij\7f\2\2jk\7q\2\2k\n\3\2\2\2lm\7t\2\2mn\7g\2\2no\7"+
		"v\2\2op\7w\2\2pq\7t\2\2qr\7p\2\2r\f\3\2\2\2st\7d\2\2t\16\3\2\2\2uv\7c"+
		"\2\2vw\7c\2\2w\20\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{|\7g\2\2|\22\3\2"+
		"\2\2}~\7.\2\2~\24\3\2\2\2\177\u0080\7=\2\2\u0080\26\3\2\2\2\u0081\u0082"+
		"\7-\2\2\u0082\30\3\2\2\2\u0083\u0084\7,\2\2\u0084\32\3\2\2\2\u0085\u0086"+
		"\7\61\2\2\u0086\34\3\2\2\2\u0087\u0088\7/\2\2\u0088\36\3\2\2\2\u0089\u008a"+
		"\7p\2\2\u008a\u008b\7q\2\2\u008b\u008c\7v\2\2\u008c \3\2\2\2\u008d\u008e"+
		"\7r\2\2\u008e\u008f\7t\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7v\2\2\u0092\"\3\2\2\2\u0093\u0094\7*\2\2\u0094$\3\2\2\2\u0095"+
		"\u0096\7+\2\2\u0096&\3\2\2\2\u0097\u0098\7}\2\2\u0098(\3\2\2\2\u0099\u009a"+
		"\7\177\2\2\u009a*\3\2\2\2\u009b\u009d\5-\27\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a6\3\2"+
		"\2\2\u00a0\u00a2\7\60\2\2\u00a1\u00a3\5-\27\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7,\3\2\2\2\u00a8\u00a9"+
		"\t\2\2\2\u00a9.\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\60\3\2\2\2\u00ac\u00b0"+
		"\5/\30\2\u00ad\u00af\13\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b4\5/\30\2\u00b4\62\3\2\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7g\2\2\u00b9\64\3\2\2\2\u00ba"+
		"\u00bb\7h\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2"+
		"\u00be\u00bf\7g\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7"+
		"t\2\2\u00c28\3\2\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6"+
		"\7f\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8\u00c9\7?\2\2\u00c9<\3"+
		"\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7?\2\2\u00cc>\3\2\2\2\u00cd\u00ce"+
		"\7@\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7"+
		"@\2\2\u00d2\u00d3\7?\2\2\u00d3D\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5\u00d6"+
		"\7?\2\2\u00d6F\3\2\2\2\u00d7\u00d8\7?\2\2\u00d8H\3\2\2\2\u00d9\u00da\7"+
		"p\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7d\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00df\7t\2\2\u00dfJ\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2"+
		"\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5"+
		"\u00e6\7i\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7q\2\2\u00e9"+
		"\u00ea\7q\2\2\u00ea\u00eb\7n\2\2\u00ebN\3\2\2\2\u00ec\u00ed\7p\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7n\2\2\u00efP\3\2\2\2\u00f0\u00f5\5S*\2\u00f1"+
		"\u00f4\5S*\2\u00f2\u00f4\t\3\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2"+
		"\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6R"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\t\4\2\2\u00f9T\3\2\2\2\u00fa"+
		"\u00fb\7\61\2\2\u00fb\u00fc\7\61\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\13"+
		"\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\t\5"+
		"\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b+\2\2\u0107"+
		"V\3\2\2\2\u0108\u0109\7\61\2\2\u0109\u010a\7,\2\2\u010a\u010e\3\2\2\2"+
		"\u010b\u010d\13\2\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0112\7,\2\2\u0112\u0113\7\61\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b,"+
		"\2\2\u0115X\3\2\2\2\u0116\u0118\t\6\2\2\u0117\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\b-\2\2\u011cZ\3\2\2\2\r\2\u009e\u00a4\u00a6\u00b0\u00f3\u00f5\u0100"+
		"\u0104\u010e\u0119\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}