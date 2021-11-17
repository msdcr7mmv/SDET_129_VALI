package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.objectrepository.LoginTest;

public class RepoTest  
{
	@Test
public void repoTest() 
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888");
	LoginTest lp= new LoginTest(driver);
	lp.loginIntoVtiger("admin","admin");
	
	
}

}
