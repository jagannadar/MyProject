package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseUtils;
import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;

public class TC002_Delete_Lead extends BaseUtils{
	
	@BeforeTest
	public void setData()
	{
		excelFileName = "DeleteData";
	}
	
	@Test(dataProvider = "jags" , priority = 3)
	public void Delete_Create( String email) throws InterruptedException
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
		.firstDataFromTable()
		.clickFirstData()
		.clickDelete()
		.clickFindLeads()
		.enterCapturedLeadID()
		.clickFindLeadsButton()
		.verifyNoRecords();
		
		
		
	}
	
	

}
