package curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

import java.util.List;

public class FindElements extends BaseTest {

	@Test(priority = 0)
	public void testFindElements() throws InterruptedException {


		//driver.findElements --> intoarce o lista de WebElements -->List <WebElements> lista - driver.findElements
		//driver.findElement --> intoarce un WebElement --> WebElement element = driver.findElement


		List<WebElement> books = driver.findElements(By.cssSelector("h3[class*='sc_title']"));
		System.out.println(books.size());
		books.get(3).click();;
		Thread.sleep(4000);
	}

}
