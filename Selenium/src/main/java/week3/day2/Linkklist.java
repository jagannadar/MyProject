package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkklist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TVR",Keys.TAB);
		
		driver.findElementById("chkSelectDateOnly").click();
		
		List<WebElement> Trainlist = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[1]");
		int j[] = new int[Trainlist.size()];
		
		Set<Integer> setTrain = new TreeSet<Integer>();
		
	
		
		for(int i =0; i <Trainlist.size() ; i++)
		{
			
			j[i] = Integer.parseInt(Trainlist.get(i).getText());
	
			System.out.println(j[i]);
			setTrain.add(j[i]);		
						
		}
		
		
		System.out.println(setTrain.size());
		System.out.println(setTrain);	
		
		if(Trainlist.size() == setTrain.size())
		{
			System.out.println("No Duplicate");
			
		}
		else
		{
			System.out.println("Duplicate");
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> nameList = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[2]/a");
		
			
		List<String> ListTrainName = new ArrayList<String>();
		
		for(int i =0 ; i < nameList.size() ; i++)
		{
			ListTrainName.add(nameList.get(i).getText());
		}
		
		System.out.println("Before Sorting " +ListTrainName);
		System.out.println(ListTrainName.size());
	
		Collections.sort(ListTrainName);		
		System.out.println("After Sorting "+ListTrainName);
		
		String s1[] = new String[ListTrainName.size()];
		s1 = ListTrainName.toArray(s1);
		
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.findElementByXPath("//div[@id='divTrainsListHeader']//td[2]/a").click();
//		System.out.println(elmnt.getText());
		
		
		List<WebElement> nameList2 = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[2]/a");
		
		List<String> ListTrainName2 = new ArrayList<String>();
		
		for(int i=0 ; i < nameList2.size() ; i ++)
		
		{
			ListTrainName2.add(nameList2.get(i).getText());
		}
		
		String s2[] = new String[ListTrainName2.size()];
		s1 = ListTrainName.toArray(s2);
		int temp=0;
		for(int i = 0; i < ListTrainName.size() ; i++ )
		{
			
		if(s1[i] == s2[i])
		{
			temp ++ ;
		}
		
		
		}
		
		if(temp == ListTrainName.size())
		{
			System.out.println("Both are sorted");
		}
		else
		{
			System.out.println("Mismatch");
		}
	}
	
}
