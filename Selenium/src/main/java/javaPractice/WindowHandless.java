package javaPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandless {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text() ='Open Multiple Windows']").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		/*
		for(String each : windowHandles)
		{
			System.out.println(each);			
			driver.switchTo().window(each);			
			String title = driver.getTitle();
			if(title.contains("Buttons")).
			{
				System.out.println("Present");
				break;
			}
			
			
		}*/
		List<String> wind = new LinkedList<String>();
		wind.addAll(windowHandles);
		/*for(String s : wind)
		{
		
		driver.switchTo().window(s);
		System.out.println(driver.getTitle());
		
		}*/
		
		
		for(int i = 0 ; i < wind.size() ; i++)
		{
			
			driver.switchTo().window(wind.get(i));
			System.out.println(driver.getTitle());
			
		}
		
		/*Iterator<String> iterat = windowHandles.iterator();
		if(iterat.hasNext())
		{
			String nnext = iterat.next();
			driver.switchTo().window(nnext);	
			String title = driver.getTitle();
			System.out.println(title);		
		}
		*/
		
		
		
	}

}
