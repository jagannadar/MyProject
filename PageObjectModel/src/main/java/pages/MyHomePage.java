	package pages;

import baseclass.BaseUtils;

public class MyHomePage extends BaseUtils {

	
	MyHomePage()
	{}
	
	public MyLeads clickLead()
	{
		
		driver.findElementByLinkText("Leads").click();
		return new MyLeads();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
