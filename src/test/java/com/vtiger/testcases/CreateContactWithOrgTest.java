package com.vtiger.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vtiger.genericutil.BaseClass;
import com.vtiger.genericutil.JavaUtility;

public class CreateContactWithOrgTest extends BaseClass
{
	@Test
	public void createContactWithOrganisation() throws Throwable
	{
		String firstName = eUtil.excelUtility("Sheet1", 6, 2)+"_"+JavaUtility.generateRandomNumber();
		String lastName = eUtil.excelUtility("Sheet1", 6, 3)+"_"+JavaUtility.generateRandomNumber();
		String searchType = eUtil.excelUtility("Sheet1", 6, 4);
		
		//Create Contact with Organisation
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		WebElement fn = driver.findElement(By.name("salutationtype"));
		wUtil.selectByVisibleText(fn, "Mr.");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
		
		//Switch to child window
		String partialWinTitle="Accounts";
		wUtil.switchToWindow(driver, partialWinTitle);
		driver.findElement(By.id("search_txt")).sendKeys(searchType);
  	driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='Session8']")).click();
		
		//Switch to Parent window
		String partialWinTitle1="Contacts";
		wUtil.switchToWindow(driver, partialWinTitle1);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
	}
}
