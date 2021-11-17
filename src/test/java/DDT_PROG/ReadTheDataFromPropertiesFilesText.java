package DDT_PROG;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadTheDataFromPropertiesFilesText 
{
 @Test
 public void readTheDataFromPropertiesFilesText() throws Throwable 
 {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
 }
}
