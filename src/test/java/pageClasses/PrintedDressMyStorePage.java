package pageClasses;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class PrintedDressMyStorePage extends BasePage {
	
	public PrintedDressMyStorePage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	@FindBy(xpath = "//select[@id='group_1']")
	WebElement dressSize_drpdwn;
	
	@FindBy(xpath = "//button[@name = 'Submit']")
	WebElement prntdDrsAtc;
	
	@FindBy(xpath = "//span[@title = 'Continue shopping']")
	WebElement continueShopng;
	
	public void selSize() {
		Select sel = new Select(dressSize_drpdwn);
		sel.selectByIndex(1);
	}
	
	public void clickAddToCrt() throws InterruptedException {
		jse.executeScript("window.scrollBy(0,300);");
		prntdDrsAtc.click();
		Thread.sleep(2000);
	}
	
	public void handleproductwindow() throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		// here we are converting set to array list so that we dont have to use iterator
		// logic
		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		driver.switchTo().window(tabs.get(0));
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(continueShopng));
		continueShopng.click();
		Thread.sleep(2000);
	}
}
