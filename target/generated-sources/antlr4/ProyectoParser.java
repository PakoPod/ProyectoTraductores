// Generated from Proyecto.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProyectoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, PRINT=2, WHILE=3, ELSEIF=4, ELSE=5, IF=6, IGUAL_IGUAL=7, MAYOR_IGUAL_QUE=8, 
		MENOR_IGUAL_QUE=9, IGUAL=10, MULTI=11, SUMA=12, MODULO=13, PUNTO_Y_COMA=14, 
		ABRIR_PAR=15, CERRAR_PAR=16, ABRIR_LLAVES=17, CERRAR_LLAVES=18, AND=19, 
		NUMERO=20, COMENTARIOS=21, CADENA=22, ID=23, ESPACIO=24;
	public static final int
		RULE_programa = 0, RULE_bloque = 1, RULE_sentencia = 2, RULE_expr = 3, 
		RULE_asignacion = 4, RULE_primitivo = 5, RULE_sentencia_while = 6, RULE_sentencia_if = 7, 
		RULE_bloque_if = 8, RULE_bloque_elseif = 9, RULE_bloque_else = 10, RULE_print = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloque", "sentencia", "expr", "asignacion", "primitivo", 
			"sentencia_while", "sentencia_if", "bloque_if", "bloque_elseif", "bloque_else", 
			"print"
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

	@Override
	public String getGrammarFileName() { return "Proyecto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProyectoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13664334L) != 0)) {
				{
				{
				setState(24);
				sentencia();
				}
				}
				setState(29);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode ABRIR_LLAVES() { return getToken(ProyectoParser.ABRIR_LLAVES, 0); }
		public TerminalNode CERRAR_LLAVES() { return getToken(ProyectoParser.CERRAR_LLAVES, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(ABRIR_LLAVES);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13664334L) != 0)) {
				{
				{
				setState(31);
				sentencia();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Sentencia_whileContext sentencia_while() {
			return getRuleContext(Sentencia_whileContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				sentencia_while();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				sentencia_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(ProyectoParser.MULTI, 0); }
		public AContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(ProyectoParser.SUMA, 0); }
		public BContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(ProyectoParser.MODULO, 0); }
		public CContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ProyectoParser.AND, 0); }
		public DContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL_IGUAL() { return getToken(ProyectoParser.IGUAL_IGUAL, 0); }
		public EContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYOR_IGUAL_QUE() { return getToken(ProyectoParser.MAYOR_IGUAL_QUE, 0); }
		public FContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENOR_IGUAL_QUE() { return getToken(ProyectoParser.MENOR_IGUAL_QUE, 0); }
		public GContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitG(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HContext extends ExprContext {
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public HContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitH(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AInicioContext extends ExprContext {
		public TerminalNode ABRIR_PAR() { return getToken(ProyectoParser.ABRIR_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CERRAR_PAR() { return getToken(ProyectoParser.CERRAR_PAR, 0); }
		public AInicioContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterAInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitAInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitAInicio(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(ProyectoParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRIR_PAR:
				{
				_localctx = new AInicioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47);
				match(ABRIR_PAR);
				setState(48);
				expr(0);
				setState(49);
				match(CERRAR_PAR);
				}
				break;
			case BOOL:
			case NUMERO:
			case CADENA:
				{
				_localctx = new HContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				primitivo();
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(55);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(56);
						match(MULTI);
						setState(57);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new BContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(59);
						match(SUMA);
						setState(60);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new CContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(62);
						match(MODULO);
						setState(63);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new DContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(65);
						match(AND);
						setState(66);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new EContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68);
						match(IGUAL_IGUAL);
						setState(69);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new FContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(71);
						match(MAYOR_IGUAL_QUE);
						setState(72);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new GContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(74);
						match(MENOR_IGUAL_QUE);
						setState(75);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProyectoParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(ProyectoParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(ProyectoParser.PUNTO_Y_COMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			match(IGUAL);
			setState(83);
			expr(0);
			setState(84);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitivoContext extends ParserRuleContext {
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	 
		public PrimitivoContext() { }
		public void copyFrom(PrimitivoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends PrimitivoContext {
		public TerminalNode BOOL() { return getToken(ProyectoParser.BOOL, 0); }
		public BoolContext(PrimitivoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends PrimitivoContext {
		public TerminalNode NUMERO() { return getToken(ProyectoParser.NUMERO, 0); }
		public NumeroContext(PrimitivoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CadenaContext extends PrimitivoContext {
		public TerminalNode CADENA() { return getToken(ProyectoParser.CADENA, 0); }
		public CadenaContext(PrimitivoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primitivo);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(BOOL);
				}
				break;
			case NUMERO:
				_localctx = new NumeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(NUMERO);
				}
				break;
			case CADENA:
				_localctx = new CadenaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(CADENA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ProyectoParser.WHILE, 0); }
		public TerminalNode ABRIR_PAR() { return getToken(ProyectoParser.ABRIR_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CERRAR_PAR() { return getToken(ProyectoParser.CERRAR_PAR, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Sentencia_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterSentencia_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitSentencia_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitSentencia_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_whileContext sentencia_while() throws RecognitionException {
		Sentencia_whileContext _localctx = new Sentencia_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencia_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(WHILE);
			setState(92);
			match(ABRIR_PAR);
			setState(93);
			expr(0);
			setState(94);
			match(CERRAR_PAR);
			setState(95);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_ifContext extends ParserRuleContext {
		public Bloque_ifContext bloque_if() {
			return getRuleContext(Bloque_ifContext.class,0);
		}
		public List<Bloque_elseifContext> bloque_elseif() {
			return getRuleContexts(Bloque_elseifContext.class);
		}
		public Bloque_elseifContext bloque_elseif(int i) {
			return getRuleContext(Bloque_elseifContext.class,i);
		}
		public List<Bloque_elseContext> bloque_else() {
			return getRuleContexts(Bloque_elseContext.class);
		}
		public Bloque_elseContext bloque_else(int i) {
			return getRuleContext(Bloque_elseContext.class,i);
		}
		public Sentencia_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterSentencia_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitSentencia_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitSentencia_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencia_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			bloque_if();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(98);
				bloque_elseif();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(104);
				bloque_else();
				}
				}
				setState(109);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ProyectoParser.IF, 0); }
		public TerminalNode ABRIR_PAR() { return getToken(ProyectoParser.ABRIR_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CERRAR_PAR() { return getToken(ProyectoParser.CERRAR_PAR, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bloque_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterBloque_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitBloque_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitBloque_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_ifContext bloque_if() throws RecognitionException {
		Bloque_ifContext _localctx = new Bloque_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IF);
			setState(111);
			match(ABRIR_PAR);
			setState(112);
			expr(0);
			setState(113);
			match(CERRAR_PAR);
			setState(114);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_elseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(ProyectoParser.ELSEIF, 0); }
		public TerminalNode ABRIR_PAR() { return getToken(ProyectoParser.ABRIR_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CERRAR_PAR() { return getToken(ProyectoParser.CERRAR_PAR, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bloque_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterBloque_elseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitBloque_elseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitBloque_elseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_elseifContext bloque_elseif() throws RecognitionException {
		Bloque_elseifContext _localctx = new Bloque_elseifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloque_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ELSEIF);
			setState(117);
			match(ABRIR_PAR);
			setState(118);
			expr(0);
			setState(119);
			match(CERRAR_PAR);
			setState(120);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ProyectoParser.ELSE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bloque_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterBloque_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitBloque_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitBloque_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_elseContext bloque_else() throws RecognitionException {
		Bloque_elseContext _localctx = new Bloque_elseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloque_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ELSE);
			setState(123);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ProyectoParser.PRINT, 0); }
		public TerminalNode ABRIR_PAR() { return getToken(ProyectoParser.ABRIR_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CERRAR_PAR() { return getToken(ProyectoParser.CERRAR_PAR, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(ProyectoParser.PUNTO_Y_COMA, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProyectoListener ) ((ProyectoListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProyectoVisitor ) return ((ProyectoVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PRINT);
			setState(126);
			match(ABRIR_PAR);
			setState(127);
			expr(0);
			setState(128);
			match(CERRAR_PAR);
			setState(129);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0084\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005Z\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007d\b\u0007\n\u0007\f\u0007g\t\u0007\u0001\u0007\u0005"+
		"\u0007j\b\u0007\n\u0007\f\u0007m\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0000\u0001\u0006\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u008a\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004,\u0001\u0000"+
		"\u0000\u0000\u00065\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000"+
		"\nY\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000ea\u0001\u0000"+
		"\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000\u0000"+
		"\u0014z\u0001\u0000\u0000\u0000\u0016}\u0001\u0000\u0000\u0000\u0018\u001a"+
		"\u0003\u0004\u0002\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0001\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001e\"\u0005\u0011\u0000\u0000\u001f!\u0003"+
		"\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0005\u0012\u0000\u0000&\u0003"+
		"\u0001\u0000\u0000\u0000\'-\u0003\b\u0004\u0000(-\u0003\f\u0006\u0000"+
		")-\u0003\u000e\u0007\u0000*-\u0003\u0016\u000b\u0000+-\u0003\u0006\u0003"+
		"\u0000,\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000,)\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0005"+
		"\u0001\u0000\u0000\u0000./\u0006\u0003\uffff\uffff\u0000/0\u0005\u000f"+
		"\u0000\u000001\u0003\u0006\u0003\u000012\u0005\u0010\u0000\u000026\u0001"+
		"\u0000\u0000\u000036\u0003\n\u0005\u000046\u0005\u0017\u0000\u00005.\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"6N\u0001\u0000\u0000\u000078\n\t\u0000\u000089\u0005\u000b\u0000\u0000"+
		"9M\u0003\u0006\u0003\n:;\n\b\u0000\u0000;<\u0005\f\u0000\u0000<M\u0003"+
		"\u0006\u0003\t=>\n\u0007\u0000\u0000>?\u0005\r\u0000\u0000?M\u0003\u0006"+
		"\u0003\b@A\n\u0006\u0000\u0000AB\u0005\u0013\u0000\u0000BM\u0003\u0006"+
		"\u0003\u0007CD\n\u0005\u0000\u0000DE\u0005\u0007\u0000\u0000EM\u0003\u0006"+
		"\u0003\u0006FG\n\u0004\u0000\u0000GH\u0005\b\u0000\u0000HM\u0003\u0006"+
		"\u0003\u0005IJ\n\u0003\u0000\u0000JK\u0005\t\u0000\u0000KM\u0003\u0006"+
		"\u0003\u0004L7\u0001\u0000\u0000\u0000L:\u0001\u0000\u0000\u0000L=\u0001"+
		"\u0000\u0000\u0000L@\u0001\u0000\u0000\u0000LC\u0001\u0000\u0000\u0000"+
		"LF\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0007\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0017\u0000\u0000"+
		"RS\u0005\n\u0000\u0000ST\u0003\u0006\u0003\u0000TU\u0005\u000e\u0000\u0000"+
		"U\t\u0001\u0000\u0000\u0000VZ\u0005\u0001\u0000\u0000WZ\u0005\u0014\u0000"+
		"\u0000XZ\u0005\u0016\u0000\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0003\u0000\u0000\\]\u0005\u000f\u0000\u0000]^\u0003\u0006\u0003"+
		"\u0000^_\u0005\u0010\u0000\u0000_`\u0003\u0002\u0001\u0000`\r\u0001\u0000"+
		"\u0000\u0000ae\u0003\u0010\b\u0000bd\u0003\u0012\t\u0000cb\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fk\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hj\u0003\u0014\n\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u000f\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0006\u0000\u0000op\u0005"+
		"\u000f\u0000\u0000pq\u0003\u0006\u0003\u0000qr\u0005\u0010\u0000\u0000"+
		"rs\u0003\u0002\u0001\u0000s\u0011\u0001\u0000\u0000\u0000tu\u0005\u0004"+
		"\u0000\u0000uv\u0005\u000f\u0000\u0000vw\u0003\u0006\u0003\u0000wx\u0005"+
		"\u0010\u0000\u0000xy\u0003\u0002\u0001\u0000y\u0013\u0001\u0000\u0000"+
		"\u0000z{\u0005\u0005\u0000\u0000{|\u0003\u0002\u0001\u0000|\u0015\u0001"+
		"\u0000\u0000\u0000}~\u0005\u0002\u0000\u0000~\u007f\u0005\u000f\u0000"+
		"\u0000\u007f\u0080\u0003\u0006\u0003\u0000\u0080\u0081\u0005\u0010\u0000"+
		"\u0000\u0081\u0082\u0005\u000e\u0000\u0000\u0082\u0017\u0001\u0000\u0000"+
		"\u0000\t\u001b\",5LNYek";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}