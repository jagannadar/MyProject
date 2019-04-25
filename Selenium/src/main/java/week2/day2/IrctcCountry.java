package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcCountry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		int count = 0;
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElementByXPath("//a[@id ='loginText']//following::a").click();
		
		
		WebElement country = driver.findElementByXPath("//select[@formcontrolname=\"resCountry\"]");
		Select Scountry = new Select(country);
		List<WebElement> LCountry = Scountry.getOptions();
		
		for(int i=0;i<LCountry.size();i++)
		{
			if(LCountry.get(i).getText().startsWith("E")) {
			System.out.println(LCountry.get(i).getText());
			count ++;
			}
			if(count==2)
			{
				
				LCountry.get(i).click();
				break;
			}
			
		}
	}	

}
