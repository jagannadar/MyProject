package pages;

import baseclass.BaseUtils;

public class HomePage extends BaseUtils {

	
	public HomePage()
	{}
	
	public MyHomePage clickCRM()
	{
		
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
