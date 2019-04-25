package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragg {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElementById("draggable");
		Point ll = driver.findElementById("draggable").getLocation();
		System.out.println(ll);
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, ll.getX()+30, ll.getY()+40).perform();
		
		
		
		
	}

}
