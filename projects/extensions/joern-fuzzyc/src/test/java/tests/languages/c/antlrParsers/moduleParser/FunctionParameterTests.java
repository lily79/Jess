package tests.languages.c.antlrParsers.moduleParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import antlr.ModuleParser;

public class FunctionParameterTests extends FunctionDefinitionTests {

	@Test
	public void testFunctionPtrParam() {
		String input = "int foo(char *(*param)(void)){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);

		assertTrue(output.startsWith(
				"(function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( (parameter_decl_clause (parameter_decl (param_decl_specifiers (type_name (base_type char))) (parameter_id (ptrs (ptr_operator *)) ( (parameter_id (ptrs (ptr_operator *)) (parameter_name (identifier param))) ) (type_suffix (param_type_list ( void )))))) )) (compound_statement { }))"));
	}

	@Test
	public void testVoidParamList() {
		String input = "static int altgid(void){}";
		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertEquals("(function_def (return_type (function_decl_specifiers static) (type_name (base_type int))) (function_name (identifier altgid)) (function_param_list ( (parameter_decl_clause (parameter_decl void)) )) (compound_statement { }))", output);
	}
	
	@Test
	public void testLinebreakInDefinition() {
		String input = "static int\n" + 
				"xmlstrlen(const XML_Char *s){}";
		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertEquals("(function_def (return_type (function_decl_specifiers static) (type_name (base_type int))) \\n (function_name (identifier xmlstrlen)) (function_param_list ( (parameter_decl_clause (parameter_decl (param_decl_specifiers (type_name const (base_type XML_Char))) (parameter_id (ptrs (ptr_operator *)) (parameter_name (identifier s))))) )) (compound_statement { }))", output);
	}
	
	@Test
	public void testLinebreakInParameters() {
		String input = " void proc3(int a3, int b3,\n int c3, int d3) {}";
		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		String expected = "(function_def (return_type (type_name (base_type void))) (function_name (identifier proc3)) "
				+ "(function_param_list ( "
				+ "(parameter_decl_clause "
				+ "(parameter_decl (param_decl_specifiers (type_name (base_type int))) (parameter_id (parameter_name (identifier a3)))) , "
				+ "(parameter_decl (param_decl_specifiers (type_name (base_type int))) (parameter_id (parameter_name (identifier b3)))) , "
				+ "\\n "
				+ "(parameter_decl (param_decl_specifiers (type_name (base_type int))) (parameter_id (parameter_name (identifier c3)))) , "
				+ "(parameter_decl (param_decl_specifiers (type_name (base_type int))) (parameter_id (parameter_name (identifier d3))))) "
				+ ")) "
				+ "(compound_statement { }))";
		assertEquals(expected, output);
	}

	@Test
	public void testParamVoidPtr() {
		String input = "static int altgid(void *ptr){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertTrue(output.startsWith("(function_def"));
	}

	@Test
	public void testLinux__user() {
		String input = "static long aio_read_events_ring(struct kioctx *ctx, struct io_event __user *event, long nr){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertTrue(output.startsWith("(function_def"));
	}

	@Test
	public void testParamConstVoidPtr() {
		String input = "static ssize_t _7z_write_data(struct archive_write *a, const void *buff, size_t s){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertTrue(output.startsWith("(function_def"));
	}
}
