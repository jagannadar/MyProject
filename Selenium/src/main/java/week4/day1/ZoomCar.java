package week4.day1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();
		
		driver.manage().window().maximize();
		
		
		driver.findElementByXPath(" //div[@class='component-popular-locations']/div[4]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		
		
		Date date = new Date();		
		DateFormat dateFormat = new SimpleDateFormat("dd");
		String today = dateFormat.format(date);
		int tmrw = Integer.parseInt(today)+1;
		int future = Integer.parseInt(today)+2;
		
		
		driver.findElementByXPath(" //div[@class = 'days']/div[contains(text(), '"+tmrw+"')]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		Thread.sleep(5000);
		driver.findElementByXPath(" //div[@class = 'days']/div[contains(text(), '"+future+"')]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		List<WebElement> priceList = driver.findElementsByXPath("//div[@class='car-list-layout']//div[@class = 'price']");
		 
		 
		 int arr[] = new int[priceList.size()];
		
		 List<Integer> priceListValue = new ArrayList<Integer>();
		 int count =1;
		 
		
		 for(int i =0 ; i < priceList.size() ; i++)
		 {
		 arr[i]=  Integer.parseInt(priceList.get(i).getText().substring(2, 5));
		 priceListValue.add(arr[i]);
		
		 }
		 System.out.println("Price List of the cars " + priceListValue);
		 
		 
		 
			 int min = priceListValue.get(0);
			 
			 for(int k =2 ; k <= priceListValue.size();k ++ )
			 {
				 int max = priceListValue.get(k-1);
				 if(min < max)
				 {
					 min = max;
					 count = k;
				 }
			 }
			 Thread.sleep(5000);
			 String priceText = driver.findElementByXPath("(//div[@class='car-list-layout']//div[@class = 'price'])["+count+"]").getText().substring(2, 5);
			 System.out.println("The highest price of the Car from this list is " +priceText);
			 
			 String carName = driver.findElementByXPath("((//div[@class='car-list-layout']//div[@class = 'price'])["+count+"]/preceding::div[@class='details']/h3)["+count+"]").getText();
		 	System.out.println("The Brand which has highest Price is " + carName);
		 	
//		 	driver.findElementByXPath("(//div[@class='car-list-layout']//div[@class = 'price'])["+count+"]/following-sibling::button").click();
//		 	
//		 	driver.close();
//		
		
	}

}
