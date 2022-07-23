package curs12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JSExecutorExample extends BaseTest {
	
	@Test
	public void jsExecutorExample1() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		jse.executeScript("window.scrollTo(0, -500)");
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(6000);
		
		WebElement signButton = driver.findElement(By.xpath("//input[@class='sc_emailer_button']"));
		jse.executeScript("arguments[0].scrollIntoView();", signButton);
		//arguments0 = inseamna ca signButton.scrollIntoView
		
//		Actions action = new Actions(driver);
//		action.moveToElement(signButton).perform();
		Thread.sleep(5000);
	}
	
	//@Test
	public void jsExecutorExample2() throws InterruptedException {
		
		WebElement iconSearch = driver.findElement(By.xpath("//button[contains(@class,'search_submit')]"));
		WebElement searchField = driver.findElement(By.xpath("//input[contains(@class, 'search_field')]"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click(), arguments[1].value='cooking'", iconSearch, searchField);
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		Thread.sleep(6000);
		
		
		String pageTitle = driver.getTitle();
		String JsPageTitle = jse.executeScript("return document.title").toString();
		System.out.println(pageTitle);
		System.out.println(JsPageTitle);
	}
	
	
	

}
