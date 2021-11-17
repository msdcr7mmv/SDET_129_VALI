package com.practice.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LenskartToolTip 
{
	@Test
	public void lenskartToolTip()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/");
		String order = driver.findElement(By.xpath("//span[normalize-space()='Track Order']")).getAttribute("TrackOrder");
		System.out.println(order);
	}
}
