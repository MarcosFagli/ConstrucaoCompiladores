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
		RULE_cf2 = 4, RULE_ultimocomando = 5, RULE_nomedafuncao = 6, RULE_listavar = 7, 
		RULE_listadenomes = 8, RULE_listaexp = 9, RULE_exp = 10, RULE_exp2 = 11, 
		RULE_expprefixo = 12, RULE_expprefixo2 = 13, RULE_var = 14, RULE_args = 15, 
		RULE_funcao = 16, RULE_corpodafuncao = 17, RULE_listapar = 18, RULE_construtortabela = 19, 
		RULE_listadecampos = 20, RULE_campo = 21, RULE_separadordecampos = 22, 
		RULE_opbin = 23, RULE_opunaria = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "trecho", "bloco", "comando", "cf2", "ultimocomando", "nomedafuncao", 
			"listavar", "listadenomes", "listaexp", "exp", "exp2", "expprefixo", 
			"expprefixo2", "var", "args", "funcao", "corpodafuncao", "listapar", 
			"construtortabela", "listadecampos", "campo", "separadordecampos", "opbin", 
			"opunaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "':'", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
			"'if'", "'then'", "'elseif'", "'else'", "'for'", "','", "'in'", "'function'", 
			"'local'", "'return'", "'break'", "'.'", "'nil'", "'false'", "'true'", 
			"'...'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'^'", "'%'", "'..'", "'<'", "'<='", "'>'", "'>='", "'=='", "'~='", 
			"'and'", "'or'", "'not'", "'#'"
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
			setState(50);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__24) | (1L << Nome))) != 0)) {
				{
				{
				setState(52);
				comando();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(53);
					match(T__0);
					}
				}

				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(61);
				ultimocomando();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(62);
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
			setState(67);
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
		public ArgsContext a2;
		public Token nome1;
		public ListaexpContext list;
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				listavar();
				setState(70);
				match(T__1);
				setState(71);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(73);
				((ComandoContext)_localctx).exp1 = expprefixo();
				setState(74);
				args();
				}
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).exp1!=null?_input.getText(((ComandoContext)_localctx).exp1.start,((ComandoContext)_localctx).exp1.stop):null), Tipo.FUNCAO); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(78);
				expprefixo();
				setState(79);
				match(T__2);
				setState(80);
				match(Nome);
				setState(81);
				((ComandoContext)_localctx).a2 = args();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				expprefixo();
				setState(84);
				match(T__2);
				setState(85);
				match(Nome);
				setState(86);
				args();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(T__3);
				setState(89);
				bloco();
				setState(90);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(T__5);
				setState(93);
				exp();
				setState(94);
				match(T__3);
				setState(95);
				bloco();
				setState(96);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				match(T__6);
				setState(99);
				bloco();
				setState(100);
				match(T__7);
				setState(101);
				exp();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(103);
				match(T__8);
				setState(104);
				exp();
				setState(105);
				match(T__9);
				setState(106);
				bloco();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(107);
					match(T__10);
					setState(108);
					exp();
					setState(109);
					match(T__9);
					setState(110);
					bloco();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(117);
					match(T__11);
					setState(118);
					bloco();
					}
				}

				setState(121);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				match(T__12);
				setState(124);
				((ComandoContext)_localctx).nome1 = match(Nome);
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).nome1!=null?((ComandoContext)_localctx).nome1.getText():null), Tipo.VARIAVEL); 
				setState(126);
				match(T__1);
				setState(127);
				exp();
				setState(128);
				match(T__13);
				setState(129);
				exp();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(130);
					match(T__13);
					setState(131);
					exp();
					}
				}

				setState(134);
				match(T__3);
				setState(135);
				bloco();
				setState(136);
				match(T__4);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
				match(T__12);
				setState(139);
				listadenomes();
				setState(140);
				match(T__14);
				setState(141);
				listaexp();
				setState(142);
				match(T__3);
				setState(143);
				bloco();
				setState(144);
				match(T__4);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(146);
				match(T__15);
				setState(147);
				nomedafuncao();
				setState(148);
				corpodafuncao();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(150);
				match(T__16);
				setState(151);
				match(T__15);
				setState(152);
				match(Nome);
				setState(153);
				corpodafuncao();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(154);
				match(T__16);
				setState(155);
				listadenomes();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(156);
					match(T__1);
					setState(157);
					((ComandoContext)_localctx).list = listaexp();
					 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).list!=null?_input.getText(((ComandoContext)_localctx).list.start,((ComandoContext)_localctx).list.stop):null), Tipo.VARIAVEL); 
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
		enterRule(_localctx, 8, RULE_cf2);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__28:
			case Cadeia:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				args();
				setState(165);
				cf2();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__2);
				setState(168);
				match(Nome);
				setState(169);
				args();
				setState(170);
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
		enterRule(_localctx, 10, RULE_ultimocomando);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__17);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(175);
					listaexp();
					}
				}

				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T__18);
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
		enterRule(_localctx, 12, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((NomedafuncaoContext)_localctx).nome = match(Nome);
			TabelaDeSimbolos.adicionarSimbolo((((NomedafuncaoContext)_localctx).nome!=null?((NomedafuncaoContext)_localctx).nome.getText():null),Tipo.FUNCAO);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(183);
				match(T__19);
				setState(184);
				match(Nome);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(190);
				match(T__2);
				setState(191);
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
		enterRule(_localctx, 14, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			var();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(195);
				match(T__13);
				setState(196);
				var();
				}
				}
				setState(201);
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
		enterRule(_localctx, 16, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((ListadenomesContext)_localctx).nome1 = match(Nome);
			TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).nome1!=null?((ListadenomesContext)_localctx).nome1.getText():null),Tipo.VARIAVEL);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(T__13);
					setState(205);
					((ListadenomesContext)_localctx).nome2 = match(Nome);
					TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).nome2!=null?((ListadenomesContext)_localctx).nome2.getText():null),Tipo.VARIAVEL);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 18, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					exp();
					setState(213);
					match(T__13);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(220);
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
		enterRule(_localctx, 20, RULE_exp);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__20);
				setState(223);
				exp2();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__21);
				setState(225);
				exp2();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(T__22);
				setState(227);
				exp2();
				}
				break;
			case Numero:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(Numero);
				setState(229);
				exp2();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(Cadeia);
				setState(231);
				exp2();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(T__23);
				setState(233);
				exp2();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				funcao();
				setState(235);
				exp2();
				}
				break;
			case T__24:
			case Nome:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				expprefixo();
				setState(238);
				exp2();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				construtortabela();
				setState(241);
				exp2();
				}
				break;
			case T__31:
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 10);
				{
				setState(243);
				opunaria();
				setState(244);
				exp();
				setState(245);
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
		enterRule(_localctx, 22, RULE_exp2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					opbin();
					setState(250);
					exp();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public Token nome2;
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
		enterRule(_localctx, 24, RULE_expprefixo);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(Nome);
				setState(258);
				expprefixo2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				((ExpprefixoContext)_localctx).nome1 = match(Nome);
				{
				setState(260);
				match(T__19);
				setState(261);
				((ExpprefixoContext)_localctx).nome2 = match(Nome);
				setState(262);
				expprefixo2();
				}
				TabelaDeSimbolos.adicionarSimbolo((((ExpprefixoContext)_localctx).nome1!=null?((ExpprefixoContext)_localctx).nome1.getText():null) + '.' + (((ExpprefixoContext)_localctx).nome2!=null?((ExpprefixoContext)_localctx).nome2.getText():null),Tipo.FUNCAO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(T__24);
				setState(267);
				exp();
				setState(268);
				match(T__25);
				setState(269);
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
		enterRule(_localctx, 26, RULE_expprefixo2);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				args();
				setState(274);
				expprefixo2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__2);
				setState(277);
				match(Nome);
				setState(278);
				args();
				setState(279);
				expprefixo2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(T__26);
				setState(282);
				exp();
				setState(283);
				match(T__27);
				setState(284);
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
		enterRule(_localctx, 28, RULE_var);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				((VarContext)_localctx).nome = match(Nome);
				TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).nome!=null?((VarContext)_localctx).nome.getText():null),Tipo.VARIAVEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				expprefixo();
				setState(292);
				match(T__26);
				setState(293);
				exp();
				setState(294);
				match(T__27);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				expprefixo();
				setState(297);
				match(T__19);
				setState(298);
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
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__24);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(303);
					listaexp();
					}
				}

				setState(306);
				match(T__25);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				construtortabela();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
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
		enterRule(_localctx, 32, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__15);
			setState(312);
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
		enterRule(_localctx, 34, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__24);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23 || _la==Nome) {
				{
				setState(315);
				listapar();
				}
			}

			setState(318);
			match(T__25);
			setState(319);
			bloco();
			setState(320);
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
		enterRule(_localctx, 36, RULE_listapar);
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				listadenomes();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(323);
					match(T__13);
					setState(324);
					match(T__23);
					}
				}

				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(T__23);
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
		enterRule(_localctx, 38, RULE_construtortabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__28);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
				{
				setState(331);
				listadecampos();
				}
			}

			setState(334);
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
		enterRule(_localctx, 40, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			campo();
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(337);
					separadordecampos();
					setState(338);
					campo();
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__13) {
				{
				setState(345);
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
		enterRule(_localctx, 42, RULE_campo);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(T__26);
				setState(349);
				exp();
				setState(350);
				match(T__27);
				setState(351);
				match(T__1);
				setState(352);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(Nome);
				setState(355);
				match(T__1);
				setState(356);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
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
		enterRule(_localctx, 44, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		enterRule(_localctx, 46, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		enterRule(_localctx, 48, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0171\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\5\39\n\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\5"+
		"\3B\n\3\5\3D\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5s\n\5\f\5"+
		"\16\5v\13\5\3\5\3\5\5\5z\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0087\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a3\n\5\5\5\u00a5"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00af\n\6\3\7\3\7\5\7\u00b3\n"+
		"\7\3\7\5\7\u00b6\n\7\3\b\3\b\3\b\3\b\7\b\u00bc\n\b\f\b\16\b\u00bf\13\b"+
		"\3\b\3\b\5\b\u00c3\n\b\3\t\3\t\3\t\7\t\u00c8\n\t\f\t\16\t\u00cb\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\13\3\13\3\13\7"+
		"\13\u00da\n\13\f\13\16\13\u00dd\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00fa\n\f\3\r\3\r\3\r\7\r\u00ff\n\r\f\r\16\r\u0102\13\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0112\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0122\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u012f\n\20\3\21\3\21\5\21\u0133\n\21\3\21\3\21\3"+
		"\21\5\21\u0138\n\21\3\22\3\22\3\22\3\23\3\23\5\23\u013f\n\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\5\24\u0148\n\24\3\24\5\24\u014b\n\24\3\25\3"+
		"\25\5\25\u014f\n\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0157\n\26\f\26"+
		"\16\26\u015a\13\26\3\26\5\26\u015d\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0169\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\5\4\2"+
		"\3\3\20\20\3\2!/\4\2\"\"\60\61\2\u018f\2\64\3\2\2\2\4<\3\2\2\2\6E\3\2"+
		"\2\2\b\u00a4\3\2\2\2\n\u00ae\3\2\2\2\f\u00b5\3\2\2\2\16\u00b7\3\2\2\2"+
		"\20\u00c4\3\2\2\2\22\u00cc\3\2\2\2\24\u00db\3\2\2\2\26\u00f9\3\2\2\2\30"+
		"\u0100\3\2\2\2\32\u0111\3\2\2\2\34\u0121\3\2\2\2\36\u012e\3\2\2\2 \u0137"+
		"\3\2\2\2\"\u0139\3\2\2\2$\u013c\3\2\2\2&\u014a\3\2\2\2(\u014c\3\2\2\2"+
		"*\u0152\3\2\2\2,\u0168\3\2\2\2.\u016a\3\2\2\2\60\u016c\3\2\2\2\62\u016e"+
		"\3\2\2\2\64\65\5\4\3\2\65\3\3\2\2\2\668\5\b\5\2\679\7\3\2\28\67\3\2\2"+
		"\289\3\2\2\29;\3\2\2\2:\66\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=C\3\2"+
		"\2\2><\3\2\2\2?A\5\f\7\2@B\7\3\2\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2C?\3\2"+
		"\2\2CD\3\2\2\2D\5\3\2\2\2EF\5\4\3\2F\7\3\2\2\2GH\5\20\t\2HI\7\4\2\2IJ"+
		"\5\24\13\2J\u00a5\3\2\2\2KL\5\32\16\2LM\5 \21\2MN\3\2\2\2NO\b\5\1\2O\u00a5"+
		"\3\2\2\2PQ\5\32\16\2QR\7\5\2\2RS\7\62\2\2ST\5 \21\2T\u00a5\3\2\2\2UV\5"+
		"\32\16\2VW\7\5\2\2WX\7\62\2\2XY\5 \21\2Y\u00a5\3\2\2\2Z[\7\6\2\2[\\\5"+
		"\6\4\2\\]\7\7\2\2]\u00a5\3\2\2\2^_\7\b\2\2_`\5\26\f\2`a\7\6\2\2ab\5\6"+
		"\4\2bc\7\7\2\2c\u00a5\3\2\2\2de\7\t\2\2ef\5\6\4\2fg\7\n\2\2gh\5\26\f\2"+
		"h\u00a5\3\2\2\2ij\7\13\2\2jk\5\26\f\2kl\7\f\2\2lt\5\6\4\2mn\7\r\2\2no"+
		"\5\26\f\2op\7\f\2\2pq\5\6\4\2qs\3\2\2\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2"+
		"tu\3\2\2\2uy\3\2\2\2vt\3\2\2\2wx\7\16\2\2xz\5\6\4\2yw\3\2\2\2yz\3\2\2"+
		"\2z{\3\2\2\2{|\7\7\2\2|\u00a5\3\2\2\2}~\7\17\2\2~\177\7\62\2\2\177\u0080"+
		"\b\5\1\2\u0080\u0081\7\4\2\2\u0081\u0082\5\26\f\2\u0082\u0083\7\20\2\2"+
		"\u0083\u0086\5\26\f\2\u0084\u0085\7\20\2\2\u0085\u0087\5\26\f\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\6"+
		"\2\2\u0089\u008a\5\6\4\2\u008a\u008b\7\7\2\2\u008b\u00a5\3\2\2\2\u008c"+
		"\u008d\7\17\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\21\2\2\u008f\u0090"+
		"\5\24\13\2\u0090\u0091\7\6\2\2\u0091\u0092\5\6\4\2\u0092\u0093\7\7\2\2"+
		"\u0093\u00a5\3\2\2\2\u0094\u0095\7\22\2\2\u0095\u0096\5\16\b\2\u0096\u0097"+
		"\5$\23\2\u0097\u00a5\3\2\2\2\u0098\u0099\7\23\2\2\u0099\u009a\7\22\2\2"+
		"\u009a\u009b\7\62\2\2\u009b\u00a5\5$\23\2\u009c\u009d\7\23\2\2\u009d\u00a2"+
		"\5\22\n\2\u009e\u009f\7\4\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\b\5\1"+
		"\2\u00a1\u00a3\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4G\3\2\2\2\u00a4K\3\2\2\2\u00a4P\3\2\2\2\u00a4U\3\2\2\2\u00a4"+
		"Z\3\2\2\2\u00a4^\3\2\2\2\u00a4d\3\2\2\2\u00a4i\3\2\2\2\u00a4}\3\2\2\2"+
		"\u00a4\u008c\3\2\2\2\u00a4\u0094\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4\u009c"+
		"\3\2\2\2\u00a5\t\3\2\2\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\5\n\6\2\u00a8"+
		"\u00af\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\7\62\2\2\u00ab\u00ac\5"+
		" \21\2\u00ac\u00ad\5\n\6\2\u00ad\u00af\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae"+
		"\u00a9\3\2\2\2\u00af\13\3\2\2\2\u00b0\u00b2\7\24\2\2\u00b1\u00b3\5\24"+
		"\13\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b6\7\25\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\r\3\2\2"+
		"\2\u00b7\u00b8\7\62\2\2\u00b8\u00bd\b\b\1\2\u00b9\u00ba\7\26\2\2\u00ba"+
		"\u00bc\7\62\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c1\7\5\2\2\u00c1\u00c3\7\62\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\17\3\2\2\2\u00c4\u00c9\5\36\20\2\u00c5\u00c6\7\20\2\2\u00c6"+
		"\u00c8\5\36\20\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\21\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7\62\2\2\u00cd\u00d3\b\n\1\2\u00ce\u00cf\7\20\2\2\u00cf\u00d0\7"+
		"\62\2\2\u00d0\u00d2\b\n\1\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\23\3\2\2\2\u00d5\u00d3\3\2\2"+
		"\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\7\20\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\5\26\f\2\u00df"+
		"\25\3\2\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00fa\5\30\r\2\u00e2\u00e3\7\30"+
		"\2\2\u00e3\u00fa\5\30\r\2\u00e4\u00e5\7\31\2\2\u00e5\u00fa\5\30\r\2\u00e6"+
		"\u00e7\7\63\2\2\u00e7\u00fa\5\30\r\2\u00e8\u00e9\7\64\2\2\u00e9\u00fa"+
		"\5\30\r\2\u00ea\u00eb\7\32\2\2\u00eb\u00fa\5\30\r\2\u00ec\u00ed\5\"\22"+
		"\2\u00ed\u00ee\5\30\r\2\u00ee\u00fa\3\2\2\2\u00ef\u00f0\5\32\16\2\u00f0"+
		"\u00f1\5\30\r\2\u00f1\u00fa\3\2\2\2\u00f2\u00f3\5(\25\2\u00f3\u00f4\5"+
		"\30\r\2\u00f4\u00fa\3\2\2\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7\5\26\f\2"+
		"\u00f7\u00f8\5\30\r\2\u00f8\u00fa\3\2\2\2\u00f9\u00e0\3\2\2\2\u00f9\u00e2"+
		"\3\2\2\2\u00f9\u00e4\3\2\2\2\u00f9\u00e6\3\2\2\2\u00f9\u00e8\3\2\2\2\u00f9"+
		"\u00ea\3\2\2\2\u00f9\u00ec\3\2\2\2\u00f9\u00ef\3\2\2\2\u00f9\u00f2\3\2"+
		"\2\2\u00f9\u00f5\3\2\2\2\u00fa\27\3\2\2\2\u00fb\u00fc\5\60\31\2\u00fc"+
		"\u00fd\5\26\f\2\u00fd\u00ff\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3"+
		"\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\31\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7\62\2\2\u0104\u0112\5\34\17\2\u0105\u0106"+
		"\7\62\2\2\u0106\u0107\7\26\2\2\u0107\u0108\7\62\2\2\u0108\u0109\5\34\17"+
		"\2\u0109\u010a\3\2\2\2\u010a\u010b\b\16\1\2\u010b\u0112\3\2\2\2\u010c"+
		"\u010d\7\33\2\2\u010d\u010e\5\26\f\2\u010e\u010f\7\34\2\2\u010f\u0110"+
		"\5\34\17\2\u0110\u0112\3\2\2\2\u0111\u0103\3\2\2\2\u0111\u0105\3\2\2\2"+
		"\u0111\u010c\3\2\2\2\u0112\33\3\2\2\2\u0113\u0114\5 \21\2\u0114\u0115"+
		"\5\34\17\2\u0115\u0122\3\2\2\2\u0116\u0117\7\5\2\2\u0117\u0118\7\62\2"+
		"\2\u0118\u0119\5 \21\2\u0119\u011a\5\34\17\2\u011a\u0122\3\2\2\2\u011b"+
		"\u011c\7\35\2\2\u011c\u011d\5\26\f\2\u011d\u011e\7\36\2\2\u011e\u011f"+
		"\5\34\17\2\u011f\u0122\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u0113\3\2\2\2"+
		"\u0121\u0116\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u0120\3\2\2\2\u0122\35"+
		"\3\2\2\2\u0123\u0124\7\62\2\2\u0124\u012f\b\20\1\2\u0125\u0126\5\32\16"+
		"\2\u0126\u0127\7\35\2\2\u0127\u0128\5\26\f\2\u0128\u0129\7\36\2\2\u0129"+
		"\u012f\3\2\2\2\u012a\u012b\5\32\16\2\u012b\u012c\7\26\2\2\u012c\u012d"+
		"\7\62\2\2\u012d\u012f\3\2\2\2\u012e\u0123\3\2\2\2\u012e\u0125\3\2\2\2"+
		"\u012e\u012a\3\2\2\2\u012f\37\3\2\2\2\u0130\u0132\7\33\2\2\u0131\u0133"+
		"\5\24\13\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2"+
		"\u0134\u0138\7\34\2\2\u0135\u0138\5(\25\2\u0136\u0138\7\64\2\2\u0137\u0130"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138!\3\2\2\2\u0139"+
		"\u013a\7\22\2\2\u013a\u013b\5$\23\2\u013b#\3\2\2\2\u013c\u013e\7\33\2"+
		"\2\u013d\u013f\5&\24\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0141\7\34\2\2\u0141\u0142\5\6\4\2\u0142\u0143\7\7\2\2"+
		"\u0143%\3\2\2\2\u0144\u0147\5\22\n\2\u0145\u0146\7\20\2\2\u0146\u0148"+
		"\7\32\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2"+
		"\u0149\u014b\7\32\2\2\u014a\u0144\3\2\2\2\u014a\u0149\3\2\2\2\u014b\'"+
		"\3\2\2\2\u014c\u014e\7\37\2\2\u014d\u014f\5*\26\2\u014e\u014d\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7 \2\2\u0151)\3\2"+
		"\2\2\u0152\u0158\5,\27\2\u0153\u0154\5.\30\2\u0154\u0155\5,\27\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0153\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015d\5.\30\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d+\3\2\2\2"+
		"\u015e\u015f\7\35\2\2\u015f\u0160\5\26\f\2\u0160\u0161\7\36\2\2\u0161"+
		"\u0162\7\4\2\2\u0162\u0163\5\26\f\2\u0163\u0169\3\2\2\2\u0164\u0165\7"+
		"\62\2\2\u0165\u0166\7\4\2\2\u0166\u0169\5\26\f\2\u0167\u0169\5\26\f\2"+
		"\u0168\u015e\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0167\3\2\2\2\u0169-\3"+
		"\2\2\2\u016a\u016b\t\2\2\2\u016b/\3\2\2\2\u016c\u016d\t\3\2\2\u016d\61"+
		"\3\2\2\2\u016e\u016f\t\4\2\2\u016f\63\3\2\2\2!8<ACty\u0086\u00a2\u00a4"+
		"\u00ae\u00b2\u00b5\u00bd\u00c2\u00c9\u00d3\u00db\u00f9\u0100\u0111\u0121"+
		"\u012e\u0132\u0137\u013e\u0147\u014a\u014e\u0158\u015c\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}