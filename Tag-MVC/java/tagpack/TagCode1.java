package tagpack;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.*;
import javax.servlet.jsp.*;
public class TagCode1 extends SimpleTagSupport
{
	public void doTag()throws JspException,IOException
	{
		getJspContext().getOut().print("This is a first simple tag");
	}
}