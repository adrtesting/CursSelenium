package package7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExampleClass {
	
	@Test
	public void testCeva() throws InterruptedException {
		System.out.println("Print test");
		
	System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(5000);
	driver.get("https://www.emag.ro/");
	driver.quit();
	}

}
