package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowwHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> LWindows = driver.getWindowHandles();
		System.out.println(LWindows);
		
		String arr[] = new String[LWindows.size()];
		arr= LWindows.toArray(arr);
		
		driver.switchTo().window(arr[1]);
		driver.getTitle();
		driver.close();
		
		driver.switchTo().window(arr[0]);
		
		driver.close();
	}

}
