package com.yalla.pages.cuc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class HomePage extends Annotations{ 

	public HomePage() {
       PageFactory.initElements(driver, this);
	} 
	
	
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	@FindBy(how=How.LINK_TEXT , using="CRM/SFA") WebElement eleLogin;
	public LoginPage clickLogout() {
		//WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);  
		return new LoginPage();

	}
	
	
	@Then("Click on the CRM\\/SFA link")
	public MyHomePage clickCRM() {
		//WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogin);  
		return new MyHomePage();

	}
	
	

}







