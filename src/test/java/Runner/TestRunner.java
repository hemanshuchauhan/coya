package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
				features = {"src/test/resources/feature/"},
				glue = {"StepDefn"}
	
//		dryRun = false,
	//	tags = {"@scenario1"},
	//	monochrome = true
		

		

		)

public class TestRunner {

}
