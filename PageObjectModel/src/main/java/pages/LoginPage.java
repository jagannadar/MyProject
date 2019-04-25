package pages;

import baseclass.BaseUtils;

public class LoginPage extends BaseUtils {
	
	public LoginPage()
	{
		
	}

	
	public LoginPage enterUserName(String name)
	{
		driver.findElementById("username").sendKeys(name);
		return this;
	}
	
	public LoginPage enterPassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
		return this;
	}
	
	public HomePage clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
