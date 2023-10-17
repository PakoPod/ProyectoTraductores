// Generated from /Users/irobles/Downloads/intro-antlr/src/main/antlr4/MiPrograma.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiProgramaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, PRINT=2, VAR=3, IGUAL=4, PUNTO_Y_COMA=5, ABRIR_LLAVES=6, CERRAR_LLAVES=7, 
		ID=8, NUMERO=9, ESPACIO=10;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_definir_var = 2, RULE_asignacion = 3, 
		RULE_print = 4, RULE_valor = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "definir_var", "asignacion", "print", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'print'", "'var'", "'='", "';'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "PRINT", "VAR", "IGUAL", "PUNTO_Y_COMA", "ABRIR_LLAVES", 
			"CERRAR_LLAVES", "ID", "NUMERO", "ESPACIO"
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

	@Override
	public String getGrammarFileName() { return "MiPrograma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiProgramaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(MiProgramaParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(MiProgramaParser.ID, 0); }
		public TerminalNode ABRIR_LLAVES() { return getToken(MiProgramaParser.ABRIR_LLAVES, 0); }
		public TerminalNode CERRAR_LLAVES() { return getToken(MiProgramaParser.CERRAR_LLAVES, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(PROGRAMA);
			setState(13);
			match(ID);
			setState(14);
			match(ABRIR_LLAVES);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(15);
				sentencia();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(CERRAR_LLAVES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciaContext extends ParserRuleContext {
		public Definir_varContext definir_var() {
			return getRuleContext(Definir_varContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				definir_var();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				asignacion();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definir_varContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiProgramaParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MiProgramaParser.ID, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(MiProgramaParser.PUNTO_Y_COMA, 0); }
		public Definir_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir_var; }
	}

	public final Definir_varContext definir_var() throws RecognitionException {
		Definir_varContext _localctx = new Definir_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definir_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(VAR);
			setState(29);
			match(ID);
			setState(30);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiProgramaParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MiProgramaParser.IGUAL, 0); }
		public TerminalNode NUMERO() { return getToken(MiProgramaParser.NUMERO, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(MiProgramaParser.PUNTO_Y_COMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(ID);
			setState(33);
			match(IGUAL);
			setState(34);
			match(NUMERO);
			setState(35);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MiProgramaParser.PRINT, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(MiProgramaParser.PUNTO_Y_COMA, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(PRINT);
			setState(38);
			valor();
			setState(39);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	 
		public ValorContext() { }
		public void copyFrom(ValorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValorNumeroContext extends ValorContext {
		public TerminalNode NUMERO() { return getToken(MiProgramaParser.NUMERO, 0); }
		public ValorNumeroContext(ValorContext ctx) { copyFrom(ctx); }
	}
	public static class ValorIdContext extends ValorContext {
		public TerminalNode ID() { return getToken(MiProgramaParser.ID, 0); }
		public ValorIdContext(ValorContext ctx) { copyFrom(ctx); }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valor);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				_localctx = new ValorNumeroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(NUMERO);
				}
				break;
			case ID:
				_localctx = new ValorIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\7\2\23\n\2\f\2\16"+
		"\2\26\13\2\3\2\3\2\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7.\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2"+
		"-\2\16\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b\"\3\2\2\2\n\'\3\2\2\2\f-\3"+
		"\2\2\2\16\17\7\3\2\2\17\20\7\n\2\2\20\24\7\b\2\2\21\23\5\4\3\2\22\21\3"+
		"\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3"+
		"\2\2\2\27\30\7\t\2\2\30\3\3\2\2\2\31\35\5\6\4\2\32\35\5\b\5\2\33\35\5"+
		"\n\6\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\7"+
		"\5\2\2\37 \7\n\2\2 !\7\7\2\2!\7\3\2\2\2\"#\7\n\2\2#$\7\6\2\2$%\7\13\2"+
		"\2%&\7\7\2\2&\t\3\2\2\2\'(\7\4\2\2()\5\f\7\2)*\7\7\2\2*\13\3\2\2\2+.\7"+
		"\13\2\2,.\7\n\2\2-+\3\2\2\2-,\3\2\2\2.\r\3\2\2\2\5\24\34-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}