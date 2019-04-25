package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExp {

	public static void main(String[] args) {
		
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
