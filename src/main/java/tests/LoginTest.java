package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class LoginTest extends BaseTest {


	//@Test(priority=0)
	@Test(priority=0)
	public void validLogin() throws InterruptedException {

		page.navMenu.navigateTo(page.navMenu.loginLink);
		page.loginPage.loginInApp("TestUser", "12345@67890");
		assertTrue(page.loginPage.sucessloginMessage.isDisplayed());
		assertTrue(page.loginPage.errorloginMessage.isDisplayed());
		page.loginPage.logoutFromApp();

	}

	//@Test(priority =1)
	@Test(priority =1)
	public void invalidTest() {

		page.navMenu.navigateTo(page.navMenu.loginLink);
		
	}
}