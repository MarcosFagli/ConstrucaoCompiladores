// Generated from Lua.g4 by ANTLR 4.7.2
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, Nome=48, Numero=49, Cadeia=50, COMENTARIO=51, WS=52;
	public static final int
		RULE_programa = 0, RULE_trecho = 1, RULE_bloco = 2, RULE_comando = 3, 
		RULE_chamadadefuncao = 4, RULE_cf2 = 5, RULE_ultimocomando = 6, RULE_nomedafuncao = 7, 
		RULE_listavar = 8, RULE_listadenomes = 9, RULE_listaexp = 10, RULE_exp = 11, 
		RULE_exp2 = 12, RULE_expprefixo = 13, RULE_expprefixo2 = 14, RULE_var = 15, 
		RULE_args = 16, RULE_funcao = 17, RULE_corpodafuncao = 18, RULE_listapar = 19, 
		RULE_construtortabela = 20, RULE_listadecampos = 21, RULE_campo = 22, 
		RULE_separadordecampos = 23, RULE_opbin = 24, RULE_opunaria = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "trecho", "bloco", "comando", "chamadadefuncao", "cf2", "ultimocomando", 
			"nomedafuncao", "listavar", "listadenomes", "listaexp", "exp", "exp2", 
			"expprefixo", "expprefixo2", "var", "args", "funcao", "corpodafuncao", 
			"listapar", "construtortabela", "listadecampos", "campo", "separadordecampos", 
			"opbin", "opunaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "':'", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
			"'if'", "'then'", "'elseif'", "'else'", "'for'", "','", "'in'", "'function'", 
			"'local'", "'('", "')'", "'return'", "'break'", "'.'", "'nil'", "'false'", 
			"'true'", "'...'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'%'", "'..'", "'<'", "'<='", "'>'", "'>='", "'=='", "'~='", "'and'", 
			"'or'", "'not'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Nome", "Numero", "Cadeia", "COMENTARIO", "WS"
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<628093,628301,595160>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			trecho();
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

	public static class TrechoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public UltimocomandoContext ultimocomando() {
			return getRuleContext(UltimocomandoContext.class,0);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTrecho(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Nome))) != 0)) {
				{
				{
				setState(54);
				comando();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(55);
					match(T__0);
					}
				}

				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__20) {
				{
				setState(63);
				ultimocomando();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(64);
					match(T__0);
					}
				}

				}
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

	public static class BlocoContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			trecho();
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

	public static class ComandoContext extends ParserRuleContext {
		public ExpprefixoContext exp1;
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				listavar();
				setState(72);
				match(T__1);
				setState(73);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((ComandoContext)_localctx).exp1 = expprefixo();
				TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).exp1!=null?_input.getText(((ComandoContext)_localctx).exp1.start,((ComandoContext)_localctx).exp1.stop):null),Tipo.FUNCAO);
				setState(77);
				args();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				expprefixo();
				setState(80);
				match(T__2);
				setState(81);
				match(Nome);
				setState(82);
				args();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(T__3);
				setState(85);
				bloco();
				setState(86);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(T__5);
				setState(89);
				exp();
				setState(90);
				match(T__3);
				setState(91);
				bloco();
				setState(92);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(T__6);
				setState(95);
				bloco();
				setState(96);
				match(T__7);
				setState(97);
				exp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				match(T__8);
				setState(100);
				exp();
				setState(101);
				match(T__9);
				setState(102);
				bloco();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(103);
					match(T__10);
					setState(104);
					exp();
					setState(105);
					match(T__9);
					setState(106);
					bloco();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(113);
					match(T__11);
					setState(114);
					bloco();
					}
				}

				setState(117);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(T__12);
				setState(120);
				match(Nome);
				setState(121);
				match(T__1);
				setState(122);
				exp();
				setState(123);
				match(T__13);
				setState(124);
				exp();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(125);
					match(T__13);
					setState(126);
					exp();
					}
				}

				setState(129);
				match(T__3);
				setState(130);
				bloco();
				setState(131);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(133);
				match(T__12);
				setState(134);
				listadenomes();
				setState(135);
				match(T__14);
				setState(136);
				listaexp();
				setState(137);
				match(T__3);
				setState(138);
				bloco();
				setState(139);
				match(T__4);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				match(T__15);
				setState(142);
				nomedafuncao();
				setState(143);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				match(T__16);
				setState(146);
				match(T__15);
				setState(147);
				match(Nome);
				setState(148);
				corpodafuncao();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(149);
				match(T__16);
				setState(150);
				listadenomes();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(151);
					match(T__1);
					setState(152);
					listaexp();
					}
				}

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

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Cf2Context cf2() {
			return getRuleContext(Cf2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ChamadadefuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadadefuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadadefuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadadefuncao(this);
		}
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_chamadadefuncao);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				var();
				setState(158);
				args();
				setState(159);
				cf2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__17);
				setState(162);
				exp();
				setState(163);
				match(T__18);
				setState(164);
				args();
				setState(165);
				cf2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				var();
				setState(168);
				match(T__2);
				setState(169);
				match(Nome);
				setState(170);
				args();
				setState(171);
				cf2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(T__17);
				setState(174);
				exp();
				setState(175);
				match(T__18);
				setState(176);
				match(T__2);
				setState(177);
				match(Nome);
				setState(178);
				args();
				setState(179);
				cf2();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				cf2();
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

	public static class Cf2Context extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Cf2Context cf2() {
			return getRuleContext(Cf2Context.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public Cf2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cf2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCf2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCf2(this);
		}
	}

	public final Cf2Context cf2() throws RecognitionException {
		Cf2Context _localctx = new Cf2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_cf2);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__28:
			case Cadeia:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				args();
				setState(185);
				cf2();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__2);
				setState(188);
				match(Nome);
				setState(189);
				args();
				setState(190);
				cf2();
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

	public static class UltimocomandoContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public UltimocomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimocomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterUltimocomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitUltimocomando(this);
		}
	}

	public final UltimocomandoContext ultimocomando() throws RecognitionException {
		UltimocomandoContext _localctx = new UltimocomandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ultimocomando);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__19);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(195);
					listaexp();
					}
				}

				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__20);
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

	public static class NomedafuncaoContext extends ParserRuleContext {
		public Token nome;
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public NomedafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomedafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomedafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomedafuncao(this);
		}
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((NomedafuncaoContext)_localctx).nome = match(Nome);
			TabelaDeSimbolos.adicionarSimbolo((((NomedafuncaoContext)_localctx).nome!=null?((NomedafuncaoContext)_localctx).nome.getText():null),Tipo.FUNCAO);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(203);
				match(T__21);
				setState(204);
				match(Nome);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(210);
				match(T__2);
				setState(211);
				match(Nome);
				}
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

	public static class ListavarContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ListavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListavar(this);
		}
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			var();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(215);
				match(T__13);
				setState(216);
				var();
				}
				}
				setState(221);
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

	public static class ListadenomesContext extends ParserRuleContext {
		public Token nome1;
		public Token nome2;
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public ListadenomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadenomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadenomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadenomes(this);
		}
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((ListadenomesContext)_localctx).nome1 = match(Nome);
			TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).nome1!=null?((ListadenomesContext)_localctx).nome1.getText():null),Tipo.VARIAVEL);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					match(T__13);
					setState(225);
					((ListadenomesContext)_localctx).nome2 = match(Nome);
					TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).nome2!=null?((ListadenomesContext)_localctx).nome2.getText():null),Tipo.VARIAVEL);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaexp(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					exp();
					setState(233);
					match(T__13);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(240);
			exp();
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

	public static class ExpContext extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode Numero() { return getToken(LuaParser.Numero, 0); }
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__22);
				setState(243);
				exp2();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__23);
				setState(245);
				exp2();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(T__24);
				setState(247);
				exp2();
				}
				break;
			case Numero:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(Numero);
				setState(249);
				exp2();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(Cadeia);
				setState(251);
				exp2();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				match(T__25);
				setState(253);
				exp2();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				funcao();
				setState(255);
				exp2();
				}
				break;
			case T__17:
			case Nome:
				enterOuterAlt(_localctx, 8);
				{
				setState(257);
				expprefixo();
				setState(258);
				exp2();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				construtortabela();
				setState(261);
				exp2();
				}
				break;
			case T__31:
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 10);
				{
				setState(263);
				opunaria();
				setState(264);
				exp();
				setState(265);
				exp2();
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

	public static class Exp2Context extends ParserRuleContext {
		public List<OpbinContext> opbin() {
			return getRuleContexts(OpbinContext.class);
		}
		public OpbinContext opbin(int i) {
			return getRuleContext(OpbinContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp2(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					opbin();
					setState(270);
					exp();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ExpprefixoContext extends ParserRuleContext {
		public Token nome1;
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public Expprefixo2Context expprefixo2() {
			return getRuleContext(Expprefixo2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpprefixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo(this);
		}
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expprefixo);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(Nome);
				setState(278);
				expprefixo2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(Nome);
				{
				setState(280);
				match(T__21);
				setState(281);
				((ExpprefixoContext)_localctx).nome1 = match(Nome);
				TabelaDeSimbolos.adicionarSimbolo((((ExpprefixoContext)_localctx).nome1!=null?((ExpprefixoContext)_localctx).nome1.getText():null),Tipo.FUNCAO);
				setState(283);
				expprefixo2();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__17);
				setState(285);
				exp();
				setState(286);
				match(T__18);
				setState(287);
				expprefixo2();
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

	public static class Expprefixo2Context extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Expprefixo2Context expprefixo2() {
			return getRuleContext(Expprefixo2Context.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expprefixo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo2(this);
		}
	}

	public final Expprefixo2Context expprefixo2() throws RecognitionException {
		Expprefixo2Context _localctx = new Expprefixo2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_expprefixo2);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				args();
				setState(292);
				expprefixo2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__2);
				setState(295);
				match(Nome);
				setState(296);
				args();
				setState(297);
				expprefixo2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(T__26);
				setState(300);
				exp();
				setState(301);
				match(T__27);
				setState(302);
				expprefixo2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class VarContext extends ParserRuleContext {
		public Token nome;
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				((VarContext)_localctx).nome = match(Nome);
				TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).nome!=null?((VarContext)_localctx).nome.getText():null),Tipo.VARIAVEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				expprefixo();
				setState(310);
				match(T__26);
				setState(311);
				exp();
				setState(312);
				match(T__27);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				expprefixo();
				setState(315);
				match(T__21);
				setState(316);
				match(Nome);
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

	public static class ArgsContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(T__17);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(321);
					listaexp();
					}
				}

				setState(324);
				match(T__18);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				construtortabela();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(Cadeia);
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

	public static class FuncaoContext extends ParserRuleContext {
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__15);
			setState(330);
			corpodafuncao();
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

	public static class CorpodafuncaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ListaparContext listapar() {
			return getRuleContext(ListaparContext.class,0);
		}
		public CorpodafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpodafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCorpodafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCorpodafuncao(this);
		}
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__17);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25 || _la==Nome) {
				{
				setState(333);
				listapar();
				}
			}

			setState(336);
			match(T__18);
			setState(337);
			bloco();
			setState(338);
			match(T__4);
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

	public static class ListaparContext extends ParserRuleContext {
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public ListaparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listapar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListapar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListapar(this);
		}
	}

	public final ListaparContext listapar() throws RecognitionException {
		ListaparContext _localctx = new ListaparContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listapar);
		int _la;
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				listadenomes();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(341);
					match(T__13);
					setState(342);
					match(T__25);
					}
				}

				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(T__25);
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

	public static class ConstrutortabelaContext extends ParserRuleContext {
		public ListadecamposContext listadecampos() {
			return getRuleContext(ListadecamposContext.class,0);
		}
		public ConstrutortabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtortabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConstrutortabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConstrutortabela(this);
		}
	}

	public final ConstrutortabelaContext construtortabela() throws RecognitionException {
		ConstrutortabelaContext _localctx = new ConstrutortabelaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_construtortabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(T__28);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
				{
				setState(349);
				listadecampos();
				}
			}

			setState(352);
			match(T__29);
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

	public static class ListadecamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<SeparadordecamposContext> separadordecampos() {
			return getRuleContexts(SeparadordecamposContext.class);
		}
		public SeparadordecamposContext separadordecampos(int i) {
			return getRuleContext(SeparadordecamposContext.class,i);
		}
		public ListadecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadecampos(this);
		}
	}

	public final ListadecamposContext listadecampos() throws RecognitionException {
		ListadecamposContext _localctx = new ListadecamposContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			campo();
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					separadordecampos();
					setState(356);
					campo();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__13) {
				{
				setState(363);
				separadordecampos();
				}
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

	public static class CampoContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCampo(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_campo);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(T__26);
				setState(367);
				exp();
				setState(368);
				match(T__27);
				setState(369);
				match(T__1);
				setState(370);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(Nome);
				setState(373);
				match(T__1);
				setState(374);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				exp();
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

	public static class SeparadordecamposContext extends ParserRuleContext {
		public SeparadordecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadordecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterSeparadordecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitSeparadordecampos(this);
		}
	}

	public final SeparadordecamposContext separadordecampos() throws RecognitionException {
		SeparadordecamposContext _localctx = new SeparadordecamposContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__13) ) {
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

	public static class OpbinContext extends ParserRuleContext {
		public OpbinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpbin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpbin(this);
		}
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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

	public static class OpunariaContext extends ParserRuleContext {
		public OpunariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opunaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpunaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpunaria(this);
		}
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0183\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\5\3;\n\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\3\3\3\5\3D\n\3\5\3F\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5o\n\5\f\5\16\5r\13\5\3\5"+
		"\3\5\5\5v\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009c\n\5\5\5\u009e\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00b9\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c3\n"+
		"\7\3\b\3\b\5\b\u00c7\n\b\3\b\5\b\u00ca\n\b\3\t\3\t\3\t\3\t\7\t\u00d0\n"+
		"\t\f\t\16\t\u00d3\13\t\3\t\3\t\5\t\u00d7\n\t\3\n\3\n\3\n\7\n\u00dc\n\n"+
		"\f\n\16\n\u00df\13\n\3\13\3\13\3\13\3\13\3\13\7\13\u00e6\n\13\f\13\16"+
		"\13\u00e9\13\13\3\f\3\f\3\f\7\f\u00ee\n\f\f\f\16\f\u00f1\13\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010e\n\r\3\16\3\16\3\16\7\16\u0113"+
		"\n\16\f\16\16\16\u0116\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0124\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0134\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0141\n\21\3\22\3\22\5\22\u0145"+
		"\n\22\3\22\3\22\3\22\5\22\u014a\n\22\3\23\3\23\3\23\3\24\3\24\5\24\u0151"+
		"\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u015a\n\25\3\25\5\25\u015d"+
		"\n\25\3\26\3\26\5\26\u0161\n\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0169"+
		"\n\27\f\27\16\27\u016c\13\27\3\27\5\27\u016f\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u017b\n\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\2\5\4\2\3\3\20\20\3\2!/\4\2\"\"\60\61\2\u01a3\2\66\3\2\2\2\4>\3\2"+
		"\2\2\6G\3\2\2\2\b\u009d\3\2\2\2\n\u00b8\3\2\2\2\f\u00c2\3\2\2\2\16\u00c9"+
		"\3\2\2\2\20\u00cb\3\2\2\2\22\u00d8\3\2\2\2\24\u00e0\3\2\2\2\26\u00ef\3"+
		"\2\2\2\30\u010d\3\2\2\2\32\u0114\3\2\2\2\34\u0123\3\2\2\2\36\u0133\3\2"+
		"\2\2 \u0140\3\2\2\2\"\u0149\3\2\2\2$\u014b\3\2\2\2&\u014e\3\2\2\2(\u015c"+
		"\3\2\2\2*\u015e\3\2\2\2,\u0164\3\2\2\2.\u017a\3\2\2\2\60\u017c\3\2\2\2"+
		"\62\u017e\3\2\2\2\64\u0180\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\28:\5\b\5"+
		"\29;\7\3\2\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<8\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?E\3\2\2\2@>\3\2\2\2AC\5\16\b\2BD\7\3\2\2CB\3\2\2\2CD\3\2"+
		"\2\2DF\3\2\2\2EA\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GH\5\4\3\2H\7\3\2\2\2IJ\5"+
		"\22\n\2JK\7\4\2\2KL\5\26\f\2L\u009e\3\2\2\2MN\5\34\17\2NO\b\5\1\2OP\5"+
		"\"\22\2P\u009e\3\2\2\2QR\5\34\17\2RS\7\5\2\2ST\7\62\2\2TU\5\"\22\2U\u009e"+
		"\3\2\2\2VW\7\6\2\2WX\5\6\4\2XY\7\7\2\2Y\u009e\3\2\2\2Z[\7\b\2\2[\\\5\30"+
		"\r\2\\]\7\6\2\2]^\5\6\4\2^_\7\7\2\2_\u009e\3\2\2\2`a\7\t\2\2ab\5\6\4\2"+
		"bc\7\n\2\2cd\5\30\r\2d\u009e\3\2\2\2ef\7\13\2\2fg\5\30\r\2gh\7\f\2\2h"+
		"p\5\6\4\2ij\7\r\2\2jk\5\30\r\2kl\7\f\2\2lm\5\6\4\2mo\3\2\2\2ni\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qu\3\2\2\2rp\3\2\2\2st\7\16\2\2tv\5\6\4"+
		"\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\7\2\2x\u009e\3\2\2\2yz\7\17\2\2z"+
		"{\7\62\2\2{|\7\4\2\2|}\5\30\r\2}~\7\20\2\2~\u0081\5\30\r\2\177\u0080\7"+
		"\20\2\2\u0080\u0082\5\30\r\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\7\6\2\2\u0084\u0085\5\6\4\2\u0085\u0086\7\7"+
		"\2\2\u0086\u009e\3\2\2\2\u0087\u0088\7\17\2\2\u0088\u0089\5\24\13\2\u0089"+
		"\u008a\7\21\2\2\u008a\u008b\5\26\f\2\u008b\u008c\7\6\2\2\u008c\u008d\5"+
		"\6\4\2\u008d\u008e\7\7\2\2\u008e\u009e\3\2\2\2\u008f\u0090\7\22\2\2\u0090"+
		"\u0091\5\20\t\2\u0091\u0092\5&\24\2\u0092\u009e\3\2\2\2\u0093\u0094\7"+
		"\23\2\2\u0094\u0095\7\22\2\2\u0095\u0096\7\62\2\2\u0096\u009e\5&\24\2"+
		"\u0097\u0098\7\23\2\2\u0098\u009b\5\24\13\2\u0099\u009a\7\4\2\2\u009a"+
		"\u009c\5\26\f\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3"+
		"\2\2\2\u009dI\3\2\2\2\u009dM\3\2\2\2\u009dQ\3\2\2\2\u009dV\3\2\2\2\u009d"+
		"Z\3\2\2\2\u009d`\3\2\2\2\u009de\3\2\2\2\u009dy\3\2\2\2\u009d\u0087\3\2"+
		"\2\2\u009d\u008f\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u0097\3\2\2\2\u009e"+
		"\t\3\2\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\5\"\22\2\u00a1\u00a2\5\f\7"+
		"\2\u00a2\u00b9\3\2\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\5\30\r\2\u00a5"+
		"\u00a6\7\25\2\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\5\f\7\2\u00a8\u00b9\3"+
		"\2\2\2\u00a9\u00aa\5 \21\2\u00aa\u00ab\7\5\2\2\u00ab\u00ac\7\62\2\2\u00ac"+
		"\u00ad\5\"\22\2\u00ad\u00ae\5\f\7\2\u00ae\u00b9\3\2\2\2\u00af\u00b0\7"+
		"\24\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\7\25\2\2\u00b2\u00b3\7\5\2\2"+
		"\u00b3\u00b4\7\62\2\2\u00b4\u00b5\5\"\22\2\u00b5\u00b6\5\f\7\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b9\5\f\7\2\u00b8\u009f\3\2\2\2\u00b8\u00a3\3\2\2\2\u00b8"+
		"\u00a9\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\13\3\2\2"+
		"\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\5\f\7\2\u00bc\u00c3\3\2\2\2\u00bd"+
		"\u00be\7\5\2\2\u00be\u00bf\7\62\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\5"+
		"\f\7\2\u00c1\u00c3\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3"+
		"\r\3\2\2\2\u00c4\u00c6\7\26\2\2\u00c5\u00c7\5\26\f\2\u00c6\u00c5\3\2\2"+
		"\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00ca\7\27\2\2\u00c9"+
		"\u00c4\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\17\3\2\2\2\u00cb\u00cc\7\62\2"+
		"\2\u00cc\u00d1\b\t\1\2\u00cd\u00ce\7\30\2\2\u00ce\u00d0\7\62\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\5\2\2\u00d5"+
		"\u00d7\7\62\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\21\3\2\2"+
		"\2\u00d8\u00dd\5 \21\2\u00d9\u00da\7\20\2\2\u00da\u00dc\5 \21\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\23\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\62\2\2\u00e1\u00e7"+
		"\b\13\1\2\u00e2\u00e3\7\20\2\2\u00e3\u00e4\7\62\2\2\u00e4\u00e6\b\13\1"+
		"\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\25\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\30\r\2\u00eb"+
		"\u00ec\7\20\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f3\5\30\r\2\u00f3\27\3\2\2\2\u00f4\u00f5\7\31"+
		"\2\2\u00f5\u010e\5\32\16\2\u00f6\u00f7\7\32\2\2\u00f7\u010e\5\32\16\2"+
		"\u00f8\u00f9\7\33\2\2\u00f9\u010e\5\32\16\2\u00fa\u00fb\7\63\2\2\u00fb"+
		"\u010e\5\32\16\2\u00fc\u00fd\7\64\2\2\u00fd\u010e\5\32\16\2\u00fe\u00ff"+
		"\7\34\2\2\u00ff\u010e\5\32\16\2\u0100\u0101\5$\23\2\u0101\u0102\5\32\16"+
		"\2\u0102\u010e\3\2\2\2\u0103\u0104\5\34\17\2\u0104\u0105\5\32\16\2\u0105"+
		"\u010e\3\2\2\2\u0106\u0107\5*\26\2\u0107\u0108\5\32\16\2\u0108\u010e\3"+
		"\2\2\2\u0109\u010a\5\64\33\2\u010a\u010b\5\30\r\2\u010b\u010c\5\32\16"+
		"\2\u010c\u010e\3\2\2\2\u010d\u00f4\3\2\2\2\u010d\u00f6\3\2\2\2\u010d\u00f8"+
		"\3\2\2\2\u010d\u00fa\3\2\2\2\u010d\u00fc\3\2\2\2\u010d\u00fe\3\2\2\2\u010d"+
		"\u0100\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010e\31\3\2\2\2\u010f\u0110\5\62\32\2\u0110\u0111\5\30\r\2\u0111"+
		"\u0113\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\33\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118"+
		"\7\62\2\2\u0118\u0124\5\36\20\2\u0119\u011a\7\62\2\2\u011a\u011b\7\30"+
		"\2\2\u011b\u011c\7\62\2\2\u011c\u011d\b\17\1\2\u011d\u0124\5\36\20\2\u011e"+
		"\u011f\7\24\2\2\u011f\u0120\5\30\r\2\u0120\u0121\7\25\2\2\u0121\u0122"+
		"\5\36\20\2\u0122\u0124\3\2\2\2\u0123\u0117\3\2\2\2\u0123\u0119\3\2\2\2"+
		"\u0123\u011e\3\2\2\2\u0124\35\3\2\2\2\u0125\u0126\5\"\22\2\u0126\u0127"+
		"\5\36\20\2\u0127\u0134\3\2\2\2\u0128\u0129\7\5\2\2\u0129\u012a\7\62\2"+
		"\2\u012a\u012b\5\"\22\2\u012b\u012c\5\36\20\2\u012c\u0134\3\2\2\2\u012d"+
		"\u012e\7\35\2\2\u012e\u012f\5\30\r\2\u012f\u0130\7\36\2\2\u0130\u0131"+
		"\5\36\20\2\u0131\u0134\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0125\3\2\2\2"+
		"\u0133\u0128\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0132\3\2\2\2\u0134\37"+
		"\3\2\2\2\u0135\u0136\7\62\2\2\u0136\u0141\b\21\1\2\u0137\u0138\5\34\17"+
		"\2\u0138\u0139\7\35\2\2\u0139\u013a\5\30\r\2\u013a\u013b\7\36\2\2\u013b"+
		"\u0141\3\2\2\2\u013c\u013d\5\34\17\2\u013d\u013e\7\30\2\2\u013e\u013f"+
		"\7\62\2\2\u013f\u0141\3\2\2\2\u0140\u0135\3\2\2\2\u0140\u0137\3\2\2\2"+
		"\u0140\u013c\3\2\2\2\u0141!\3\2\2\2\u0142\u0144\7\24\2\2\u0143\u0145\5"+
		"\26\f\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u014a\7\25\2\2\u0147\u014a\5*\26\2\u0148\u014a\7\64\2\2\u0149\u0142\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a#\3\2\2\2\u014b\u014c"+
		"\7\22\2\2\u014c\u014d\5&\24\2\u014d%\3\2\2\2\u014e\u0150\7\24\2\2\u014f"+
		"\u0151\5(\25\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\7\25\2\2\u0153\u0154\5\6\4\2\u0154\u0155\7\7\2\2\u0155"+
		"\'\3\2\2\2\u0156\u0159\5\24\13\2\u0157\u0158\7\20\2\2\u0158\u015a\7\34"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u015d\7\34\2\2\u015c\u0156\3\2\2\2\u015c\u015b\3\2\2\2\u015d)\3\2\2\2"+
		"\u015e\u0160\7\37\2\2\u015f\u0161\5,\27\2\u0160\u015f\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7 \2\2\u0163+\3\2\2\2\u0164\u016a"+
		"\5.\30\2\u0165\u0166\5\60\31\2\u0166\u0167\5.\30\2\u0167\u0169\3\2\2\2"+
		"\u0168\u0165\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f\5\60\31\2"+
		"\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f-\3\2\2\2\u0170\u0171\7"+
		"\35\2\2\u0171\u0172\5\30\r\2\u0172\u0173\7\36\2\2\u0173\u0174\7\4\2\2"+
		"\u0174\u0175\5\30\r\2\u0175\u017b\3\2\2\2\u0176\u0177\7\62\2\2\u0177\u0178"+
		"\7\4\2\2\u0178\u017b\5\30\r\2\u0179\u017b\5\30\r\2\u017a\u0170\3\2\2\2"+
		"\u017a\u0176\3\2\2\2\u017a\u0179\3\2\2\2\u017b/\3\2\2\2\u017c\u017d\t"+
		"\2\2\2\u017d\61\3\2\2\2\u017e\u017f\t\3\2\2\u017f\63\3\2\2\2\u0180\u0181"+
		"\t\4\2\2\u0181\65\3\2\2\2\":>CEpu\u0081\u009b\u009d\u00b8\u00c2\u00c6"+
		"\u00c9\u00d1\u00d6\u00dd\u00e7\u00ef\u010d\u0114\u0123\u0133\u0140\u0144"+
		"\u0149\u0150\u0159\u015c\u0160\u016a\u016e\u017a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}