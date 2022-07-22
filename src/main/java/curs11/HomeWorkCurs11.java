package curs11;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class HomeWorkCurs11 extends BaseTest {
	
	@Test(priority = 0)
	public void homeworkBook() throws InterruptedException {
		
		WebElement link = driver.findElement(By.xpath("(//a[contains(@href, '/life-in-the-garden/')])[1]"));
		link.click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 1)
	public void homeworkReview() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement review = driver.findElement(By.xpath("//*[@id='tab-title-reviews']/a"));
		review.click();
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
		submit.click();
		
		Alert jsAlert = driver.switchTo().alert();
		jsAlert.accept();
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void homeworkAddToCart() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, -500)", "");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='single_add_to_cart_button button alt']")).click();
		Thread.sleep(2000);
		
		String nameofthebookadded = driver.findElement(By.xpath("//*[@class='woocommerce-message']")).getText();
		assertEquals(nameofthebookadded, "'Life in the garden has been added to your cart.");
		
	}
	
	

}
