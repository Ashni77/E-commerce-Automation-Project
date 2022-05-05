package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class IdentityMyStorePage extends BasePage {

	public IdentityMyStorePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "old_passwd")
	WebElement currentPwd;

	@FindBy(id = "passwd")
	WebElement newPwd;

	@FindBy(id = "confirmation")
	WebElement cnfrmPwd;

	@FindBy(id = "newsletter")
	WebElement newsletter_cb;

	@FindBy(id = "optin")
	WebElement offers_cb;

	@FindBy(xpath = "//button[@class = 'btn btn-default button button-medium']")
	WebElement save_btn;

	@FindBy(xpath = "//p[@class = 'alert alert-success']")
	WebElement success_msg;

	public void enterCrntPwd() {
		currentPwd.sendKeys("automation");
	}

	public void enterNewPwd() {
		newPwd.sendKeys("hello123");
	}

	public void confirmPwd() {
		cnfrmPwd.sendKeys("hello123");
	}

	public void selectNewsltrCB() {
		if (newsletter_cb.isSelected() == false)
			newsletter_cb.click();
	}

	public void selectOffersCB() {
		if (offers_cb.isSelected() == false)
			offers_cb.click();
	}

	public void clickSave() throws InterruptedException {
		save_btn.click();
		Thread.sleep(1000);
	}

	public String checkMsg() {
		String msg = success_msg.getText();
		return msg;
	}

}
