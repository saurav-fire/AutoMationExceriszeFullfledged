package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.FinalPage;
import pageObjects.HomePage;
import pageObjects.PaymentsPage;
import pageObjects.RegistrationPage;
import pageObjects.WomenDressPage;
import testBase.BaseClass;

public class TC003_AddtoCartTest extends BaseClass{

	

	@Test
	public void addToCart() {

		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		RegistrationPage rp = new RegistrationPage(driver);
		rp.enterEmail("despacito@gmail.com");
		rp.enterPassWord("12345678");
		rp.clickOnLogin();
		hp.clickonWomen();
		hp.clickOnDress();
		WomenDressPage wp = new WomenDressPage(driver);
		wp.clickOnAddToCart();
		wp.clickOnViewCart();
		CartPage cp = new CartPage(driver);
		cp.clickOnProceed();
		CheckOutPage chkpg = new CheckOutPage(driver);
		chkpg.clickOnPlaceOrder();
		PaymentsPage pp = new PaymentsPage(driver);
		pp.enterNameOnCard("bhairav");
		pp.enterCardNumber("56464423111345");
		pp.enterCVC("311");
		pp.enterMM("12");
		pp.enterYYYY("2019");
		pp.clickOnsubmit();
		FinalPage fp = new FinalPage(driver);
		Assert.assertEquals(fp.msgOrderPlaced(), "ORDER PLACED!");

	}

}
