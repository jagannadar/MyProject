package com.yalla.pages.cuc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.And;


public class CreateLead extends Annotations{
	
	public CreateLead() {
		PageFactory.initElements(driver, this); 
	}
	
	
	@FindBy(how=How.ID , using="createLeadForm_companyName") WebElement eleCname;
	@FindBy(how=How.ID , using="createLeadForm_firstName") WebElement eleFname;
	@FindBy(how=How.ID , using="createLeadForm_lastName") WebElement eleLname;
	@FindBy(how=How.NAME , using ="submitButton") WebElement eleButton;
	
	@And("Enter CompanyName as (.*)")
	public CreateLead enterCname(String cname)
	{
		clearAndType(eleCname , cname);
		return this;
		
	}
	
	@And("Enter FirstName as (.*)")
	public CreateLead enterFname(String fname)
	{
		clearAndType(eleFname , fname);
		return this;
		
	}
	@And("Enter LastName as (.*)")
	public CreateLead enterLname(String lname)
	{
		clearAndType(eleLname , lname);
		return this;
		
	}
	
	@And("Click on the CreateLead Button")
	public ViewLeads clickButton()
	{
		click(eleButton);
		
		return new ViewLeads();
		
	}
	
		
	
	
	

}
