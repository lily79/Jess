package parsing.Functions.builder;

import java.util.Stack;

import ast.ASTNode;
import ast.c.statements.blockstarters.IfStatement;
import ast.statements.blockstarters.DoStatement;
import ast.statements.blockstarters.TryStatement;

public class ContentBuilderStack
{
	Stack<ASTNode> itemStack = new Stack<ASTNode>();
	private ShadowStack shadowStack = new ShadowStack(itemStack);

	public void push(ASTNode statementItem)
	{
		shadowStack.push(statementItem);
		itemStack.push(statementItem);
	}

	public ASTNode pop()
	{
		shadowStack.pop();
		return itemStack.pop();
	}

	public int size()
	{
		return itemStack.size();
	}

	public ASTNode peek()
	{
		return itemStack.peek();
	}

	public IfStatement getIfInElseCase()
	{
		return shadowStack.getIfInElseCase();
	}

	public IfStatement getIf()
	{
		return shadowStack.getIf();
	}
	
//	//Preprocessor if/else handling
//	public PreIfStatement getPreIfInPreElseCase()
//	{
//		return shadowStack.getPreIfInPreElseCase();
//	}
//	
//	//Preprocessor if handling
//	public PreIfStatement getPreIf()
//	{
//		return shadowStack.getPreIf();
//	}

	public DoStatement getDo()
	{
		return shadowStack.getDo();
	}

	public TryStatement getTry()
	{
		return shadowStack.getTry();
	}
}
