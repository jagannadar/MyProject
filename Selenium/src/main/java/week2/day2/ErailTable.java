package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		// Printing all data in a web table
		
		WebElement tableElement = driver.findElementByXPath("//table/tbody");
		List<WebElement> rowelements = tableElement.findElements(By.tagName("tr"));
		
		
		
		for(int i =1 ; i < 2;i++)
		{
			List<WebElement> colselements = rowelements.get(i).findElements(By.xpath("//td/font"));
			
		for(int j =0;j<colselements.size();j++)
		{
				
				System.out.println(colselements.get(j).getText());
		}
						
			
		}
		
	}

	

}
