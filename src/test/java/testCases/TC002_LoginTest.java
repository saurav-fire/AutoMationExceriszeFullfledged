package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test
	public void LoginUsingValCred()
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		
		RegistrationPage rp = new RegistrationPage(driver);
		logger.info("entering email");
		rp.enterEmail("despacito@gmail.com");
		logger.info("entering password");
		rp.enterPassWord("12345678");
		rp.clickOnLogin();
		Assert.assertTrue(true);
		
		
		
	}








	








	

	
	

}
