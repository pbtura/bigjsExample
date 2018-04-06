package util;

import org.jsweet.transpiler.JSweetContext;
import org.jsweet.transpiler.JSweetFactory;
import org.jsweet.transpiler.JSweetOptions;

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
}
