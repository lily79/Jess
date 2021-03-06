grammar Common;
import ModuleLex;

@header{
  import java.util.Stack;
  import java.util.EmptyStackException;
}


@parser::members{
	// Find the closing bracket to the opening bracket (and then return true), skip
	// everything that is in between
	public boolean skipToEndOfObject() {
		// Stack of curly brackets
		Stack<Object> CurlyStack = new Stack<Object>();
		// Object for the brackets
		Object o = new Object();
		// returns the value of the current symbol in the stream (which is the next
		// symbol to be consumed)
		int t = _input.LA(1);

		// Find the closing bracket to the opening bracket, skip everything that is in
		// between
		while (t != EOF && !(CurlyStack.empty() && t == CLOSING_CURLY)) {

			// If there is an #else inside a method or class
			if (t == PRE_ELSE || t == PRE_ELIF) {
				// Stack for collecting #ifs
				Stack<Object> ifdefStack = new Stack<Object>();
				// Return and parse #else, skip to next input
				consume();
				t = _input.LA(1);

				// Find the closing #endif to the opening #else, skip everything that is in
				// between (#else/#endif included)
				while (t != EOF && !(ifdefStack.empty() && (t == PRE_ENDIF))) {
					// Collect all found opening #ifs. If a #endif is found, remove one #if/#else
					// from stack
					if (t == PRE_IF)
						ifdefStack.push(o);
					else if (t == PRE_ENDIF)
						ifdefStack.pop();

					// Return and parse current t, skip to next input
					consume();
					t = _input.LA(1);
				}
			}

			// Collect all found opening brackets. If a closing bracket is found, remove one
			// opening bracket from stack
			if (t == OPENING_CURLY)
				CurlyStack.push(o);
			else if (t == CLOSING_CURLY)
				CurlyStack.pop();

			// Consume and return the current symbol, move cursor to next symbol, the
			// consumed symbol is added to the parse tree
			consume();
			t = _input.LA(1);
		}

		if (t != EOF) {
			// Return the closing bracket (if there is one)
			consume();
			//Check for newline and END_TEST
			if(_input.LA(1) == NEWLINE &&  _input.LA(2) == END_TEST){
			    //Parse both
			    consume();
			    consume();
			}
		}

		return true;
	}
            
       // this should go into FunctionGrammar but ANTLR fails
       // to join the parser::members-section on inclusion
       
       //Find the closing #endif to the opening #if (and then return true), consume everything that is in between
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
             
       
      //Find the end of a preprocessor macro
     public boolean preProcFindMacroEnd()  {
          //Stack for backslashes
          Stack<Object> slashStack = new Stack<Object>();
          //Object for the  slashes
          Object o = new Object();
          //returns the value of the current symbol in the stream (which is the next symbol to be consumed)
          int t = _input.LA(1);

            //Look for end of the macro where a newline appears without a previous backslash
            while(t != EOF && !(slashStack.empty() && t == NEWLINE)){
                
                   //Count escape and newline characters                   
                  if(t == ESCAPE){
                        slashStack.push(o);
                  } else if(t == NEWLINE) {
                        slashStack.pop();
                  } 
                  
                  //Consume and return the current symbol, the consumed symbol is added to the parse tree 
                  consume();                   
                  //Move cursor to next symbol
                  t = _input.LA(1);
             }                                             
   	return true;
	}
	
	 //Find the end of a preprocessor macro
     public boolean preProcFindConditionEnd()  {
         int t = _input.LA(1);
         //System.out.println("Scan: "+t); 
         
         //Look for end of the macro where a newline appears without a previous backslash
         while(!(t == EOF || t == NEWLINE || t == COMMENT)){

             
             //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
             consume();
             t = _input.LA(1); 
//             System.out.println("New t: "+t);                 
         }   
         
         //The newline or the EOF belong to the PreIfStatement's code   
         if(t == NEWLINE || t == EOF ){
                //System.out.println("Newline found");
                consume();
          } 
          
          //The comment does not belong to the PreIfStatement's code 
          if(t == COMMENT){
                //System.out.println("Comment found");
                //exitRule();
               // createTerminalNode(parent,t);
              // t = EOF;
          }              
         
         //Look for / \n or begin of a comment
         return true;
     }
     
         //Find the end of a preprocessor macro
     public boolean skipComments()  {
         int t = _input.LA(1);
         System.out.println("Scan: "+t);          
          
          //The comment does not belong to the PreIfStatement's code 
          if(t == COMMENT){
              //Look for newline or EOF          
              for(int i = 1; !(t == NEWLINE || t == EOF); i++){
                  t = _input.LA(1+i); 
              }
              consume();
              System.out.println("Consumed");
                //exitRule();
               // createTerminalNode(parent,t);
              // t = EOF;
          }              
         
         //Look for / \n or begin of a comment
         return true;
     }

}


comment: COMMENT;
newline: NEWLINE;
unary_operator : '&' | '*' | '+'| '-' | '~' | '!';
relational_operator: ('<'|'>'|'<='|'>=');

constant
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
	|	(STRING NEWLINE* COMMENT* NEWLINE*)+ //Comment should be comment, but currently parser cannot handle this
    |   CHAR
    |   FLOATING_POINT_LITERAL
    ;

// keywords & operators

function_decl_specifiers: ('inline' | 'virtual' | 'explicit' | 'friend' | 'static');
ptr_operator: ('*' | '&');

access_specifier: ('public' | 'private' | 'protected');

operator: (('new' | 'delete' ) ('[' ']')?)
  | '+' | '-' | '*' | '/' | '%' |'^' | '&' | '|' | '~'
  | '!' | '=' | '<' | '>' | '+=' | '-=' | '*='
  | '/=' | '%=' | '^=' | '&=' | '|=' | '>>'
  |'<<'| '>>=' | '<<=' | '==' | '!='
  | '<=' | '>=' | '&&' | '||' | '++' | '--'
  | ',' | '->*' | '->' | '(' ')' | '[' ']'
  ;

assignment_operator: '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='; 
equality_operator: ('=='| '!=');

template_decl_start : TEMPLATE '<' template_param_list '>';


// template water
template_param_list : (('<' template_param_list '>') |
                       ('(' template_param_list ')') | 
                       no_angle_brackets_or_brackets)+
;

// water
no_brackets: ~('(' | ')');
no_brackets_curlies_or_squares: ~('(' | ')' | '{' | '}' | '[' | ']');
no_brackets_or_semicolon: ~('(' | ')' | ';');
no_angle_brackets_or_brackets : ~('<' | '>' | '(' | ')');
no_curlies: ~('{' | '}');
no_squares: ~('[' | ']');
no_squares_or_semicolon: ~('[' | ']' | ';');
no_comma_or_semicolon: ~(',' | ';');


assign_water: ~('(' | ')' | '{' | '}' | '[' | ']' | ';' | ',');
assign_water_l2: ~('(' | ')' | '{' | '}' | '[' | ']');

water: .;
