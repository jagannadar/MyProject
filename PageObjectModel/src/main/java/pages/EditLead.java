package pages;

import baseclass.BaseUtils;

public class EditLead extends BaseUtils{
	
	public EditLead changeCompanyName(String cname)
	{
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(cname);
		return this;
	}
	
	public ViewLeads clickEditUpdate()
	{
		
		driver.findElementByXPath("//input[@value='Update']").click();
		return new ViewLeads();
	}
	
	
	public static void main(String[] args) {
		
	}

}
