package RunnerCucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/CreateCucumber/CreateLead.feature" , glue="com.yalla.pages.cuc" , monochrome = true /*, dryRun = true , snippets = SnippetType.CAMELCASE*/)
public class Runtest extends Annotations {


	@BeforeTest
	public void setData() {
		testcaseName = "Creat_Lead_Cucumber_Int";
		testcaseDec = "Create Lead";
		author = "Jagss";
		category = "Testcases"; 
	} 
	
}




