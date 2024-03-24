package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	@Given("user I am at the login page")
	public void gotoLoginPage() 
	{
		System.out.println("Given Statement");
	}
	@When("I enter username")
	public void enteringUsername()
	{
		System.out.println("Entering UserName");
	}
    @When("I enter password")
    public void enteringPassword() 
    {
    	System.out.println("Entering Password");
    }
    @When("I click on login button")
    public void LoginToApp()
    {
    	System.out.println("Clicking On Login Button");
    }
    @Then("I should get looged into the application")
    public void validateLogin() 
    {
    	System.out.println("Validating login");
    }
    
    
    @Then("I should see the title")
    public void validateTitle() 
    {
    	System.out.println("Validating the Title");
    }
}
