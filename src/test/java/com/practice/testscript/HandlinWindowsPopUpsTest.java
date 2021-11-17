package com.practice.testscript;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlinWindowsPopUpsTest
{
	@Test
public void handlinWindowsPopUpsTest()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
 driver.get("https://www.naukri.com");
 Set<String> windids=driver.getWindowHandles();
 for(String win:windids)
 {
	 driver.switchTo().window(win);
	 System.out.println(driver.getTitle());
	if(driver.switchTo().window(win).getTitle().equalsIgnoreCase("Tech Mahindra"))
	{
		driver.manage().window().maximize();
		break;
	}
	 
 }
 
}
}
