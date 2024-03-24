package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData {
	@Given("I am at the landing page")
	public void i_am_at_the_landing_page() 
	{
	   System.out.println("Given Statement");
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String uname) 
	{
	    System.out.println("Enter Username is " + uname);
	}

	@When("I enter the Password as {string}")
	public void i_enter_the_password_as(String password)
	{
	    System.out.println("Enter password is " + password);
	}

	@When("I click on submit Button")
	public void i_click_on_submit_button() 
	{
	   System.out.println("Click on submit");
	}

	@Then("I should logged into app")
	public void i_should_logged_into_app() 
	{
	   System.out.println("User Logged In");
	}

}
