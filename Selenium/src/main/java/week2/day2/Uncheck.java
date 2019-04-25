package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uncheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement eb = driver.findElementByXPath("//div[@class = 'example'][2]/input");
		
		if(eb.isSelected())
		{
			eb.click();
		}
		

	}

}
