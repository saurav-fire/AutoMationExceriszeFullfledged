package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	WebElement lnkProceedToCheckout;
	
	public void clickOnProceed()
	{
		lnkProceedToCheckout.click();
	}

}
