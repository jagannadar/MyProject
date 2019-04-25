package pages;

import baseclass.BaseUtils;

public class ViewLeads extends BaseUtils {

	ViewLeads()
	{
		
	}
	public DuplicateLead clickDuplicateLeadButton()
	{
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLead();
	}
	
	public MyLeads clickDelete()
	{
		driver.findElementByLinkText("Delete").click();
		return new MyLeads();
		
	}
	
	public EditLead clickEdit()
	{
		driver.findElementByLinkText("Edit").click();
		return new EditLead();
	}
	
//	public boolean verifyCompanyName()
//	{
//		return  driver.findElementById("viewLead_companyName_sp").getText().contains(duplicate);
//	//	return new ViewLeads();
//	}
	
	public ViewLeads verifyTitle()
	{
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("View Lead | opentaps CRM"))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not Verified");
		}
		return this;
	}
	public void verifyCompanyName(String vname)
	{
		String getcom = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(getcom);
		if(getcom.contains(vname))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("Not matched");
		}
		
		
		
		
	//	return contains;
	}
	
	
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
