package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement lnkmyAccount;

	@FindBy(xpath = "//div[@id='Women']//li[1]")
	WebElement lnkWomenDress;
	
	
	@FindBy(xpath = "//a[normalize-space()='Women']")
	WebElement lnkWomen;
	
	

	public void clickOnMyAccount() {

		lnkmyAccount.click();
	}

	public void clickOnDress() {
		lnkWomenDress.click();
	}
	
	public void clickonWomen()
	{
		lnkWomen.click();
	}

}
