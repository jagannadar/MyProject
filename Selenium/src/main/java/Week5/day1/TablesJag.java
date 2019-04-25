package Week5.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TablesJag {
@Test
	public void tablejags() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		int in;
		int min = 0;
		int count = 0 ;
		 
		 
		 	
		 List<WebElement> total = driver.findElementsByXPath("//font[contains(text(),'%')]");
		 
		 for(int i =1 ; i <= total.size();i++)
		 {
			 String s = total.get(i-1).getText();
			 String se = s.replaceAll("%", "");
			 
			 in =Integer.parseInt(se);
			
			 if(i==1)
				 min=in;
			 
			 System.out.println(min);
			 if(in < min)
			 {
				 min = in;
				 count = i;
			 }
			 
			 
		 }
		 
		 driver.findElementByXPath("(//font[contains(text(),'%')])["+count+"]/following::td").click();

	}
	
	
	}	 


