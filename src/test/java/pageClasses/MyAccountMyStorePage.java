package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class MyAccountMyStorePage extends BasePage {

	public MyAccountMyStorePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@title = 'Information']")
	WebElement personalInfo;

	public void clickPI() throws InterruptedException {
		personalInfo.click();
		Thread.sleep(2000);
	}

}
