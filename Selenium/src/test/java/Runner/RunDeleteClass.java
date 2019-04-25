package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;



public class RunDeleteClass {


	@CucumberOptions(features="src/test/java/Property/DeleteLead.feature" , glue= {"stepsDelete" , "steps" }, monochrome = true /*, dryRun = true , snippets = SnippetType.CAMELCASE*/)
	public class Runtest extends AbstractTestNGCucumberTests {

	}


}
