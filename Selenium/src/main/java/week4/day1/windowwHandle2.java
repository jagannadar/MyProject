package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowwHandle2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> LWindows = driver.getWindowHandles();
		
		List<String> Llist = new ArrayList<String>();
		
		Llist.addAll(LWindows);
		
		driver.switchTo().window(Llist.get(1));
		
		File Screensht = driver.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./snap/img.png");
		
		FileUtils.copyFile(Screensht, target);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.switchTo().window(Llist.get(0));
		driver.close();
		
		driver.switchTo().window(Llist.get(1));
		driver.close();
		

	}

}
