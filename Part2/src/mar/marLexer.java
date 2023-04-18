// Generated from C:/Users/luisr/OneDrive - Universidade do Algarve/uni/3º Ano/2º SEMESTRE/Compiladores/Trabalho/Part2/src\mar.g4 by ANTLR 4.12.0
package mar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class marLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENDLINE=1, ADD=2, MULT=3, DIV=4, SUB=5, NOT=6, PRINT=7, PARENTL=8, PARENTR=9, 
		NUMBER=10, DIGIT=11, DQ=12, STRING=13, TRUE=14, FALSE=15, NIL=16, OR=17, 
		AND=18, EQ=19, NEQ=20, GT=21, LT=22, GEQ=23, LEQ=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENDLINE", "ADD", "MULT", "DIV", "SUB", "NOT", "PRINT", "PARENTL", "PARENTR", 
			"NUMBER", "DIGIT", "DQ", "STRING", "TRUE", "FALSE", "NIL", "OR", "AND", 
			"EQ", "NEQ", "GT", "LT", "GEQ", "LEQ", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'+'", "'*'", "'/'", "'-'", "'not'", "'print'", "'('", "')'", 
			null, null, "'\"'", null, "'true'", "'false'", "'nil'", "'or'", "'and'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENDLINE", "ADD", "MULT", "DIV", "SUB", "NOT", "PRINT", "PARENTL", 
			"PARENTR", "NUMBER", "DIGIT", "DQ", "STRING", "TRUE", "FALSE", "NIL", 
			"OR", "AND", "EQ", "NEQ", "GT", "LT", "GEQ", "LEQ", "WS"
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
		"\u0004\u0000\u0019\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0004\tM\b\t\u000b\t\f\tN\u0001\t\u0001\t\u0004"+
		"\tS\b\t\u000b\t\f\tT\u0003\tW\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\f_\b\f\n\f\f\fb\t\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0004\u0018\u008d\b\u0018\u000b\u0018\f\u0018\u008e\u0001\u0018\u0001"+
		"\u0018\u0001`\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000\u0002\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u0096\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000"+
		"\u00057\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t;\u0001"+
		"\u0000\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000"+
		"\u0000\u000fG\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000\u0013"+
		"L\u0001\u0000\u0000\u0000\u0015X\u0001\u0000\u0000\u0000\u0017Z\u0001"+
		"\u0000\u0000\u0000\u0019\\\u0001\u0000\u0000\u0000\u001be\u0001\u0000"+
		"\u0000\u0000\u001dj\u0001\u0000\u0000\u0000\u001fp\u0001\u0000\u0000\u0000"+
		"!t\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%{\u0001\u0000\u0000"+
		"\u0000\'~\u0001\u0000\u0000\u0000)\u0081\u0001\u0000\u0000\u0000+\u0083"+
		"\u0001\u0000\u0000\u0000-\u0085\u0001\u0000\u0000\u0000/\u0088\u0001\u0000"+
		"\u0000\u00001\u008c\u0001\u0000\u0000\u000034\u0005;\u0000\u00004\u0002"+
		"\u0001\u0000\u0000\u000056\u0005+\u0000\u00006\u0004\u0001\u0000\u0000"+
		"\u000078\u0005*\u0000\u00008\u0006\u0001\u0000\u0000\u00009:\u0005/\u0000"+
		"\u0000:\b\u0001\u0000\u0000\u0000;<\u0005-\u0000\u0000<\n\u0001\u0000"+
		"\u0000\u0000=>\u0005n\u0000\u0000>?\u0005o\u0000\u0000?@\u0005t\u0000"+
		"\u0000@\f\u0001\u0000\u0000\u0000AB\u0005p\u0000\u0000BC\u0005r\u0000"+
		"\u0000CD\u0005i\u0000\u0000DE\u0005n\u0000\u0000EF\u0005t\u0000\u0000"+
		"F\u000e\u0001\u0000\u0000\u0000GH\u0005(\u0000\u0000H\u0010\u0001\u0000"+
		"\u0000\u0000IJ\u0005)\u0000\u0000J\u0012\u0001\u0000\u0000\u0000KM\u0003"+
		"\u0015\n\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OV\u0001\u0000\u0000\u0000"+
		"PR\u0005.\u0000\u0000QS\u0003\u0015\n\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UW\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W\u0014\u0001\u0000\u0000\u0000XY\u0007\u0000\u0000\u0000"+
		"Y\u0016\u0001\u0000\u0000\u0000Z[\u0005\"\u0000\u0000[\u0018\u0001\u0000"+
		"\u0000\u0000\\`\u0003\u0017\u000b\u0000]_\t\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000cd\u0003\u0017\u000b\u0000d\u001a\u0001\u0000\u0000\u0000ef\u0005"+
		"t\u0000\u0000fg\u0005r\u0000\u0000gh\u0005u\u0000\u0000hi\u0005e\u0000"+
		"\u0000i\u001c\u0001\u0000\u0000\u0000jk\u0005f\u0000\u0000kl\u0005a\u0000"+
		"\u0000lm\u0005l\u0000\u0000mn\u0005s\u0000\u0000no\u0005e\u0000\u0000"+
		"o\u001e\u0001\u0000\u0000\u0000pq\u0005n\u0000\u0000qr\u0005i\u0000\u0000"+
		"rs\u0005l\u0000\u0000s \u0001\u0000\u0000\u0000tu\u0005o\u0000\u0000u"+
		"v\u0005r\u0000\u0000v\"\u0001\u0000\u0000\u0000wx\u0005a\u0000\u0000x"+
		"y\u0005n\u0000\u0000yz\u0005d\u0000\u0000z$\u0001\u0000\u0000\u0000{|"+
		"\u0005=\u0000\u0000|}\u0005=\u0000\u0000}&\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005!\u0000\u0000\u007f\u0080\u0005=\u0000\u0000\u0080(\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005>\u0000\u0000\u0082*\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005<\u0000\u0000\u0084,\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005>\u0000\u0000\u0086\u0087\u0005=\u0000\u0000\u0087.\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005<\u0000\u0000\u0089\u008a\u0005=\u0000\u0000"+
		"\u008a0\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0001\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u0018\u0000\u0000\u0091"+
		"2\u0001\u0000\u0000\u0000\u0006\u0000NTV`\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}