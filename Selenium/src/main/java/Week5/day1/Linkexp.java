package Week5.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Linkexp {
	@Test
	public  void linkExp() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		String s = "Go to Home Page";
		driver.findElementByLinkText(s).click();
		
		driver.navigate().back();
		
		String st = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		
		System.out.println(st);
		System.out.println("Link Page");
		
//		boolean ee = driver.findElementByLinkText("Verify am I broken?").isEnabled();
//		System.out.println(ee);
		
		 List<WebElement> links = driver.findElementsByTagName("a");
		 Iterator<WebElement> iterator = links.iterator();
		 while(iterator.hasNext())	
		 {
			 iterator.next().getAttribute("href");
		 }
		 
		
	}

}
