package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage extends BasePage {

	public PaymentsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@name='name_on_card']")
	WebElement txtNameOnCard;

	@FindBy(xpath = "//input[@name='card_number']")
	WebElement txtCardNumber;

	@FindBy(xpath = "//input[@placeholder='ex. 311']")
	WebElement txtCVC;

	@FindBy(xpath = "//input[@placeholder='MM']")
	WebElement txtMM;

	@FindBy(xpath = "//input[@placeholder='YYYY']")
	WebElement txtYYYY;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement btnSubmit;
	
	
	
	public void enterNameOnCard(String name)
	{
		txtNameOnCard.sendKeys(name);
	}
	
	public void enterCardNumber(String number)
	{
		txtCardNumber.sendKeys(number);
	}
	
	
	public void enterCVC(String cvc)
	{
		txtCVC.sendKeys(cvc);
	}
	public void enterMM(String mm)
	{
		txtMM.sendKeys(mm);
	}
	
	public void enterYYYY(String year)
	{
		txtYYYY.sendKeys(year);
	}
	public void clickOnsubmit()
	{
		btnSubmit.click();
	}

}
