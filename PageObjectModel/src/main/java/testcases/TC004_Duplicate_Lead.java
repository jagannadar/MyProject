package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseUtils;
import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;

public class TC004_Duplicate_Lead extends BaseUtils{
	
	@BeforeTest
	public void setData()
	{
		excelFileName = "DuplicateData";
	}
	
	@Test(dataProvider = "FetchDuplicate")
	public void LoginAndCreate( String email) throws InterruptedException
	{
		
		 new LoginPage()
		.enterUserName("Demosalesmanager")
		.enterPassword("crmsfa")
		.clickLogin()
		
		.clickCRM()
		.clickLead()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmailTextBox(email)
		.clickFindLeadsButton()
		.firstNameDataFromTable()
		.clickNameFirstData()
		.clickDuplicateLeadButton()
		.verifyTitle("Duplicate Lead | opentaps CRM")
		.clickCreateLead()
		.verifyCompanyName(duplicate);
		
		
		
		
	}
	
	

}
