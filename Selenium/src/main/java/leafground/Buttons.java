package leafground;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Buttons {

	@Test
	public void buttons() throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.findElementByXPath(("//select[@multiple]/option)[4]")).click();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		driver.findElementById("home").click();
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.findElementById("position").getLocation());
		
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		
		System.out.println(driver.findElementById("size").getSize());
		
		
	}

}
