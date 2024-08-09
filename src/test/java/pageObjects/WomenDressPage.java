package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenDressPage extends BasePage {

	public WomenDressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath="//a[@data-product-id='3' and (text()='Add to cart')][1]")
	WebElement btnAddToCart;
	
	@FindBy(xpath = "//u[text()='View Cart']")
	WebElement lnkViewCart;
	
	public void clickOnAddToCart()
	{
		btnAddToCart.click();
		
	}
	
	public void clickOnViewCart()
	{
		
		lnkViewCart.click();
	}
	
	

}
