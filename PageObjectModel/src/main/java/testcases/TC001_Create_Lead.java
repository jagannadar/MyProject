package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseUtils;
import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;

public class TC001_Create_Lead extends BaseUtils{
	
	@BeforeTest
	public void setData()
	{
		excelFileName = "CreateData";
	}
	
	
	@Test(dataProvider = "JAGAN" , priority=2)
	public void LoginAndCreate(String uname , String pwd , String Cname , String Fname , String Lname)
	{
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		
		//new HomePage()
		.clickCRM()
		.clickLead()
		.clickCreateLead()
		.cname(Cname)
		.Fname(Fname)
		.Lname(Lname)
		.email()
		.clickButton();	
		
	}
	
	@Test(dataProvider = "JAGAN" , priority = 4)
	public void LoginAndCreated(String uname , String pwd , String Cname , String Fname , String Lname)
	{
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		
		//new HomePage()
		.clickCRM()
		.clickLead()
		.clickCreateLead()
		.cname(Cname)
		.Fname(Fname)
		.Lname(Lname)
		.email()
		.clickButton();	
		
	}
	
	
	

}
