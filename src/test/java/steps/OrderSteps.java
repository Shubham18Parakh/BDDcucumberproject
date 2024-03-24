package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	@Given("user should br logged into Application")
	public void user_should_br_logged_into_application() 
	{
	    System.out.println("Given Statement");
	}

	@When("user click on orders button")
	public void user_click_on_orders_button() 
	{
	   System.out.println("Clicking on order button");
	}

	@Then("user redirects to order Page")
	public void user_redirects_to_order_page() 
	{
	   System.out.println("Redirects to order page");
	}

	@When("user click on current order button")
	public void user_click_on_current_order_button() {
	  System.out.println(" clicking on current order button");
	}

	@When("user should see current order Information")
	public void user_should_see_current_order_information() 
	{
	    System.out.println("Current order information fatched");
	}

	@When("user click on past order button")
	public void user_click_on_past_order_button() 
	{
	    System.out.println("Clicking on past order button");
	}

	@When("user should see past order Information")
	public void user_should_see_past_order_information() 
	{
	    System.out.println("past order information fatched");
	}

	@When("user click on cancle order button")
	public void user_click_on_cancle_order_button()
	{
	   System.out.println("Clicking on Cancelled order button");
	}

	@When("user should see cancelled order Information")
	public void user_should_see_cancelled_order_information() 
	{
	    System.out.println("Cancelled order information fatched");
	}




}
