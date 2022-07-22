package curs10;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class HomeWorkCurs10 extends BaseTest {
	
	@Test(priority = 0)
	public void dramaPercentage() {
		
		WebElement Text = driver.findElement(By.xpath("(//div[@class=\"sc_skills_total\"])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBePresentInElement(Text, "95%"));
		assertEquals(Text, "95%");
		
	}
	
	@Test(priority = 1)
	public void biographyPercentage() {
		
		WebElement Text1 = driver.findElement(By.xpath("(//div[@class=\"sc_skills_total\"])[2]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(Text1, "75%"));
		assertEquals(Text1, "75%");
		
	}
	
	@Test(priority = 2)
	public void cookbooksPercentage() {
		
		WebElement Text2 = driver.findElement(By.xpath("(//div[@class=\"sc_skills_total\"])[3]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(Text2, "82%"));
		assertEquals(Text2, "82%");
	
	}

}
