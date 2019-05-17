package leafground;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropDown
{
	@Test
	public void alertt() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		Actions mous = new Actions(driver);
		mous.moveToElement(driver.findElementByXPath(("//select[@id='dropdown1']"))).click().perform();
	//	driver.findElementByXPath(("//select[@multiple]"));
		
		List<WebElement> Loptions = driver.findElementsByXPath("//select[@id='dropdown1']/option");
		WebElement webElement = Loptions.get(2);
		webElement.click();
		
		
		
	}

}
