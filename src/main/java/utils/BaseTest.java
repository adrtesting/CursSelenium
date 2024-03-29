package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
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
	
	@AfterMethod
	public void recordFailure(ITestResult method) throws IOException {

		if(ITestResult.FAILURE == method.getStatus()) {
			TakesScreenshot poza =  (TakesScreenshot)driver;
			File picture = poza.getScreenshotAs(OutputType.FILE);
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

			//Files.copy(picture, new File("screenshots/"+method.getName() + "-"+ timeStamp + ".png"));

		}

	}
	
	

}