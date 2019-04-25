package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/Property/CreateLead.feature" , glue= {"stepes", "steppd" }, monochrome = true /*, dryRun = true , snippets = SnippetType.CAMELCASE*/)
public class Runtest extends AbstractTestNGCucumberTests {

}


