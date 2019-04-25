package TestCases;


import org.testng.annotations.Test;

public class CreateLead extends BaseUtils{
	// to run test case 2 times with same data
	// enabled if false @test will not be considered to run
	@Test(invocationCount = 1/*, enabled = false*/)
	public void createLeadTest() {
//		login();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
//		closeApp();
	}
}