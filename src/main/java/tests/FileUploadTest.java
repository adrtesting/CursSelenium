package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FileUploadTest extends BaseTest {
	
	@Test
	public void fileUpload( ) throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\adrian.petre01\\eclipse-workspace\\CursSelenium\\TestFileUpload.txt");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		String actualText = driver.findElement(By.id("upload-files")).getText();
		assertEquals(actualText, "TestFileUpload.txt");
		Thread.sleep(3000);
	}

}
