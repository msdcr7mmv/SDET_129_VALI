package DDT_PROG;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadParameterFromXMLFileTest 
{
	@Test
	public void readParamFromXMLTest(XmlTest xml)
	{
		String URL = xml.getParameter("url");
		System.out.println(URL);
	}
}
