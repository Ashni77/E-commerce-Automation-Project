package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class ContactUsPage extends BasePage{
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "id_contact")
	WebElement subject;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "id_order")
	WebElement orderRef;
	
	@FindBy(id = "fileUpload")
	WebElement chooseFile_btn;
	
	@FindBy(id = "message")
	WebElement message_txtbox;
	
	@FindBy(id = "submitMessage")
	WebElement send_btn;
	
	@FindBy(xpath = "//p[contains(text(),'Your message has been successfully sent to our tea')]")
	WebElement successMsg;
	
	public void selectSubject() throws InterruptedException {
		Select sel = new Select(subject);
		sel.selectByIndex(1);
		Thread.sleep(1000);
	}
	
	public void enterEmail() throws InterruptedException {
		email.sendKeys("ashniu4@gmail.com");
		Thread.sleep(1000);
	}
	
	public void enterOrder() throws InterruptedException {
		orderRef.sendKeys("12345");
		Thread.sleep(1000);
	}
	
	public void uploadFile() throws InterruptedException {
		chooseFile_btn.sendKeys("C:\\Users\\Ashni\\eclipse-workspace\\E-commerce\\src\\test\\resources\\upload docs\\T-shirt.jpg");
		Thread.sleep(1000);
	}
	
	public void enterMessage() throws InterruptedException {
		message_txtbox.sendKeys("I want to return the product");
		Thread.sleep(1000);
	}
	
	public void clickSend() throws InterruptedException {
		send_btn.click();
		Thread.sleep(1000);
	}
	
	public String getSuccessMsg() {
		String msg = successMsg.getText();
		return msg;
	}


}
