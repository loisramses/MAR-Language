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
		NEWLINE=10, NUMBER=11, DIGIT=12, DQ=13, STRING=14, TRUE=15, FALSE=16, 
		NIL=17, OR=18, AND=19, EQ=20, NEQ=21, GT=22, LT=23, GEQ=24, LEQ=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENDLINE", "ADD", "MULT", "DIV", "SUB", "NOT", "PRINT", "PARENTL", "PARENTR", 
			"NEWLINE", "NUMBER", "DIGIT", "DQ", "STRING", "TRUE", "FALSE", "NIL", 
			"OR", "AND", "EQ", "NEQ", "GT", "LT", "GEQ", "LEQ", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'+'", "'*'", "'/'", "'-'", "'not'", "'print'", "'('", "')'", 
			"'\\n'", null, null, "'\"'", null, "'true'", "'false'", "'nil'", "'or'", 
			"'and'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENDLINE", "ADD", "MULT", "DIV", "SUB", "NOT", "PRINT", "PARENTL", 
			"PARENTR", "NEWLINE", "NUMBER", "DIGIT", "DQ", "STRING", "TRUE", "FALSE", 
			"NIL", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GEQ", "LEQ", "WS"
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
		"\u0004\u0000\u001a\u0096\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004"+
		"\nQ\b\n\u000b\n\f\nR\u0001\n\u0001\n\u0004\nW\b\n\u000b\n\f\nX\u0003\n"+
		"[\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r"+
		"c\b\r\n\r\f\rf\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0004\u0019\u0091\b\u0019\u000b\u0019\f\u0019\u0092\u0001\u0019\u0001"+
		"\u0019\u0001d\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000\u0002\u0001"+
		"\u000009\u0003\u0000\t\t\r\r  \u009a\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000"+
		"\u0000\u00037\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007"+
		";\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b?\u0001\u0000"+
		"\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000fI\u0001\u0000\u0000\u0000"+
		"\u0011K\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000\u0015P"+
		"\u0001\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019^\u0001"+
		"\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001di\u0001\u0000\u0000"+
		"\u0000\u001fn\u0001\u0000\u0000\u0000!t\u0001\u0000\u0000\u0000#x\u0001"+
		"\u0000\u0000\u0000%{\u0001\u0000\u0000\u0000\'\u007f\u0001\u0000\u0000"+
		"\u0000)\u0082\u0001\u0000\u0000\u0000+\u0085\u0001\u0000\u0000\u0000-"+
		"\u0087\u0001\u0000\u0000\u0000/\u0089\u0001\u0000\u0000\u00001\u008c\u0001"+
		"\u0000\u0000\u00003\u0090\u0001\u0000\u0000\u000056\u0005;\u0000\u0000"+
		"6\u0002\u0001\u0000\u0000\u000078\u0005+\u0000\u00008\u0004\u0001\u0000"+
		"\u0000\u00009:\u0005*\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005"+
		"/\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005-\u0000\u0000>\n\u0001"+
		"\u0000\u0000\u0000?@\u0005n\u0000\u0000@A\u0005o\u0000\u0000AB\u0005t"+
		"\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005p\u0000\u0000DE\u0005r"+
		"\u0000\u0000EF\u0005i\u0000\u0000FG\u0005n\u0000\u0000GH\u0005t\u0000"+
		"\u0000H\u000e\u0001\u0000\u0000\u0000IJ\u0005(\u0000\u0000J\u0010\u0001"+
		"\u0000\u0000\u0000KL\u0005)\u0000\u0000L\u0012\u0001\u0000\u0000\u0000"+
		"MN\u0005\n\u0000\u0000N\u0014\u0001\u0000\u0000\u0000OQ\u0003\u0017\u000b"+
		"\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SZ\u0001\u0000\u0000\u0000TV\u0005"+
		".\u0000\u0000UW\u0003\u0017\u000b\u0000VU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y[\u0001\u0000\u0000\u0000ZT\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\u0016\u0001\u0000\u0000\u0000\\]\u0007\u0000\u0000\u0000]\u0018"+
		"\u0001\u0000\u0000\u0000^_\u0005\"\u0000\u0000_\u001a\u0001\u0000\u0000"+
		"\u0000`d\u0003\u0019\f\u0000ac\t\u0000\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0003"+
		"\u0019\f\u0000h\u001c\u0001\u0000\u0000\u0000ij\u0005t\u0000\u0000jk\u0005"+
		"r\u0000\u0000kl\u0005u\u0000\u0000lm\u0005e\u0000\u0000m\u001e\u0001\u0000"+
		"\u0000\u0000no\u0005f\u0000\u0000op\u0005a\u0000\u0000pq\u0005l\u0000"+
		"\u0000qr\u0005s\u0000\u0000rs\u0005e\u0000\u0000s \u0001\u0000\u0000\u0000"+
		"tu\u0005n\u0000\u0000uv\u0005i\u0000\u0000vw\u0005l\u0000\u0000w\"\u0001"+
		"\u0000\u0000\u0000xy\u0005o\u0000\u0000yz\u0005r\u0000\u0000z$\u0001\u0000"+
		"\u0000\u0000{|\u0005a\u0000\u0000|}\u0005n\u0000\u0000}~\u0005d\u0000"+
		"\u0000~&\u0001\u0000\u0000\u0000\u007f\u0080\u0005=\u0000\u0000\u0080"+
		"\u0081\u0005=\u0000\u0000\u0081(\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"!\u0000\u0000\u0083\u0084\u0005=\u0000\u0000\u0084*\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005>\u0000\u0000\u0086,\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005<\u0000\u0000\u0088.\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		">\u0000\u0000\u008a\u008b\u0005=\u0000\u0000\u008b0\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005<\u0000\u0000\u008d\u008e\u0005=\u0000\u0000\u008e"+
		"2\u0001\u0000\u0000\u0000\u008f\u0091\u0007\u0001\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0006\u0019\u0000\u0000\u00954\u0001"+
		"\u0000\u0000\u0000\u0006\u0000RXZd\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}