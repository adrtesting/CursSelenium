package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavMenuPage {
	
	public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//PageFactory
	//Vine cu anotari @FindBy() (este o prescurtare pentru driver.findElement())
	@FindBy(xpath="(//a[contains(@class, 'popup_login_link')])[1]") public WebElement loginLink;
	
	//FindBy este acelasi lucru cu: WebElement loginLink = driver.findElement(By.xpath("(//a[contains(@class, 'popup_login_link')])[1]")));
	
	@FindBy(linkText = "Contacts") public WebElement contactsLink;
	//scopul Page Models este sa aiba elemente

	public void navigateTo(WebElement loginLink2) {
		// TODO Auto-generated method stub
		loginLink2.click();
		
	}
	
	
}
