package stepsDelete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Listeners(ExtentITestListenerClassAdapter.class)
public class DeleteSteps {
	
	ChromeDriver driver;
	@Given("Open the Browser")
	public void openTheBrowser() {
		System.out.println("Delete Steps");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  
		  driver=new ChromeDriver();
	}

	@Given("Maximise the browser")
	public void maximiseTheBrowser() {
	   driver.manage().window().maximize();
	}

	@Given("Set TimeOut")
	public void setTimeOut() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Get URL")
	public void getURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter Username as (.*)")
	public void enterUsername(String s) {
		driver.findElementById("username").sendKeys(s);
	}

	@Given("Enter Password")
	public void enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click on login button")
	public void clickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		}

	@Then("Click on crmLink")
	public void ClickoncrmLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@When("Click on Leads")
	public void clickOnLeads() {
		driver.findElementByLinkText("Leads").click();
	}

	@When("Cick on findLeads")
	public void cickOnFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
	}

	@When("Click Phone tab")
	public void clickPhoneTab() {
		driver.findElementByXPath("//span[text()='Phone']").click();
	}

	@When("Enter {int}")
	public void enter(Integer int1) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(String.valueOf(int1));
	}

	@Then("Click on findLeads")
	public void clickOnFindLeads() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

	@When("Click on firstRecord")
	public void clickOnFirstRecord() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}

	@When("Click delete")
	public void clickDelete() {
		driver.findElementByLinkText("Delete").click();
	}

}
