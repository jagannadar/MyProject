package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC001_CreateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_CreateLead";
		testcaseDec = "Login into leaftaps";
		author = "Jagan";
		category = "TestCases";
		excelFileName = "CreateData";
	} 

	@Test(dataProvider="FetchCreateLeadData") 
	public void loginAndLogout(String uName, String pwd, String cname, String fname, String lname) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRM()
		.clickLeads()
		.clickCreateLead()
		.enterCname(cname)
		.enterFname(fname)
		.enterLname(lname)
		.clickButton();
		
		
		
		
		/*LoginPage lp = new  LoginPage();
		lp.enterUserName();
		lp.enterPassWord();*/
		
	}
	
}






