package wweek5.day2;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

@Listeners(ExtentITestListenerClassAdapter.class)

public class BaseUtils{
	public String excelFileName;
	ChromeDriver driver;
	@Parameters({"url" , "username" , "password"})
	@BeforeMethod
	public void login(String url , String usernameee , String password)
	{
		System.out.println("BeforeMethod");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElementById("username").sendKeys(usernameee);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	@AfterMethod
	public void closeApp()
	{
		System.out.println("After Method");
		driver.quit();
	}
	
	@DataProvider(name = "jags")
	public String[][] getData() throws IOException
	{
		return ReadExcel.getExceldata(excelFileName);
	}

}
