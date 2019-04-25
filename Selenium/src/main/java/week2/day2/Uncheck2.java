package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uncheck2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		List<WebElement> eb = driver.findElementsByXPath("//input[@type  ='checkbox']");
		
		//for(WebElement e : eb)
		for(int i =0 ; i <eb.size();i++)
		{
			if(eb.get(i).isSelected())
			{
				eb.get(i).click();
			}
		}
		

	}

}
