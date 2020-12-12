// Generated from latte/latteParser.g4 by ANTLR 4.8
package latte;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class latteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Surrogate_id_SYMB_0=1, Surrogate_id_SYMB_1=2, Surrogate_id_SYMB_2=3, Surrogate_id_SYMB_3=4, 
		Surrogate_id_SYMB_4=5, Surrogate_id_SYMB_5=6, Surrogate_id_SYMB_6=7, Surrogate_id_SYMB_7=8, 
		Surrogate_id_SYMB_8=9, Surrogate_id_SYMB_9=10, Surrogate_id_SYMB_10=11, 
		Surrogate_id_SYMB_11=12, Surrogate_id_SYMB_12=13, Surrogate_id_SYMB_13=14, 
		Surrogate_id_SYMB_14=15, Surrogate_id_SYMB_15=16, Surrogate_id_SYMB_16=17, 
		Surrogate_id_SYMB_17=18, Surrogate_id_SYMB_18=19, Surrogate_id_SYMB_19=20, 
		Surrogate_id_SYMB_20=21, Surrogate_id_SYMB_21=22, Surrogate_id_SYMB_22=23, 
		Surrogate_id_SYMB_23=24, Surrogate_id_SYMB_24=25, Surrogate_id_SYMB_25=26, 
		Surrogate_id_SYMB_26=27, Surrogate_id_SYMB_27=28, Surrogate_id_SYMB_28=29, 
		Surrogate_id_SYMB_29=30, Surrogate_id_SYMB_30=31, Surrogate_id_SYMB_31=32, 
		Surrogate_id_SYMB_32=33, Surrogate_id_SYMB_33=34, Surrogate_id_SYMB_34=35, 
		Surrogate_id_SYMB_35=36, Surrogate_id_SYMB_36=37, Surrogate_id_SYMB_37=38, 
		Surrogate_id_SYMB_38=39, Surrogate_id_SYMB_39=40, Surrogate_id_SYMB_40=41, 
		Surrogate_id_SYMB_41=42, COMMENT_antlr_builtin=43, MULTICOMMENT_antlr_builtin=44, 
		INTEGER=45, IDENT=46, WS=47, ErrorToken=48, STRING=49, STRINGESC=50;
	public static final int
		RULE_start_Prog = 0, RULE_prog = 1, RULE_funct = 2, RULE_topDef = 3, RULE_listTopDef = 4, 
		RULE_arg = 5, RULE_listArg = 6, RULE_clsBlock = 7, RULE_listClsDef = 8, 
		RULE_clsDef = 9, RULE_clsMethod = 10, RULE_clsAttr = 11, RULE_block = 12, 
		RULE_listStmt = 13, RULE_stmt = 14, RULE_item = 15, RULE_listItem = 16, 
		RULE_primitiveType = 17, RULE_classType = 18, RULE_type = 19, RULE_listType = 20, 
		RULE_expr6 = 21, RULE_expr5 = 22, RULE_expr4 = 23, RULE_expr3 = 24, RULE_expr2 = 25, 
		RULE_expr1 = 26, RULE_expr = 27, RULE_listExpr = 28, RULE_addOp = 29, 
		RULE_mulOp = 30, RULE_relOp = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_Prog", "prog", "funct", "topDef", "listTopDef", "arg", "listArg", 
			"clsBlock", "listClsDef", "clsDef", "clsMethod", "clsAttr", "block", 
			"listStmt", "stmt", "item", "listItem", "primitiveType", "classType", 
			"type", "listType", "expr6", "expr5", "expr4", "expr3", "expr2", "expr1", 
			"expr", "listExpr", "addOp", "mulOp", "relOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'{'", "'}'", "';'", "'='", "'['", "']'", 
			"'.'", "'++'", "'--'", "':'", "'[]'", "'-'", "'!'", "'&&'", "'||'", "'+'", 
			"'*'", "'/'", "'%'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'boolean'", 
			"'class'", "'else'", "'extends'", "'false'", "'for'", "'if'", "'int'", 
			"'new'", "'return'", "'string'", "'true'", "'void'", "'while'", null, 
			null, null, null, null, null, "'\"'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", "Surrogate_id_SYMB_2", 
			"Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "Surrogate_id_SYMB_5", 
			"Surrogate_id_SYMB_6", "Surrogate_id_SYMB_7", "Surrogate_id_SYMB_8", 
			"Surrogate_id_SYMB_9", "Surrogate_id_SYMB_10", "Surrogate_id_SYMB_11", 
			"Surrogate_id_SYMB_12", "Surrogate_id_SYMB_13", "Surrogate_id_SYMB_14", 
			"Surrogate_id_SYMB_15", "Surrogate_id_SYMB_16", "Surrogate_id_SYMB_17", 
			"Surrogate_id_SYMB_18", "Surrogate_id_SYMB_19", "Surrogate_id_SYMB_20", 
			"Surrogate_id_SYMB_21", "Surrogate_id_SYMB_22", "Surrogate_id_SYMB_23", 
			"Surrogate_id_SYMB_24", "Surrogate_id_SYMB_25", "Surrogate_id_SYMB_26", 
			"Surrogate_id_SYMB_27", "Surrogate_id_SYMB_28", "Surrogate_id_SYMB_29", 
			"Surrogate_id_SYMB_30", "Surrogate_id_SYMB_31", "Surrogate_id_SYMB_32", 
			"Surrogate_id_SYMB_33", "Surrogate_id_SYMB_34", "Surrogate_id_SYMB_35", 
			"Surrogate_id_SYMB_36", "Surrogate_id_SYMB_37", "Surrogate_id_SYMB_38", 
			"Surrogate_id_SYMB_39", "Surrogate_id_SYMB_40", "Surrogate_id_SYMB_41", 
			"COMMENT_antlr_builtin", "MULTICOMMENT_antlr_builtin", "INTEGER", "IDENT", 
			"WS", "ErrorToken", "STRING", "STRINGESC"
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
	public String getGrammarFileName() { return "latteParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public latteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start_ProgContext extends ParserRuleContext {
		public latte.Absyn.Prog result;
		public ProgContext x;
		public TerminalNode EOF() { return getToken(latteParser.EOF, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public Start_ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterStart_Prog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitStart_Prog(this);
		}
	}

	public final Start_ProgContext start_Prog() throws RecognitionException {
		Start_ProgContext _localctx = new Start_ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_Prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((Start_ProgContext)_localctx).x = prog();
			setState(65);
			match(EOF);
			 ((Start_ProgContext)_localctx).result =  ((Start_ProgContext)_localctx).x.result; 
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

	public static class ProgContext extends ParserRuleContext {
		public latte.Absyn.Prog result;
		public ListTopDefContext p_1_1;
		public ListTopDefContext listTopDef() {
			return getRuleContext(ListTopDefContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((ProgContext)_localctx).p_1_1 = listTopDef();
			 ((ProgContext)_localctx).result =  new latte.Absyn.Program(((ProgContext)_localctx).p_1_1.result); 
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

	public static class FunctContext extends ParserRuleContext {
		public latte.Absyn.Funct result;
		public TypeContext p_1_1;
		public Token p_1_2;
		public ListArgContext p_1_4;
		public BlockContext p_1_6;
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(latteParser.Surrogate_id_SYMB_0, 0); }
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(latteParser.Surrogate_id_SYMB_1, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(latteParser.IDENT, 0); }
		public ListArgContext listArg() {
			return getRuleContext(ListArgContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitFunct(this);
		}
	}

	public final FunctContext funct() throws RecognitionException {
		FunctContext _localctx = new FunctContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((FunctContext)_localctx).p_1_1 = type(0);
			setState(72);
			((FunctContext)_localctx).p_1_2 = match(IDENT);
			setState(73);
			match(Surrogate_id_SYMB_0);
			setState(74);
			((FunctContext)_localctx).p_1_4 = listArg();
			setState(75);
			match(Surrogate_id_SYMB_1);
			setState(76);
			((FunctContext)_localctx).p_1_6 = block();
			 ((FunctContext)_localctx).result =  new latte.Absyn.Function(((FunctContext)_localctx).p_1_1.result,((FunctContext)_localctx).p_1_2.getText(),((FunctContext)_localctx).p_1_4.result,((FunctContext)_localctx).p_1_6.result); 
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

	public static class TopDefContext extends ParserRuleContext {
		public latte.Absyn.TopDef result;
		public FunctContext p_1_1;
		public Token p_2_2;
		public ClsBlockContext p_2_3;
		public Token p_3_2;
		public Token p_3_4;
		public ClsBlockContext p_3_5;
		public FunctContext funct() {
			return getRuleContext(FunctContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_29() { return getToken(latteParser.Surrogate_id_SYMB_29, 0); }
		public List<TerminalNode> IDENT() { return getTokens(latteParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(latteParser.IDENT, i);
		}
		public ClsBlockContext clsBlock() {
			return getRuleContext(ClsBlockContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_31() { return getToken(latteParser.Surrogate_id_SYMB_31, 0); }
		public TopDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterTopDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitTopDef(this);
		}
	}

	public final TopDefContext topDef() throws RecognitionException {
		TopDefContext _localctx = new TopDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topDef);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((TopDefContext)_localctx).p_1_1 = funct();
				 ((TopDefContext)_localctx).result =  new latte.Absyn.FnDef(((TopDefContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(Surrogate_id_SYMB_29);
				setState(83);
				((TopDefContext)_localctx).p_2_2 = match(IDENT);
				setState(84);
				((TopDefContext)_localctx).p_2_3 = clsBlock();
				 ((TopDefContext)_localctx).result =  new latte.Absyn.ClassDef(((TopDefContext)_localctx).p_2_2.getText(),((TopDefContext)_localctx).p_2_3.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(Surrogate_id_SYMB_29);
				setState(88);
				((TopDefContext)_localctx).p_3_2 = match(IDENT);
				setState(89);
				match(Surrogate_id_SYMB_31);
				setState(90);
				((TopDefContext)_localctx).p_3_4 = match(IDENT);
				setState(91);
				((TopDefContext)_localctx).p_3_5 = clsBlock();
				 ((TopDefContext)_localctx).result =  new latte.Absyn.ClassDefExtend(((TopDefContext)_localctx).p_3_2.getText(),((TopDefContext)_localctx).p_3_4.getText(),((TopDefContext)_localctx).p_3_5.result); 
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

	public static class ListTopDefContext extends ParserRuleContext {
		public latte.Absyn.ListTopDef result;
		public TopDefContext p_1_1;
		public TopDefContext p_2_1;
		public ListTopDefContext p_2_2;
		public TopDefContext topDef() {
			return getRuleContext(TopDefContext.class,0);
		}
		public ListTopDefContext listTopDef() {
			return getRuleContext(ListTopDefContext.class,0);
		}
		public ListTopDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTopDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterListTopDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitListTopDef(this);
		}
	}

	public final ListTopDefContext listTopDef() throws RecognitionException {
		ListTopDefContext _localctx = new ListTopDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listTopDef);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((ListTopDefContext)_localctx).p_1_1 = topDef();
				 ((ListTopDefContext)_localctx).result =  new latte.Absyn.ListTopDef(); _localctx.result.addLast(((ListTopDefContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				((ListTopDefContext)_localctx).p_2_1 = topDef();
				setState(100);
				((ListTopDefContext)_localctx).p_2_2 = listTopDef();
				 ((ListTopDefContext)_localctx).result =  ((ListTopDefContext)_localctx).p_2_2.result; _localctx.result.addFirst(((ListTopDefContext)_localctx).p_2_1.result); 
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

	public static class ArgContext extends ParserRuleContext {
		public latte.Absyn.Arg result;
		public TypeContext p_1_1;
		public Token p_1_2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(latteParser.IDENT, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((ArgContext)_localctx).p_1_1 = type(0);
			setState(106);
			((ArgContext)_localctx).p_1_2 = match(IDENT);
			 ((ArgContext)_localctx).result =  new latte.Absyn.Argument(((ArgContext)_localctx).p_1_1.result,((ArgContext)_localctx).p_1_2.getText()); 
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

	public static class ListArgContext extends ParserRuleContext {
		public latte.Absyn.ListArg result;
		public ArgContext p_2_1;
		public ArgContext p_3_1;
		public ListArgContext p_3_3;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(latteParser.Surrogate_id_SYMB_2, 0); }
		public ListArgContext listArg() {
			return getRuleContext(ListArgContext.class,0);
		}
		public ListArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterListArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitListArg(this);
		}
	}

	public final ListArgContext listArg() throws RecognitionException {
		ListArgContext _localctx = new ListArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listArg);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListArgContext)_localctx).result =  new latte.Absyn.ListArg(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				((ListArgContext)_localctx).p_2_1 = arg();
				 ((ListArgContext)_localctx).result =  new latte.Absyn.ListArg(); _localctx.result.addLast(((ListArgContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				((ListArgContext)_localctx).p_3_1 = arg();
				setState(114);
				match(Surrogate_id_SYMB_2);
				setState(115);
				((ListArgContext)_localctx).p_3_3 = listArg();
				 ((ListArgContext)_localctx).result =  ((ListArgContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListArgContext)_localctx).p_3_1.result); 
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

	public static class ClsBlockContext extends ParserRuleContext {
		public latte.Absyn.ClsBlock result;
		public ListClsDefContext p_1_2;
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(latteParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(latteParser.Surrogate_id_SYMB_4, 0); }
		public ListClsDefContext listClsDef() {
			return getRuleContext(ListClsDefContext.class,0);
		}
		public ClsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterClsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitClsBlock(this);
		}
	}

	public final ClsBlockContext clsBlock() throws RecognitionException {
		ClsBlockContext _localctx = new ClsBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_clsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(Surrogate_id_SYMB_3);
			setState(121);
			((ClsBlockContext)_localctx).p_1_2 = listClsDef(0);
			setState(122);
			match(Surrogate_id_SYMB_4);
			 ((ClsBlockContext)_localctx).result =  new latte.Absyn.ClassBlock(((ClsBlockContext)_localctx).p_1_2.result); 
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

	public static class ListClsDefContext extends ParserRuleContext {
		public latte.Absyn.ListClsDef result;
		public ListClsDefContext p_2_1;
		public ClsDefContext p_2_2;
		public ListClsDefContext listClsDef() {
			return getRuleContext(ListClsDefContext.class,0);
		}
		public ClsDefContext clsDef() {
			return getRuleContext(ClsDefContext.class,0);
		}
		public ListClsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listClsDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterListClsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitListClsDef(this);
		}
	}

	public final ListClsDefContext listClsDef() throws RecognitionException {
		return listClsDef(0);
	}

	private ListClsDefContext listClsDef(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListClsDefContext _localctx = new ListClsDefContext(_ctx, _parentState);
		ListClsDefContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_listClsDef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListClsDefContext)_localctx).result =  new latte.Absyn.ListClsDef(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListClsDefContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listClsDef);
					setState(128);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(129);
					((ListClsDefContext)_localctx).p_2_2 = clsDef();
					 ((ListClsDefContext)_localctx).result =  ((ListClsDefContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListClsDefContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ClsDefContext extends ParserRuleContext {
		public latte.Absyn.ClsDef result;
		public ClsAttrContext p_1_1;
		public ClsMethodContext p_2_1;
		public ClsAttrContext clsAttr() {
			return getRuleContext(ClsAttrContext.class,0);
		}
		public ClsMethodContext clsMethod() {
			return getRuleContext(ClsMethodContext.class,0);
		}
		public ClsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterClsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitClsDef(this);
		}
	}

	public final ClsDefContext clsDef() throws RecognitionException {
		ClsDefContext _localctx = new ClsDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_clsDef);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((ClsDefContext)_localctx).p_1_1 = clsAttr();
				 ((ClsDefContext)_localctx).result =  new latte.Absyn.ClassDefAttr(((ClsDefContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((ClsDefContext)_localctx).p_2_1 = clsMethod();
				 ((ClsDefContext)_localctx).result =  new latte.Absyn.ClassDefMethod(((ClsDefContext)_localctx).p_2_1.result); 
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

	public static class ClsMethodContext extends ParserRuleContext {
		public latte.Absyn.ClsMethod result;
		public FunctContext p_1_1;
		public FunctContext funct() {
			return getRuleContext(FunctContext.class,0);
		}
		public ClsMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterClsMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitClsMethod(this);
		}
	}

	public final ClsMethodContext clsMethod() throws RecognitionException {
		ClsMethodContext _localctx = new ClsMethodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_clsMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((ClsMethodContext)_localctx).p_1_1 = funct();
			 ((ClsMethodContext)_localctx).result =  new latte.Absyn.ClassMethod(((ClsMethodContext)_localctx).p_1_1.result); 
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

	public static class ClsAttrContext extends ParserRuleContext {
		public latte.Absyn.ClsAttr result;
		public TypeContext p_1_1;
		public Token p_1_2;
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(latteParser.Surrogate_id_SYMB_5, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(latteParser.IDENT, 0); }
		public ClsAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterClsAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitClsAttr(this);
		}
	}

	public final ClsAttrContext clsAttr() throws RecognitionException {
		ClsAttrContext _localctx = new ClsAttrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_clsAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((ClsAttrContext)_localctx).p_1_1 = type(0);
			setState(149);
			((ClsAttrContext)_localctx).p_1_2 = match(IDENT);
			setState(150);
			match(Surrogate_id_SYMB_5);
			 ((ClsAttrContext)_localctx).result =  new latte.Absyn.ClassAttribute(((ClsAttrContext)_localctx).p_1_1.result,((ClsAttrContext)_localctx).p_1_2.getText()); 
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

	public static class BlockContext extends ParserRuleContext {
		public latte.Absyn.Block result;
		public ListStmtContext p_1_2;
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(latteParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(latteParser.Surrogate_id_SYMB_4, 0); }
		public ListStmtContext listStmt() {
			return getRuleContext(ListStmtContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Surrogate_id_SYMB_3);
			setState(154);
			((BlockContext)_localctx).p_1_2 = listStmt(0);
			setState(155);
			match(Surrogate_id_SYMB_4);
			 ((BlockContext)_localctx).result =  new latte.Absyn.BlockOfStatements(((BlockContext)_localctx).p_1_2.result); 
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

	public static class ListStmtContext extends ParserRuleContext {
		public latte.Absyn.ListStmt result;
		public ListStmtContext p_2_1;
		public StmtContext p_2_2;
		public ListStmtContext listStmt() {
			return getRuleContext(ListStmtContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ListStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterListStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitListStmt(this);
		}
	}

	public final ListStmtContext listStmt() throws RecognitionException {
		return listStmt(0);
	}

	private ListStmtContext listStmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStmtContext _localctx = new ListStmtContext(_ctx, _parentState);
		ListStmtContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_listStmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListStmtContext)_localctx).result =  new latte.Absyn.ListStmt(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStmtContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStmt);
					setState(161);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(162);
					((ListStmtContext)_localctx).p_2_2 = stmt();
					 ((ListStmtContext)_localctx).result =  ((ListStmtContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListStmtContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(169);
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

	public static class StmtContext extends ParserRuleContext {
		public latte.Absyn.Stmt result;
		public BlockContext p_2_1;
		public TypeContext p_3_1;
		public ListItemContext p_3_2;
		public Token p_4_1;
		public ExprContext p_4_3;
		public Token p_5_1;
		public ExprContext p_5_3;
		public ExprContext p_5_6;
		public Expr6Context p_6_1;
		public Token p_6_3;
		public ExprContext p_6_5;
		public Token p_7_1;
		public Token p_8_1;
		public ExprContext p_9_2;
		public ExprContext p_11_3;
		public StmtContext p_11_5;
		public ExprContext p_12_3;
		public StmtContext p_12_5;
		public StmtContext p_12_7;
		public ExprContext p_13_3;
		public StmtContext p_13_5;
		public ArgContext p_14_3;
		public ExprContext p_14_5;
		public StmtContext p_14_7;
		public ExprContext p_15_1;
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(latteParser.Surrogate_id_SYMB_5, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemContext listItem() {
			return getRuleContext(ListItemContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(latteParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode IDENT() { return getToken(latteParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(latteParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(latteParser.Surrogate_id_SYMB_8, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(latteParser.Surrogate_id_SYMB_9, 0); }
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(latteParser.Surrogate_id_SYMB_10, 0); }
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(latteParser.Surrogate_id_SYMB_11, 0); }
		public TerminalNode Surrogate_id_SYMB_37() { return getToken(latteParser.Surrogate_id_SYMB_37, 0); }
		public TerminalNode Surrogate_id_SYMB_34() { return getToken(latteParser.Surrogate_id_SYMB_34, 0); }
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(latteParser.Surrogate_id_SYMB_0, 0); }
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(latteParser.Surrogate_id_SYMB_1, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_30() { return getToken(latteParser.Surrogate_id_SYMB_30, 0); }
		public TerminalNode Surrogate_id_SYMB_41() { return getToken(latteParser.Surrogate_id_SYMB_41, 0); }
		public TerminalNode Surrogate_id_SYMB_33() { return getToken(latteParser.Surrogate_id_SYMB_33, 0); }
		public TerminalNode Surrogate_id_SYMB_12() { return getToken(latteParser.Surrogate_id_SYMB_12, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.Empty(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				((StmtContext)_localctx).p_2_1 = block();
				 ((StmtContext)_localctx).result =  new latte.Absyn.BStmt(((StmtContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				((StmtContext)_localctx).p_3_1 = type(0);
				setState(176);
				((StmtContext)_localctx).p_3_2 = listItem();
				setState(177);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.Decl(((StmtContext)_localctx).p_3_1.result,((StmtContext)_localctx).p_3_2.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				((StmtContext)_localctx).p_4_1 = match(IDENT);
				setState(181);
				match(Surrogate_id_SYMB_6);
				setState(182);
				((StmtContext)_localctx).p_4_3 = expr();
				setState(183);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.Ass(((StmtContext)_localctx).p_4_1.getText(),((StmtContext)_localctx).p_4_3.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				((StmtContext)_localctx).p_5_1 = match(IDENT);
				setState(187);
				match(Surrogate_id_SYMB_7);
				setState(188);
				((StmtContext)_localctx).p_5_3 = expr();
				setState(189);
				match(Surrogate_id_SYMB_8);
				setState(190);
				match(Surrogate_id_SYMB_6);
				setState(191);
				((StmtContext)_localctx).p_5_6 = expr();
				setState(192);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.AssArr(((StmtContext)_localctx).p_5_1.getText(),((StmtContext)_localctx).p_5_3.result,((StmtContext)_localctx).p_5_6.result); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				((StmtContext)_localctx).p_6_1 = expr6(0);
				setState(196);
				match(Surrogate_id_SYMB_9);
				setState(197);
				((StmtContext)_localctx).p_6_3 = match(IDENT);
				setState(198);
				match(Surrogate_id_SYMB_6);
				setState(199);
				((StmtContext)_localctx).p_6_5 = expr();
				setState(200);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.AssAttr(((StmtContext)_localctx).p_6_1.result,((StmtContext)_localctx).p_6_3.getText(),((StmtContext)_localctx).p_6_5.result); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				((StmtContext)_localctx).p_7_1 = match(IDENT);
				setState(204);
				match(Surrogate_id_SYMB_10);
				setState(205);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.Incr(((StmtContext)_localctx).p_7_1.getText()); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				((StmtContext)_localctx).p_8_1 = match(IDENT);
				setState(208);
				match(Surrogate_id_SYMB_11);
				setState(209);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.Decr(((StmtContext)_localctx).p_8_1.getText()); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(211);
				match(Surrogate_id_SYMB_37);
				setState(212);
				((StmtContext)_localctx).p_9_2 = expr();
				setState(213);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.Ret(((StmtContext)_localctx).p_9_2.result); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(216);
				match(Surrogate_id_SYMB_37);
				setState(217);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.VRet(); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(219);
				match(Surrogate_id_SYMB_34);
				setState(220);
				match(Surrogate_id_SYMB_0);
				setState(221);
				((StmtContext)_localctx).p_11_3 = expr();
				setState(222);
				match(Surrogate_id_SYMB_1);
				setState(223);
				((StmtContext)_localctx).p_11_5 = stmt();
				 ((StmtContext)_localctx).result =  new latte.Absyn.Cond(((StmtContext)_localctx).p_11_3.result,((StmtContext)_localctx).p_11_5.result); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(226);
				match(Surrogate_id_SYMB_34);
				setState(227);
				match(Surrogate_id_SYMB_0);
				setState(228);
				((StmtContext)_localctx).p_12_3 = expr();
				setState(229);
				match(Surrogate_id_SYMB_1);
				setState(230);
				((StmtContext)_localctx).p_12_5 = stmt();
				setState(231);
				match(Surrogate_id_SYMB_30);
				setState(232);
				((StmtContext)_localctx).p_12_7 = stmt();
				 ((StmtContext)_localctx).result =  new latte.Absyn.CondElse(((StmtContext)_localctx).p_12_3.result,((StmtContext)_localctx).p_12_5.result,((StmtContext)_localctx).p_12_7.result); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(235);
				match(Surrogate_id_SYMB_41);
				setState(236);
				match(Surrogate_id_SYMB_0);
				setState(237);
				((StmtContext)_localctx).p_13_3 = expr();
				setState(238);
				match(Surrogate_id_SYMB_1);
				setState(239);
				((StmtContext)_localctx).p_13_5 = stmt();
				 ((StmtContext)_localctx).result =  new latte.Absyn.While(((StmtContext)_localctx).p_13_3.result,((StmtContext)_localctx).p_13_5.result); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(242);
				match(Surrogate_id_SYMB_33);
				setState(243);
				match(Surrogate_id_SYMB_0);
				setState(244);
				((StmtContext)_localctx).p_14_3 = arg();
				setState(245);
				match(Surrogate_id_SYMB_12);
				setState(246);
				((StmtContext)_localctx).p_14_5 = expr();
				setState(247);
				match(Surrogate_id_SYMB_1);
				setState(248);
				((StmtContext)_localctx).p_14_7 = stmt();
				 ((StmtContext)_localctx).result =  new latte.Absyn.For(((StmtContext)_localctx).p_14_3.result,((StmtContext)_localctx).p_14_5.result,((StmtContext)_localctx).p_14_7.result); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(251);
				((StmtContext)_localctx).p_15_1 = expr();
				setState(252);
				match(Surrogate_id_SYMB_5);
				 ((StmtContext)_localctx).result =  new latte.Absyn.SExp(((StmtContext)_localctx).p_15_1.result); 
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

	public static class ItemContext extends ParserRuleContext {
		public latte.Absyn.Item result;
		public Token p_1_1;
		public Token p_2_1;
		public ExprContext p_2_3;
		public TerminalNode IDENT() { return getToken(latteParser.IDENT, 0); }
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(latteParser.Surrogate_id_SYMB_6, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_item);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				((ItemContext)_localctx).p_1_1 = match(IDENT);
				 ((ItemContext)_localctx).result =  new latte.Absyn.NoInit(((ItemContext)_localctx).p_1_1.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				((ItemContext)_localctx).p_2_1 = match(IDENT);
				setState(260);
				match(Surrogate_id_SYMB_6);
				setState(261);
				((ItemContext)_localctx).p_2_3 = expr();
				 ((ItemContext)_localctx).result =  new latte.Absyn.Init(((ItemContext)_localctx).p_2_1.getText(),((ItemContext)_localctx).p_2_3.result); 
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

	public static class ListItemContext extends ParserRuleContext {
		public latte.Absyn.ListItem result;
		public ItemContext p_1_1;
		public ItemContext p_2_1;
		public ListItemContext p_2_3;
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(latteParser.Surrogate_id_SYMB_2, 0); }
		public ListItemContext listItem() {
			return getRuleContext(ListItemContext.class,0);
		}
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitListItem(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listItem);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				((ListItemContext)_localctx).p_1_1 = item();
				 ((ListItemContext)_localctx).result =  new latte.Absyn.ListItem(); _localctx.result.addLast(((ListItemContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				((ListItemContext)_localctx).p_2_1 = item();
				setState(270);
				match(Surrogate_id_SYMB_2);
				setState(271);
				((ListItemContext)_localctx).p_2_3 = listItem();
				 ((ListItemContext)_localctx).result =  ((ListItemContext)_localctx).p_2_3.result; _localctx.result.addFirst(((ListItemContext)_localctx).p_2_1.result); 
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public latte.Absyn.PrimitiveType result;
		public TerminalNode Surrogate_id_SYMB_35() { return getToken(latteParser.Surrogate_id_SYMB_35, 0); }
		public TerminalNode Surrogate_id_SYMB_38() { return getToken(latteParser.Surrogate_id_SYMB_38, 0); }
		public TerminalNode Surrogate_id_SYMB_28() { return getToken(latteParser.Surrogate_id_SYMB_28, 0); }
		public TerminalNode Surrogate_id_SYMB_40() { return getToken(latteParser.Surrogate_id_SYMB_40, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primitiveType);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_35:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(Surrogate_id_SYMB_35);
				 ((PrimitiveTypeContext)_localctx).result =  new latte.Absyn.Int(); 
				}
				break;
			case Surrogate_id_SYMB_38:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(Surrogate_id_SYMB_38);
				 ((PrimitiveTypeContext)_localctx).result =  new latte.Absyn.Str(); 
				}
				break;
			case Surrogate_id_SYMB_28:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(Surrogate_id_SYMB_28);
				 ((PrimitiveTypeContext)_localctx).result =  new latte.Absyn.Bool(); 
				}
				break;
			case Surrogate_id_SYMB_40:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(Surrogate_id_SYMB_40);
				 ((PrimitiveTypeContext)_localctx).result =  new latte.Absyn.Void(); 
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

	public static class ClassTypeContext extends ParserRuleContext {
		public latte.Absyn.ClassType result;
		public Token p_1_1;
		public TerminalNode IDENT() { return getToken(latteParser.IDENT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((ClassTypeContext)_localctx).p_1_1 = match(IDENT);
			 ((ClassTypeContext)_localctx).result =  new latte.Absyn.ClassT(((ClassTypeContext)_localctx).p_1_1.getText()); 
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

	public static class TypeContext extends ParserRuleContext {
		public latte.Absyn.Type result;
		public TypeContext p_1_1;
		public PrimitiveTypeContext p_2_1;
		public ClassTypeContext p_3_1;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_13() { return getToken(latteParser.Surrogate_id_SYMB_13, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_28:
			case Surrogate_id_SYMB_35:
			case Surrogate_id_SYMB_38:
			case Surrogate_id_SYMB_40:
				{
				setState(290);
				((TypeContext)_localctx).p_2_1 = primitiveType();
				 ((TypeContext)_localctx).result =  new latte.Absyn.Primitive(((TypeContext)_localctx).p_2_1.result); 
				}
				break;
			case IDENT:
				{
				setState(293);
				((TypeContext)_localctx).p_3_1 = classType();
				 ((TypeContext)_localctx).result =  new latte.Absyn.Class(((TypeContext)_localctx).p_3_1.result); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.p_1_1 = _prevctx;
					_localctx.p_1_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(298);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(299);
					match(Surrogate_id_SYMB_13);
					 ((TypeContext)_localctx).result =  new latte.Absyn.ArrayT(((TypeContext)_localctx).p_1_1.result); 
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ListTypeContext extends ParserRuleContext {
		public latte.Absyn.ListType result;
		public TypeContext p_2_1;
		public TypeContext p_3_1;
		public ListTypeContext p_3_3;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(latteParser.Surrogate_id_SYMB_2, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitListType(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listType);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListTypeContext)_localctx).result =  new latte.Absyn.ListType(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				((ListTypeContext)_localctx).p_2_1 = type(0);
				 ((ListTypeContext)_localctx).result =  new latte.Absyn.ListType(); _localctx.result.addLast(((ListTypeContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				((ListTypeContext)_localctx).p_3_1 = type(0);
				setState(311);
				match(Surrogate_id_SYMB_2);
				setState(312);
				((ListTypeContext)_localctx).p_3_3 = listType();
				 ((ListTypeContext)_localctx).result =  ((ListTypeContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListTypeContext)_localctx).p_3_1.result); 
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

	public static class Expr6Context extends ParserRuleContext {
		public latte.Absyn.Expr result;
		public Expr6Context p_8_1;
		public Expr6Context p_9_1;
		public TypeContext p_1_2;
		public ExprContext p_1_4;
		public Token p_2_2;
		public Token p_3_1;
		public Token p_4_1;
		public ExprContext p_4_3;
		public Token p_5_1;
		public Token p_10_1;
		public ListExprContext p_10_3;
		public TypeContext p_11_2;
		public Expr6Context p_11_4;
		public Token p_12_1;
		public ExprContext p_13_2;
		public Token p_8_3;
		public Token p_9_3;
		public ListExprContext p_9_5;
		public TerminalNode Surrogate_id_SYMB_36() { return getToken(latteParser.Surrogate_id_SYMB_36, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(latteParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(latteParser.Surrogate_id_SYMB_8, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(latteParser.IDENT, 0); }
		public TerminalNode INTEGER() { return getToken(latteParser.INTEGER, 0); }
		public TerminalNode Surrogate_id_SYMB_39() { return getToken(latteParser.Surrogate_id_SYMB_39, 0); }
		public TerminalNode Surrogate_id_SYMB_32() { return getToken(latteParser.Surrogate_id_SYMB_32, 0); }
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(latteParser.Surrogate_id_SYMB_0, 0); }
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(latteParser.Surrogate_id_SYMB_1, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public TerminalNode STRING() { return getToken(latteParser.STRING, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(latteParser.Surrogate_id_SYMB_9, 0); }
		public Expr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterExpr6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitExpr6(this);
		}
	}

	public final Expr6Context expr6() throws RecognitionException {
		return expr6(0);
	}

	private Expr6Context expr6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr6Context _localctx = new Expr6Context(_ctx, _parentState);
		Expr6Context _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr6, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(318);
				match(Surrogate_id_SYMB_36);
				setState(319);
				((Expr6Context)_localctx).p_1_2 = type(0);
				setState(320);
				match(Surrogate_id_SYMB_7);
				setState(321);
				((Expr6Context)_localctx).p_1_4 = expr();
				setState(322);
				match(Surrogate_id_SYMB_8);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.ENewArray(((Expr6Context)_localctx).p_1_2.result,((Expr6Context)_localctx).p_1_4.result); 
				}
				break;
			case 2:
				{
				setState(325);
				match(Surrogate_id_SYMB_36);
				setState(326);
				((Expr6Context)_localctx).p_2_2 = match(IDENT);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.ENewObject(((Expr6Context)_localctx).p_2_2.getText()); 
				}
				break;
			case 3:
				{
				setState(328);
				((Expr6Context)_localctx).p_3_1 = match(IDENT);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.EVar(((Expr6Context)_localctx).p_3_1.getText()); 
				}
				break;
			case 4:
				{
				setState(330);
				((Expr6Context)_localctx).p_4_1 = match(IDENT);
				setState(331);
				match(Surrogate_id_SYMB_7);
				setState(332);
				((Expr6Context)_localctx).p_4_3 = expr();
				setState(333);
				match(Surrogate_id_SYMB_8);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.EArrayElem(((Expr6Context)_localctx).p_4_1.getText(),((Expr6Context)_localctx).p_4_3.result); 
				}
				break;
			case 5:
				{
				setState(336);
				((Expr6Context)_localctx).p_5_1 = match(INTEGER);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.ELitInt(Integer.parseInt(((Expr6Context)_localctx).p_5_1.getText())); 
				}
				break;
			case 6:
				{
				setState(338);
				match(Surrogate_id_SYMB_39);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.ELitTrue(); 
				}
				break;
			case 7:
				{
				setState(340);
				match(Surrogate_id_SYMB_32);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.ELitFalse(); 
				}
				break;
			case 8:
				{
				setState(342);
				((Expr6Context)_localctx).p_10_1 = match(IDENT);
				setState(343);
				match(Surrogate_id_SYMB_0);
				setState(344);
				((Expr6Context)_localctx).p_10_3 = listExpr();
				setState(345);
				match(Surrogate_id_SYMB_1);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.EApp(((Expr6Context)_localctx).p_10_1.getText(),((Expr6Context)_localctx).p_10_3.result); 
				}
				break;
			case 9:
				{
				setState(348);
				match(Surrogate_id_SYMB_0);
				setState(349);
				((Expr6Context)_localctx).p_11_2 = type(0);
				setState(350);
				match(Surrogate_id_SYMB_1);
				setState(351);
				((Expr6Context)_localctx).p_11_4 = expr6(3);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.ECast(((Expr6Context)_localctx).p_11_2.result,((Expr6Context)_localctx).p_11_4.result); 
				}
				break;
			case 10:
				{
				setState(354);
				((Expr6Context)_localctx).p_12_1 = match(STRING);
				 ((Expr6Context)_localctx).result =  new latte.Absyn.EString(((Expr6Context)_localctx).p_12_1.getText().substring(1, ((Expr6Context)_localctx).p_12_1.getText().length()-1)); 
				}
				break;
			case 11:
				{
				setState(356);
				match(Surrogate_id_SYMB_0);
				setState(357);
				((Expr6Context)_localctx).p_13_2 = expr();
				setState(358);
				match(Surrogate_id_SYMB_1);
				 ((Expr6Context)_localctx).result =  ((Expr6Context)_localctx).p_13_2.result; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Expr6Context(_parentctx, _parentState);
						_localctx.p_8_1 = _prevctx;
						_localctx.p_8_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr6);
						setState(363);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(364);
						match(Surrogate_id_SYMB_9);
						setState(365);
						((Expr6Context)_localctx).p_8_3 = match(IDENT);
						 ((Expr6Context)_localctx).result =  new latte.Absyn.EAttr(((Expr6Context)_localctx).p_8_1.result,((Expr6Context)_localctx).p_8_3.getText()); 
						}
						break;
					case 2:
						{
						_localctx = new Expr6Context(_parentctx, _parentState);
						_localctx.p_9_1 = _prevctx;
						_localctx.p_9_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr6);
						setState(367);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(368);
						match(Surrogate_id_SYMB_9);
						setState(369);
						((Expr6Context)_localctx).p_9_3 = match(IDENT);
						setState(370);
						match(Surrogate_id_SYMB_0);
						setState(371);
						((Expr6Context)_localctx).p_9_5 = listExpr();
						setState(372);
						match(Surrogate_id_SYMB_1);
						 ((Expr6Context)_localctx).result =  new latte.Absyn.EMethod(((Expr6Context)_localctx).p_9_1.result,((Expr6Context)_localctx).p_9_3.getText(),((Expr6Context)_localctx).p_9_5.result); 
						}
						break;
					}
					} 
				}
				setState(379);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr5Context extends ParserRuleContext {
		public latte.Absyn.Expr result;
		public Expr6Context p_1_2;
		public Expr6Context p_2_2;
		public Expr6Context p_3_1;
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(latteParser.Surrogate_id_SYMB_14, 0); }
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_15() { return getToken(latteParser.Surrogate_id_SYMB_15, 0); }
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterExpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitExpr5(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr5);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(Surrogate_id_SYMB_14);
				setState(381);
				((Expr5Context)_localctx).p_1_2 = expr6(0);
				 ((Expr5Context)_localctx).result =  new latte.Absyn.Neg(((Expr5Context)_localctx).p_1_2.result); 
				}
				break;
			case Surrogate_id_SYMB_15:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(Surrogate_id_SYMB_15);
				setState(385);
				((Expr5Context)_localctx).p_2_2 = expr6(0);
				 ((Expr5Context)_localctx).result =  new latte.Absyn.Not(((Expr5Context)_localctx).p_2_2.result); 
				}
				break;
			case Surrogate_id_SYMB_0:
			case Surrogate_id_SYMB_32:
			case Surrogate_id_SYMB_36:
			case Surrogate_id_SYMB_39:
			case INTEGER:
			case IDENT:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				((Expr5Context)_localctx).p_3_1 = expr6(0);
				 ((Expr5Context)_localctx).result =  ((Expr5Context)_localctx).p_3_1.result; 
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

	public static class Expr4Context extends ParserRuleContext {
		public latte.Absyn.Expr result;
		public Expr4Context p_1_1;
		public Expr5Context p_2_1;
		public MulOpContext p_1_2;
		public Expr5Context p_1_3;
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public MulOpContext mulOp() {
			return getRuleContext(MulOpContext.class,0);
		}
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitExpr4(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		return expr4(0);
	}

	private Expr4Context expr4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr4Context _localctx = new Expr4Context(_ctx, _parentState);
		Expr4Context _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(394);
			((Expr4Context)_localctx).p_2_1 = expr5();
			 ((Expr4Context)_localctx).result =  ((Expr4Context)_localctx).p_2_1.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr4Context(_parentctx, _parentState);
					_localctx.p_1_1 = _prevctx;
					_localctx.p_1_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr4);
					setState(397);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(398);
					((Expr4Context)_localctx).p_1_2 = mulOp();
					setState(399);
					((Expr4Context)_localctx).p_1_3 = expr5();
					 ((Expr4Context)_localctx).result =  new latte.Absyn.EMul(((Expr4Context)_localctx).p_1_1.result,((Expr4Context)_localctx).p_1_2.result,((Expr4Context)_localctx).p_1_3.result); 
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Expr3Context extends ParserRuleContext {
		public latte.Absyn.Expr result;
		public Expr3Context p_1_1;
		public Expr4Context p_2_1;
		public AddOpContext p_1_2;
		public Expr4Context p_1_3;
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitExpr3(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		return expr3(0);
	}

	private Expr3Context expr3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr3Context _localctx = new Expr3Context(_ctx, _parentState);
		Expr3Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(408);
			((Expr3Context)_localctx).p_2_1 = expr4(0);
			 ((Expr3Context)_localctx).result =  ((Expr3Context)_localctx).p_2_1.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr3Context(_parentctx, _parentState);
					_localctx.p_1_1 = _prevctx;
					_localctx.p_1_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr3);
					setState(411);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(412);
					((Expr3Context)_localctx).p_1_2 = addOp();
					setState(413);
					((Expr3Context)_localctx).p_1_3 = expr4(0);
					 ((Expr3Context)_localctx).result =  new latte.Absyn.EAdd(((Expr3Context)_localctx).p_1_1.result,((Expr3Context)_localctx).p_1_2.result,((Expr3Context)_localctx).p_1_3.result); 
					}
					} 
				}
				setState(420);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr2Context extends ParserRuleContext {
		public latte.Absyn.Expr result;
		public Expr2Context p_1_1;
		public Expr3Context p_2_1;
		public RelOpContext p_1_2;
		public Expr3Context p_1_3;
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitExpr2(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		return expr2(0);
	}

	private Expr2Context expr2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr2Context _localctx = new Expr2Context(_ctx, _parentState);
		Expr2Context _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(422);
			((Expr2Context)_localctx).p_2_1 = expr3(0);
			 ((Expr2Context)_localctx).result =  ((Expr2Context)_localctx).p_2_1.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr2Context(_parentctx, _parentState);
					_localctx.p_1_1 = _prevctx;
					_localctx.p_1_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr2);
					setState(425);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(426);
					((Expr2Context)_localctx).p_1_2 = relOp();
					setState(427);
					((Expr2Context)_localctx).p_1_3 = expr3(0);
					 ((Expr2Context)_localctx).result =  new latte.Absyn.ERel(((Expr2Context)_localctx).p_1_1.result,((Expr2Context)_localctx).p_1_2.result,((Expr2Context)_localctx).p_1_3.result); 
					}
					} 
				}
				setState(434);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public latte.Absyn.Expr result;
		public Expr2Context p_1_1;
		public Expr1Context p_1_3;
		public Expr2Context p_2_1;
		public TerminalNode Surrogate_id_SYMB_16() { return getToken(latteParser.Surrogate_id_SYMB_16, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr1);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				((Expr1Context)_localctx).p_1_1 = expr2(0);
				setState(436);
				match(Surrogate_id_SYMB_16);
				setState(437);
				((Expr1Context)_localctx).p_1_3 = expr1();
				 ((Expr1Context)_localctx).result =  new latte.Absyn.EAnd(((Expr1Context)_localctx).p_1_1.result,((Expr1Context)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				((Expr1Context)_localctx).p_2_1 = expr2(0);
				 ((Expr1Context)_localctx).result =  ((Expr1Context)_localctx).p_2_1.result; 
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

	public static class ExprContext extends ParserRuleContext {
		public latte.Absyn.Expr result;
		public Expr1Context p_1_1;
		public ExprContext p_1_3;
		public Expr1Context p_2_1;
		public TerminalNode Surrogate_id_SYMB_17() { return getToken(latteParser.Surrogate_id_SYMB_17, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				((ExprContext)_localctx).p_1_1 = expr1();
				setState(446);
				match(Surrogate_id_SYMB_17);
				setState(447);
				((ExprContext)_localctx).p_1_3 = expr();
				 ((ExprContext)_localctx).result =  new latte.Absyn.EOr(((ExprContext)_localctx).p_1_1.result,((ExprContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				((ExprContext)_localctx).p_2_1 = expr1();
				 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).p_2_1.result; 
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

	public static class ListExprContext extends ParserRuleContext {
		public latte.Absyn.ListExpr result;
		public ExprContext p_2_1;
		public ExprContext p_3_1;
		public ListExprContext p_3_3;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(latteParser.Surrogate_id_SYMB_2, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitListExpr(this);
		}
	}

	public final ListExprContext listExpr() throws RecognitionException {
		ListExprContext _localctx = new ListExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listExpr);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListExprContext)_localctx).result =  new latte.Absyn.ListExpr(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				((ListExprContext)_localctx).p_2_1 = expr();
				 ((ListExprContext)_localctx).result =  new latte.Absyn.ListExpr(); _localctx.result.addLast(((ListExprContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				((ListExprContext)_localctx).p_3_1 = expr();
				setState(460);
				match(Surrogate_id_SYMB_2);
				setState(461);
				((ListExprContext)_localctx).p_3_3 = listExpr();
				 ((ListExprContext)_localctx).result =  ((ListExprContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListExprContext)_localctx).p_3_1.result); 
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

	public static class AddOpContext extends ParserRuleContext {
		public latte.Absyn.AddOp result;
		public TerminalNode Surrogate_id_SYMB_18() { return getToken(latteParser.Surrogate_id_SYMB_18, 0); }
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(latteParser.Surrogate_id_SYMB_14, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitAddOp(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_addOp);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_18:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(Surrogate_id_SYMB_18);
				 ((AddOpContext)_localctx).result =  new latte.Absyn.Plus(); 
				}
				break;
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(Surrogate_id_SYMB_14);
				 ((AddOpContext)_localctx).result =  new latte.Absyn.Minus(); 
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

	public static class MulOpContext extends ParserRuleContext {
		public latte.Absyn.MulOp result;
		public TerminalNode Surrogate_id_SYMB_19() { return getToken(latteParser.Surrogate_id_SYMB_19, 0); }
		public TerminalNode Surrogate_id_SYMB_20() { return getToken(latteParser.Surrogate_id_SYMB_20, 0); }
		public TerminalNode Surrogate_id_SYMB_21() { return getToken(latteParser.Surrogate_id_SYMB_21, 0); }
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitMulOp(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mulOp);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_19:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(Surrogate_id_SYMB_19);
				 ((MulOpContext)_localctx).result =  new latte.Absyn.Times(); 
				}
				break;
			case Surrogate_id_SYMB_20:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(Surrogate_id_SYMB_20);
				 ((MulOpContext)_localctx).result =  new latte.Absyn.Div(); 
				}
				break;
			case Surrogate_id_SYMB_21:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(Surrogate_id_SYMB_21);
				 ((MulOpContext)_localctx).result =  new latte.Absyn.Mod(); 
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

	public static class RelOpContext extends ParserRuleContext {
		public latte.Absyn.RelOp result;
		public TerminalNode Surrogate_id_SYMB_22() { return getToken(latteParser.Surrogate_id_SYMB_22, 0); }
		public TerminalNode Surrogate_id_SYMB_23() { return getToken(latteParser.Surrogate_id_SYMB_23, 0); }
		public TerminalNode Surrogate_id_SYMB_24() { return getToken(latteParser.Surrogate_id_SYMB_24, 0); }
		public TerminalNode Surrogate_id_SYMB_25() { return getToken(latteParser.Surrogate_id_SYMB_25, 0); }
		public TerminalNode Surrogate_id_SYMB_26() { return getToken(latteParser.Surrogate_id_SYMB_26, 0); }
		public TerminalNode Surrogate_id_SYMB_27() { return getToken(latteParser.Surrogate_id_SYMB_27, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof latteParserListener ) ((latteParserListener)listener).exitRelOp(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relOp);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_22:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(Surrogate_id_SYMB_22);
				 ((RelOpContext)_localctx).result =  new latte.Absyn.LTH(); 
				}
				break;
			case Surrogate_id_SYMB_23:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(Surrogate_id_SYMB_23);
				 ((RelOpContext)_localctx).result =  new latte.Absyn.LE(); 
				}
				break;
			case Surrogate_id_SYMB_24:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(Surrogate_id_SYMB_24);
				 ((RelOpContext)_localctx).result =  new latte.Absyn.GTH(); 
				}
				break;
			case Surrogate_id_SYMB_25:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				match(Surrogate_id_SYMB_25);
				 ((RelOpContext)_localctx).result =  new latte.Absyn.GE(); 
				}
				break;
			case Surrogate_id_SYMB_26:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				match(Surrogate_id_SYMB_26);
				 ((RelOpContext)_localctx).result =  new latte.Absyn.EQU(); 
				}
				break;
			case Surrogate_id_SYMB_27:
				enterOuterAlt(_localctx, 6);
				{
				setState(490);
				match(Surrogate_id_SYMB_27);
				 ((RelOpContext)_localctx).result =  new latte.Absyn.NE(); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return listClsDef_sempred((ListClsDefContext)_localctx, predIndex);
		case 13:
			return listStmt_sempred((ListStmtContext)_localctx, predIndex);
		case 19:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 21:
			return expr6_sempred((Expr6Context)_localctx, predIndex);
		case 23:
			return expr4_sempred((Expr4Context)_localctx, predIndex);
		case 24:
			return expr3_sempred((Expr3Context)_localctx, predIndex);
		case 25:
			return expr2_sempred((Expr2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean listClsDef_sempred(ListClsDefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listStmt_sempred(ListStmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr6_sempred(Expr6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr4_sempred(Expr4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr3_sempred(Expr3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr2_sempred(Expr2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u01f1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\by\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0092\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a8\n\17\f\17\16\17\u00ab\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0102\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010b"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0115\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011f\n\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u012b\n\25\3\25\3\25\3\25\7\25\u0130\n"+
		"\25\f\25\16\25\u0133\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u013e\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u016c\n\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u017a\n\27\f\27\16\27\u017d\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u018a\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0195\n\31\f\31\16"+
		"\31\u0198\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01a3"+
		"\n\32\f\32\16\32\u01a6\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\7\33\u01b1\n\33\f\33\16\33\u01b4\13\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u01be\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u01c8\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01d3"+
		"\n\36\3\37\3\37\3\37\3\37\5\37\u01d9\n\37\3 \3 \3 \3 \3 \3 \5 \u01e1\n"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01ef\n!\3!\2\t\22\34(,\60\62"+
		"\64\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@\2\2\2\u020c\2B\3\2\2\2\4F\3\2\2\2\6I\3\2\2\2\b`\3\2\2\2\ni\3\2\2\2\f"+
		"k\3\2\2\2\16x\3\2\2\2\20z\3\2\2\2\22\177\3\2\2\2\24\u0091\3\2\2\2\26\u0093"+
		"\3\2\2\2\30\u0096\3\2\2\2\32\u009b\3\2\2\2\34\u00a0\3\2\2\2\36\u0101\3"+
		"\2\2\2 \u010a\3\2\2\2\"\u0114\3\2\2\2$\u011e\3\2\2\2&\u0120\3\2\2\2(\u012a"+
		"\3\2\2\2*\u013d\3\2\2\2,\u016b\3\2\2\2.\u0189\3\2\2\2\60\u018b\3\2\2\2"+
		"\62\u0199\3\2\2\2\64\u01a7\3\2\2\2\66\u01bd\3\2\2\28\u01c7\3\2\2\2:\u01d2"+
		"\3\2\2\2<\u01d8\3\2\2\2>\u01e0\3\2\2\2@\u01ee\3\2\2\2BC\5\4\3\2CD\7\2"+
		"\2\3DE\b\2\1\2E\3\3\2\2\2FG\5\n\6\2GH\b\3\1\2H\5\3\2\2\2IJ\5(\25\2JK\7"+
		"\60\2\2KL\7\3\2\2LM\5\16\b\2MN\7\4\2\2NO\5\32\16\2OP\b\4\1\2P\7\3\2\2"+
		"\2QR\5\6\4\2RS\b\5\1\2Sa\3\2\2\2TU\7 \2\2UV\7\60\2\2VW\5\20\t\2WX\b\5"+
		"\1\2Xa\3\2\2\2YZ\7 \2\2Z[\7\60\2\2[\\\7\"\2\2\\]\7\60\2\2]^\5\20\t\2^"+
		"_\b\5\1\2_a\3\2\2\2`Q\3\2\2\2`T\3\2\2\2`Y\3\2\2\2a\t\3\2\2\2bc\5\b\5\2"+
		"cd\b\6\1\2dj\3\2\2\2ef\5\b\5\2fg\5\n\6\2gh\b\6\1\2hj\3\2\2\2ib\3\2\2\2"+
		"ie\3\2\2\2j\13\3\2\2\2kl\5(\25\2lm\7\60\2\2mn\b\7\1\2n\r\3\2\2\2oy\b\b"+
		"\1\2pq\5\f\7\2qr\b\b\1\2ry\3\2\2\2st\5\f\7\2tu\7\5\2\2uv\5\16\b\2vw\b"+
		"\b\1\2wy\3\2\2\2xo\3\2\2\2xp\3\2\2\2xs\3\2\2\2y\17\3\2\2\2z{\7\6\2\2{"+
		"|\5\22\n\2|}\7\7\2\2}~\b\t\1\2~\21\3\2\2\2\177\u0080\b\n\1\2\u0080\u0081"+
		"\b\n\1\2\u0081\u0088\3\2\2\2\u0082\u0083\f\3\2\2\u0083\u0084\5\24\13\2"+
		"\u0084\u0085\b\n\1\2\u0085\u0087\3\2\2\2\u0086\u0082\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\23\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\5\30\r\2\u008c\u008d\b\13\1\2\u008d\u0092\3"+
		"\2\2\2\u008e\u008f\5\26\f\2\u008f\u0090\b\13\1\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008b\3\2\2\2\u0091\u008e\3\2\2\2\u0092\25\3\2\2\2\u0093\u0094\5\6\4"+
		"\2\u0094\u0095\b\f\1\2\u0095\27\3\2\2\2\u0096\u0097\5(\25\2\u0097\u0098"+
		"\7\60\2\2\u0098\u0099\7\b\2\2\u0099\u009a\b\r\1\2\u009a\31\3\2\2\2\u009b"+
		"\u009c\7\6\2\2\u009c\u009d\5\34\17\2\u009d\u009e\7\7\2\2\u009e\u009f\b"+
		"\16\1\2\u009f\33\3\2\2\2\u00a0\u00a1\b\17\1\2\u00a1\u00a2\b\17\1\2\u00a2"+
		"\u00a9\3\2\2\2\u00a3\u00a4\f\3\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\b"+
		"\17\1\2\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00a9\3\2\2"+
		"\2\u00ac\u00ad\7\b\2\2\u00ad\u0102\b\20\1\2\u00ae\u00af\5\32\16\2\u00af"+
		"\u00b0\b\20\1\2\u00b0\u0102\3\2\2\2\u00b1\u00b2\5(\25\2\u00b2\u00b3\5"+
		"\"\22\2\u00b3\u00b4\7\b\2\2\u00b4\u00b5\b\20\1\2\u00b5\u0102\3\2\2\2\u00b6"+
		"\u00b7\7\60\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00b9\58\35\2\u00b9\u00ba\7"+
		"\b\2\2\u00ba\u00bb\b\20\1\2\u00bb\u0102\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd"+
		"\u00be\7\n\2\2\u00be\u00bf\58\35\2\u00bf\u00c0\7\13\2\2\u00c0\u00c1\7"+
		"\t\2\2\u00c1\u00c2\58\35\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\b\20\1\2\u00c4"+
		"\u0102\3\2\2\2\u00c5\u00c6\5,\27\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\7\60"+
		"\2\2\u00c8\u00c9\7\t\2\2\u00c9\u00ca\58\35\2\u00ca\u00cb\7\b\2\2\u00cb"+
		"\u00cc\b\20\1\2\u00cc\u0102\3\2\2\2\u00cd\u00ce\7\60\2\2\u00ce\u00cf\7"+
		"\r\2\2\u00cf\u00d0\7\b\2\2\u00d0\u0102\b\20\1\2\u00d1\u00d2\7\60\2\2\u00d2"+
		"\u00d3\7\16\2\2\u00d3\u00d4\7\b\2\2\u00d4\u0102\b\20\1\2\u00d5\u00d6\7"+
		"(\2\2\u00d6\u00d7\58\35\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\b\20\1\2\u00d9"+
		"\u0102\3\2\2\2\u00da\u00db\7(\2\2\u00db\u00dc\7\b\2\2\u00dc\u0102\b\20"+
		"\1\2\u00dd\u00de\7%\2\2\u00de\u00df\7\3\2\2\u00df\u00e0\58\35\2\u00e0"+
		"\u00e1\7\4\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e3\b\20\1\2\u00e3\u0102"+
		"\3\2\2\2\u00e4\u00e5\7%\2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e7\58\35\2\u00e7"+
		"\u00e8\7\4\2\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\7!\2\2\u00ea\u00eb\5"+
		"\36\20\2\u00eb\u00ec\b\20\1\2\u00ec\u0102\3\2\2\2\u00ed\u00ee\7,\2\2\u00ee"+
		"\u00ef\7\3\2\2\u00ef\u00f0\58\35\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\5\36"+
		"\20\2\u00f2\u00f3\b\20\1\2\u00f3\u0102\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5"+
		"\u00f6\7\3\2\2\u00f6\u00f7\5\f\7\2\u00f7\u00f8\7\17\2\2\u00f8\u00f9\5"+
		"8\35\2\u00f9\u00fa\7\4\2\2\u00fa\u00fb\5\36\20\2\u00fb\u00fc\b\20\1\2"+
		"\u00fc\u0102\3\2\2\2\u00fd\u00fe\58\35\2\u00fe\u00ff\7\b\2\2\u00ff\u0100"+
		"\b\20\1\2\u0100\u0102\3\2\2\2\u0101\u00ac\3\2\2\2\u0101\u00ae\3\2\2\2"+
		"\u0101\u00b1\3\2\2\2\u0101\u00b6\3\2\2\2\u0101\u00bc\3\2\2\2\u0101\u00c5"+
		"\3\2\2\2\u0101\u00cd\3\2\2\2\u0101\u00d1\3\2\2\2\u0101\u00d5\3\2\2\2\u0101"+
		"\u00da\3\2\2\2\u0101\u00dd\3\2\2\2\u0101\u00e4\3\2\2\2\u0101\u00ed\3\2"+
		"\2\2\u0101\u00f4\3\2\2\2\u0101\u00fd\3\2\2\2\u0102\37\3\2\2\2\u0103\u0104"+
		"\7\60\2\2\u0104\u010b\b\21\1\2\u0105\u0106\7\60\2\2\u0106\u0107\7\t\2"+
		"\2\u0107\u0108\58\35\2\u0108\u0109\b\21\1\2\u0109\u010b\3\2\2\2\u010a"+
		"\u0103\3\2\2\2\u010a\u0105\3\2\2\2\u010b!\3\2\2\2\u010c\u010d\5 \21\2"+
		"\u010d\u010e\b\22\1\2\u010e\u0115\3\2\2\2\u010f\u0110\5 \21\2\u0110\u0111"+
		"\7\5\2\2\u0111\u0112\5\"\22\2\u0112\u0113\b\22\1\2\u0113\u0115\3\2\2\2"+
		"\u0114\u010c\3\2\2\2\u0114\u010f\3\2\2\2\u0115#\3\2\2\2\u0116\u0117\7"+
		"&\2\2\u0117\u011f\b\23\1\2\u0118\u0119\7)\2\2\u0119\u011f\b\23\1\2\u011a"+
		"\u011b\7\37\2\2\u011b\u011f\b\23\1\2\u011c\u011d\7+\2\2\u011d\u011f\b"+
		"\23\1\2\u011e\u0116\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u011a\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f%\3\2\2\2\u0120\u0121\7\60\2\2\u0121\u0122\b\24\1"+
		"\2\u0122\'\3\2\2\2\u0123\u0124\b\25\1\2\u0124\u0125\5$\23\2\u0125\u0126"+
		"\b\25\1\2\u0126\u012b\3\2\2\2\u0127\u0128\5&\24\2\u0128\u0129\b\25\1\2"+
		"\u0129\u012b\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u0131"+
		"\3\2\2\2\u012c\u012d\f\5\2\2\u012d\u012e\7\20\2\2\u012e\u0130\b\25\1\2"+
		"\u012f\u012c\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132)\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u013e\b\26\1\2\u0135"+
		"\u0136\5(\25\2\u0136\u0137\b\26\1\2\u0137\u013e\3\2\2\2\u0138\u0139\5"+
		"(\25\2\u0139\u013a\7\5\2\2\u013a\u013b\5*\26\2\u013b\u013c\b\26\1\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0134\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u0138\3\2"+
		"\2\2\u013e+\3\2\2\2\u013f\u0140\b\27\1\2\u0140\u0141\7\'\2\2\u0141\u0142"+
		"\5(\25\2\u0142\u0143\7\n\2\2\u0143\u0144\58\35\2\u0144\u0145\7\13\2\2"+
		"\u0145\u0146\b\27\1\2\u0146\u016c\3\2\2\2\u0147\u0148\7\'\2\2\u0148\u0149"+
		"\7\60\2\2\u0149\u016c\b\27\1\2\u014a\u014b\7\60\2\2\u014b\u016c\b\27\1"+
		"\2\u014c\u014d\7\60\2\2\u014d\u014e\7\n\2\2\u014e\u014f\58\35\2\u014f"+
		"\u0150\7\13\2\2\u0150\u0151\b\27\1\2\u0151\u016c\3\2\2\2\u0152\u0153\7"+
		"/\2\2\u0153\u016c\b\27\1\2\u0154\u0155\7*\2\2\u0155\u016c\b\27\1\2\u0156"+
		"\u0157\7#\2\2\u0157\u016c\b\27\1\2\u0158\u0159\7\60\2\2\u0159\u015a\7"+
		"\3\2\2\u015a\u015b\5:\36\2\u015b\u015c\7\4\2\2\u015c\u015d\b\27\1\2\u015d"+
		"\u016c\3\2\2\2\u015e\u015f\7\3\2\2\u015f\u0160\5(\25\2\u0160\u0161\7\4"+
		"\2\2\u0161\u0162\5,\27\5\u0162\u0163\b\27\1\2\u0163\u016c\3\2\2\2\u0164"+
		"\u0165\7\63\2\2\u0165\u016c\b\27\1\2\u0166\u0167\7\3\2\2\u0167\u0168\5"+
		"8\35\2\u0168\u0169\7\4\2\2\u0169\u016a\b\27\1\2\u016a\u016c\3\2\2\2\u016b"+
		"\u013f\3\2\2\2\u016b\u0147\3\2\2\2\u016b\u014a\3\2\2\2\u016b\u014c\3\2"+
		"\2\2\u016b\u0152\3\2\2\2\u016b\u0154\3\2\2\2\u016b\u0156\3\2\2\2\u016b"+
		"\u0158\3\2\2\2\u016b\u015e\3\2\2\2\u016b\u0164\3\2\2\2\u016b\u0166\3\2"+
		"\2\2\u016c\u017b\3\2\2\2\u016d\u016e\f\b\2\2\u016e\u016f\7\f\2\2\u016f"+
		"\u0170\7\60\2\2\u0170\u017a\b\27\1\2\u0171\u0172\f\7\2\2\u0172\u0173\7"+
		"\f\2\2\u0173\u0174\7\60\2\2\u0174\u0175\7\3\2\2\u0175\u0176\5:\36\2\u0176"+
		"\u0177\7\4\2\2\u0177\u0178\b\27\1\2\u0178\u017a\3\2\2\2\u0179\u016d\3"+
		"\2\2\2\u0179\u0171\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c-\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\21\2\2"+
		"\u017f\u0180\5,\27\2\u0180\u0181\b\30\1\2\u0181\u018a\3\2\2\2\u0182\u0183"+
		"\7\22\2\2\u0183\u0184\5,\27\2\u0184\u0185\b\30\1\2\u0185\u018a\3\2\2\2"+
		"\u0186\u0187\5,\27\2\u0187\u0188\b\30\1\2\u0188\u018a\3\2\2\2\u0189\u017e"+
		"\3\2\2\2\u0189\u0182\3\2\2\2\u0189\u0186\3\2\2\2\u018a/\3\2\2\2\u018b"+
		"\u018c\b\31\1\2\u018c\u018d\5.\30\2\u018d\u018e\b\31\1\2\u018e\u0196\3"+
		"\2\2\2\u018f\u0190\f\4\2\2\u0190\u0191\5> \2\u0191\u0192\5.\30\2\u0192"+
		"\u0193\b\31\1\2\u0193\u0195\3\2\2\2\u0194\u018f\3\2\2\2\u0195\u0198\3"+
		"\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\61\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019a\b\32\1\2\u019a\u019b\5\60\31\2\u019b\u019c"+
		"\b\32\1\2\u019c\u01a4\3\2\2\2\u019d\u019e\f\4\2\2\u019e\u019f\5<\37\2"+
		"\u019f\u01a0\5\60\31\2\u01a0\u01a1\b\32\1\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u019d\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\63\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\b\33\1\2\u01a8\u01a9"+
		"\5\62\32\2\u01a9\u01aa\b\33\1\2\u01aa\u01b2\3\2\2\2\u01ab\u01ac\f\4\2"+
		"\2\u01ac\u01ad\5@!\2\u01ad\u01ae\5\62\32\2\u01ae\u01af\b\33\1\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\65\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6"+
		"\5\64\33\2\u01b6\u01b7\7\23\2\2\u01b7\u01b8\5\66\34\2\u01b8\u01b9\b\34"+
		"\1\2\u01b9\u01be\3\2\2\2\u01ba\u01bb\5\64\33\2\u01bb\u01bc\b\34\1\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be\67\3\2\2"+
		"\2\u01bf\u01c0\5\66\34\2\u01c0\u01c1\7\24\2\2\u01c1\u01c2\58\35\2\u01c2"+
		"\u01c3\b\35\1\2\u01c3\u01c8\3\2\2\2\u01c4\u01c5\5\66\34\2\u01c5\u01c6"+
		"\b\35\1\2\u01c6\u01c8\3\2\2\2\u01c7\u01bf\3\2\2\2\u01c7\u01c4\3\2\2\2"+
		"\u01c89\3\2\2\2\u01c9\u01d3\b\36\1\2\u01ca\u01cb\58\35\2\u01cb\u01cc\b"+
		"\36\1\2\u01cc\u01d3\3\2\2\2\u01cd\u01ce\58\35\2\u01ce\u01cf\7\5\2\2\u01cf"+
		"\u01d0\5:\36\2\u01d0\u01d1\b\36\1\2\u01d1\u01d3\3\2\2\2\u01d2\u01c9\3"+
		"\2\2\2\u01d2\u01ca\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d3;\3\2\2\2\u01d4\u01d5"+
		"\7\25\2\2\u01d5\u01d9\b\37\1\2\u01d6\u01d7\7\21\2\2\u01d7\u01d9\b\37\1"+
		"\2\u01d8\u01d4\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9=\3\2\2\2\u01da\u01db"+
		"\7\26\2\2\u01db\u01e1\b \1\2\u01dc\u01dd\7\27\2\2\u01dd\u01e1\b \1\2\u01de"+
		"\u01df\7\30\2\2\u01df\u01e1\b \1\2\u01e0\u01da\3\2\2\2\u01e0\u01dc\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1?\3\2\2\2\u01e2\u01e3\7\31\2\2\u01e3\u01ef"+
		"\b!\1\2\u01e4\u01e5\7\32\2\2\u01e5\u01ef\b!\1\2\u01e6\u01e7\7\33\2\2\u01e7"+
		"\u01ef\b!\1\2\u01e8\u01e9\7\34\2\2\u01e9\u01ef\b!\1\2\u01ea\u01eb\7\35"+
		"\2\2\u01eb\u01ef\b!\1\2\u01ec\u01ed\7\36\2\2\u01ed\u01ef\b!\1\2\u01ee"+
		"\u01e2\3\2\2\2\u01ee\u01e4\3\2\2\2\u01ee\u01e6\3\2\2\2\u01ee\u01e8\3\2"+
		"\2\2\u01ee\u01ea\3\2\2\2\u01ee\u01ec\3\2\2\2\u01efA\3\2\2\2\34`ix\u0088"+
		"\u0091\u00a9\u0101\u010a\u0114\u011e\u012a\u0131\u013d\u016b\u0179\u017b"+
		"\u0189\u0196\u01a4\u01b2\u01bd\u01c7\u01d2\u01d8\u01e0\u01ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}