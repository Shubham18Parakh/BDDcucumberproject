package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\loginwithdata.feature"},
		
		glue = {"steps"},
		
		publish = true
		

		
		
		
		
		
		)





public class LogInWithDataRunner extends AbstractTestNGCucumberTests
{

}
