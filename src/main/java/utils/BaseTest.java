package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public static WebDriver driver;
	
	public BasePage page;
	
	
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
		driver.get("https://keybooks.ro");
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		page = new BasePage();
	
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

}
