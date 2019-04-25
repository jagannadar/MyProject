package week2.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class linkexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		String s = "Go to Home Page";
		driver.findElementByLinkText(s).click();
		driver.navigate().back();
		
		Actions mouse = new Actions(driver);	
		mouse.moveToElement(driver.findElementByLinkText("Go to Home Page")).click().perform();
		driver.navigate().back();	
		
		driver.get("http://www.leafground.com/pages/Link.html");
		String ss = "Go to Home Page";
		driver.findElementByLinkText(ss).sendKeys(Keys.ENTER);
		driver.navigate().back();
		
		
		
	
		
		/*String st = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		
		System.out.println(st);
		
//		boolean ee = driver.findElementByLinkText("Verify am I broken?").isEnabled();
//		System.out.println(ee);
		
		 List<WebElement> links = driver.findElementsByTagName("a");
		 Iterator<WebElement> iterator = links.iterator();
		 while(iterator.hasNext())	
		 {
			 iterator.next().getAttribute("href");
		 }
		 
		 */
		
	}

}
