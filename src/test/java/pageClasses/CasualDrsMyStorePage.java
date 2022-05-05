package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CasualDrsMyStorePage extends BasePage {

	public CasualDrsMyStorePage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor jse = (JavascriptExecutor) driver;

	@FindBy(xpath = "//a[@class = 'product-name' and @title = 'Printed Dress']")
	WebElement prntdDrs;

	@FindBy(xpath = "//a[@title = 'Dresses' and @class = 'sf-with-ul']")
	WebElement dresses_topTb;

	public void clickPrntdDrs() {
		jse.executeScript("window.scrollBy(0,250);");
		prntdDrs.click();
	}

}
