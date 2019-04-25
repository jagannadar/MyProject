package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class MyLeads extends Annotations {

	public MyLeads() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(how=How.LINK_TEXT , using="Create Lead") WebElement eleCreateLead;
	
	public CreateLead clickCreateLead()
	{
		
		click(eleCreateLead);
		return new CreateLead();
	}
	
	
}
