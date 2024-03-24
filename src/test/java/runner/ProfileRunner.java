package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\profile.feature"},
		glue = {"steps" , "hooks"},
		dryRun=true,
		plugin = {"pretty"},
		//tags = "@profile"
	
		publish = true
		//tags = "@sanity or @functional"
		//tags = "@sanity and @functional" //No tests found. Nothing was run
		
		//tags = "not @functional"
	//	tags = "(@sanity or functional) and ( not regression)"
		
		
		
		)



public class ProfileRunner extends AbstractTestNGCucumberTests
{
	
	

}
