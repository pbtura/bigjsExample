package util;

import org.jsweet.transpiler.JSweetContext;
import org.jsweet.transpiler.JSweetFactory;
import org.jsweet.transpiler.JSweetOptions;
import org.jsweet.transpiler.Java2TypeScriptTranslator;
import org.jsweet.transpiler.TranspilationHandler;
import org.jsweet.transpiler.extension.PrinterAdapter;

import com.sun.tools.javac.tree.JCTree.JCCompilationUnit;

public class TuraJSweetFactory extends JSweetFactory
{
	public TuraJSweetFactory()
	{
		super();
	}

	@Override
	public JSweetContext createContext(JSweetOptions options)
	{
		return super.createContext(options);
	}

	@Override
	public Java2TypeScriptTranslator createTranslator(PrinterAdapter adapter, TranspilationHandler transpilationHandler,
			JSweetContext context, JCCompilationUnit compilationUnit, boolean fillSourceMap)
	{
		return new CustomTranslator(adapter, transpilationHandler, context, compilationUnit, fillSourceMap);
	}
}
