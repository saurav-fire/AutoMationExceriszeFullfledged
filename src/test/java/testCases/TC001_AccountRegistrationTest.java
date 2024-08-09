package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.EntetrAccountInfo;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test
	public void verifyAccountRegistration() throws InterruptedException {
		HomePage hp = new HomePage(driver);

		hp.clickOnMyAccount();
		RegistrationPage rp = new RegistrationPage(driver);
		rp.setName("saurav");
		rp.setEmail("despacito2@gmail.com");
		rp.clickOnSignup();
		EntetrAccountInfo Einfo = new EntetrAccountInfo(driver);
		Einfo.clickOnCheckBox();
		Einfo.inputPassWord("12345678");
		Einfo.selectDays("30");
		Einfo.selectMonth("10");
		Einfo.selectYear("1996");
		Einfo.enterFirstName("john");
		Einfo.enterLastName("bobade");
		Einfo.enterAdressOne("wadgao");
		Einfo.enterStateName("maha");
		Einfo.enterCity("pulgao");
		Einfo.enterZipCode("445122");
		Einfo.enterMobNo("9776675443");
		Einfo.clickOnContinue();
		Assert.assertTrue(true);

	}

}
