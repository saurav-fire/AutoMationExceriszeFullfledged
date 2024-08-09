package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//a[text()='Place Order']")
	WebElement lnkPlaceOrder;
	
	public void clickOnPlaceOrder()
	{
		lnkPlaceOrder.click();
	}

}
