// Generated from /Users/irobles/Documents/workspaces/java/traductores/practicas/practica4/src/main/antlr4/Practica4.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Practica4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, FOR=2, IN=3, IGUAL=4, PUNTO_Y_COMA=5, COMA=6, ABRIR_PARENTESIS=7, 
		CERRAR_PARENTESIS=8, ABRIR_LLAVES=9, CERRAR_LLAVES=10, ABRIR_CORCHETE=11, 
		CERRAR_CORCHETE=12, ID=13, ENTERO=14, DECIMAL=15, ESPACIO=16;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_bucle_for = 2, RULE_asignacion = 3, 
		RULE_valor = 4, RULE_numero = 5, RULE_arreglo = 6, RULE_numero_sep_comas = 7, 
		RULE_coma_numero = 8, RULE_print = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "bucle_for", "asignacion", "valor", "numero", 
			"arreglo", "numero_sep_comas", "coma_numero", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'for'", "'in'", "'='", "';'", "','", "'('", "')'", 
			"'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "FOR", "IN", "IGUAL", "PUNTO_Y_COMA", "COMA", "ABRIR_PARENTESIS", 
			"CERRAR_PARENTESIS", "ABRIR_LLAVES", "CERRAR_LLAVES", "ABRIR_CORCHETE", 
			"CERRAR_CORCHETE", "ID", "ENTERO", "DECIMAL", "ESPACIO"
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
	public String getGrammarFileName() { return "Practica4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Practica4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(20);
				sentencia();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Bucle_forContext bucle_for() {
			return getRuleContext(Bucle_forContext.class,0);
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
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				asignacion();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				print();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				bucle_for();
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

	public static class Bucle_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Practica4Parser.FOR, 0); }
		public TerminalNode ABRIR_PARENTESIS() { return getToken(Practica4Parser.ABRIR_PARENTESIS, 0); }
		public List<TerminalNode> ID() { return getTokens(Practica4Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Practica4Parser.ID, i);
		}
		public TerminalNode IN() { return getToken(Practica4Parser.IN, 0); }
		public TerminalNode CERRAR_PARENTESIS() { return getToken(Practica4Parser.CERRAR_PARENTESIS, 0); }
		public TerminalNode ABRIR_LLAVES() { return getToken(Practica4Parser.ABRIR_LLAVES, 0); }
		public TerminalNode CERRAR_LLAVES() { return getToken(Practica4Parser.CERRAR_LLAVES, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Bucle_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_for; }
	}

	public final Bucle_forContext bucle_for() throws RecognitionException {
		Bucle_forContext _localctx = new Bucle_forContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bucle_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(FOR);
			setState(32);
			match(ABRIR_PARENTESIS);
			setState(33);
			match(ID);
			setState(34);
			match(IN);
			setState(35);
			match(ID);
			setState(36);
			match(CERRAR_PARENTESIS);
			setState(37);
			match(ABRIR_LLAVES);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				sentencia();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Practica4Parser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(Practica4Parser.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(Practica4Parser.PUNTO_Y_COMA, 0); }
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
			setState(46);
			match(ID);
			setState(47);
			match(IGUAL);
			setState(48);
			valor();
			setState(49);
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
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valor);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				numero();
				}
				break;
			case ABRIR_CORCHETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				arreglo();
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(Practica4Parser.ENTERO, 0); }
		public TerminalNode DECIMAL() { return getToken(Practica4Parser.DECIMAL, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode ABRIR_CORCHETE() { return getToken(Practica4Parser.ABRIR_CORCHETE, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode CERRAR_CORCHETE() { return getToken(Practica4Parser.CERRAR_CORCHETE, 0); }
		public Numero_sep_comasContext numero_sep_comas() {
			return getRuleContext(Numero_sep_comasContext.class,0);
		}
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arreglo);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ABRIR_CORCHETE);
				setState(58);
				numero();
				setState(59);
				match(CERRAR_CORCHETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(ABRIR_CORCHETE);
				setState(62);
				numero_sep_comas();
				setState(63);
				match(CERRAR_CORCHETE);
				}
				break;
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

	public static class Numero_sep_comasContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public List<Coma_numeroContext> coma_numero() {
			return getRuleContexts(Coma_numeroContext.class);
		}
		public Coma_numeroContext coma_numero(int i) {
			return getRuleContext(Coma_numeroContext.class,i);
		}
		public Numero_sep_comasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_sep_comas; }
	}

	public final Numero_sep_comasContext numero_sep_comas() throws RecognitionException {
		Numero_sep_comasContext _localctx = new Numero_sep_comasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numero_sep_comas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			numero();
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				coma_numero();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMA );
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

	public static class Coma_numeroContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(Practica4Parser.COMA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Coma_numeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma_numero; }
	}

	public final Coma_numeroContext coma_numero() throws RecognitionException {
		Coma_numeroContext _localctx = new Coma_numeroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coma_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(COMA);
			setState(74);
			numero();
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
		public TerminalNode PRINT() { return getToken(Practica4Parser.PRINT, 0); }
		public TerminalNode ABRIR_PARENTESIS() { return getToken(Practica4Parser.ABRIR_PARENTESIS, 0); }
		public TerminalNode ID() { return getToken(Practica4Parser.ID, 0); }
		public TerminalNode CERRAR_PARENTESIS() { return getToken(Practica4Parser.CERRAR_PARENTESIS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(Practica4Parser.PUNTO_Y_COMA, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PRINT);
			setState(77);
			match(ABRIR_PARENTESIS);
			setState(78);
			match(ID);
			setState(79);
			match(CERRAR_PARENTESIS);
			setState(80);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\5\68\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bD\n\b\3\t\3\t"+
		"\6\tH\n\t\r\t\16\tI\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\2\2"+
		"\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\20\21\2Q\2\31\3\2\2\2\4\37\3\2\2\2"+
		"\6!\3\2\2\2\b\60\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16C\3\2\2\2\20E\3\2\2"+
		"\2\22K\3\2\2\2\24N\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34 \5\b\5\2\35 \5"+
		"\24\13\2\36 \5\6\4\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2"+
		"\2\2!\"\7\4\2\2\"#\7\t\2\2#$\7\17\2\2$%\7\5\2\2%&\7\17\2\2&\'\7\n\2\2"+
		"\'+\7\13\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2"+
		"\2-+\3\2\2\2./\7\f\2\2/\7\3\2\2\2\60\61\7\17\2\2\61\62\7\6\2\2\62\63\5"+
		"\n\6\2\63\64\7\7\2\2\64\t\3\2\2\2\658\5\f\7\2\668\5\16\b\2\67\65\3\2\2"+
		"\2\67\66\3\2\2\28\13\3\2\2\29:\t\2\2\2:\r\3\2\2\2;<\7\r\2\2<=\5\f\7\2"+
		"=>\7\16\2\2>D\3\2\2\2?@\7\r\2\2@A\5\20\t\2AB\7\16\2\2BD\3\2\2\2C;\3\2"+
		"\2\2C?\3\2\2\2D\17\3\2\2\2EG\5\f\7\2FH\5\22\n\2GF\3\2\2\2HI\3\2\2\2IG"+
		"\3\2\2\2IJ\3\2\2\2J\21\3\2\2\2KL\7\b\2\2LM\5\f\7\2M\23\3\2\2\2NO\7\3\2"+
		"\2OP\7\t\2\2PQ\7\17\2\2QR\7\n\2\2RS\7\7\2\2S\25\3\2\2\2\b\31\37+\67CI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}