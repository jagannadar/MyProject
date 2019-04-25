package leafground;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class WindowHandless {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Window.html");
		
		driver.findElementById("color").click();
		driver.findElement(By.id(""));
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> Lwindow = new LinkedList<String>();
		Lwindow.addAll(windowHandles);
		
		driver.switchTo().window(Lwindow.get(2));
		Thread.sleep(7000);
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.switchTo().parentFrame();
		driver.close();
		
		
		
		
		

	}

}
