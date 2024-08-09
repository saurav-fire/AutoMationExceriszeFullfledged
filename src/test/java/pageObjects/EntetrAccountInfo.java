package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EntetrAccountInfo extends BasePage {

	WebDriver driver;

	public EntetrAccountInfo(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id=\"id_gender1\"]")
	WebElement chkboxgender;

	@FindBy(xpath = "//input[@type='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//select[@id='days']")
	WebElement selectDaydrpdown;

	@FindBy(xpath = "//select[@id='months']")
	WebElement selectMonthdrpDown;

	@FindBy(xpath = "//select[@id='years']")
	WebElement selectYearsdrpDown;

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement txtlastName;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement txtAdress1;

	@FindBy(xpath = "//input[@id='state']")
	WebElement txtState;

	@FindBy(xpath = "//input[@id='city']")
	WebElement txtCity;

	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement txtZipCode;

	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement txtMobNo;

	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement btnCreateAccount;

	public void clickOnCheckBox() {
		chkboxgender.click();
	}

	public void inputPassWord(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void selectDays(String value) {
		Select selDays = new Select(selectDaydrpdown);
		selDays.selectByValue(value);

	}

	public void selectMonth(String value) {
		Select selMonth = new Select(selectMonthdrpDown);
		selMonth.selectByValue(value);

	}

	public void selectYear(String value) {
		Select selYear = new Select(selectYearsdrpDown);
		selYear.selectByValue(value);

	}
	
	public void enterFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		txtlastName.sendKeys(lname);
	}
	
	public void enterAdressOne(String add)
	{
		txtAdress1.sendKeys(add);
	}
	
	public void enterStateName(String state)
	{
		txtState.sendKeys(state);
	}
	
	public void enterCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	public void enterZipCode(String zcode)
	{
		txtZipCode.sendKeys(zcode);
	}
	
	public void enterMobNo(String mobno)
	{
		txtMobNo.sendKeys(mobno);
	}
	
	public void clickOnContinue()
	{
		btnCreateAccount.click();
	}
	
	
	
	
	
}
