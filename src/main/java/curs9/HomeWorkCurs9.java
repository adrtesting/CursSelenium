package curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.List;
import java.util.Optional;

import static org.testng.Assert.assertEquals;

public class HomeWorkCurs9 extends BaseTest {

	public static final String BOOK_TITLE = "The forest";

	@Test
	public void home() {
		
		// ul.sc_tabs_title
		List<WebElement> tabs = driver.findElements(By.cssSelector("ul[class*=sc_tabs_title]"));

		for (int i = 0; i < tabs.size(); i++) {

			tabs.get(i).click();

			List<WebElement> books = driver.findElements(By.cssSelector("h3[class*=sc_title] a"));
			for (int j = 0; j < books.size(); j++) {
				if (books.get(j).getText().equals(BOOK_TITLE)) {
					books.get(j).click();
					break;
				}
			}

		}

		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
	}
	
}

