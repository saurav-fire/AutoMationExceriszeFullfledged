package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC004_verifyLoginDDT extends BaseClass {
	
	
	@Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
	public void verifyloginDDT(String email, String pwd, String exp) {
	
	HomePage hp = new HomePage(driver);
	hp.clickOnMyAccount();
	
	RegistrationPage rp = new RegistrationPage(driver);
	logger.info("entering email");
	rp.enterEmail(email);
	logger.info("entering password");
	rp.enterPassWord(pwd);
	rp.clickOnLogin();
	
	
	
	}
}
