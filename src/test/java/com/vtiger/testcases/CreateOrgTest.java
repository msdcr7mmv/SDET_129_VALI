package com.vtiger.testcases;

import org.testng.annotations.Test;

import com.vtiger.genericutil.BaseClass;
import com.vtiger.genericutil.ExcelUtility;
import com.vtiger.genericutil.JavaUtility;
import com.vtiger.objectrepository.CreateOrganisation;
import com.vtiger.objectrepository.HomePage;
import com.vtiger.objectrepository.OrganisationInfo;
import com.vtiger.objectrepository.OrganisationPage;
public class CreateOrgTest extends BaseClass 
{

	@Test
	public void createOrganisationTest() throws Throwable
	{
		ExcelUtility eUtil=new ExcelUtility();
		String orgName = eUtil.excelUtility("Sheet1",6 , 2)+"_"+JavaUtility.generateRandomNumber();

		//Create Organisation
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisation();
		
		OrganisationPage op=new OrganisationPage(driver);
		op.clickOnCreateOrg();
		
		CreateOrganisation co=new CreateOrganisation(driver);
		co.createOrgName(orgName);

		OrganisationInfo oi=new OrganisationInfo(driver);
		oi.verifyOrgName(orgName);
	}


}
