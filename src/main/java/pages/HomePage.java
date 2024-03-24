package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	
	@FindBy(id = "nav-cart-count") WebElement cartIcon;
	
	@FindBy(id="twotabsearchtextbox") WebElement searchTextField;
	
	@FindBy(id="nav-search-submit-button") WebElement searchButton;
	
	@FindBy(xpath ="//span[contains(text(),'Samsung Galaxy M04 Light Green, 4GB RAM, 128GB Storage')]" ) WebElement samsungPhone;
WebDriverWait wait;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	public String fatchTitle() 
	{
		String title = driver.getTitle();
		return title;
	}
	public boolean isCartDisplayed() 
	{
		boolean isGettingDisplayed = cartIcon.isDisplayed();
		return isGettingDisplayed;
	}
	public void searchProduct(String productName) 
	{
		searchTextField.sendKeys(productName);
		searchButton.click();
	}
	public void checkMobileOnPage()
	{
		//wait.until(ExpectedConditions.visibilityOf(samsungPhone));
		wait.until(ExpectedConditions.titleContains("mobile"));
	}
	public void clickOnMobile()
	{
		samsungPhone.click();
	}
	public String navToMobilePage() 
	
	{
		String titleOfPage="";
		String parentId = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		
		for( String winId:allWinId) 
		{
			if(!(winId.equals(parentId)))
			{
				driver.switchTo().window(winId);
				 titleOfPage = driver.getTitle();
			}
		}
		return titleOfPage;
	}
}
