package curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.List;
import java.util.Optional;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeWorkCurs9 extends BaseTest {

	public static final String BOOK_TITLE = "The forest";
	//am facut constanta, nu constructor

		@Test
		public void home() throws InterruptedException {
			
			// ul.sc_tabs_title
			WebElement book = null;
			List<WebElement> tabs = driver.findElements(By.cssSelector("li[class*='sc_tabs_title'"));
			System.out.println(tabs.size());
			for (int i = 0; i < tabs.size(); i++) {
				Thread.sleep(2000);
				tabs.get(i).click();
				book = driver.findElement(By.linkText(BOOK_TITLE));
				assertTrue(book.isDisplayed());
	
//				List<WebElement> books = driver.findElements(By.cssSelector("h3[class*=sc_title] a"));
//				for (int j = 0; j < books.size(); j++) {
//					if (books.get(j).getText().equals(BOOK_TITLE)) {
//						books.get(j).click();
						
						
					}
			book.click();
			assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
				}
				
		}
		
	

