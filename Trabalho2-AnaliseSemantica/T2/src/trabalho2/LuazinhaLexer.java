// Generated from Luazinha.g4 by ANTLR 4.7.2
package trabalho2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuazinhaLexer extends Lexer {
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
		T__45=46, T__46=47, NOME=48, CADEIA=49, NUMERO=50, COMENTARIO=51, WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "NOME", "CADEIA", 
			"NUMERO", "EXPOENTE", "COMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
			"'if'", "'then'", "'elseif'", "'else'", "'for'", "','", "'in'", "'function'", 
			"'local'", "'return'", "'break'", "'.'", "':'", "'['", "']'", "'nil'", 
			"'false'", "'true'", "'...'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", 
			"'*'", "'/'", "'^'", "'%'", "'..'", "'<'", "'<='", "'>'", "'>='", "'=='", 
			"'~='", "'and'", "'or'", "'not'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NOME", "CADEIA", "NUMERO", "COMENTARIO", "WS"
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


	PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();


	public LuazinhaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Luazinha.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 51:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0169\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-"+
		"\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\7\61\u0116\n\61\f\61\16\61\u0119"+
		"\13\61\3\62\3\62\7\62\u011d\n\62\f\62\16\62\u0120\13\62\3\62\3\62\3\62"+
		"\7\62\u0125\n\62\f\62\16\62\u0128\13\62\3\62\5\62\u012b\n\62\3\63\6\63"+
		"\u012e\n\63\r\63\16\63\u012f\3\63\5\63\u0133\n\63\3\63\6\63\u0136\n\63"+
		"\r\63\16\63\u0137\3\63\3\63\7\63\u013c\n\63\f\63\16\63\u013f\13\63\3\63"+
		"\5\63\u0142\n\63\3\63\3\63\6\63\u0146\n\63\r\63\16\63\u0147\3\63\5\63"+
		"\u014b\n\63\5\63\u014d\n\63\3\64\3\64\5\64\u0151\n\64\3\64\6\64\u0154"+
		"\n\64\r\64\16\64\u0155\3\65\3\65\3\65\3\65\7\65\u015c\n\65\f\65\16\65"+
		"\u015f\13\65\3\65\5\65\u0162\n\65\3\65\3\65\3\65\3\66\3\66\3\66\2\2\67"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\65k\66\3\2"+
		"\n\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17))\5\2\f\f\17\17$$\4\2GGgg\4"+
		"\2--//\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0178\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\tt\3\2\2"+
		"\2\13x\3\2\2\2\r~\3\2\2\2\17\u0085\3\2\2\2\21\u008b\3\2\2\2\23\u008e\3"+
		"\2\2\2\25\u0093\3\2\2\2\27\u009a\3\2\2\2\31\u009f\3\2\2\2\33\u00a3\3\2"+
		"\2\2\35\u00a5\3\2\2\2\37\u00a8\3\2\2\2!\u00b1\3\2\2\2#\u00b7\3\2\2\2%"+
		"\u00be\3\2\2\2\'\u00c4\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3"+
		"\2\2\2/\u00cc\3\2\2\2\61\u00d0\3\2\2\2\63\u00d6\3\2\2\2\65\u00db\3\2\2"+
		"\2\67\u00df\3\2\2\29\u00e1\3\2\2\2;\u00e3\3\2\2\2=\u00e5\3\2\2\2?\u00e7"+
		"\3\2\2\2A\u00e9\3\2\2\2C\u00eb\3\2\2\2E\u00ed\3\2\2\2G\u00ef\3\2\2\2I"+
		"\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f6\3\2\2\2O\u00f8\3\2\2\2Q\u00fb\3\2"+
		"\2\2S\u00fd\3\2\2\2U\u0100\3\2\2\2W\u0103\3\2\2\2Y\u0106\3\2\2\2[\u010a"+
		"\3\2\2\2]\u010d\3\2\2\2_\u0111\3\2\2\2a\u0113\3\2\2\2c\u012a\3\2\2\2e"+
		"\u014c\3\2\2\2g\u014e\3\2\2\2i\u0157\3\2\2\2k\u0166\3\2\2\2mn\7=\2\2n"+
		"\4\3\2\2\2op\7?\2\2p\6\3\2\2\2qr\7f\2\2rs\7q\2\2s\b\3\2\2\2tu\7g\2\2u"+
		"v\7p\2\2vw\7f\2\2w\n\3\2\2\2xy\7y\2\2yz\7j\2\2z{\7k\2\2{|\7n\2\2|}\7g"+
		"\2\2}\f\3\2\2\2~\177\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7r\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084\16\3\2\2\2\u0085"+
		"\u0086\7w\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2"+
		"\u0089\u008a\7n\2\2\u008a\20\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7"+
		"h\2\2\u008d\22\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090\7j\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7p\2\2\u0092\24\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095"+
		"\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7h\2\2\u0099\26\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e\30\3\2\2\2\u009f\u00a0\7h\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7t\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4"+
		"\34\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\36\3\2\2\2\u00a8"+
		"\u00a9\7h\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7e\2\2"+
		"\u00ac\u00ad\7v\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7q\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0 \3\2\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4"+
		"\7e\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\"\3\2\2\2\u00b7\u00b8"+
		"\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bc\u00bd\7p\2\2\u00bd$\3\2\2\2\u00be\u00bf\7d\2\2\u00bf"+
		"\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7m\2\2"+
		"\u00c3&\3\2\2\2\u00c4\u00c5\7\60\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7<\2\2"+
		"\u00c7*\3\2\2\2\u00c8\u00c9\7]\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7_\2\2\u00cb"+
		".\3\2\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\60\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3"+
		"\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"\u00d8\7t\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7g\2\2\u00da\64\3\2\2\2\u00db"+
		"\u00dc\7\60\2\2\u00dc\u00dd\7\60\2\2\u00dd\u00de\7\60\2\2\u00de\66\3\2"+
		"\2\2\u00df\u00e0\7*\2\2\u00e08\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2:\3\2\2"+
		"\2\u00e3\u00e4\7}\2\2\u00e4<\3\2\2\2\u00e5\u00e6\7\177\2\2\u00e6>\3\2"+
		"\2\2\u00e7\u00e8\7-\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7/\2\2\u00eaB\3\2\2"+
		"\2\u00eb\u00ec\7,\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7\61\2\2\u00eeF\3\2\2"+
		"\2\u00ef\u00f0\7`\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7\'\2\2\u00f2J\3\2\2"+
		"\2\u00f3\u00f4\7\60\2\2\u00f4\u00f5\7\60\2\2\u00f5L\3\2\2\2\u00f6\u00f7"+
		"\7>\2\2\u00f7N\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa\7?\2\2\u00faP\3"+
		"\2\2\2\u00fb\u00fc\7@\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7@\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ffT\3\2\2\2\u0100\u0101\7?\2\2\u0101\u0102\7?\2\2\u0102V\3"+
		"\2\2\2\u0103\u0104\7\u0080\2\2\u0104\u0105\7?\2\2\u0105X\3\2\2\2\u0106"+
		"\u0107\7c\2\2\u0107\u0108\7p\2\2\u0108\u0109\7f\2\2\u0109Z\3\2\2\2\u010a"+
		"\u010b\7q\2\2\u010b\u010c\7t\2\2\u010c\\\3\2\2\2\u010d\u010e\7p\2\2\u010e"+
		"\u010f\7q\2\2\u010f\u0110\7v\2\2\u0110^\3\2\2\2\u0111\u0112\7%\2\2\u0112"+
		"`\3\2\2\2\u0113\u0117\t\2\2\2\u0114\u0116\t\3\2\2\u0115\u0114\3\2\2\2"+
		"\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118b\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u011a\u011e\7)\2\2\u011b\u011d\n\4\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u012b\7)\2\2\u0122"+
		"\u0126\7$\2\2\u0123\u0125\n\5\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012b\7$\2\2\u012a\u011a\3\2\2\2\u012a\u0122\3\2"+
		"\2\2\u012bd\3\2\2\2\u012c\u012e\4\62;\2\u012d\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u0133\5g\64\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u014d\3\2"+
		"\2\2\u0134\u0136\4\62;\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013d\7\60"+
		"\2\2\u013a\u013c\4\62;\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0142\5g\64\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u014d\3\2\2\2\u0143\u0145\7\60\2\2\u0144\u0146\4\62;\2\u0145\u0144\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u014b\5g\64\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u012d\3\2\2\2\u014c\u0135\3\2\2\2\u014c"+
		"\u0143\3\2\2\2\u014df\3\2\2\2\u014e\u0150\t\6\2\2\u014f\u0151\t\7\2\2"+
		"\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154"+
		"\4\62;\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156h\3\2\2\2\u0157\u0158\7/\2\2\u0158\u0159\7/\2\2\u0159"+
		"\u015d\3\2\2\2\u015a\u015c\n\b\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0162\7\17\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3"+
		"\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\f\2\2\u0164\u0165\b\65\2\2\u0165"+
		"j\3\2\2\2\u0166\u0167\t\t\2\2\u0167\u0168\b\66\3\2\u0168l\3\2\2\2\23\2"+
		"\u0117\u011e\u0126\u012a\u012f\u0132\u0137\u013d\u0141\u0147\u014a\u014c"+
		"\u0150\u0155\u015d\u0161\4\3\65\2\3\66\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}