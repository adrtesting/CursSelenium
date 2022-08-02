package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPage {
	
	public WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"mep_0\"]/div/div[3]/div[3]/span") public WebElement song;
	@FindBy(xpath="//*[@id=\"mep_0\"]/div/div[3]/a") public WebElement sound;

	
	public void hoverBlog() {
		
		Actions action = new Actions(driver);
		WebElement Blog = driver.findElement(By.xpath("//*[@id=\"menu-item-76\"]/a"));
		action.moveToElement(Blog).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-232\"]/a"))).click().build().perform();
				
	}
	
	public void Audiopage() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		WebElement audio = driver.findElement(By.partialLinkText("Post Formats"));
		audio.click();
	}
	
	public void sliderAudio(WebElement element, int x, int y) {
		
		Actions action =  new Actions(driver);
		action.dragAndDropBy(element, x, y).perform();
	}

	public void hoverBlog(Object hoverBlog) {
		// TODO Auto-generated method stub
		
	}

	public void navigateTo(Object audiopage) {
		// TODO Auto-generated method stub
		
	}

	public void navigateTo1(Object sliderAudio) {
		// TODO Auto-generated method stub
		
	}


}
