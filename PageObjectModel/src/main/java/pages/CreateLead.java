package pages;

import baseclass.BaseUtils;

public class CreateLead extends BaseUtils {

	
	CreateLead()
	{
		
	}
	
	public CreateLead cname(String cname) 
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		return this;
	}
	public CreateLead Fname(String Fname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
		return this;
	}
	public CreateLead Lname(String Lname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
		return this;
	}
	public CreateLead email()
	{
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("jagannadar44@gmail.com");
		return this;
	}
	public ViewLeads clickButton()
	{
		driver.findElementByName("submitButton").click();
		return new ViewLeads();
	}
	
	public static void main(String[] args) {
		

	}

}
