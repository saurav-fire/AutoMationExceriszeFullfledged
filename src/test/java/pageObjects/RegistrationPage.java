package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@data-qa='signup-name']")
	WebElement txtName;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//button[@data-qa='signup-button']")
	WebElement btnSignUp;

	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement txtLoginEmail;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txtLoginpwd;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btnLogin;

	public void setName(String fname) {
		txtName.sendKeys(fname);

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void clickOnSignup() {
		btnSignUp.click();
	}
	
	
	
	public void enterEmail(String email) {
		txtLoginEmail.sendKeys(email);

	}

	public void enterPassWord(String pwd) {
		txtLoginpwd.sendKeys(pwd);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}


}
