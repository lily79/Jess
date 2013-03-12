package tests;

import static org.junit.Assert.*;

import main.ShallowParser;
import main.TokenSubStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.junit.Test;
import antlr.CodeSensorLexer;


public class ShallowParserTest {

	private TokenSubStream createTokenStream(String input)
	{
		ANTLRInputStream inputStream = new ANTLRInputStream(input);
		CodeSensorLexer lex = new CodeSensorLexer(inputStream);
		TokenSubStream tokens = new TokenSubStream(lex);
        return tokens;
	}
	
	@Test
	public void testTermination()
	{
		String input = "class foo{ bar(){} }; xxx(){}";
		TokenSubStream tokens = createTokenStream(input);
		ShallowParser shallowParser = new ShallowParser();
		shallowParser.parse("filename", tokens);
		assertTrue(true);
	}

}
