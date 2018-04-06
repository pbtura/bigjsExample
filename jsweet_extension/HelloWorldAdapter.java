import org.jsweet.transpiler.extension.PrinterAdapter;

public class HelloWorldAdapter extends PrinterAdapter
{
	public HelloWorldAdapter(PrinterAdapter parent)
	{
		super(parent);
		addTypeMapping(java.util.Date.class.getName(), "string");
	}
}
