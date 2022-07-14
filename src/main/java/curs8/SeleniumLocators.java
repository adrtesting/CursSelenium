package curs8;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.protobuf.Option;


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
	
	
	@Test
	public void linkTestLocator() throws InterruptedException {
		
		driver.findElement(By.className("menu_user_login")).click();
		driver.findElement(By.id("log")).sendKeys("TestUser");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345@67890");
		driver.findElement(By.cssSelector("div.animated > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(5) > input:nth-child(1)")).click();
		
		Thread.sleep(4000);
		WebElement userName = driver.findElement(By.className("user_name"));
		assertTrue(userName.isDisplayed());
		
		String userLogat = userName.getText();
		System.out.println(userLogat);
		assertEquals(userLogat, "Test User");
		
		//assertTrue(driver.findElement(By.className("user_name")).isDisplayed());
		//isDisplayed() --> metoda Selenium care verifica daca un element este prezent sau nu --> intoarce true sau false
		//asserTrue() 
	}
		
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}
