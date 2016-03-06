// Generated from JavaBean.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaBeanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, VALUE=21, WS=22, BLOCK_COMMENT=23, LINE_COMMENT=24, 
		ANY=25;
	public static final int
		RULE_file = 0, RULE_clazz = 1, RULE_ignore = 2, RULE_method = 3, RULE_methodParam = 4, 
		RULE_field = 5, RULE_type = 6, RULE_block = 7, RULE_pack = 8, RULE_importExpr = 9, 
		RULE_classModifer = 10, RULE_modifier = 11, RULE_classImplements = 12, 
		RULE_classExtend = 13;
	public static final String[] ruleNames = {
		"file", "clazz", "ignore", "method", "methodParam", "field", "type", "block", 
		"pack", "importExpr", "classModifer", "modifier", "classImplements", "classExtend"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'}'", "'('", "')'", "','", "'='", "';'", "'void'", 
		"'package'", "'.'", "'import'", "'static'", "'final'", "'public'", "'private'", 
		"'protected'", "'implements'", "'extends'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID", "VALUE", "WS", "BLOCK_COMMENT", 
		"LINE_COMMENT", "ANY"
	};
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
	public String getGrammarFileName() { return "JavaBean.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaBeanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public PackContext pack() {
			return getRuleContext(PackContext.class,0);
		}
		public List<ImportExprContext> importExpr() {
			return getRuleContexts(ImportExprContext.class);
		}
		public ImportExprContext importExpr(int i) {
			return getRuleContext(ImportExprContext.class,i);
		}
		public List<ClazzContext> clazz() {
			return getRuleContexts(ClazzContext.class);
		}
		public ClazzContext clazz(int i) {
			return getRuleContext(ClazzContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(28);
				pack();
				}
			}

			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(31);
				importExpr();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				{
				setState(37);
				clazz();
				}
				}
				setState(42);
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

	public static class ClazzContext extends ParserRuleContext {
		public ClassModiferContext classModifer() {
			return getRuleContext(ClassModiferContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaBeanParser.ID, 0); }
		public IgnoreContext ignore() {
			return getRuleContext(IgnoreContext.class,0);
		}
		public ClassExtendContext classExtend() {
			return getRuleContext(ClassExtendContext.class,0);
		}
		public ClassImplementsContext classImplements() {
			return getRuleContext(ClassImplementsContext.class,0);
		}
		public ClazzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterClazz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitClazz(this);
		}
	}

	public final ClazzContext clazz() throws RecognitionException {
		ClazzContext _localctx = new ClazzContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clazz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			classModifer();
			setState(44);
			match(T__0);
			setState(45);
			match(ID);
			setState(47);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(46);
				classExtend();
				}
			}

			setState(50);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(49);
				classImplements();
				}
			}

			setState(52);
			match(T__1);
			setState(53);
			ignore();
			setState(54);
			match(T__2);
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

	public static class IgnoreContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<ClazzContext> clazz() {
			return getRuleContexts(ClazzContext.class);
		}
		public ClazzContext clazz(int i) {
			return getRuleContext(ClazzContext.class,i);
		}
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitIgnore(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ignore);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(60);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(56);
						field();
						}
						break;
					case 2:
						{
						setState(57);
						method();
						}
						break;
					case 3:
						{
						setState(58);
						clazz();
						}
						break;
					case 4:
						{
						setState(59);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaBeanParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodParamContext methodParam() {
			return getRuleContext(MethodParamContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				setState(65);
				modifier();
				}
			}

			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(68);
				type();
				}
				break;
			}
			setState(71);
			match(ID);
			setState(72);
			match(T__3);
			setState(74);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(73);
				methodParam();
				}
			}

			setState(76);
			match(T__4);
			setState(77);
			block();
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

	public static class MethodParamContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaBeanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaBeanParser.ID, i);
		}
		public MethodParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterMethodParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitMethodParam(this);
		}
	}

	public final MethodParamContext methodParam() throws RecognitionException {
		MethodParamContext _localctx = new MethodParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(ID);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(81);
				match(T__5);
				setState(82);
				match(ID);
				setState(83);
				match(ID);
				}
				}
				setState(88);
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

	public static class FieldContext extends ParserRuleContext {
		public ClassModiferContext classModifer() {
			return getRuleContext(ClassModiferContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JavaBeanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaBeanParser.ID, i);
		}
		public TerminalNode VALUE() { return getToken(JavaBeanParser.VALUE, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			classModifer();
			setState(90);
			match(ID);
			setState(91);
			match(ID);
			setState(94);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(92);
				match(T__6);
				setState(93);
				match(VALUE);
				}
			}

			setState(96);
			match(T__7);
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
		public TerminalNode ID() { return getToken(JavaBeanParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(103);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(101);
						block();
						}
						break;
					case 2:
						{
						setState(102);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(108);
			match(T__2);
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

	public static class PackContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaBeanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaBeanParser.ID, i);
		}
		public PackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterPack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitPack(this);
		}
	}

	public final PackContext pack() throws RecognitionException {
		PackContext _localctx = new PackContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__9);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==ID) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 || _la==ID );
			setState(116);
			match(T__7);
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

	public static class ImportExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaBeanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaBeanParser.ID, i);
		}
		public ImportExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterImportExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitImportExpr(this);
		}
	}

	public final ImportExprContext importExpr() throws RecognitionException {
		ImportExprContext _localctx = new ImportExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__11);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==ID) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 || _la==ID );
			setState(124);
			match(T__7);
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

	public static class ClassModiferContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ClassModiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterClassModifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitClassModifer(this);
		}
	}

	public final ClassModiferContext classModifer() throws RecognitionException {
		ClassModiferContext _localctx = new ClassModiferContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classModifer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				setState(126);
				modifier();
				}
			}

			setState(130);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(129);
				match(T__12);
				}
			}

			setState(133);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(132);
				match(T__13);
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

	public static class ModifierContext extends ParserRuleContext {
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ClassImplementsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaBeanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaBeanParser.ID, i);
		}
		public ClassImplementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImplements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterClassImplements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitClassImplements(this);
		}
	}

	public final ClassImplementsContext classImplements() throws RecognitionException {
		ClassImplementsContext _localctx = new ClassImplementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classImplements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__17);
			setState(138);
			match(ID);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(139);
				match(T__5);
				setState(140);
				match(ID);
				}
				}
				setState(145);
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

	public static class ClassExtendContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaBeanParser.ID, 0); }
		public ClassExtendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExtend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).enterClassExtend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBeanListener ) ((JavaBeanListener)listener).exitClassExtend(this);
		}
	}

	public final ClassExtendContext classExtend() throws RecognitionException {
		ClassExtendContext _localctx = new ClassExtendContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classExtend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__18);
			setState(147);
			match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\3\5\3\65\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4"+
		"\3\5\5\5E\n\5\3\5\5\5H\n\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\t\3\t\3\n\3\n\6\ns\n"+
		"\n\r\n\16\nt\3\n\3\n\3\13\3\13\6\13{\n\13\r\13\16\13|\3\13\3\13\3\f\5"+
		"\f\u0082\n\f\3\f\5\f\u0085\n\f\3\f\5\f\u0088\n\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\7\16\u0090\n\16\f\16\16\16\u0093\13\16\3\17\3\17\3\17\3\17\4@k\2"+
		"\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\4\2\13\13\26\26\4\2\r\r\26"+
		"\26\3\2\21\23\u009f\2\37\3\2\2\2\4-\3\2\2\2\6@\3\2\2\2\bD\3\2\2\2\nQ\3"+
		"\2\2\2\f[\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22p\3\2\2\2\24x\3\2\2\2\26\u0081"+
		"\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u0094\3\2\2\2\36 \5\22\n"+
		"\2\37\36\3\2\2\2\37 \3\2\2\2 $\3\2\2\2!#\5\24\13\2\"!\3\2\2\2#&\3\2\2"+
		"\2$\"\3\2\2\2$%\3\2\2\2%*\3\2\2\2&$\3\2\2\2\')\5\4\3\2(\'\3\2\2\2),\3"+
		"\2\2\2*(\3\2\2\2*+\3\2\2\2+\3\3\2\2\2,*\3\2\2\2-.\5\26\f\2./\7\3\2\2/"+
		"\61\7\26\2\2\60\62\5\34\17\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2"+
		"\63\65\5\32\16\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\4\2"+
		"\2\678\5\6\4\289\7\5\2\29\5\3\2\2\2:?\5\f\7\2;?\5\b\5\2<?\5\4\3\2=?\13"+
		"\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?B\3\2\2\2@A\3\2\2\2@>\3"+
		"\2\2\2A\7\3\2\2\2B@\3\2\2\2CE\5\30\r\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2F"+
		"H\5\16\b\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\26\2\2JL\7\6\2\2KM\5\n\6"+
		"\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\7\2\2OP\5\20\t\2P\t\3\2\2\2QR\7\26"+
		"\2\2RX\7\26\2\2ST\7\b\2\2TU\7\26\2\2UW\7\26\2\2VS\3\2\2\2WZ\3\2\2\2XV"+
		"\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2ZX\3\2\2\2[\\\5\26\f\2\\]\7\26\2\2]`\7\26"+
		"\2\2^_\7\t\2\2_a\7\27\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\n\2\2c\r\3"+
		"\2\2\2de\t\2\2\2e\17\3\2\2\2fk\7\4\2\2gj\5\20\t\2hj\13\2\2\2ig\3\2\2\2"+
		"ih\3\2\2\2jm\3\2\2\2kl\3\2\2\2ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\5\2\2"+
		"o\21\3\2\2\2pr\7\f\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2"+
		"\2uv\3\2\2\2vw\7\n\2\2w\23\3\2\2\2xz\7\16\2\2y{\t\3\2\2zy\3\2\2\2{|\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\n\2\2\177\25\3\2\2\2\u0080"+
		"\u0082\5\30\r\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3"+
		"\2\2\2\u0083\u0085\7\17\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0088\7\20\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\27\3\2\2\2\u0089\u008a\t\4\2\2\u008a\31\3\2\2\2\u008b\u008c"+
		"\7\24\2\2\u008c\u0091\7\26\2\2\u008d\u008e\7\b\2\2\u008e\u0090\7\26\2"+
		"\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\33\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\25\2\2\u0095"+
		"\u0096\7\26\2\2\u0096\35\3\2\2\2\26\37$*\61\64>@DGLX`ikt|\u0081\u0084"+
		"\u0087\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}