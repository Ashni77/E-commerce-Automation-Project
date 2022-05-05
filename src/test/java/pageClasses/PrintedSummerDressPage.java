package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class PrintedSummerDressPage extends BasePage {
	
	public PrintedSummerDressPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	@FindBy(xpath = "//div[@class = 'right-block']//a[@title ='Printed Summer Dress']")
	WebElement prntdSmrDrs;
	
	@FindBy(xpath = "//a[@class ='btn btn-default button-plus product_quantity_up']")
	WebElement incQuantity;
	
	@FindBy(xpath = "//select[@id='group_1']")
	WebElement smrDrsSize;
	
	@FindBy(xpath = "//a[@id='color_14']")
	WebElement blueCol;
	
	@FindBy(xpath = "//button[@type = 'submit' and @class ='exclusive']")
	WebElement smrDrsAtc;
	
	@FindBy(xpath = "//span[@title = 'Close window']")
	WebElement closeWndw;
	
	@FindBy(xpath = "//a[@title = 'View my shopping cart']")
	WebElement shopngCart;
	
	public void clickSmrDrs() throws InterruptedException {
		jse.executeScript("window.scrollBy(0,300);");
		prntdSmrDrs.click();
		Thread.sleep(1000);
	}
	
	public void clickPlusCB() {
		incQuantity.click();
	}
	
	public void selSizeSmrDrs() {
		Select sel = new Select(smrDrsSize);
		sel.selectByIndex(1);
	}
	
	public void selBlueCol() {
		blueCol.click();
	}
	
	public void clickSmrDrsAtc() throws InterruptedException {
		smrDrsAtc.click();
		Thread.sleep(2000);
	}
	
	public void clickCancel() throws InterruptedException {
		closeWndw.click();
		Thread.sleep(2000);
	}
	
	public void clickShopngCrt() {
		shopngCart.click();
	}
}
