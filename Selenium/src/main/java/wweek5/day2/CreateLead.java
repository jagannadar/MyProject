package wweek5.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseUtils{
	// to run test case 2 times with same data
	// enabled if false @test will not be considered to run
	
	@BeforeTest
	public void setdata()
	{
		System.out.println("Before Test");
		excelFileName = "CreateLead";
	}
	
	@Test(dataProvider = "jags" )
	public void createLeadTest(String com , String first , String last) {
//		login();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(com);
		driver.findElementById("createLeadForm_firstName").sendKeys(first);
		driver.findElementById("createLeadForm_lastName").sendKeys(last);
		driver.findElementByName("submitButton").click();
//		closeApp();
	}
	
	

	
		
	
}





