package cucumberOptions;

//feature 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/cucumberFeatures/Login.feature", glue="stepDefinition")

	public class TestRunner extends AbstractTestNGCucumberTests {

	}
