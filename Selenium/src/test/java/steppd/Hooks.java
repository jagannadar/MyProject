package steppd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepes.Methodsteps;

public class Hooks  {

	

	@Before
	public void beforemethods(Scenario s)
	{
		

		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getStatus());


		/*System.out.println("Create Steps");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  
		driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String text = driver.findElementByXPath("//div[@id='form']/h2").getText();
		if(text.contains("Welcome ")) {
			System.out.println("Homme Page is displayed");
		}*/


	}

	@After
	public void afterMethods(Scenario s)
	{
		System.out.println(s.getStatus());

	}

}



