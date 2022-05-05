package pageClasses;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class FadedShrtSleevTshirtPage extends BasePage {

	public FadedShrtSleevTshirtPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@class = 'btn btn-default button-minus product_quantity_down']")
	WebElement decQuantity_btn;

	@FindBy(xpath = "//a[@class = 'btn btn-default button-plus product_quantity_up']")
	WebElement incQuantity_btn;

	@FindBy(xpath = "//select[@id='group_1']")
	WebElement sizeDrpdwn;

	@FindBy(xpath = "//a[@id='color_13']")
	WebElement orgCol_cb;

	@FindBy(xpath = "//a[@id='color_14']")
	WebElement blueCol_cb;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]")
	WebElement AddCrt_btn;

	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]")
	WebElement prcdCkt_btn;

	public void clickIncQuantity() {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(incQuantity_btn));
		incQuantity_btn.click();
	}

	public void selectSize() {
		Select sel = new Select(sizeDrpdwn);
		sel.selectByIndex(1);
	}

	public void clickOrgCol() {
		orgCol_cb.click();
	}

	public void clickBlueCol() {
		blueCol_cb.click();
	}

	public void clickAddToCart() {
		AddCrt_btn.click();
	}

	public void handleCheckoutWindow() throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		// here we are converting set to array list so that we dont have to use iterator
		// logic
		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		driver.switchTo().window(tabs.get(0));
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(prcdCkt_btn));
		prcdCkt_btn.click();
		Thread.sleep(2000);
	}

}
