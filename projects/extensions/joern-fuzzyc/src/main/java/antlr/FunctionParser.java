// Generated from ..\java\antlr\Function.g4 by ANTLR 4.5.3

	package antlr;


  import java.util.Stack;
  import java.util.EmptyStackException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, IF=57, ELSE=58, FOR=59, WHILE=60, 
		BREAK=61, CASE=62, CONTINUE=63, SWITCH=64, DO=65, GOTO=66, RETURN=67, 
		TYPEDEF=68, VOID=69, UNSIGNED=70, SIGNED=71, LONG=72, CV_QUALIFIER=73, 
		VIRTUAL=74, TRY=75, CATCH=76, THROW=77, USING=78, NAMESPACE=79, AUTO=80, 
		REGISTER=81, PRE_IF=82, PRE_ELIF=83, PRE_ELSE=84, PRE_ENDIF=85, PRE_DEFINE=86, 
		PRE_UNDEF=87, PRE_DIAGNOSTIC=88, PRE_OTHER=89, PRE_INCLUDE=90, PRE_INCLUDE_NEXT=91, 
		PRE_LINE=92, PRE_PRAGMA=93, OPERATOR=94, TEMPLATE=95, NEW=96, CLASS_KEY=97, 
		ALPHA_NUMERIC=98, OPENING_CURLY=99, CLOSING_CURLY=100, HEX_LITERAL=101, 
		DECIMAL_LITERAL=102, OCTAL_LITERAL=103, FLOATING_POINT_LITERAL=104, CHAR=105, 
		STRING=106, COMMENT=107, WHITESPACE=108, CPPCOMMENT=109, ELLIPSIS=110, 
		OTHER=111;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_opening_curly = 2, RULE_closing_curly = 3, 
		RULE_block_starter = 4, RULE_selection_or_iteration = 5, RULE_for_init_statement = 6, 
		RULE_jump_statement = 7, RULE_label = 8, RULE_expr_statement = 9, RULE_condition = 10, 
		RULE_pre_statement = 11, RULE_pre_blockstarter = 12, RULE_pre_command = 13, 
		RULE_pre_if_statement = 14, RULE_pre_elif_statement = 15, RULE_pre_else_statement = 16, 
		RULE_pre_endif_statement = 17, RULE_pre_if_condition = 18, RULE_unary_operator = 19, 
		RULE_relational_operator = 20, RULE_constant = 21, RULE_function_decl_specifiers = 22, 
		RULE_ptr_operator = 23, RULE_access_specifier = 24, RULE_operator = 25, 
		RULE_assignment_operator = 26, RULE_equality_operator = 27, RULE_template_decl_start = 28, 
		RULE_template_param_list = 29, RULE_no_brackets = 30, RULE_no_brackets_curlies_or_squares = 31, 
		RULE_no_brackets_or_semicolon = 32, RULE_no_angle_brackets_or_brackets = 33, 
		RULE_no_curlies = 34, RULE_no_squares = 35, RULE_no_squares_or_semicolon = 36, 
		RULE_no_comma_or_semicolon = 37, RULE_assign_water = 38, RULE_assign_water_l2 = 39, 
		RULE_water = 40, RULE_expr = 41, RULE_assign_expr = 42, RULE_conditional_expression = 43, 
		RULE_or_expression = 44, RULE_and_expression = 45, RULE_inclusive_or_expression = 46, 
		RULE_exclusive_or_expression = 47, RULE_bit_and_expression = 48, RULE_equality_expression = 49, 
		RULE_relational_expression = 50, RULE_shift_expression = 51, RULE_additive_expression = 52, 
		RULE_multiplicative_expression = 53, RULE_cast_expression = 54, RULE_cast_target = 55, 
		RULE_unary_expression = 56, RULE_new_expression = 57, RULE_unary_op_and_cast_expr = 58, 
		RULE_sizeof_expression = 59, RULE_sizeof = 60, RULE_sizeof_operand = 61, 
		RULE_sizeof_operand2 = 62, RULE_inc_dec = 63, RULE_postfix_expression = 64, 
		RULE_function_argument_list = 65, RULE_function_argument = 66, RULE_primary_expression = 67, 
		RULE_init_declarator = 68, RULE_declarator = 69, RULE_type_suffix = 70, 
		RULE_simple_decl = 71, RULE_var_decl = 72, RULE_init_declarator_list = 73, 
		RULE_initializer = 74, RULE_initializer_list = 75, RULE_class_def = 76, 
		RULE_class_name = 77, RULE_base_classes = 78, RULE_base_class = 79, RULE_type_name = 80, 
		RULE_base_type = 81, RULE_param_decl_specifiers = 82, RULE_parameter_name = 83, 
		RULE_param_type_list = 84, RULE_param_type = 85, RULE_param_type_id = 86, 
		RULE_identifier = 87, RULE_number = 88, RULE_ptrs = 89, RULE_func_ptrs = 90;
	public static final String[] ruleNames = {
		"statements", "statement", "opening_curly", "closing_curly", "block_starter", 
		"selection_or_iteration", "for_init_statement", "jump_statement", "label", 
		"expr_statement", "condition", "pre_statement", "pre_blockstarter", "pre_command", 
		"pre_if_statement", "pre_elif_statement", "pre_else_statement", "pre_endif_statement", 
		"pre_if_condition", "unary_operator", "relational_operator", "constant", 
		"function_decl_specifiers", "ptr_operator", "access_specifier", "operator", 
		"assignment_operator", "equality_operator", "template_decl_start", "template_param_list", 
		"no_brackets", "no_brackets_curlies_or_squares", "no_brackets_or_semicolon", 
		"no_angle_brackets_or_brackets", "no_curlies", "no_squares", "no_squares_or_semicolon", 
		"no_comma_or_semicolon", "assign_water", "assign_water_l2", "water", "expr", 
		"assign_expr", "conditional_expression", "or_expression", "and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "bit_and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
		"multiplicative_expression", "cast_expression", "cast_target", "unary_expression", 
		"new_expression", "unary_op_and_cast_expr", "sizeof_expression", "sizeof", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"function_argument_list", "function_argument", "primary_expression", "init_declarator", 
		"declarator", "type_suffix", "simple_decl", "var_decl", "init_declarator_list", 
		"initializer", "initializer_list", "class_def", "class_name", "base_classes", 
		"base_class", "type_name", "base_type", "param_decl_specifiers", "parameter_name", 
		"param_type_list", "param_type", "param_type_id", "identifier", "number", 
		"ptrs", "func_ptrs"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "':'", "'='", "'defined'", "'&'", "'*'", "'+'", 
		"'-'", "'~'", "'!'", "'<'", "'>'", "'<='", "'>='", "'inline'", "'explicit'", 
		"'friend'", "'static'", "'public'", "'private'", "'protected'", "'delete'", 
		"'['", "']'", "'/'", "'%'", "'^'", "'|'", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'^='", "'&='", "'|='", "'>>'", "'<<'", "'>>='", "'<<='", "'=='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'?'", 
		"'::'", "'sizeof'", "'.'", "'restrict'", "'if'", "'else'", "'for'", "'while'", 
		"'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", "'return'", 
		"'typedef'", "'void'", "'unsigned'", "'signed'", "'long'", null, "'virtual'", 
		"'try'", "'catch'", "'throw'", "'using'", "'namespace'", "'auto'", "'register'", 
		null, "'#elif'", "'#else'", "'#endif'", "'#define'", "'#undef'", null, 
		null, null, "'#include_next'", "'#line'", null, "'operator'", "'template'", 
		"'new'", null, null, "'{'", "'}'", null, null, null, null, null, null, 
		null, null, null, "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "IF", "ELSE", "FOR", 
		"WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", 
		"TYPEDEF", "VOID", "UNSIGNED", "SIGNED", "LONG", "CV_QUALIFIER", "VIRTUAL", 
		"TRY", "CATCH", "THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", "PRE_IF", 
		"PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "PRE_UNDEF", "PRE_DIAGNOSTIC", 
		"PRE_OTHER", "PRE_INCLUDE", "PRE_INCLUDE_NEXT", "PRE_LINE", "PRE_PRAGMA", 
		"OPERATOR", "TEMPLATE", "NEW", "CLASS_KEY", "ALPHA_NUMERIC", "OPENING_CURLY", 
		"CLOSING_CURLY", "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", 
		"CHAR", "STRING", "COMMENT", "WHITESPACE", "CPPCOMMENT", "ELLIPSIS", "OTHER"
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
	public String getGrammarFileName() { return "Function.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	//Find the closing bracket to the opening bracket (and then return true), skip everything that is in between
	            public boolean skipToEndOfObject() {
	                //Stack of curly brackets
	                Stack<Object> CurlyStack = new Stack<Object>();
	                //Object for the brackets
	                Object o = new Object();
	                //returns the value of the current symbol in the stream (which is the next symbol to be consumed)
	                int t = _input.LA(1);

	                //Find the closing bracket to the opening bracket, skip everything that is in between
	                while(t != EOF && !(CurlyStack.empty() && t == CLOSING_CURLY)){
	                    
	                    //If there is an #else inside a method or class
	                    if(t == PRE_ELSE || t == PRE_ELIF){
	                        //Stack for collecting #ifs
	                        Stack<Object> ifdefStack = new Stack<Object>();
	                        //Return and parse #else, skip to next input
	                        consume();
	                        t = _input.LA(1);
	                        
	                        //Find the closing #endif to the opening #else, skip everything that is in between (#else/#endif included)
	                        while(t != EOF && !(ifdefStack.empty() && (t == PRE_ENDIF))){
	                            //Collect all found opening #ifs. If a #endif is found, remove one #if/#else from stack
	                            if(t == PRE_IF)
	                                ifdefStack.push(o);
	                            else if(t == PRE_ENDIF)
	                                ifdefStack.pop();

	                            //Return and parse current t, skip to next input
	                            consume();
	                            t = _input.LA(1);
	                        }
	                    }
	                    
	                    //Collect all found opening brackets. If a closing bracket is found, remove one opening bracket from stack
	                    if(t == OPENING_CURLY)
	                        CurlyStack.push(o);
	                    else if(t == CLOSING_CURLY)
	                        CurlyStack.pop();
	                        
	                    //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
	                    consume();
	                    t = _input.LA(1);
	                }
	                
	                if(t != EOF){
	                    //Return the closing bracket (if there is one)
	                    consume();
	                 }   
	                 
	                return true;
	            }
	       // this should go into FunctionGrammar but ANTLR fails
	       // to join the parser::members-section on inclusion
	       
	       //Find the closing #endif to the opening #if (and then return true), skip everything that is in between
	       public boolean preProcSkipToEnd()  {
	       		//Stack for collecting #ifs
	            Stack<Object> PreprocessorStack = new Stack<Object>();
	            //Object for the  #ifs
	            Object o = new Object();
	            //returns the value of the current symbol in the stream (which is the next symbol to be consumed)
	            int t = _input.LA(1);

					//Look for the closing #endif to the first opening #if
	                while(t != EOF && !(PreprocessorStack.empty() && t == PRE_ENDIF)){
	                        //Collect all found opening #ifs. If a #endif is found, remove one #if from stack                    
	                        if(t == PRE_IF)
	                            PreprocessorStack.push(o);
	                        else if(t == PRE_ENDIF)
	                            PreprocessorStack.pop();
	                            
	                        //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
	                        consume();
	                        t = _input.LA(1);
	                }
	                //Return and parse the closing #endif (if there is one)
	                if(t != EOF)
	 					consume();
	                return true;
	       }


	public FunctionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(182);
				statement();
				}
				}
				setState(187);
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

	public static class StatementContext extends ParserRuleContext {
		public Opening_curlyContext opening_curly() {
			return getRuleContext(Opening_curlyContext.class,0);
		}
		public Closing_curlyContext closing_curly() {
			return getRuleContext(Closing_curlyContext.class,0);
		}
		public Pre_blockstarterContext pre_blockstarter() {
			return getRuleContext(Pre_blockstarterContext.class,0);
		}
		public Block_starterContext block_starter() {
			return getRuleContext(Block_starterContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public Expr_statementContext expr_statement() {
			return getRuleContext(Expr_statementContext.class,0);
		}
		public WaterContext water() {
			return getRuleContext(WaterContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				pre_blockstarter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				block_starter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				jump_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				label();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				simple_decl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				expr_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(196);
				water();
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

	public static class Opening_curlyContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Opening_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opening_curly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOpening_curly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOpening_curly(this);
		}
	}

	public final Opening_curlyContext opening_curly() throws RecognitionException {
		Opening_curlyContext _localctx = new Opening_curlyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opening_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(OPENING_CURLY);
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

	public static class Closing_curlyContext extends ParserRuleContext {
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public Closing_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closing_curly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClosing_curly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClosing_curly(this);
		}
	}

	public final Closing_curlyContext closing_curly() throws RecognitionException {
		Closing_curlyContext _localctx = new Closing_curlyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_closing_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(CLOSING_CURLY);
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

	public static class Block_starterContext extends ParserRuleContext {
		public Selection_or_iterationContext selection_or_iteration() {
			return getRuleContext(Selection_or_iterationContext.class,0);
		}
		public Block_starterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_starter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBlock_starter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBlock_starter(this);
		}
	}

	public final Block_starterContext block_starter() throws RecognitionException {
		Block_starterContext _localctx = new Block_starterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_starter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			selection_or_iteration();
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

	public static class Selection_or_iterationContext extends ParserRuleContext {
		public Selection_or_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_or_iteration; }
	 
		public Selection_or_iterationContext() { }
		public void copyFrom(Selection_or_iterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Try_statementContext extends Selection_or_iterationContext {
		public TerminalNode TRY() { return getToken(FunctionParser.TRY, 0); }
		public Try_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTry_statement(this);
		}
	}
	public static class If_statementContext extends Selection_or_iterationContext {
		public TerminalNode IF() { return getToken(FunctionParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIf_statement(this);
		}
	}
	public static class Catch_statementContext extends Selection_or_iterationContext {
		public TerminalNode CATCH() { return getToken(FunctionParser.CATCH, 0); }
		public Param_typeContext param_type() {
			return getRuleContext(Param_typeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(FunctionParser.ELLIPSIS, 0); }
		public Catch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCatch_statement(this);
		}
	}
	public static class For_statementContext extends Selection_or_iterationContext {
		public TerminalNode FOR() { return getToken(FunctionParser.FOR, 0); }
		public For_init_statementContext for_init_statement() {
			return getRuleContext(For_init_statementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFor_statement(this);
		}
	}
	public static class Else_statementContext extends Selection_or_iterationContext {
		public TerminalNode ELSE() { return getToken(FunctionParser.ELSE, 0); }
		public Else_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitElse_statement(this);
		}
	}
	public static class Switch_statementContext extends Selection_or_iterationContext {
		public TerminalNode SWITCH() { return getToken(FunctionParser.SWITCH, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Switch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSwitch_statement(this);
		}
	}
	public static class Do_statementContext extends Selection_or_iterationContext {
		public TerminalNode DO() { return getToken(FunctionParser.DO, 0); }
		public Do_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDo_statement(this);
		}
	}
	public static class While_statementContext extends Selection_or_iterationContext {
		public TerminalNode WHILE() { return getToken(FunctionParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitWhile_statement(this);
		}
	}

	public final Selection_or_iterationContext selection_or_iteration() throws RecognitionException {
		Selection_or_iterationContext _localctx = new Selection_or_iterationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selection_or_iteration);
		int _la;
		try {
			setState(244);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(CATCH);
				setState(207);
				match(T__0);
				setState(210);
				switch (_input.LA(1)) {
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case AUTO:
				case REGISTER:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
					{
					setState(208);
					param_type();
					}
					break;
				case ELLIPSIS:
					{
					setState(209);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212);
				match(T__1);
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(IF);
				setState(214);
				match(T__0);
				setState(215);
				condition();
				setState(216);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(SWITCH);
				setState(220);
				match(T__0);
				setState(221);
				condition();
				setState(222);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(FOR);
				setState(225);
				match(T__0);
				setState(228);
				switch (_input.LA(1)) {
				case T__0:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__20:
				case T__21:
				case T__22:
				case T__46:
				case T__47:
				case T__52:
				case T__53:
				case TYPEDEF:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case TEMPLATE:
				case NEW:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
					{
					setState(226);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(227);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (NEW - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)) | (1L << (CHAR - 69)) | (1L << (STRING - 69)))) != 0)) {
					{
					setState(230);
					condition();
					}
				}

				setState(233);
				match(T__2);
				setState(235);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (ALPHA_NUMERIC - 96)) | (1L << (HEX_LITERAL - 96)) | (1L << (DECIMAL_LITERAL - 96)) | (1L << (OCTAL_LITERAL - 96)) | (1L << (FLOATING_POINT_LITERAL - 96)) | (1L << (CHAR - 96)) | (1L << (STRING - 96)))) != 0)) {
					{
					setState(234);
					expr();
					}
				}

				setState(237);
				match(T__1);
				}
				break;
			case DO:
				_localctx = new Do_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				match(WHILE);
				setState(240);
				match(T__0);
				setState(241);
				condition();
				setState(242);
				match(T__1);
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

	public static class For_init_statementContext extends ParserRuleContext {
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFor_init_statement(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_init_statement);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				expr();
				setState(248);
				match(T__2);
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

	public static class Jump_statementContext extends ParserRuleContext {
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	 
		public Jump_statementContext() { }
		public void copyFrom(Jump_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThrowStatementContext extends Jump_statementContext {
		public TerminalNode THROW() { return getToken(FunctionParser.THROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThrowStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitThrowStatement(this);
		}
	}
	public static class BreakStatementContext extends Jump_statementContext {
		public TerminalNode BREAK() { return getToken(FunctionParser.BREAK, 0); }
		public BreakStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBreakStatement(this);
		}
	}
	public static class ContinueStatementContext extends Jump_statementContext {
		public TerminalNode CONTINUE() { return getToken(FunctionParser.CONTINUE, 0); }
		public ContinueStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitContinueStatement(this);
		}
	}
	public static class ReturnStatementContext extends Jump_statementContext {
		public TerminalNode RETURN() { return getToken(FunctionParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitReturnStatement(this);
		}
	}
	public static class GotoStatementContext extends Jump_statementContext {
		public TerminalNode GOTO() { return getToken(FunctionParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitGotoStatement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jump_statement);
		int _la;
		try {
			setState(270);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(BREAK);
				setState(253);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(CONTINUE);
				setState(255);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(GOTO);
				setState(257);
				identifier();
				setState(258);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(RETURN);
				setState(262);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (ALPHA_NUMERIC - 96)) | (1L << (HEX_LITERAL - 96)) | (1L << (DECIMAL_LITERAL - 96)) | (1L << (OCTAL_LITERAL - 96)) | (1L << (FLOATING_POINT_LITERAL - 96)) | (1L << (CHAR - 96)) | (1L << (STRING - 96)))) != 0)) {
					{
					setState(261);
					expr();
					}
				}

				setState(264);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				match(THROW);
				setState(267);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (ALPHA_NUMERIC - 96)) | (1L << (HEX_LITERAL - 96)) | (1L << (DECIMAL_LITERAL - 96)) | (1L << (OCTAL_LITERAL - 96)) | (1L << (FLOATING_POINT_LITERAL - 96)) | (1L << (CHAR - 96)) | (1L << (STRING - 96)))) != 0)) {
					{
					setState(266);
					expr();
					}
				}

				setState(269);
				match(T__2);
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

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public TerminalNode CASE() { return getToken(FunctionParser.CASE, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(272);
				match(CASE);
				}
			}

			setState(278);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
			case T__22:
			case ALPHA_NUMERIC:
				{
				setState(275);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
				{
				setState(276);
				number();
				}
				break;
			case CHAR:
				{
				setState(277);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280);
			match(T__3);
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

	public static class Expr_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpr_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpr_statement(this);
		}
	}

	public final Expr_statementContext expr_statement() throws RecognitionException {
		Expr_statementContext _localctx = new Expr_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (ALPHA_NUMERIC - 96)) | (1L << (HEX_LITERAL - 96)) | (1L << (DECIMAL_LITERAL - 96)) | (1L << (OCTAL_LITERAL - 96)) | (1L << (FLOATING_POINT_LITERAL - 96)) | (1L << (CHAR - 96)) | (1L << (STRING - 96)))) != 0)) {
				{
				setState(282);
				expr();
				}
			}

			setState(285);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				type_name();
				setState(289);
				declarator();
				setState(290);
				match(T__4);
				setState(291);
				assign_expr();
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

	public static class Pre_statementContext extends ParserRuleContext {
		public Pre_blockstarterContext pre_blockstarter() {
			return getRuleContext(Pre_blockstarterContext.class,0);
		}
		public Pre_commandContext pre_command() {
			return getRuleContext(Pre_commandContext.class,0);
		}
		public Pre_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_statement(this);
		}
	}

	public final Pre_statementContext pre_statement() throws RecognitionException {
		Pre_statementContext _localctx = new Pre_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pre_statement);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				pre_blockstarter();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				pre_command();
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

	public static class Pre_blockstarterContext extends ParserRuleContext {
		public Pre_if_statementContext pre_if_statement() {
			return getRuleContext(Pre_if_statementContext.class,0);
		}
		public Pre_elif_statementContext pre_elif_statement() {
			return getRuleContext(Pre_elif_statementContext.class,0);
		}
		public Pre_else_statementContext pre_else_statement() {
			return getRuleContext(Pre_else_statementContext.class,0);
		}
		public Pre_endif_statementContext pre_endif_statement() {
			return getRuleContext(Pre_endif_statementContext.class,0);
		}
		public Pre_blockstarterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_blockstarter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_blockstarter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_blockstarter(this);
		}
	}

	public final Pre_blockstarterContext pre_blockstarter() throws RecognitionException {
		Pre_blockstarterContext _localctx = new Pre_blockstarterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pre_blockstarter);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				pre_endif_statement();
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

	public static class Pre_commandContext extends ParserRuleContext {
		public TerminalNode PRE_INCLUDE() { return getToken(FunctionParser.PRE_INCLUDE, 0); }
		public Pre_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_command(this);
		}
	}

	public final Pre_commandContext pre_command() throws RecognitionException {
		Pre_commandContext _localctx = new Pre_commandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pre_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(PRE_INCLUDE);
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

	public static class Pre_if_statementContext extends ParserRuleContext {
		public TerminalNode PRE_IF() { return getToken(FunctionParser.PRE_IF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_if_statement(this);
		}
	}

	public final Pre_if_statementContext pre_if_statement() throws RecognitionException {
		Pre_if_statementContext _localctx = new Pre_if_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pre_if_statement);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(PRE_IF);
				setState(308);
				pre_if_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(PRE_IF);
				setState(310);
				match(T__0);
				setState(311);
				pre_if_condition();
				setState(312);
				match(T__1);
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

	public static class Pre_elif_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ELIF() { return getToken(FunctionParser.PRE_ELIF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_elif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_elif_statement(this);
		}
	}

	public final Pre_elif_statementContext pre_elif_statement() throws RecognitionException {
		Pre_elif_statementContext _localctx = new Pre_elif_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pre_elif_statement);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(PRE_ELIF);
				setState(317);
				pre_if_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(PRE_ELIF);
				setState(319);
				match(T__0);
				setState(320);
				pre_if_condition();
				setState(321);
				match(T__1);
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

	public static class Pre_else_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ELSE() { return getToken(FunctionParser.PRE_ELSE, 0); }
		public Pre_else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_else_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_else_statement(this);
		}
	}

	public final Pre_else_statementContext pre_else_statement() throws RecognitionException {
		Pre_else_statementContext _localctx = new Pre_else_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pre_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(PRE_ELSE);
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

	public static class Pre_endif_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ENDIF() { return getToken(FunctionParser.PRE_ENDIF, 0); }
		public Pre_endif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_endif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_endif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_endif_statement(this);
		}
	}

	public final Pre_endif_statementContext pre_endif_statement() throws RecognitionException {
		Pre_endif_statementContext _localctx = new Pre_endif_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pre_endif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(PRE_ENDIF);
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

	public static class Pre_if_conditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Pre_if_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_if_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_if_condition(this);
		}
	}

	public final Pre_if_conditionContext pre_if_condition() throws RecognitionException {
		Pre_if_conditionContext _localctx = new Pre_if_conditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pre_if_condition);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(T__5);
				setState(331);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(T__5);
				setState(333);
				match(T__0);
				setState(334);
				condition();
				setState(335);
				match(T__1);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRelational_operator(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(FunctionParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (HEX_LITERAL - 101)) | (1L << (DECIMAL_LITERAL - 101)) | (1L << (OCTAL_LITERAL - 101)) | (1L << (FLOATING_POINT_LITERAL - 101)) | (1L << (CHAR - 101)) | (1L << (STRING - 101)))) != 0)) ) {
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

	public static class Function_decl_specifiersContext extends ParserRuleContext {
		public Function_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_decl_specifiers(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__18 - 17)) | (1L << (T__19 - 17)) | (1L << (VIRTUAL - 17)))) != 0)) ) {
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

	public static class Ptr_operatorContext extends ParserRuleContext {
		public Ptr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtr_operator(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	public static class Access_specifierContext extends ParserRuleContext {
		public Access_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAccess_specifier(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operator);
		int _la;
		try {
			setState(396);
			switch (_input.LA(1)) {
			case T__23:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(351);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(354);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(352);
					match(T__24);
					setState(353);
					match(T__25);
					}
				}

				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(T__9);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				match(T__7);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(360);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 7);
				{
				setState(361);
				match(T__28);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 8);
				{
				setState(362);
				match(T__6);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(363);
				match(T__29);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 10);
				{
				setState(364);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 11);
				{
				setState(365);
				match(T__11);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 12);
				{
				setState(366);
				match(T__4);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 13);
				{
				setState(367);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 14);
				{
				setState(368);
				match(T__13);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 15);
				{
				setState(369);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 16);
				{
				setState(370);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 17);
				{
				setState(371);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 18);
				{
				setState(372);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 19);
				{
				setState(373);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 20);
				{
				setState(374);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 21);
				{
				setState(375);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 22);
				{
				setState(376);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 23);
				{
				setState(377);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 24);
				{
				setState(378);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 25);
				{
				setState(379);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 26);
				{
				setState(380);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 27);
				{
				setState(381);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 28);
				{
				setState(382);
				match(T__43);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 29);
				{
				setState(383);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 30);
				{
				setState(384);
				match(T__15);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 31);
				{
				setState(385);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 32);
				{
				setState(386);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 33);
				{
				setState(387);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 34);
				{
				setState(388);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 35);
				{
				setState(389);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 36);
				{
				setState(390);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 37);
				{
				setState(391);
				match(T__50);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(392);
				match(T__0);
				setState(393);
				match(T__1);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 39);
				{
				setState(394);
				match(T__24);
				setState(395);
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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

	public static class Equality_operatorContext extends ParserRuleContext {
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitEquality_operator(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
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

	public static class Template_decl_startContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public Template_param_listContext template_param_list() {
			return getRuleContext(Template_param_listContext.class,0);
		}
		public Template_decl_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl_start(this);
		}
	}

	public final Template_decl_startContext template_decl_start() throws RecognitionException {
		Template_decl_startContext _localctx = new Template_decl_startContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(TEMPLATE);
			setState(403);
			match(T__12);
			setState(404);
			template_param_list();
			setState(405);
			match(T__13);
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

	public static class Template_param_listContext extends ParserRuleContext {
		public List<No_angle_brackets_or_bracketsContext> no_angle_brackets_or_brackets() {
			return getRuleContexts(No_angle_brackets_or_bracketsContext.class);
		}
		public No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets(int i) {
			return getRuleContext(No_angle_brackets_or_bracketsContext.class,i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public Template_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_param_list(this);
		}
	}

	public final Template_param_listContext template_param_list() throws RecognitionException {
		Template_param_listContext _localctx = new Template_param_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(416);
				switch (_input.LA(1)) {
				case T__12:
					{
					{
					setState(407);
					match(T__12);
					setState(408);
					template_param_list();
					setState(409);
					match(T__13);
					}
					}
					break;
				case T__0:
					{
					{
					setState(411);
					match(T__0);
					setState(412);
					template_param_list();
					setState(413);
					match(T__1);
					}
					}
					break;
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case IF:
				case ELSE:
				case FOR:
				case WHILE:
				case BREAK:
				case CASE:
				case CONTINUE:
				case SWITCH:
				case DO:
				case GOTO:
				case RETURN:
				case TYPEDEF:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case VIRTUAL:
				case TRY:
				case CATCH:
				case THROW:
				case USING:
				case NAMESPACE:
				case AUTO:
				case REGISTER:
				case PRE_IF:
				case PRE_ELIF:
				case PRE_ELSE:
				case PRE_ENDIF:
				case PRE_DEFINE:
				case PRE_UNDEF:
				case PRE_DIAGNOSTIC:
				case PRE_OTHER:
				case PRE_INCLUDE:
				case PRE_INCLUDE_NEXT:
				case PRE_LINE:
				case PRE_PRAGMA:
				case OPERATOR:
				case TEMPLATE:
				case NEW:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
				case OPENING_CURLY:
				case CLOSING_CURLY:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
				case COMMENT:
				case WHITESPACE:
				case CPPCOMMENT:
				case ELLIPSIS:
				case OTHER:
					{
					setState(415);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0) );
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

	public static class No_bracketsContext extends ParserRuleContext {
		public No_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__1) ) {
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

	public static class No_brackets_curlies_or_squaresContext extends ParserRuleContext {
		public No_brackets_curlies_or_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_curlies_or_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__24) | (1L << T__25))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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

	public static class No_brackets_or_semicolonContext extends ParserRuleContext {
		public No_brackets_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets_or_semicolon(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
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

	public static class No_angle_brackets_or_bracketsContext extends ParserRuleContext {
		public No_angle_brackets_or_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_angle_brackets_or_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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

	public static class No_curliesContext extends ParserRuleContext {
		public No_curliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_curlies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_curlies(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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

	public static class No_squaresContext extends ParserRuleContext {
		public No_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_squares(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__24 || _la==T__25) ) {
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

	public static class No_squares_or_semicolonContext extends ParserRuleContext {
		public No_squares_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_squares_or_semicolon(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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

	public static class No_comma_or_semicolonContext extends ParserRuleContext {
		public No_comma_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_comma_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_comma_or_semicolon(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__2 || _la==T__48) ) {
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

	public static class Assign_waterContext extends ParserRuleContext {
		public Assign_waterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_water(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__24) | (1L << T__25) | (1L << T__48))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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

	public static class Assign_water_l2Context extends ParserRuleContext {
		public Assign_water_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water_l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_water_l2(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__24) | (1L << T__25))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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

	public static class WaterContext extends ParserRuleContext {
		public WaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitWater(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			matchWildcard();
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
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			assign_expr();
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(443);
				match(T__48);
				setState(444);
				expr();
				}
				break;
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

	public static class Assign_exprContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			conditional_expression();
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(448);
				assignment_operator();
				setState(449);
				assign_expr();
				}
				break;
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	 
		public Conditional_expressionContext() { }
		public void copyFrom(Conditional_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormOrContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public NormOrContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNormOr(this);
		}
	}
	public static class CndExprContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public CndExprContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCndExpr(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditional_expression);
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				or_expression();
				{
				setState(455);
				match(T__51);
				setState(456);
				expr();
				setState(457);
				match(T__3);
				setState(458);
				conditional_expression();
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

	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			and_expression();
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(463);
				match(T__45);
				setState(464);
				or_expression();
				}
				break;
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

	public static class And_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			inclusive_or_expression();
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(468);
				match(T__44);
				setState(469);
				and_expression();
				}
				break;
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_inclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			exclusive_or_expression();
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(473);
				match(T__29);
				setState(474);
				inclusive_or_expression();
				}
				break;
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_exclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			bit_and_expression();
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(478);
				match(T__28);
				setState(479);
				exclusive_or_expression();
				}
				break;
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

	public static class Bit_and_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Bit_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBit_and_expression(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bit_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			equality_expression();
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(483);
				match(T__6);
				setState(484);
				bit_and_expression();
				}
				break;
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_equality_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			relational_expression();
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(488);
				equality_operator();
				setState(489);
				equality_expression();
				}
				break;
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			shift_expression();
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(494);
				relational_operator();
				setState(495);
				relational_expression();
				}
				break;
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			additive_expression();
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==T__38 || _la==T__39) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(501);
				shift_expression();
				}
				break;
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			multiplicative_expression();
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(505);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(506);
				additive_expression();
				}
				break;
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			cast_expression();
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(510);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(511);
				multiplicative_expression();
				}
				break;
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

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cast_expression);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(514);
				match(T__0);
				setState(515);
				cast_target();
				setState(516);
				match(T__1);
				setState(517);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				unary_expression();
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

	public static class Cast_targetContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Cast_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCast_target(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			type_name();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(523);
				ptr_operator();
				}
				}
				setState(528);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_op_and_cast_exprContext unary_op_and_cast_expr() {
			return getRuleContext(Unary_op_and_cast_exprContext.class,0);
		}
		public Sizeof_expressionContext sizeof_expression() {
			return getRuleContext(Sizeof_expressionContext.class,0);
		}
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unary_expression);
		try {
			setState(533);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				unary_op_and_cast_expr();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				sizeof_expression();
				}
				break;
			case T__52:
			case NEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				new_expression();
				}
				break;
			case T__0:
			case T__20:
			case T__21:
			case T__22:
			case T__46:
			case T__47:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				postfix_expression(0);
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

	public static class New_expressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(FunctionParser.NEW, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNew_expression(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_new_expression);
		int _la;
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(535);
					match(T__52);
					}
				}

				setState(538);
				match(NEW);
				setState(539);
				type_name();
				setState(540);
				match(T__24);
				setState(542);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (ALPHA_NUMERIC - 96)) | (1L << (HEX_LITERAL - 96)) | (1L << (DECIMAL_LITERAL - 96)) | (1L << (OCTAL_LITERAL - 96)) | (1L << (FLOATING_POINT_LITERAL - 96)) | (1L << (CHAR - 96)) | (1L << (STRING - 96)))) != 0)) {
					{
					setState(541);
					conditional_expression();
					}
				}

				setState(544);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(546);
					match(T__52);
					}
				}

				setState(549);
				match(NEW);
				setState(550);
				type_name();
				setState(551);
				match(T__0);
				setState(553);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (ALPHA_NUMERIC - 96)) | (1L << (HEX_LITERAL - 96)) | (1L << (DECIMAL_LITERAL - 96)) | (1L << (OCTAL_LITERAL - 96)) | (1L << (FLOATING_POINT_LITERAL - 96)) | (1L << (CHAR - 96)) | (1L << (STRING - 96)))) != 0)) {
					{
					setState(552);
					expr();
					}
				}

				setState(555);
				match(T__1);
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

	public static class Unary_op_and_cast_exprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_op_and_cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op_and_cast_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_op_and_cast_expr(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			unary_operator();
			setState(560);
			cast_expression();
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

	public static class Sizeof_expressionContext extends ParserRuleContext {
		public SizeofContext sizeof() {
			return getRuleContext(SizeofContext.class,0);
		}
		public Sizeof_operandContext sizeof_operand() {
			return getRuleContext(Sizeof_operandContext.class,0);
		}
		public Sizeof_operand2Context sizeof_operand2() {
			return getRuleContext(Sizeof_operand2Context.class,0);
		}
		public Sizeof_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_expression(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sizeof_expression);
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				sizeof();
				setState(563);
				match(T__0);
				setState(564);
				sizeof_operand();
				setState(565);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				sizeof();
				setState(568);
				sizeof_operand2();
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

	public static class SizeofContext extends ParserRuleContext {
		public SizeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__53);
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

	public static class Sizeof_operandContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Sizeof_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_operand(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			type_name();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(575);
				ptr_operator();
				}
				}
				setState(580);
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

	public static class Sizeof_operand2Context extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Sizeof_operand2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_operand2(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			unary_expression();
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

	public static class Inc_decContext extends ParserRuleContext {
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInc_dec(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMemberAccess(this);
		}
	}
	public static class IncDecOpContext extends Postfix_expressionContext {
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IncDecOpContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIncDecOp(this);
		}
	}
	public static class PrimaryOnlyContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryOnlyContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPrimaryOnly(this);
		}
	}
	public static class FuncCallContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
		}
		public FuncCallContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFuncCall(this);
		}
	}
	public static class ArrayIndexingContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayIndexingContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArrayIndexing(this);
		}
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtrMemberAccess(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			switch (_input.LA(1)) {
			case T__0:
			case T__20:
			case T__21:
			case T__22:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(586);
				primary_expression();
				}
				break;
			case T__46:
			case T__47:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(587);
				inc_dec();
				setState(588);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(616);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(592);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(593);
						match(T__24);
						setState(594);
						expr();
						setState(595);
						match(T__25);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(597);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(598);
						match(T__0);
						setState(599);
						function_argument_list();
						setState(600);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(602);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(603);
						match(T__54);
						setState(605);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(604);
							match(TEMPLATE);
							}
						}

						{
						setState(607);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(608);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(609);
						match(T__50);
						setState(611);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(610);
							match(TEMPLATE);
							}
						}

						{
						setState(613);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(614);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(615);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class Function_argument_listContext extends ParserRuleContext {
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_argument_list(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (ALPHA_NUMERIC - 96)) | (1L << (HEX_LITERAL - 96)) | (1L << (DECIMAL_LITERAL - 96)) | (1L << (OCTAL_LITERAL - 96)) | (1L << (FLOATING_POINT_LITERAL - 96)) | (1L << (CHAR - 96)) | (1L << (STRING - 96)))) != 0)) {
				{
				setState(621);
				function_argument();
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__48) {
					{
					{
					setState(622);
					match(T__48);
					setState(623);
					function_argument();
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Function_argumentContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_argument(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			assign_expr();
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_primary_expression);
		try {
			setState(639);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
			case T__22:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(635);
				match(T__0);
				setState(636);
				expr();
				setState(637);
				match(T__1);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
	 
		public Init_declaratorContext() { }
		public void copyFrom(Init_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitDeclWithAssignContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclWithAssignContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclWithAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclWithAssign(this);
		}
	}
	public static class InitDeclSimpleContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitDeclSimpleContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclSimple(this);
		}
	}
	public static class InitDeclWithCallContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitDeclWithCallContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclWithCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclWithCall(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_init_declarator);
		int _la;
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				declarator();
				setState(642);
				match(T__0);
				setState(644);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (ALPHA_NUMERIC - 96)) | (1L << (HEX_LITERAL - 96)) | (1L << (DECIMAL_LITERAL - 96)) | (1L << (OCTAL_LITERAL - 96)) | (1L << (FLOATING_POINT_LITERAL - 96)) | (1L << (CHAR - 96)) | (1L << (STRING - 96)))) != 0)) {
					{
					setState(643);
					expr();
					}
				}

				setState(646);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				declarator();
				setState(649);
				match(T__4);
				setState(650);
				initializer();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				declarator();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Func_ptrsContext func_ptrs() {
			return getRuleContext(Func_ptrsContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declarator);
		int _la;
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				_la = _input.LA(1);
				if (_la==T__6 || _la==T__7) {
					{
					setState(655);
					ptrs();
					}
				}

				setState(658);
				identifier();
				setState(660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(659);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				_la = _input.LA(1);
				if (_la==T__6 || _la==T__7) {
					{
					setState(662);
					ptrs();
					}
				}

				setState(665);
				match(T__0);
				setState(666);
				func_ptrs();
				setState(667);
				identifier();
				setState(668);
				match(T__1);
				setState(669);
				type_suffix();
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

	public static class Type_suffixContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType_suffix(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_type_suffix);
		int _la;
		try {
			setState(679);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(673);
				match(T__24);
				setState(675);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (ALPHA_NUMERIC - 96)) | (1L << (HEX_LITERAL - 96)) | (1L << (DECIMAL_LITERAL - 96)) | (1L << (OCTAL_LITERAL - 96)) | (1L << (FLOATING_POINT_LITERAL - 96)) | (1L << (CHAR - 96)) | (1L << (STRING - 96)))) != 0)) {
					{
					setState(674);
					conditional_expression();
					}
				}

				setState(677);
				match(T__25);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				param_type_list();
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

	public static class Simple_declContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSimple_decl(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_simple_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(682);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(681);
				match(TYPEDEF);
				}
			}

			setState(685);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(684);
				template_decl_start();
				}
			}

			}
			setState(687);
			var_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclByClassContext extends Var_declContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclByClassContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclByClass(this);
		}
	}
	public static class DeclByTypeContext extends Var_declContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclByTypeContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclByType(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_var_decl);
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				class_def();
				setState(691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(690);
					init_declarator_list();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				type_name();
				setState(694);
				init_declarator_list();
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

	public static class Init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			init_declarator();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(699);
				match(T__48);
				setState(700);
				init_declarator();
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706);
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

	public static class InitializerContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_initializer);
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				assign_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				match(OPENING_CURLY);
				setState(710);
				initializer_list();
				setState(711);
				match(CLOSING_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				match(OPENING_CURLY);
				setState(714);
				match(CLOSING_CURLY);
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

	public static class Initializer_listContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			initializer();
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(718);
				match(T__48);
				setState(719);
				initializer();
				}
				}
				setState(724);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS_KEY() { return getToken(FunctionParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Base_classesContext base_classes() {
			return getRuleContext(Base_classesContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(CLASS_KEY);
			setState(727);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(726);
				class_name();
				}
			}

			setState(730);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(729);
				base_classes();
				}
			}

			setState(732);
			match(OPENING_CURLY);
			skipToEndOfObject(); 
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

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			identifier();
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

	public static class Base_classesContext extends ParserRuleContext {
		public List<Base_classContext> base_class() {
			return getRuleContexts(Base_classContext.class);
		}
		public Base_classContext base_class(int i) {
			return getRuleContext(Base_classContext.class,i);
		}
		public Base_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_classes(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(T__3);
			setState(738);
			base_class();
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(739);
				match(T__48);
				setState(740);
				base_class();
				}
				}
				setState(745);
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

	public static class Base_classContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(FunctionParser.VIRTUAL, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public Base_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_class(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(746);
				match(VIRTUAL);
				}
			}

			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(749);
				access_specifier();
				}
				break;
			}
			setState(752);
			identifier();
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public TerminalNode CLASS_KEY() { return getToken(FunctionParser.CLASS_KEY, 0); }
		public TerminalNode UNSIGNED() { return getToken(FunctionParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(FunctionParser.SIGNED, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_type_name);
		int _la;
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(754);
					match(CV_QUALIFIER);
					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(761);
				_la = _input.LA(1);
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) {
					{
					setState(760);
					_la = _input.LA(1);
					if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(763);
				base_type();
				setState(768);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(764);
					match(T__12);
					setState(765);
					template_param_list();
					setState(766);
					match(T__13);
					}
				}

				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__52) {
					{
					{
					setState(770);
					match(T__52);
					setState(771);
					base_type();
					setState(776);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(772);
						match(T__12);
						setState(773);
						template_param_list();
						setState(774);
						match(T__13);
						}
					}

					}
					}
					setState(782);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(784);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(783);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				match(UNSIGNED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				match(SIGNED);
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

	public static class Base_typeContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> VOID() { return getTokens(FunctionParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(FunctionParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(FunctionParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(FunctionParser.LONG, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_type(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(790);
					_la = _input.LA(1);
					if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (LONG - 69)) | (1L << (ALPHA_NUMERIC - 69)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(793); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Param_decl_specifiersContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode AUTO() { return getToken(FunctionParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(FunctionParser.REGISTER, 0); }
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_decl_specifiers(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(795);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(798);
			type_name();
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

	public static class Parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParameter_name(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			identifier();
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

	public static class Param_type_listContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type_list(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_param_type_list);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(T__0);
				setState(803);
				match(VOID);
				setState(804);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				match(T__0);
				setState(814);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (AUTO - 69)) | (1L << (REGISTER - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)))) != 0)) {
					{
					setState(806);
					param_type();
					setState(811);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__48) {
						{
						{
						setState(807);
						match(T__48);
						setState(808);
						param_type();
						}
						}
						setState(813);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(816);
				match(T__1);
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

	public static class Param_typeContext extends ParserRuleContext {
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			param_decl_specifiers();
			setState(820);
			param_type_id();
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

	public static class Param_type_idContext extends ParserRuleContext {
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Param_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type_id(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_la = _input.LA(1);
			if (_la==T__6 || _la==T__7) {
				{
				setState(822);
				ptrs();
				}
			}

			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(825);
				match(T__0);
				setState(826);
				param_type_id();
				setState(827);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(830);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(829);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(835);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__24) {
				{
				setState(834);
				type_suffix();
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_identifier);
		try {
			int _alt;
			setState(846);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(837);
				match(ALPHA_NUMERIC);
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(838);
						match(T__52);
						setState(839);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(844);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
				}
				break;
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				access_specifier();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (HEX_LITERAL - 101)) | (1L << (DECIMAL_LITERAL - 101)) | (1L << (OCTAL_LITERAL - 101)))) != 0)) ) {
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

	public static class PtrsContext extends ParserRuleContext {
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtrs(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(850);
				ptr_operator();
				setState(852);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(851);
					match(T__55);
					}
				}

				}
				}
				setState(856); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 || _la==T__7 );
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

	public static class Func_ptrsContext extends ParserRuleContext {
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Func_ptrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunc_ptrs(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			ptrs();
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
		case 64:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3q\u035f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\7\2\u00ba\n\2\f"+
		"\2\16\2\u00bd\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c8\n\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00d5\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e7\n\7\3\7\5"+
		"\7\u00ea\n\7\3\7\3\7\5\7\u00ee\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f7"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u00fd\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0109\n\t\3\t\3\t\3\t\5\t\u010e\n\t\3\t\5\t\u0111\n\t\3\n\5\n"+
		"\u0114\n\n\3\n\3\n\3\n\5\n\u0119\n\n\3\n\3\n\3\13\5\13\u011e\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0128\n\f\3\r\3\r\5\r\u012c\n\r\3\16"+
		"\3\16\3\16\3\16\5\16\u0132\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u013d\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0146\n"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0154"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\5\33\u0165\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u018f\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u01a3\n\37\r\37"+
		"\16\37\u01a4\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3+\5+\u01c0\n+\3,\3,\3,\3,\5,\u01c6\n,\3-\3-\3-\3"+
		"-\3-\3-\3-\5-\u01cf\n-\3.\3.\3.\5.\u01d4\n.\3/\3/\3/\5/\u01d9\n/\3\60"+
		"\3\60\3\60\5\60\u01de\n\60\3\61\3\61\3\61\5\61\u01e3\n\61\3\62\3\62\3"+
		"\62\5\62\u01e8\n\62\3\63\3\63\3\63\3\63\5\63\u01ee\n\63\3\64\3\64\3\64"+
		"\3\64\5\64\u01f4\n\64\3\65\3\65\3\65\5\65\u01f9\n\65\3\66\3\66\3\66\5"+
		"\66\u01fe\n\66\3\67\3\67\3\67\5\67\u0203\n\67\38\38\38\38\38\38\58\u020b"+
		"\n8\39\39\79\u020f\n9\f9\169\u0212\139\3:\3:\3:\3:\5:\u0218\n:\3;\5;\u021b"+
		"\n;\3;\3;\3;\3;\5;\u0221\n;\3;\3;\3;\5;\u0226\n;\3;\3;\3;\3;\5;\u022c"+
		"\n;\3;\3;\5;\u0230\n;\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\5=\u023d\n=\3>"+
		"\3>\3?\3?\7?\u0243\n?\f?\16?\u0246\13?\3@\3@\3A\3A\3B\3B\3B\3B\3B\5B\u0251"+
		"\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0260\nB\3B\3B\3B\3B\5B"+
		"\u0266\nB\3B\3B\3B\7B\u026b\nB\fB\16B\u026e\13B\3C\3C\3C\7C\u0273\nC\f"+
		"C\16C\u0276\13C\5C\u0278\nC\3D\3D\3E\3E\3E\3E\3E\3E\5E\u0282\nE\3F\3F"+
		"\3F\5F\u0287\nF\3F\3F\3F\3F\3F\3F\3F\5F\u0290\nF\3G\5G\u0293\nG\3G\3G"+
		"\5G\u0297\nG\3G\5G\u029a\nG\3G\3G\3G\3G\3G\3G\5G\u02a2\nG\3H\3H\5H\u02a6"+
		"\nH\3H\3H\5H\u02aa\nH\3I\5I\u02ad\nI\3I\5I\u02b0\nI\3I\3I\3J\3J\5J\u02b6"+
		"\nJ\3J\3J\3J\5J\u02bb\nJ\3K\3K\3K\7K\u02c0\nK\fK\16K\u02c3\13K\3K\3K\3"+
		"L\3L\3L\3L\3L\3L\3L\5L\u02ce\nL\3M\3M\3M\7M\u02d3\nM\fM\16M\u02d6\13M"+
		"\3N\3N\5N\u02da\nN\3N\5N\u02dd\nN\3N\3N\3N\3O\3O\3P\3P\3P\3P\7P\u02e8"+
		"\nP\fP\16P\u02eb\13P\3Q\5Q\u02ee\nQ\3Q\5Q\u02f1\nQ\3Q\3Q\3R\7R\u02f6\n"+
		"R\fR\16R\u02f9\13R\3R\5R\u02fc\nR\3R\3R\3R\3R\3R\5R\u0303\nR\3R\3R\3R"+
		"\3R\3R\3R\5R\u030b\nR\7R\u030d\nR\fR\16R\u0310\13R\3R\5R\u0313\nR\3R\3"+
		"R\5R\u0317\nR\3S\6S\u031a\nS\rS\16S\u031b\3T\5T\u031f\nT\3T\3T\3U\3U\3"+
		"V\3V\3V\3V\3V\3V\3V\7V\u032c\nV\fV\16V\u032f\13V\5V\u0331\nV\3V\5V\u0334"+
		"\nV\3W\3W\3W\3X\5X\u033a\nX\3X\3X\3X\3X\3X\5X\u0341\nX\5X\u0343\nX\3X"+
		"\5X\u0346\nX\3Y\3Y\3Y\7Y\u034b\nY\fY\16Y\u034e\13Y\3Y\5Y\u0351\nY\3Z\3"+
		"Z\3[\3[\5[\u0357\n[\6[\u0359\n[\r[\16[\u035a\3\\\3\\\3\\\2\3\u0082]\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\2\34\3\2\t\16\3\2\17"+
		"\22\3\2gl\4\2\23\26LL\3\2\t\n\3\2\27\31\4\2\32\32bb\5\2\7\7!(+,\3\2-."+
		"\3\2\3\4\5\2\3\4\33\34ef\3\2\3\5\4\2\3\4\17\20\3\2ef\3\2\33\34\4\2\5\5"+
		"\33\34\4\2\5\5\63\63\6\2\3\5\33\34\63\63ef\3\2)*\3\2\13\f\4\2\n\n\35\36"+
		"\3\2\61\62\4\2HIcc\5\2GGJJdd\3\2RS\3\2gi\u03a5\2\u00bb\3\2\2\2\4\u00c7"+
		"\3\2\2\2\6\u00c9\3\2\2\2\b\u00cb\3\2\2\2\n\u00cd\3\2\2\2\f\u00f6\3\2\2"+
		"\2\16\u00fc\3\2\2\2\20\u0110\3\2\2\2\22\u0113\3\2\2\2\24\u011d\3\2\2\2"+
		"\26\u0127\3\2\2\2\30\u012b\3\2\2\2\32\u0131\3\2\2\2\34\u0133\3\2\2\2\36"+
		"\u013c\3\2\2\2 \u0145\3\2\2\2\"\u0147\3\2\2\2$\u0149\3\2\2\2&\u0153\3"+
		"\2\2\2(\u0155\3\2\2\2*\u0157\3\2\2\2,\u0159\3\2\2\2.\u015b\3\2\2\2\60"+
		"\u015d\3\2\2\2\62\u015f\3\2\2\2\64\u018e\3\2\2\2\66\u0190\3\2\2\28\u0192"+
		"\3\2\2\2:\u0194\3\2\2\2<\u01a2\3\2\2\2>\u01a6\3\2\2\2@\u01a8\3\2\2\2B"+
		"\u01aa\3\2\2\2D\u01ac\3\2\2\2F\u01ae\3\2\2\2H\u01b0\3\2\2\2J\u01b2\3\2"+
		"\2\2L\u01b4\3\2\2\2N\u01b6\3\2\2\2P\u01b8\3\2\2\2R\u01ba\3\2\2\2T\u01bc"+
		"\3\2\2\2V\u01c1\3\2\2\2X\u01ce\3\2\2\2Z\u01d0\3\2\2\2\\\u01d5\3\2\2\2"+
		"^\u01da\3\2\2\2`\u01df\3\2\2\2b\u01e4\3\2\2\2d\u01e9\3\2\2\2f\u01ef\3"+
		"\2\2\2h\u01f5\3\2\2\2j\u01fa\3\2\2\2l\u01ff\3\2\2\2n\u020a\3\2\2\2p\u020c"+
		"\3\2\2\2r\u0217\3\2\2\2t\u022f\3\2\2\2v\u0231\3\2\2\2x\u023c\3\2\2\2z"+
		"\u023e\3\2\2\2|\u0240\3\2\2\2~\u0247\3\2\2\2\u0080\u0249\3\2\2\2\u0082"+
		"\u0250\3\2\2\2\u0084\u0277\3\2\2\2\u0086\u0279\3\2\2\2\u0088\u0281\3\2"+
		"\2\2\u008a\u028f\3\2\2\2\u008c\u02a1\3\2\2\2\u008e\u02a9\3\2\2\2\u0090"+
		"\u02ac\3\2\2\2\u0092\u02ba\3\2\2\2\u0094\u02bc\3\2\2\2\u0096\u02cd\3\2"+
		"\2\2\u0098\u02cf\3\2\2\2\u009a\u02d7\3\2\2\2\u009c\u02e1\3\2\2\2\u009e"+
		"\u02e3\3\2\2\2\u00a0\u02ed\3\2\2\2\u00a2\u0316\3\2\2\2\u00a4\u0319\3\2"+
		"\2\2\u00a6\u031e\3\2\2\2\u00a8\u0322\3\2\2\2\u00aa\u0333\3\2\2\2\u00ac"+
		"\u0335\3\2\2\2\u00ae\u0339\3\2\2\2\u00b0\u0350\3\2\2\2\u00b2\u0352\3\2"+
		"\2\2\u00b4\u0358\3\2\2\2\u00b6\u035c\3\2\2\2\u00b8\u00ba\5\4\3\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\3\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c8\5\6\4\2\u00bf\u00c8"+
		"\5\b\5\2\u00c0\u00c8\5\32\16\2\u00c1\u00c8\5\n\6\2\u00c2\u00c8\5\20\t"+
		"\2\u00c3\u00c8\5\22\n\2\u00c4\u00c8\5\u0090I\2\u00c5\u00c8\5\24\13\2\u00c6"+
		"\u00c8\5R*\2\u00c7\u00be\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c0\3\2\2"+
		"\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\5\3\2\2\2\u00c9"+
		"\u00ca\7e\2\2\u00ca\7\3\2\2\2\u00cb\u00cc\7f\2\2\u00cc\t\3\2\2\2\u00cd"+
		"\u00ce\5\f\7\2\u00ce\13\3\2\2\2\u00cf\u00f7\7M\2\2\u00d0\u00d1\7N\2\2"+
		"\u00d1\u00d4\7\3\2\2\u00d2\u00d5\5\u00acW\2\u00d3\u00d5\7p\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00f7\7\4\2\2\u00d7"+
		"\u00d8\7;\2\2\u00d8\u00d9\7\3\2\2\u00d9\u00da\5\26\f\2\u00da\u00db\7\4"+
		"\2\2\u00db\u00f7\3\2\2\2\u00dc\u00f7\7<\2\2\u00dd\u00de\7B\2\2\u00de\u00df"+
		"\7\3\2\2\u00df\u00e0\5\26\f\2\u00e0\u00e1\7\4\2\2\u00e1\u00f7\3\2\2\2"+
		"\u00e2\u00e3\7=\2\2\u00e3\u00e6\7\3\2\2\u00e4\u00e7\5\16\b\2\u00e5\u00e7"+
		"\7\5\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00ea\5\26\f\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb\u00ed\7\5\2\2\u00ec\u00ee\5T+\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f7\7\4\2\2\u00f0\u00f7\7C"+
		"\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7\3\2\2\u00f3\u00f4\5\26\f\2\u00f4"+
		"\u00f5\7\4\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00cf\3\2\2\2\u00f6\u00d0\3\2"+
		"\2\2\u00f6\u00d7\3\2\2\2\u00f6\u00dc\3\2\2\2\u00f6\u00dd\3\2\2\2\u00f6"+
		"\u00e2\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7\r\3\2\2\2"+
		"\u00f8\u00fd\5\u0090I\2\u00f9\u00fa\5T+\2\u00fa\u00fb\7\5\2\2\u00fb\u00fd"+
		"\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\17\3\2\2\2\u00fe"+
		"\u00ff\7?\2\2\u00ff\u0111\7\5\2\2\u0100\u0101\7A\2\2\u0101\u0111\7\5\2"+
		"\2\u0102\u0103\7D\2\2\u0103\u0104\5\u00b0Y\2\u0104\u0105\7\5\2\2\u0105"+
		"\u0111\3\2\2\2\u0106\u0108\7E\2\2\u0107\u0109\5T+\2\u0108\u0107\3\2\2"+
		"\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0111\7\5\2\2\u010b\u010d"+
		"\7O\2\2\u010c\u010e\5T+\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\7\5\2\2\u0110\u00fe\3\2\2\2\u0110\u0100\3\2"+
		"\2\2\u0110\u0102\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u010b\3\2\2\2\u0111"+
		"\21\3\2\2\2\u0112\u0114\7@\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2"+
		"\u0114\u0118\3\2\2\2\u0115\u0119\5\u00b0Y\2\u0116\u0119\5\u00b2Z\2\u0117"+
		"\u0119\7k\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\6\2\2\u011b\23\3\2\2\2\u011c\u011e"+
		"\5T+\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\7\5\2\2\u0120\25\3\2\2\2\u0121\u0128\5T+\2\u0122\u0123\5\u00a2"+
		"R\2\u0123\u0124\5\u008cG\2\u0124\u0125\7\7\2\2\u0125\u0126\5V,\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0122\3\2\2\2\u0128\27\3\2\2"+
		"\2\u0129\u012c\5\32\16\2\u012a\u012c\5\34\17\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\31\3\2\2\2\u012d\u0132\5\36\20\2\u012e\u0132\5 \21"+
		"\2\u012f\u0132\5\"\22\2\u0130\u0132\5$\23\2\u0131\u012d\3\2\2\2\u0131"+
		"\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\33\3\2\2"+
		"\2\u0133\u0134\7\\\2\2\u0134\35\3\2\2\2\u0135\u0136\7T\2\2\u0136\u013d"+
		"\5&\24\2\u0137\u0138\7T\2\2\u0138\u0139\7\3\2\2\u0139\u013a\5&\24\2\u013a"+
		"\u013b\7\4\2\2\u013b\u013d\3\2\2\2\u013c\u0135\3\2\2\2\u013c\u0137\3\2"+
		"\2\2\u013d\37\3\2\2\2\u013e\u013f\7U\2\2\u013f\u0146\5&\24\2\u0140\u0141"+
		"\7U\2\2\u0141\u0142\7\3\2\2\u0142\u0143\5&\24\2\u0143\u0144\7\4\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u013e\3\2\2\2\u0145\u0140\3\2\2\2\u0146!\3\2\2\2"+
		"\u0147\u0148\7V\2\2\u0148#\3\2\2\2\u0149\u014a\7W\2\2\u014a%\3\2\2\2\u014b"+
		"\u0154\5\26\f\2\u014c\u014d\7\b\2\2\u014d\u0154\5\26\f\2\u014e\u014f\7"+
		"\b\2\2\u014f\u0150\7\3\2\2\u0150\u0151\5\26\f\2\u0151\u0152\7\4\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u014b\3\2\2\2\u0153\u014c\3\2\2\2\u0153\u014e\3\2"+
		"\2\2\u0154\'\3\2\2\2\u0155\u0156\t\2\2\2\u0156)\3\2\2\2\u0157\u0158\t"+
		"\3\2\2\u0158+\3\2\2\2\u0159\u015a\t\4\2\2\u015a-\3\2\2\2\u015b\u015c\t"+
		"\5\2\2\u015c/\3\2\2\2\u015d\u015e\t\6\2\2\u015e\61\3\2\2\2\u015f\u0160"+
		"\t\7\2\2\u0160\63\3\2\2\2\u0161\u0164\t\b\2\2\u0162\u0163\7\33\2\2\u0163"+
		"\u0165\7\34\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u018f\3"+
		"\2\2\2\u0166\u018f\7\13\2\2\u0167\u018f\7\f\2\2\u0168\u018f\7\n\2\2\u0169"+
		"\u018f\7\35\2\2\u016a\u018f\7\36\2\2\u016b\u018f\7\37\2\2\u016c\u018f"+
		"\7\t\2\2\u016d\u018f\7 \2\2\u016e\u018f\7\r\2\2\u016f\u018f\7\16\2\2\u0170"+
		"\u018f\7\7\2\2\u0171\u018f\7\17\2\2\u0172\u018f\7\20\2\2\u0173\u018f\7"+
		"!\2\2\u0174\u018f\7\"\2\2\u0175\u018f\7#\2\2\u0176\u018f\7$\2\2\u0177"+
		"\u018f\7%\2\2\u0178\u018f\7&\2\2\u0179\u018f\7\'\2\2\u017a\u018f\7(\2"+
		"\2\u017b\u018f\7)\2\2\u017c\u018f\7*\2\2\u017d\u018f\7+\2\2\u017e\u018f"+
		"\7,\2\2\u017f\u018f\7-\2\2\u0180\u018f\7.\2\2\u0181\u018f\7\21\2\2\u0182"+
		"\u018f\7\22\2\2\u0183\u018f\7/\2\2\u0184\u018f\7\60\2\2\u0185\u018f\7"+
		"\61\2\2\u0186\u018f\7\62\2\2\u0187\u018f\7\63\2\2\u0188\u018f\7\64\2\2"+
		"\u0189\u018f\7\65\2\2\u018a\u018b\7\3\2\2\u018b\u018f\7\4\2\2\u018c\u018d"+
		"\7\33\2\2\u018d\u018f\7\34\2\2\u018e\u0161\3\2\2\2\u018e\u0166\3\2\2\2"+
		"\u018e\u0167\3\2\2\2\u018e\u0168\3\2\2\2\u018e\u0169\3\2\2\2\u018e\u016a"+
		"\3\2\2\2\u018e\u016b\3\2\2\2\u018e\u016c\3\2\2\2\u018e\u016d\3\2\2\2\u018e"+
		"\u016e\3\2\2\2\u018e\u016f\3\2\2\2\u018e\u0170\3\2\2\2\u018e\u0171\3\2"+
		"\2\2\u018e\u0172\3\2\2\2\u018e\u0173\3\2\2\2\u018e\u0174\3\2\2\2\u018e"+
		"\u0175\3\2\2\2\u018e\u0176\3\2\2\2\u018e\u0177\3\2\2\2\u018e\u0178\3\2"+
		"\2\2\u018e\u0179\3\2\2\2\u018e\u017a\3\2\2\2\u018e\u017b\3\2\2\2\u018e"+
		"\u017c\3\2\2\2\u018e\u017d\3\2\2\2\u018e\u017e\3\2\2\2\u018e\u017f\3\2"+
		"\2\2\u018e\u0180\3\2\2\2\u018e\u0181\3\2\2\2\u018e\u0182\3\2\2\2\u018e"+
		"\u0183\3\2\2\2\u018e\u0184\3\2\2\2\u018e\u0185\3\2\2\2\u018e\u0186\3\2"+
		"\2\2\u018e\u0187\3\2\2\2\u018e\u0188\3\2\2\2\u018e\u0189\3\2\2\2\u018e"+
		"\u018a\3\2\2\2\u018e\u018c\3\2\2\2\u018f\65\3\2\2\2\u0190\u0191\t\t\2"+
		"\2\u0191\67\3\2\2\2\u0192\u0193\t\n\2\2\u01939\3\2\2\2\u0194\u0195\7a"+
		"\2\2\u0195\u0196\7\17\2\2\u0196\u0197\5<\37\2\u0197\u0198\7\20\2\2\u0198"+
		";\3\2\2\2\u0199\u019a\7\17\2\2\u019a\u019b\5<\37\2\u019b\u019c\7\20\2"+
		"\2\u019c\u01a3\3\2\2\2\u019d\u019e\7\3\2\2\u019e\u019f\5<\37\2\u019f\u01a0"+
		"\7\4\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\5D#\2\u01a2\u0199\3\2\2\2\u01a2"+
		"\u019d\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5=\3\2\2\2\u01a6\u01a7\n\13\2\2\u01a7?\3"+
		"\2\2\2\u01a8\u01a9\n\f\2\2\u01a9A\3\2\2\2\u01aa\u01ab\n\r\2\2\u01abC\3"+
		"\2\2\2\u01ac\u01ad\n\16\2\2\u01adE\3\2\2\2\u01ae\u01af\n\17\2\2\u01af"+
		"G\3\2\2\2\u01b0\u01b1\n\20\2\2\u01b1I\3\2\2\2\u01b2\u01b3\n\21\2\2\u01b3"+
		"K\3\2\2\2\u01b4\u01b5\n\22\2\2\u01b5M\3\2\2\2\u01b6\u01b7\n\23\2\2\u01b7"+
		"O\3\2\2\2\u01b8\u01b9\n\f\2\2\u01b9Q\3\2\2\2\u01ba\u01bb\13\2\2\2\u01bb"+
		"S\3\2\2\2\u01bc\u01bf\5V,\2\u01bd\u01be\7\63\2\2\u01be\u01c0\5T+\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0U\3\2\2\2\u01c1\u01c5\5X-\2\u01c2"+
		"\u01c3\5\66\34\2\u01c3\u01c4\5V,\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6W\3\2\2\2\u01c7\u01cf\5Z.\2\u01c8\u01c9"+
		"\5Z.\2\u01c9\u01ca\7\66\2\2\u01ca\u01cb\5T+\2\u01cb\u01cc\7\6\2\2\u01cc"+
		"\u01cd\5X-\2\u01cd\u01cf\3\2\2\2\u01ce\u01c7\3\2\2\2\u01ce\u01c8\3\2\2"+
		"\2\u01cfY\3\2\2\2\u01d0\u01d3\5\\/\2\u01d1\u01d2\7\60\2\2\u01d2\u01d4"+
		"\5Z.\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4[\3\2\2\2\u01d5\u01d8"+
		"\5^\60\2\u01d6\u01d7\7/\2\2\u01d7\u01d9\5\\/\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9]\3\2\2\2\u01da\u01dd\5`\61\2\u01db\u01dc\7 \2\2\u01dc"+
		"\u01de\5^\60\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de_\3\2\2\2"+
		"\u01df\u01e2\5b\62\2\u01e0\u01e1\7\37\2\2\u01e1\u01e3\5`\61\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3a\3\2\2\2\u01e4\u01e7\5d\63\2\u01e5"+
		"\u01e6\7\t\2\2\u01e6\u01e8\5b\62\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8c\3\2\2\2\u01e9\u01ed\5f\64\2\u01ea\u01eb\58\35\2\u01eb\u01ec"+
		"\5d\63\2\u01ec\u01ee\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"e\3\2\2\2\u01ef\u01f3\5h\65\2\u01f0\u01f1\5*\26\2\u01f1\u01f2\5f\64\2"+
		"\u01f2\u01f4\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4g\3"+
		"\2\2\2\u01f5\u01f8\5j\66\2\u01f6\u01f7\t\24\2\2\u01f7\u01f9\5h\65\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9i\3\2\2\2\u01fa\u01fd\5l\67\2"+
		"\u01fb\u01fc\t\25\2\2\u01fc\u01fe\5j\66\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fek\3\2\2\2\u01ff\u0202\5n8\2\u0200\u0201\t\26\2\2\u0201\u0203"+
		"\5l\67\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203m\3\2\2\2\u0204"+
		"\u0205\7\3\2\2\u0205\u0206\5p9\2\u0206\u0207\7\4\2\2\u0207\u0208\5n8\2"+
		"\u0208\u020b\3\2\2\2\u0209\u020b\5r:\2\u020a\u0204\3\2\2\2\u020a\u0209"+
		"\3\2\2\2\u020bo\3\2\2\2\u020c\u0210\5\u00a2R\2\u020d\u020f\5\60\31\2\u020e"+
		"\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211q\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0218\5v<\2\u0214\u0218"+
		"\5x=\2\u0215\u0218\5t;\2\u0216\u0218\5\u0082B\2\u0217\u0213\3\2\2\2\u0217"+
		"\u0214\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218s\3\2\2\2"+
		"\u0219\u021b\7\67\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021d\7b\2\2\u021d\u021e\5\u00a2R\2\u021e\u0220\7\33\2"+
		"\2\u021f\u0221\5X-\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0223\7\34\2\2\u0223\u0230\3\2\2\2\u0224\u0226\7\67\2\2"+
		"\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228"+
		"\7b\2\2\u0228\u0229\5\u00a2R\2\u0229\u022b\7\3\2\2\u022a\u022c\5T+\2\u022b"+
		"\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7\4"+
		"\2\2\u022e\u0230\3\2\2\2\u022f\u021a\3\2\2\2\u022f\u0225\3\2\2\2\u0230"+
		"u\3\2\2\2\u0231\u0232\5(\25\2\u0232\u0233\5n8\2\u0233w\3\2\2\2\u0234\u0235"+
		"\5z>\2\u0235\u0236\7\3\2\2\u0236\u0237\5|?\2\u0237\u0238\7\4\2\2\u0238"+
		"\u023d\3\2\2\2\u0239\u023a\5z>\2\u023a\u023b\5~@\2\u023b\u023d\3\2\2\2"+
		"\u023c\u0234\3\2\2\2\u023c\u0239\3\2\2\2\u023dy\3\2\2\2\u023e\u023f\7"+
		"8\2\2\u023f{\3\2\2\2\u0240\u0244\5\u00a2R\2\u0241\u0243\5\60\31\2\u0242"+
		"\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2"+
		"\2\2\u0245}\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\5r:\2\u0248\177\3"+
		"\2\2\2\u0249\u024a\t\27\2\2\u024a\u0081\3\2\2\2\u024b\u024c\bB\1\2\u024c"+
		"\u0251\5\u0088E\2\u024d\u024e\5\u0080A\2\u024e\u024f\5\u0088E\2\u024f"+
		"\u0251\3\2\2\2\u0250\u024b\3\2\2\2\u0250\u024d\3\2\2\2\u0251\u026c\3\2"+
		"\2\2\u0252\u0253\f\t\2\2\u0253\u0254\7\33\2\2\u0254\u0255\5T+\2\u0255"+
		"\u0256\7\34\2\2\u0256\u026b\3\2\2\2\u0257\u0258\f\b\2\2\u0258\u0259\7"+
		"\3\2\2\u0259\u025a\5\u0084C\2\u025a\u025b\7\4\2\2\u025b\u026b\3\2\2\2"+
		"\u025c\u025d\f\7\2\2\u025d\u025f\79\2\2\u025e\u0260\7a\2\2\u025f\u025e"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u026b\5\u00b0Y"+
		"\2\u0262\u0263\f\6\2\2\u0263\u0265\7\65\2\2\u0264\u0266\7a\2\2\u0265\u0264"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026b\5\u00b0Y"+
		"\2\u0268\u0269\f\5\2\2\u0269\u026b\5\u0080A\2\u026a\u0252\3\2\2\2\u026a"+
		"\u0257\3\2\2\2\u026a\u025c\3\2\2\2\u026a\u0262\3\2\2\2\u026a\u0268\3\2"+
		"\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u0083\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0274\5\u0086D\2\u0270\u0271"+
		"\7\63\2\2\u0271\u0273\5\u0086D\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2\2"+
		"\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274"+
		"\3\2\2\2\u0277\u026f\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0085\3\2\2\2\u0279"+
		"\u027a\5V,\2\u027a\u0087\3\2\2\2\u027b\u0282\5\u00b0Y\2\u027c\u0282\5"+
		",\27\2\u027d\u027e\7\3\2\2\u027e\u027f\5T+\2\u027f\u0280\7\4\2\2\u0280"+
		"\u0282\3\2\2\2\u0281\u027b\3\2\2\2\u0281\u027c\3\2\2\2\u0281\u027d\3\2"+
		"\2\2\u0282\u0089\3\2\2\2\u0283\u0284\5\u008cG\2\u0284\u0286\7\3\2\2\u0285"+
		"\u0287\5T+\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2"+
		"\2\u0288\u0289\7\4\2\2\u0289\u0290\3\2\2\2\u028a\u028b\5\u008cG\2\u028b"+
		"\u028c\7\7\2\2\u028c\u028d\5\u0096L\2\u028d\u0290\3\2\2\2\u028e\u0290"+
		"\5\u008cG\2\u028f\u0283\3\2\2\2\u028f\u028a\3\2\2\2\u028f\u028e\3\2\2"+
		"\2\u0290\u008b\3\2\2\2\u0291\u0293\5\u00b4[\2\u0292\u0291\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\5\u00b0Y\2\u0295\u0297"+
		"\5\u008eH\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u02a2\3\2\2"+
		"\2\u0298\u029a\5\u00b4[\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\7\3\2\2\u029c\u029d\5\u00b6\\\2\u029d\u029e"+
		"\5\u00b0Y\2\u029e\u029f\7\4\2\2\u029f\u02a0\5\u008eH\2\u02a0\u02a2\3\2"+
		"\2\2\u02a1\u0292\3\2\2\2\u02a1\u0299\3\2\2\2\u02a2\u008d\3\2\2\2\u02a3"+
		"\u02a5\7\33\2\2\u02a4\u02a6\5X-\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02aa\7\34\2\2\u02a8\u02aa\5\u00aaV\2\u02a9"+
		"\u02a3\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa\u008f\3\2\2\2\u02ab\u02ad\7F"+
		"\2\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u02b0\5:\36\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2"+
		"\2\2\u02b1\u02b2\5\u0092J\2\u02b2\u0091\3\2\2\2\u02b3\u02b5\5\u009aN\2"+
		"\u02b4\u02b6\5\u0094K\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02bb\3\2\2\2\u02b7\u02b8\5\u00a2R\2\u02b8\u02b9\5\u0094K\2\u02b9\u02bb"+
		"\3\2\2\2\u02ba\u02b3\3\2\2\2\u02ba\u02b7\3\2\2\2\u02bb\u0093\3\2\2\2\u02bc"+
		"\u02c1\5\u008aF\2\u02bd\u02be\7\63\2\2\u02be\u02c0\5\u008aF\2\u02bf\u02bd"+
		"\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c4\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c5\7\5\2\2\u02c5\u0095\3\2"+
		"\2\2\u02c6\u02ce\5V,\2\u02c7\u02c8\7e\2\2\u02c8\u02c9\5\u0098M\2\u02c9"+
		"\u02ca\7f\2\2\u02ca\u02ce\3\2\2\2\u02cb\u02cc\7e\2\2\u02cc\u02ce\7f\2"+
		"\2\u02cd\u02c6\3\2\2\2\u02cd\u02c7\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u0097"+
		"\3\2\2\2\u02cf\u02d4\5\u0096L\2\u02d0\u02d1\7\63\2\2\u02d1\u02d3\5\u0096"+
		"L\2\u02d2\u02d0\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u0099\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d9\7c"+
		"\2\2\u02d8\u02da\5\u009cO\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02dd\5\u009eP\2\u02dc\u02db\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\7e\2\2\u02df\u02e0\bN\1\2\u02e0"+
		"\u009b\3\2\2\2\u02e1\u02e2\5\u00b0Y\2\u02e2\u009d\3\2\2\2\u02e3\u02e4"+
		"\7\6\2\2\u02e4\u02e9\5\u00a0Q\2\u02e5\u02e6\7\63\2\2\u02e6\u02e8\5\u00a0"+
		"Q\2\u02e7\u02e5\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u009f\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ee\7L"+
		"\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef"+
		"\u02f1\5\62\32\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3"+
		"\2\2\2\u02f2\u02f3\5\u00b0Y\2\u02f3\u00a1\3\2\2\2\u02f4\u02f6\7K\2\2\u02f5"+
		"\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fc\t\30\2\2\u02fb"+
		"\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0302\5\u00a4"+
		"S\2\u02fe\u02ff\7\17\2\2\u02ff\u0300\5<\37\2\u0300\u0301\7\20\2\2\u0301"+
		"\u0303\3\2\2\2\u0302\u02fe\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u030e\3\2"+
		"\2\2\u0304\u0305\7\67\2\2\u0305\u030a\5\u00a4S\2\u0306\u0307\7\17\2\2"+
		"\u0307\u0308\5<\37\2\u0308\u0309\7\20\2\2\u0309\u030b\3\2\2\2\u030a\u0306"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u0304\3\2\2\2\u030d"+
		"\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0312\3\2"+
		"\2\2\u0310\u030e\3\2\2\2\u0311\u0313\7K\2\2\u0312\u0311\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0317\3\2\2\2\u0314\u0317\7H\2\2\u0315\u0317\7I\2"+
		"\2\u0316\u02f7\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2\2\2\u0317\u00a3"+
		"\3\2\2\2\u0318\u031a\t\31\2\2\u0319\u0318\3\2\2\2\u031a\u031b\3\2\2\2"+
		"\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u00a5\3\2\2\2\u031d\u031f"+
		"\t\32\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2"+
		"\u0320\u0321\5\u00a2R\2\u0321\u00a7\3\2\2\2\u0322\u0323\5\u00b0Y\2\u0323"+
		"\u00a9\3\2\2\2\u0324\u0325\7\3\2\2\u0325\u0326\7G\2\2\u0326\u0334\7\4"+
		"\2\2\u0327\u0330\7\3\2\2\u0328\u032d\5\u00acW\2\u0329\u032a\7\63\2\2\u032a"+
		"\u032c\5\u00acW\2\u032b\u0329\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b"+
		"\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u0330"+
		"\u0328\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0334\7\4"+
		"\2\2\u0333\u0324\3\2\2\2\u0333\u0327\3\2\2\2\u0334\u00ab\3\2\2\2\u0335"+
		"\u0336\5\u00a6T\2\u0336\u0337\5\u00aeX\2\u0337\u00ad\3\2\2\2\u0338\u033a"+
		"\5\u00b4[\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u0342\3\2\2"+
		"\2\u033b\u033c\7\3\2\2\u033c\u033d\5\u00aeX\2\u033d\u033e\7\4\2\2\u033e"+
		"\u0343\3\2\2\2\u033f\u0341\5\u00a8U\2\u0340\u033f\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u033b\3\2\2\2\u0342\u0340\3\2\2\2\u0343"+
		"\u0345\3\2\2\2\u0344\u0346\5\u008eH\2\u0345\u0344\3\2\2\2\u0345\u0346"+
		"\3\2\2\2\u0346\u00af\3\2\2\2\u0347\u034c\7d\2\2\u0348\u0349\7\67\2\2\u0349"+
		"\u034b\7d\2\2\u034a\u0348\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2"+
		"\2\2\u034c\u034d\3\2\2\2\u034d\u0351\3\2\2\2\u034e\u034c\3\2\2\2\u034f"+
		"\u0351\5\62\32\2\u0350\u0347\3\2\2\2\u0350\u034f\3\2\2\2\u0351\u00b1\3"+
		"\2\2\2\u0352\u0353\t\33\2\2\u0353\u00b3\3\2\2\2\u0354\u0356\5\60\31\2"+
		"\u0355\u0357\7:\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359"+
		"\3\2\2\2\u0358\u0354\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u0358\3\2\2\2\u035a"+
		"\u035b\3\2\2\2\u035b\u00b5\3\2\2\2\u035c\u035d\5\u00b4[\2\u035d\u00b7"+
		"\3\2\2\2a\u00bb\u00c7\u00d4\u00e6\u00e9\u00ed\u00f6\u00fc\u0108\u010d"+
		"\u0110\u0113\u0118\u011d\u0127\u012b\u0131\u013c\u0145\u0153\u0164\u018e"+
		"\u01a2\u01a4\u01bf\u01c5\u01ce\u01d3\u01d8\u01dd\u01e2\u01e7\u01ed\u01f3"+
		"\u01f8\u01fd\u0202\u020a\u0210\u0217\u021a\u0220\u0225\u022b\u022f\u023c"+
		"\u0244\u0250\u025f\u0265\u026a\u026c\u0274\u0277\u0281\u0286\u028f\u0292"+
		"\u0296\u0299\u02a1\u02a5\u02a9\u02ac\u02af\u02b5\u02ba\u02c1\u02cd\u02d4"+
		"\u02d9\u02dc\u02e9\u02ed\u02f0\u02f7\u02fb\u0302\u030a\u030e\u0312\u0316"+
		"\u031b\u031e\u032d\u0330\u0333\u0339\u0340\u0342\u0345\u034c\u0350\u0356"+
		"\u035a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}