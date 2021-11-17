package com.practice.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLoginWithMobilePrice 
{
	@Test
public void amazonLoginWithMobilePrice()
{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles under 15000");
     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
     driver.findElement(By.xpath("//li[@id='p_89/Redmi']//i[@class='a-icon a-icon-checkbox']")).click();
//   WebElement wb = driver.findElement(By.xpath("//span[normalize-space()='Redmi 9 Prime (Mint Green, 4GB RAM, 64GB Storage)- Full HD+ Display & AI Quad Camera']"));
//   System.out.println(wb);
//   WebElement wd =driver.findElement(By.xpath("//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-price-whole'][normalize-space()='10,499']"));
//     
//     System.out.println(wd);
}
}
