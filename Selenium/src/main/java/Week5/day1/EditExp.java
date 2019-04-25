package Week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditExp extends  Linkexp implements MouseExp {
	@Test(dependsOnMethods = {"Week5.day1.Linkexp.linkExp"} )
	public  void editExp() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("Jagan");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Jagan" , Keys.TAB);
		
		 String tt = driver.findElementByXPath("(//input[@name='username'])[1]").getAttribute("value");
		System.out.println(tt);
		
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		
		System.out.println(driver.findElementByXPath("//input[@disabled='true']").isEnabled());
		System.out.println("Edit Page");
		
	}
	
	@BeforeTest
	public void mouseExp()  {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath("(//div[@tabindex='-1']//button)[1]").click();
		WebElement elect = driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		Actions mous = new Actions(driver);
		mous.clickAndHold(elect).perform();
		
		driver.findElementByXPath("//a[text()='Apple']").click();

}
}
