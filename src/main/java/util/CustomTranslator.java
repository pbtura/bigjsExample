package util;

import org.jsweet.transpiler.JSweetContext;
import org.jsweet.transpiler.Java2TypeScriptTranslator;
import org.jsweet.transpiler.TranspilationHandler;
import org.jsweet.transpiler.extension.PrinterAdapter;

import com.sun.tools.javac.tree.JCTree.JCClassDecl;
import com.sun.tools.javac.tree.JCTree.JCCompilationUnit;
import com.sun.tools.javac.tree.JCTree.JCVariableDecl;

public class CustomTranslator extends Java2TypeScriptTranslator
{
	public CustomTranslator(PrinterAdapter adapter, TranspilationHandler logHandler, JSweetContext context,
			JCCompilationUnit compilationUnit, boolean fillSourceMap)
	{
		super(adapter, logHandler, context, compilationUnit, fillSourceMap);
	}

	@Override
	protected void printVariableInitialization(JCClassDecl clazz, JCVariableDecl var)
	{
		super.printVariableInitialization(clazz, var);
	}

	@Override
	public void visitVarDef(JCVariableDecl varDecl)
	{
		super.visitVarDef(varDecl);
		print("/*a test comment*/");
	}
}
