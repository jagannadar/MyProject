package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class framesPrac {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath("(//img[@src = '/images/fieldlookup.gif'])[1]").click();
		
		Set<String> getWin = driver.getWindowHandles();
		
		List<String> Llist = new ArrayList<String>();	
		Llist.addAll(getWin);
		
		driver.switchTo().window(Llist.get(1));
		driver.getTitle();
		
		driver.findElementByXPath("(//input[@ type='text'])[1]").sendKeys("10081");
		driver.findElementByXPath("( //tbody//tr/td/div/a)[1]").click();
		
		
		driver.switchTo().window(Llist.get(0));
		
		driver.findElementByXPath("(//img[@src = '/images/fieldlookup.gif'])[2]").click();
		Set<String> getWin1 = driver.getWindowHandles();
		
		List<String> Llist1 = new ArrayList<String>();	
		Llist1.addAll(getWin1);
		
		driver.switchTo().window(Llist1.get(1));
		driver.findElementByXPath("(//input[@ type='text'])[1]").sendKeys("10085");
		driver.findElementByXPath("( //tbody//tr/td/div/a)[1]").click();
		
		driver.switchTo().window(Llist1.get(0));
		Thread.sleep(5000);
		//driver.findElementByLinkText("Merge").click();
		driver.findElementByXPath("//table[@class = 'twoColumnForm']/tbody/tr[4]/td[2]/a").click();
		driver.switchTo().alert().accept();
		
		//driver.findElementByLinkText("Find Leads");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
