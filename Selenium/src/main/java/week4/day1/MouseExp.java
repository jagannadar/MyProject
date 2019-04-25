package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExp {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath("(//div[@tabindex='-1']//button)[1]").click();
		WebElement elect = driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		Actions mous = new Actions(driver);
		mous.clickAndHold(elect).perform();
		Thread.sleep(5000);
		driver.findElementByXPath("//a[text()='Apple']").click();
		
		
		
		
	}
}
