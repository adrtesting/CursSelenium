package curs9;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLocators {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
		
//		FirefoxOptions options = new FirefoxOptions();
//		options = webdriver.FirefoxOptions();
//		options.binary_location = r "C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Mozilla Firefox";
//		driver = webdriver.Firefox(executable_path=r'C:\WebDrivers\geckodriver.exe', options=options);
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", true);
		//System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");
	
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
	
	@Test(priority = 0)
	public void linkTextLocator() throws InterruptedException {
		
		//<a href="href="https://keybooks.ro/shop/">Books"
		//1 Identificam element
		WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
		//2. Actionam asupra elementelor
		booksLink.click();
		
		//3. Verificam daca in urma actiunii rezultatul este cel asteptat
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 1)
	public void partialLinkTestLocator() throws InterruptedException {
		
		WebElement cookingBookLink = driver.findElement(By.partialLinkText("Cook"));
		cookingBookLink.click();
		Thread.sleep(4000);
		WebElement bookTitle = driver.findElement(By.cssSelector("h1[class*='product_title']"));
		assertTrue(bookTitle.isDisplayed());
		assertEquals(bookTitle.getText(), "Cooking with love");
		
		//Cum construim un CSS selector
		//product_title entry-title
		//h1[class*='product_title']
		
		
	} 
	
	@Test(priority = 3)
	public void classNameLocatar() {
		
		WebElement price = driver.findElement(By.className("price"));
		assertTrue(price.isDisplayed());
		String productPrice = price.getText();
		assertEquals(productPrice, "$20.55");
	}
	
	@Test(priority = 4)
	public void idLocator() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		WebElement tabReview = driver.findElement(By.id("tab-title-reviews"));
		tabReview.click();
		Thread.sleep(4000);
		
		
		WebElement textAreaComment = driver.findElement(By.id("comment"));
		assertTrue(textAreaComment.isDisplayed());
		textAreaComment.sendKeys("Nice book");
	}
	
	@Test(priority = 5)
	public void nameLocator() throws InterruptedException {
		WebElement nameField = driver.findElement(By.name("author"));
		nameField.sendKeys("Test");
		Thread.sleep(4000);
		nameField.clear();
		Thread.sleep(4000);
		nameField.sendKeys("Alt Test");
		Thread.sleep(4000);
	}
	
	@Test(priority = 6)
	public void cssLocator() throws InterruptedException {
		WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
		emailField.sendKeys("test@test@yahoo.com");
		Thread.sleep(4000);
	}
	
	@Test(priority = 7)
	public void xpathLocator() throws InterruptedException {
		
		//<a class ="star-3" href="#">3></a>
		//cssSelector --> a[class='star-3']
		//xpath --> //a[@class='star-3']
		
		WebElement rating = driver.findElement(By.xpath("//a[@class='star-3']"));
		rating.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
		submitButton.click();
		Thread.sleep(4000);
	}

}
