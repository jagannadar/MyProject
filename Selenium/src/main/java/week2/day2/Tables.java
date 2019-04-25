package week2.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
//		List<WebElement> listth = driver.findElementsByXPath("//section[@class ='innerblock']//th");	
//		System.out.println("The Column count is " +listth.size());
	
		/* Getting total no of rows */
		
		 List<WebElement> rowss = driver.findElementsByXPath("//table/tbody/tr[*]/td/parent::tr");		
		 System.out.println("The total row no " + rowss.size());
		 
		 /* Getting total no of cols */
		 
		List< WebElement >cols = driver.findElementsByXPath("//table/tbody/tr[2]/td");
		 System.out.println("The total cols " + cols.size());
		 
		 /*get the progress value*/
		 
		 WebElement value = driver.findElementByXPath("//font[contains(text(),'Learn to ')]/following::td");
		 
		 String val = value.getText();
		 System.out.println(val);
		 
		 	
		 List<WebElement> total = driver.findElementsByXPath("//font[contains(text(),'%')]");
		 String arr[]= new String[3];
		 String arry[]= new String[3];
		 int n[] = new int[3];
		 for(int i =0 ; i < total.size();i++)
		 {
			 arr[i]=total.get(i).getText();
			 arry[i]=arr[i].replace("%", "");
			 System.out.println(arry[i]);
			 
			 n[i]  = Integer.parseInt(arr[i]);
			
		 }
		 int n1 = 0;
		 if (n[0] < n[1] && n[0] < n[2])
		 
		 {
			 n1 = n[0];
		 }
		 else if (n[1] < n[0] && n[1] < n[2])
		 {
			 n1 = n[1];
		 }
		 if (n[2] < n[0] && n[2] < n[1])
		 {
			 n1 = n[2];
		 }
		 
//		String arr[]= new String[3];
//		 for(int i =0;i<total.size();i++)
//		 {
//		 String s = total.get(i).toString();
//		 arr[i] = s.replaceAll("%", "");
//		 System.out.println(arr[i]);
		 }
		     
		 

}
