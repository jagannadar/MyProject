package leafground;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.sl.In;

public class WebTables {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		
		int size;
		int maxsize=100;
		int indexCol=0;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		WebElement tableElement = driver.findElementByXPath("//table/tbody");
		List<WebElement> rowsElements = tableElement.findElements(By.tagName("tr"));
		
		for (int i = 1; i < rowsElements.size(); i++) {
			
			List<WebElement> colsElement = rowsElements.get(i).findElements(By.tagName("td"));
			
			String progress = colsElement.get(1).getText();
			System.out.println(progress);
		}
			/*String replaced =progress.replaceAll("%", "");
			
			size = Integer.parseInt(replaced);
			
			if(size<maxsize)
			{
				maxsize=size;
				indexCol=i;
				
			}
				
			*/
		
		
	//	rowsElements.get(indexCol).findElements(By.tagName("td")).get(2).click();
		
		
		
		
	}

}
