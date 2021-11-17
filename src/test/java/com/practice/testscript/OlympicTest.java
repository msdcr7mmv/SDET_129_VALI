package com.practice.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OlympicTest
{
	@Test
	public void olympicTest() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.olympics.com/");
		//	String text = driver.findElement(By.xpath("//span[text()=\"Eliud KIPCHOGE\"]/ancestor::ul/li[1]//div[@class=\"featured-athlete__medals text-body-sm\"]")).getText();
		//System.out.println(text);
		//Thread.sleep(1000);
		//List<WebElement> alltxt = driver.findElements(By.xpath("//span[text()=\"Eliud KIPCHOGE\"]/ancestor::ul/li[1]//div[@class=\"featured-athlete__medals text-body-sm\"]"));
		//
		//for(WebElement onetxt:alltxt) 
		//{
		//	String person = onetxt.getText();
		//	System.out.println(person);
		//}
		//	List<WebElement> namesforall = driver.findElements(By.xpath("//a[@class='featured-athlete__name d-flex text-body']/span"));
		//	List<WebElement> medalsforall = driver.findElements(By.xpath("//div[@class='featured-athlete__medals text-body-sm']"));
		//for (int i = 0; i <medalsforall.size() ; i++)
		//{
		//System.out.println(namesforall.get(i).getText()+"\n"+medalsforall.get(i).getText());
		//}
//		WebElement goldmedal = driver.findElement(By.xpath("//div[@class='featured-athlete__medals text-body-sm']"));
//		List<WebElement> namesforall = driver.findElements(By.xpath("//a[@class='featured-athlete__name d-flex text-body']/span"));
//		for (int i = 0; i <goldmedal.size() ; i++)
//				{
//				System.out.println(namesforall.get(i).getText()+"\n"+goldmedal.get(i).getText());
//				}
	}
}
