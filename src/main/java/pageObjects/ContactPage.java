package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	public WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"wpcf7-f1328-p51-o1\"]/form/p[1]/span/input") public WebElement nameField;
	@FindBy(xpath = "//*[@id=\"wpcf7-f1328-p51-o1\"]/form/p[2]/span/input") public WebElement emailField;
	@FindBy(xpath = "//*[@id=\"wpcf7-f1328-p51-o1\"]/form/p[3]/span/input") public WebElement subjectField;
	@FindBy(xpath = "//*[@id=\"wpcf7-f1328-p51-o1\"]/form/p[4]/span/textarea") public WebElement messageField;
	@FindBy(xpath = "//*[@id=\"wpcf7-f1328-p51-o1\"]/form/p[5]/input") public WebElement sendMessageButton;
	@FindBy(xpath = "//*[@id=\"wpcf7-f1328-p51-o1\"]/form/div[2]") public WebElement successmessage;
	@FindBy(xpath = "//*[@id=\"wpcf7-f1328-p51-o1\"]/form/div[2]") public WebElement erromessageemail;
	@FindBy(xpath = "//*[@id=\"wpcf7-f1328-p51-o1\"]/form/div[2]") public WebElement errormessagename;
	@FindBy(tagName = "iframe") public WebElement iframe;
	@FindBy(xpath = "//button[@title='Zoom in']") public WebElement zoomIn;
	@FindBy(xpath = "//button[@title='Zoom out']") public WebElement zoomOut;
	@FindBy(partialLinkText = "map") public WebElement clickOutSideMap;
	
	
	public void contactForm(String name, String email, String subject, String message) {
		
		nameField.sendKeys(name);
		emailField.sendKeys(email);
		subjectField.sendKeys(subject);
		messageField.sendKeys(message);
		sendMessageButton.click();
	}
	
	public void zoomMap(WebElement element) {
		driver.switchTo().frame(iframe);
		element.click();
	}
	
	
	public void openMapInNewTab() {
		clickOutSideMap.click();
	}
	public void sendMessage(String name) {
		
		nameField.sendKeys(name);
	}

	public void navigateTo(WebElement nameField2) {
		// TODO Auto-generated method stub
		
	}

	public void navigateTo1(WebElement nameField3) {
		// TODO Auto-generated method stub
		
	}

	public void sendMessageButton(WebElement sendMessageButton2) {
		// TODO Auto-generated method stub
		
	}
	

}
