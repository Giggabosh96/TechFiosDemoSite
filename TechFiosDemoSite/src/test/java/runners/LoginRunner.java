package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:features", //location of the features               
		glue = "steps", //location of step definitions
		tags = "@DBScenario1",
		monochrome = true, 
		dryRun = false, //checks for compilation error if set to true
		plugin = {
				
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
				
		}
		)

public class LoginRunner {

}
