package com.practice.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest 
{
	@Test
public void webTableTest() 
{

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
 driver.switchTo().frame("iframeResult");
  List<WebElement> rowcount = driver.findElements(By.xpath("//table/tbody/tr"));
 List<WebElement> clmcount = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
System.out.print(rowcount);
System.out.print(clmcount);

System.out.println(driver.findElement(By.xpath("//table/tbody")).getText());
}
}
