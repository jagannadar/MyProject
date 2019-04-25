package com.yalla.pages.cuc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.And;

public class MyHomePage extends Annotations{
	public MyHomePage() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(how=How.LINK_TEXT, using="Leads")  WebElement eleLeads;
	
	@And("Click on the Leads link")
	public MyLeads clickLeads()
	{
	click(eleLeads);
	return new MyLeads();		
	}
	
}
