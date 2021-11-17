package TestNGPractice;

import org.junit.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericutil.BaseClass;
@Listeners(com.vtiger.genericutil.Listners.class)
public class SampleTest extends BaseClass
{
//	@BeforeSuite
//	public void connectDB()
//	{
//		System.out.println("connect to database");
//	}
//	@BeforeClass
//	public void launchthebrowser()
//	{
//		System.out.println("launch the browser");
//
//	}
//	@BeforeMethod
//	public void login()
//	{
//		System.out.println("login to the application");
//
//	}
	@Test
	public void createorganisation()
	{
		System.out.println(10/0);
	}
	@Test
	public void modifyOrganisation() 
	{
		System.out.println("modify organisation");	
	}
}
//	@AfterMethod
//	public void logout()
//	{
//		System.out.println("logout to the application");
//
//	}
//	@AfterClass
//	public void closethebrowser()
//	{
//		System.out.println("launch the browser");
//
//	}
//	@AfterSuite
//	public void disconnectDB()
//	{
//		System.out.println("disconnect to database");
//	}
//}