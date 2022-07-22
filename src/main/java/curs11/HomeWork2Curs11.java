package curs11;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class HomeWork2Curs11 extends BaseTest {
	
	@Test
	public void singleAuthorPage() {
		
		driver.findElement(By.xpath("//*[@id='menu-item-695']/a")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		WebElement drama = driver.findElement(By.xpath("//div[@class='sc_skills_total'])[1]"));
		wait.until(ExpectedConditions.textToBePresentInElement(drama, "95%"));
		assertEquals(drama, "95%");
	}

}
