// Generated from c:/Users/voypa/OneDrive/Escritorio/proyecto/src/main/antlr4/Proyecto.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProyectoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, PRINT=2, WHILE=3, ELSEIF=4, ELSE=5, IF=6, IGUAL_IGUAL=7, MAYOR_IGUAL_QUE=8, 
		MENOR_IGUAL_QUE=9, IGUAL=10, MULTI=11, SUMA=12, MODULO=13, PUNTO_Y_COMA=14, 
		ABRIR_PAR=15, CERRAR_PAR=16, ABRIR_LLAVES=17, CERRAR_LLAVES=18, AND=19, 
		NUMERO=20, COMENTARIOS=21, CADENA=22, ID=23, ESPACIO=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOL", "PRINT", "WHILE", "ELSEIF", "ELSE", "IF", "IGUAL_IGUAL", "MAYOR_IGUAL_QUE", 
			"MENOR_IGUAL_QUE", "IGUAL", "MULTI", "SUMA", "MODULO", "PUNTO_Y_COMA", 
			"ABRIR_PAR", "CERRAR_PAR", "ABRIR_LLAVES", "CERRAR_LLAVES", "AND", "NUMERO", 
			"COMENTARIOS", "CADENA", "ID", "ESPACIO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'print'", "'while'", "'elseif'", "'else'", "'if'", "'=='", 
			"'>='", "'<='", "'='", "'*'", "'+'", "'%'", "';'", "'('", "')'", "'{'", 
			"'}'", "'and'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "PRINT", "WHILE", "ELSEIF", "ELSE", "IF", "IGUAL_IGUAL", 
			"MAYOR_IGUAL_QUE", "MENOR_IGUAL_QUE", "IGUAL", "MULTI", "SUMA", "MODULO", 
			"PUNTO_Y_COMA", "ABRIR_PAR", "CERRAR_PAR", "ABRIR_LLAVES", "CERRAR_LLAVES", 
			"AND", "NUMERO", "COMENTARIOS", "CADENA", "ID", "ESPACIO"
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


	public ProyectoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Proyecto.g4"; }

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
		"\u0004\u0000\u0018\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0004\u0013x\b\u0013\u000b\u0013\f\u0013y\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0080\b\u0014\n\u0014\f\u0014\u0083"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u008c\b\u0015\n\u0015\f\u0015\u008f\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u0095\b\u0016"+
		"\n\u0016\f\u0016\u0098\t\u0016\u0001\u0017\u0004\u0017\u009b\b\u0017\u000b"+
		"\u0017\f\u0017\u009c\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"\u0001\u0000\u0006\u0001\u000009\u0006\u0000\t\n\r\r  09AZaz\b\u0000\t"+
		"\n\r\r  0:==AZ__az\u0003\u0000AZ__az\u0003\u000009AZaz\u0003\u0000\t\n"+
		"\r\r  \u00a5\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u0001:\u0001\u0000\u0000\u0000\u0003"+
		"<\u0001\u0000\u0000\u0000\u0005B\u0001\u0000\u0000\u0000\u0007H\u0001"+
		"\u0000\u0000\u0000\tO\u0001\u0000\u0000\u0000\u000bT\u0001\u0000\u0000"+
		"\u0000\rW\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000\u0011"+
		"]\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000\u0000\u0015b\u0001"+
		"\u0000\u0000\u0000\u0017d\u0001\u0000\u0000\u0000\u0019f\u0001\u0000\u0000"+
		"\u0000\u001bh\u0001\u0000\u0000\u0000\u001dj\u0001\u0000\u0000\u0000\u001f"+
		"l\u0001\u0000\u0000\u0000!n\u0001\u0000\u0000\u0000#p\u0001\u0000\u0000"+
		"\u0000%r\u0001\u0000\u0000\u0000\'w\u0001\u0000\u0000\u0000){\u0001\u0000"+
		"\u0000\u0000+\u0089\u0001\u0000\u0000\u0000-\u0092\u0001\u0000\u0000\u0000"+
		"/\u009a\u0001\u0000\u0000\u000012\u0005t\u0000\u000023\u0005r\u0000\u0000"+
		"34\u0005u\u0000\u00004;\u0005e\u0000\u000056\u0005f\u0000\u000067\u0005"+
		"a\u0000\u000078\u0005l\u0000\u000089\u0005s\u0000\u00009;\u0005e\u0000"+
		"\u0000:1\u0001\u0000\u0000\u0000:5\u0001\u0000\u0000\u0000;\u0002\u0001"+
		"\u0000\u0000\u0000<=\u0005p\u0000\u0000=>\u0005r\u0000\u0000>?\u0005i"+
		"\u0000\u0000?@\u0005n\u0000\u0000@A\u0005t\u0000\u0000A\u0004\u0001\u0000"+
		"\u0000\u0000BC\u0005w\u0000\u0000CD\u0005h\u0000\u0000DE\u0005i\u0000"+
		"\u0000EF\u0005l\u0000\u0000FG\u0005e\u0000\u0000G\u0006\u0001\u0000\u0000"+
		"\u0000HI\u0005e\u0000\u0000IJ\u0005l\u0000\u0000JK\u0005s\u0000\u0000"+
		"KL\u0005e\u0000\u0000LM\u0005i\u0000\u0000MN\u0005f\u0000\u0000N\b\u0001"+
		"\u0000\u0000\u0000OP\u0005e\u0000\u0000PQ\u0005l\u0000\u0000QR\u0005s"+
		"\u0000\u0000RS\u0005e\u0000\u0000S\n\u0001\u0000\u0000\u0000TU\u0005i"+
		"\u0000\u0000UV\u0005f\u0000\u0000V\f\u0001\u0000\u0000\u0000WX\u0005="+
		"\u0000\u0000XY\u0005=\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z[\u0005"+
		">\u0000\u0000[\\\u0005=\u0000\u0000\\\u0010\u0001\u0000\u0000\u0000]^"+
		"\u0005<\u0000\u0000^_\u0005=\u0000\u0000_\u0012\u0001\u0000\u0000\u0000"+
		"`a\u0005=\u0000\u0000a\u0014\u0001\u0000\u0000\u0000bc\u0005*\u0000\u0000"+
		"c\u0016\u0001\u0000\u0000\u0000de\u0005+\u0000\u0000e\u0018\u0001\u0000"+
		"\u0000\u0000fg\u0005%\u0000\u0000g\u001a\u0001\u0000\u0000\u0000hi\u0005"+
		";\u0000\u0000i\u001c\u0001\u0000\u0000\u0000jk\u0005(\u0000\u0000k\u001e"+
		"\u0001\u0000\u0000\u0000lm\u0005)\u0000\u0000m \u0001\u0000\u0000\u0000"+
		"no\u0005{\u0000\u0000o\"\u0001\u0000\u0000\u0000pq\u0005}\u0000\u0000"+
		"q$\u0001\u0000\u0000\u0000rs\u0005a\u0000\u0000st\u0005n\u0000\u0000t"+
		"u\u0005d\u0000\u0000u&\u0001\u0000\u0000\u0000vx\u0007\u0000\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z(\u0001\u0000\u0000\u0000{|\u0005/\u0000"+
		"\u0000|}\u0005*\u0000\u0000}\u0081\u0001\u0000\u0000\u0000~\u0080\u0007"+
		"\u0001\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005*\u0000\u0000\u0085\u0086\u0005/\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u0014\u0000\u0000"+
		"\u0088*\u0001\u0000\u0000\u0000\u0089\u008d\u0005\"\u0000\u0000\u008a"+
		"\u008c\u0007\u0002\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\"\u0000\u0000\u0091,"+
		"\u0001\u0000\u0000\u0000\u0092\u0096\u0007\u0003\u0000\u0000\u0093\u0095"+
		"\u0007\u0004\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097.\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009b\u0007\u0005\u0000\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0006\u0017\u0000\u0000\u009f0\u0001\u0000"+
		"\u0000\u0000\u0007\u0000:y\u0081\u008d\u0096\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}