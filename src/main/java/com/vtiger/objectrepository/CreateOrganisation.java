package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutil.WebDriverUtility;

public class CreateOrganisation extends WebDriverUtility
{

    WebDriver driver;
    public CreateOrganisation(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);	
    }
    @FindBy(name="accountname")
	private WebElement orgName;
	
	@FindBy(name="industry")
	private WebElement indType;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	/**
	 * @return the orgName
	 */
	private WebElement getOrgName() {
		return orgName;
	}

	/**
	 * @return the indType
	 */
	private WebElement getIndType() {
		return indType;
	}

	/**
	 * @return the saveBtn
	 */
	private WebElement getSaveBtn() {
		return saveBtn;
	}
	public void createOrgName(String organisationName)
	{
		orgName.sendKeys(organisationName);
		saveBtn.click();
	}
	public void createOrgNamewithIndustry(String organisationName, String industryType)
	{
		orgName.sendKeys(organisationName);
		selectByVisibleText(indType, industryType);
		saveBtn.click();
	}
	
    
}

