package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;


public class CreateLead extends Annotations{
	
	public CreateLead() {
		PageFactory.initElements(driver, this); 
	}
	
	
	@FindBy(how=How.ID , using="createLeadForm_companyName") WebElement eleCname;
	@FindBy(how=How.ID , using="createLeadForm_firstName") WebElement eleFname;
	@FindBy(how=How.ID , using="createLeadForm_lastName") WebElement eleLname;
	@FindBy(how=How.NAME , using ="submitButton") WebElement eleButton;
	
	public CreateLead enterCname(String cname)
	{
		clearAndType(eleCname , cname);
		return this;
		
	}
	public CreateLead enterFname(String fname)
	{
		clearAndType(eleFname , fname);
		return this;
		
	}
	public CreateLead enterLname(String lname)
	{
		clearAndType(eleLname , lname);
		return this;
		
	}
	
	public ViewLeads clickButton()
	{
		click(eleButton);
		takeSnap();
		return new ViewLeads();
		
	}
	
		
	
	
	

}
