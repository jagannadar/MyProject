package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElementById("username").sendKeys("Demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	//WebElement key = driver.findElementByClassName("");
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Create Lead").click();
	
		driver.findElementById("createLeadForm_companyName").sendKeys("Capgemini");
		driver.findElementById("createLeadForm_firstName").sendKeys("Jagan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ramar");
		
		driver.findElementByName("submitButton").click();
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();
		driver.findElementByLinkText("Edit").click();
		
		WebElement dropDown1 = driver.findElementByName("industryEnumId");
		Select dropp = new Select(dropDown1);
		dropp.selectByValue("IND_SOFTWARE");
		
		WebElement dropDown2 = driver.findElementByName("ownershipEnumId");
		Select dropy = new Select(dropDown2);
		List<WebElement> dropf = dropy.getOptions();
		dropy.selectByIndex(dropf.size()-1);
		
		//span[@class='x-tab-strip-text '])[4]

				//button[text()='Find Leads']

				//a[@class='selected']
	
	}

}
