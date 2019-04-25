package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import baseclass.BaseUtils;

public class FindLeads extends BaseUtils {

		
		
		public FindLeads clickEmailTab()
		{
			driver.findElementByXPath("//span[text()='Email']").click();
			return this;
		}
		
		public FindLeads enterEmailTextBox(String email)
		{
			driver.findElementByName("emailAddress").sendKeys(email);
		
			//driver.findElementByXPath("//input[@type='text']/parent::div[@class='x-form-element']/input[@name='emailAddress']").sendKeys(email);
			
			
			return this;
		}
		
		public FindLeads clickFindLeadsButton() throws InterruptedException
		{
			
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			return 	this;
		}
		
		public FindLeads firstDataFromTable() throws InterruptedException
		{
			//Thread.sleep(3000);
			cmpre = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']").getText();
			System.out.println(cmpre);
			return this;
		}
		public FindLeads firstNameDataFromTable() throws InterruptedException
		{
			//Thread.sleep(1000);
			 
			duplicate = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[@class='linktext'])[1]").getText();
			System.out.println(duplicate);
			return this;
			
		}
		
		
		public ViewLeads clickFirstData() throws InterruptedException
		{
			
			//Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver , 10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
			
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
			return new ViewLeads();
		}
		
		public ViewLeads clickNameFirstData() throws InterruptedException
		{
			
			Thread.sleep(5000);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[@class='linktext'])[1]").click();
			return new ViewLeads();
		}
		
		public DuplicateLead clickDuplicateLeadButton()
		{
			driver.findElementById("Duplicate Lead").click();
			return new DuplicateLead();
		}
		
		
		
		public FindLeads enterCapturedLeadID()
		{
			driver.findElementByXPath("//input[@name='id']").sendKeys(cmpre);
			return new FindLeads();
		}
		
		public void verifyNoRecords() throws InterruptedException
		{
			Thread.sleep(3000);
			String s = driver.findElementByClassName("x-paging-info").getText();
			System.out.println(s);
			if(s.equalsIgnoreCase("No records to display"))
					{
						System.out.println("Data got Deleted");
					}
			else
			{
				System.out.println("Data Not deleted");
			}
			
		}
		
			
		public static void main(String[] args) {		
		}

}
