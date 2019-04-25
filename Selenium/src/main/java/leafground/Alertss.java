package leafground;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Alertss {
	@Test
	public void alertt() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		driver.switchTo().alert().accept();
		
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		driver.switchTo().alert().dismiss();
		
		driver.findElementByXPath("//button[@onclick='confirmPrompt()']").click();
		driver.switchTo().alert().sendKeys("TestLeaff");
		driver.switchTo().alert().accept();	*/
		
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		/*Select drop = new Select(driver.findElementById("dropdown1"));	
		drop.selectByIndex(2);
		Thread.sleep(5000);
		
		
		Select drop2 = new Select(driver.findElementByName("dropdown2"));	
		drop2.selectByVisibleText("Selenium");
		
		Select drop3 = new Select(driver.findElementById("dropdown3"));	
		drop3.selectByValue("3");
		
		Select drop4 = new Select(driver.findElementByClassName("dropdown"));
		List<WebElement> options = drop4.getOptions();
		System.out.println(options.size());*/
		//options.get(1).click();
		
		Actions Mdrop = new Actions(driver);
	//	Mdrop.moveToElement(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select")).click();
		Mdrop.click(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		
		
		
		
		
		
	}

}
