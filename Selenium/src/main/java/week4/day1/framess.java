package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framess {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alertBox = driver.switchTo().alert();
		alertBox.sendKeys("Jagan");
		alertBox.accept();
		
		String text = driver.findElementById("demo").getText();
			
		if(text.contains("Jagan"))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not Present");
		}
		

	}

}
