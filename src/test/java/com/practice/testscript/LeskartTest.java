package com.practice.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeskartTest
{
	@Test
public void leskartTest() throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.lenskart.com/");
	driver.findElement(By.xpath("//input[@placeholder='What are you looking for ']")).click();
	Thread.sleep(2000);
	 List<WebElement> links = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']//li"));
	for (WebElement link:links) 
	{
	System.out.println(link.getText());	
	}
}
}
