package com.yalla.pages.cuc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class ViewLeads extends Annotations{

	public ViewLeads() {
		PageFactory.initElements(driver, this); 
	}
	
	
}
