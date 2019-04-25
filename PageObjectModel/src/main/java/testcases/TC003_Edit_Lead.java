package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseUtils;
import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;

public class TC003_Edit_Lead extends BaseUtils{
	
	@BeforeTest
	public void setData()
	{
		excelFileName = "EditData";
	}
	
	@Test(dataProvider = "jagu")
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
		.clickFirstData()
		.clickEdit()
		.changeCompanyName("Capgemini")
		.clickEditUpdate()
		.verifyCompanyName("Capgemini");
	//	System.out.println(verifyCompanyName);
		
		
	}
	
	

}
