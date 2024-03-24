package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SenarioOutlineSteps {
	@Given("user is at sign up")
	public void user_is_at_sign_up() {
	    System.out.println("Given Statement");
	}

	@When("user enters name as {string} in form")
	public void user_enters_name_as_in_form(String string)
	{
		System.out.println("Entered Name is " + string);

	}

	@When("user enters age as {int} in form")
	public void user_enters_age_as_in_form(Integer int1)
	{
		System.out.println("Entered age is " + int1);

	}

	@When("user confirms {string} radio button")
	public void user_confirms_radio_button(String string) 
	{
		System.out.println("Confirmed radio button is " + string);

	}

	@Then("user gets created")
	public void user_gets_created() 
	{
		System.out.println("Then Statement");

	}




}
