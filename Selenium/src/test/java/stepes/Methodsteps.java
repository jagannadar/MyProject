package stepes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steppd.Hooks;
public class Methodsteps   {
	public static ChromeDriver driver;
	
	@Given("Open the Browser")
	
	public void openTheBrowser() {
		System.out.println("Create Steps");
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  
	  driver=new ChromeDriver();
	}
	
	@Given("Maximise the Browser")
	public void maximiseTheBrowser() {
		driver.manage().window().maximize();
	}
	@And("Set the Timeout")
	public void setTheTimeout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@And("Enter the URL")
	public void enterTheURL() {
	   driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Enter the Username as (.*)")
	public void enterTheUsernameAsDemoSalesManager(String uname) {
	   driver.findElementById("username").sendKeys(uname);
	}
	@And("Enter the Password as (.*)")
	public void enterThePasswordAsCrmsfa(String password) {
		 driver.findElementById("password").sendKeys(password);
	}
	
	@When("Click on the Login Button")
	public void clickOnTheLoginButton() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}
	@Given("Verify Home Page is displayed")
	public void verifyHomePageIsDisplayed() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	    String text = driver.findElementByXPath("//div[@id='form']/h2").getText();
	    if(text.contains("Welcome ")) {
	    	System.out.println("Homme Page is displayed");
	    }
	}
	@Given("Click on the CRM\\/SFA link")
	public void clickOnTheCRMSFALink() {
		
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click on the Leads link")
	public void clickOnTheLeadsLink() {
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click on the CreateLead link")
	public void clickOnTheCreateLeadLink() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter CompanyName as (.*)")
	public void enterCompanyNameAsTCS(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}
	@And("Enter FirstName as (.*)")
	public void enterFirstNameAsGuru(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}
	@And("Enter LastName as (.*)")
	public void enterLastNameAsShankar(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname); 
	}
	@And("Click on the CreateLead Button")
	public void clickOnTheCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("verify ViewLead page is displayed")
	public void verifyViewLeadPageIsDisplayed() {
	    String text1 = driver.findElementByXPath("//div[text()='View Lead']").getText();
	    if(text1.equals("View Lead")) {
	    	System.out.println("Create Lead is sucessful");
	   }
	}
}

