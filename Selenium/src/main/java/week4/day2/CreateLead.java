package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Find Leads");
		
		
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("jagannadar44@gmail.com");
		driver.findElementByXPath(" //button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(( //div[@id='findLeads']//table)[4]//td//a)[1]").click();
		
		String title = driver.getTitle();
		if(title=="View Lead | opentaps CRM")
		{
			System.out.println("Title is Present");
		}
		
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Infy");	
		driver.findElementByXPath("//input[@value='Update']").click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> Lwindow = new ArrayList<String>();
		Lwindow.addAll(windowHandles);
		
		driver.switchTo().window(Lwindow.get(Lwindow.size()-1));
			
	}
}
