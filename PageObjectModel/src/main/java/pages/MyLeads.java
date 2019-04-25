package pages;

import baseclass.BaseUtils;

public class MyLeads extends BaseUtils {
	
	MyLeads()
	{
		
	}
	

	public CreateLead clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();
	}
	
	public FindLeads clickFindLeads()
	{
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeads();
	}
}
