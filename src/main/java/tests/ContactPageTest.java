package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ContactPageTest extends BaseTest {
	

	@Test (priority = 0)
	public void contactTest() throws InterruptedException {
		
		page.navMenu.navigateTo(page.navMenu.contactsLink);
		page.contactPage.navigateTo(page.contactPage.nameField);
		page.contactPage.contactForm("Test", "adrian@yahoo.com", "Test", "Test Adrian");
		Thread.sleep(3000);
		page.contactPage.sendMessageButton(page.contactPage.sendMessageButton);
		Thread.sleep(3000);
		Assert.assertTrue(page.contactPage.successmessage.isDisplayed());
		
	}

	@Test (priority = 1)
	public void invalidContactEmail() throws InterruptedException {
		
		page.navMenu.navigateTo(page.navMenu.contactsLink);
		page.contactPage.navigateTo(page.contactPage.nameField);
		page.contactPage.contactForm("Test", "test", "Test", "Test Adrian");
		Thread.sleep(3000);
		Assert.assertTrue(page.contactPage.erromessageemail.isDisplayed());
		
	}
	
	@Test (priority = 2)
	public void invalidContactName() throws InterruptedException {
		
		page.navMenu.navigateTo(page.navMenu.contactsLink);
		page.contactPage.navigateTo(page.contactPage.nameField);
		page.contactPage.contactForm(" ", "adrian@yahoo.com", "Test", "Test Adrian");
		Thread.sleep(3000);
		Assert.assertTrue(page.contactPage.errormessagename.isDisplayed());
	}
}
