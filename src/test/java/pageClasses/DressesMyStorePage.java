package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class DressesMyStorePage extends BasePage {

	public DressesMyStorePage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor jse = (JavascriptExecutor) driver;

	@FindBy(xpath = "//a[text() = 'Casual Dresses' and @class = 'subcategory-name']")
	WebElement casualDrs;

	public void clickCasualDrs() {
		jse.executeScript("arguments[0].scrollIntoView()", casualDrs);
		casualDrs.click();
	}

}
