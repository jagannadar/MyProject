package pages;

import baseclass.BaseUtils;

public class DuplicateLead extends BaseUtils {
	
	DuplicateLead()
	{
		
	}
	
	public ViewLeads clickCreateLead()
	{
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		return new ViewLeads();
	}
	
	public DuplicateLead verifyTitle(String Title)
	{
		String title = driver.getTitle();
		//if (title.equalsIgnoreCase("View Lead | opentaps CRM"))
		if (title.equalsIgnoreCase(Title))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not Verified");
		}
		return new DuplicateLead();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
