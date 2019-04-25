package leafground;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditExp {

	@Test
	public void edit() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("Jagan");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Jagan" , Keys.TAB);
		
		 String tt = driver.findElementByXPath("(//input[@name='username'])[1]").getAttribute("value");
		System.out.println(tt);
		
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		
		System.out.println(driver.findElementByXPath("//input[@disabled='true']").isEnabled());
	}

}
