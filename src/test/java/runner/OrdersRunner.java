package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\order.feature"},
		
		glue = {"steps"},
		
		publish = true
		
		
		
		
		
		)





public class OrdersRunner extends AbstractTestNGCucumberTests
{

}
