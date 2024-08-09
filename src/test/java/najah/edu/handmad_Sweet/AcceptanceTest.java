package najah.edu.handmad_Sweet;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="use_cases",
		plugin = {"summary","html:target/cucumber/report.html"},
		tags= "@tag6", 
		monochrome=true, 
		snippets = SnippetType.CAMELCASE,
		glue ="najah.edu.handmad_Sweet"
		)




public class AcceptanceTest {

}
