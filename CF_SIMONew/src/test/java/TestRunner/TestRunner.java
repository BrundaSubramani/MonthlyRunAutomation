package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature/AFSimoNew.feature",
		//features = { "src/test/java/Feature/CFAppNew.feature", "src/test/java/Feature/CFSimoNew.feature"},
		glue={"StepDefinitions"},
		monochrome = true,
		plugin = {"json:target/MyReport/report.json","junit:target/MyReport/report.xml","html:target/MyReport/report.html"}

		)

		
public class TestRunner {

	
}
