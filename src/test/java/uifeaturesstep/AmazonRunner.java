package uifeaturesstep;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
		features = {"src\\test\\resources\\uifeature\\homePage.feature"},
		glue = {"uifeaturesstep"},
		publish = true,
		plugin = {"pretty" , "html:target/cucumber-reports/AmazonTestResults.html"}
		
			)

public class AmazonRunner extends AbstractTestNGCucumberTests



{

}
