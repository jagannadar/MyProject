package baseclass;
import utils.ReadExcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class BaseUtils {
  
		public static ChromeDriver driver;
		public String excelFileName;
		public static String cmpre;
		public static String duplicate;
		  
		@Parameters({"url"}) 
		@BeforeMethod
		public void login(String url)
		{
			System.out.println("BeforeMethod");
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Ashot ss = new Ashot();
			/*driver.findElementById("username").sendKeys(usernameee);
			driver.findElementById("password").sendKeys(password);
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();*/
			
		}
		@AfterMethod
		public void closeApp()
		{
			System.out.println("After Method");
			driver.quit();
		}
		@DataProvider(name = "JAGAN")
		public String[][] getData() throws IOException
		{
			return ReadExcel.getExceldata(excelFileName);
		}
		
		@DataProvider(name = "jags")
		
		public String[][] getDataa() throws IOException
		{
			return ReadExcel.getExceldata(excelFileName);
		}
	
		@DataProvider(name = "jagu" )
		public String[][] getEditData() throws IOException
		{
			return ReadExcel.getExceldata(excelFileName);
		}
		
		@DataProvider(name = "FetchDuplicate")
		public String[][] getDuplicateData() throws IOException
		{
			return ReadExcel.getExceldata(excelFileName);
		}

}
