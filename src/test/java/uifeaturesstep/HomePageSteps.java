package uifeaturesstep;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps 
{
	 WebDriver driver;
	 HomePage home =new HomePage(DriverFactory.getDriver());
	@Given("user is at the amazon home page")
	public void user_is_at_the_amazon_home_page() 
	{
	  driver = DriverFactory.getDriver();
	  driver.get("https://www.amazon.in/");
	  driver.navigate().refresh();
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) 
	{
	  String title = home.fatchTitle();
	boolean isPresent = title.contains(string);
	Assert.assertEquals(isPresent, true);
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() 
	{
	   boolean isDisplaying = home.isCartDisplayed();
	   Assert.assertEquals(isDisplaying, true);
	}

	@When("user search {string} from text field")
	public void user_search_from_text_field(String string) 
	{
	   home.searchProduct(string);
	}

	@Then("user should see mobiles")
	public void user_should_see_mobiles()
	{	
		home.checkMobileOnPage();
	   String title = driver.getTitle();
	 boolean isPresent = title.contains("mobile");
	 Assert.assertEquals(isPresent, true);
	}
	

	@When("user click on mobile")
	public void user_click_on_mobile() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	    home.clickOnMobile();
	}

	@Then("mobile page should get open")
	public void mobile_page_should_get_open()
	{
	  String title = home.navToMobilePage();
	boolean ispresent = title.contains("Samsung");//Samsung
	Assert.assertEquals(ispresent, true);
	}


}
