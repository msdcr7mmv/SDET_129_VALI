package com.practice.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FutureDate 
{
	@Test
public void futureDate() throws InterruptedException
{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//li[@class=\"makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut\"]")).click();
		WebElement close = driver.findElement(By.xpath("//span[@class=\"langCardClose\"]"));
		close.click();
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(close)).click();
		driver.findElement(By.xpath("//span[text()=\"DEPARTURE\"]")).click();
		Thread.sleep(2000);
	
	for (int i=0;i<11;i++)
	{
	try {
		driver.findElement(By.xpath("//div[@aria-label='Wed Apr 06 2022']")).click();
		break;
	} catch (Exception e) {
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}
	}
	}
}

