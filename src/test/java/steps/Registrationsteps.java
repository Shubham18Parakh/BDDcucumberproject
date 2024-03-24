package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class Registrationsteps {
	@Given("user should be at acounts page")
	public void user_should_be_at_acounts_page() 
	{
	    System.out.println("Given Statement");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable)
	{
		 List<List<String>> data = dataTable.asLists();
		 for( List<String> ll:data) 
		 {
			 System.out.println(ll);
		 }
		List<String> firstList = data.get(0);
		String value = firstList.get(0);
		System.out.println(value);
		String lastName = data.get(0).get(1);
		System.out.println(lastName);
		String mobileNum = data.get(1).get(3);
		System.out.println(mobileNum);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() 
	{
		 System.out.println("Clicking On submit Button");
	}

	@Then("user should see confirmation")
	public void user_should_see_confirmation() 
	{
		 System.out.println("Confirmation Message");
	}



}
