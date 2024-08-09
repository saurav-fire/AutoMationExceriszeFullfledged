package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalPage extends BasePage {

	public FinalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@FindBy(xpath="//b[text()='Order Placed!']")
	WebElement msgOrderPlaced;
	
	
	public String msgOrderPlaced()
	{
		return msgOrderPlaced.getText();
	}

}
