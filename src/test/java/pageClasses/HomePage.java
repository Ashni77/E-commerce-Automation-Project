package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor jse = (JavascriptExecutor) driver;

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement signIn;

	@FindBy(xpath = "//a[@title='Women' and @class = 'sf-with-ul']")
	WebElement women_tb;

	@FindBy(xpath = "//a[text() = 'T-shirts']")
	WebElement tshirts_tb;

	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	WebElement dresses_tb;

	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	WebElement casualDrs_tb;

	@FindBy(xpath = "//a[@title='Summer Dresses']")
	WebElement smrDrs;

	@FindBy(xpath = "//a[@title = 'Contact Us']")
	WebElement contactUs;

	@FindBy(xpath = "//a[@title = 'Manage my customer account']")
	WebElement myAccount_footer;

	public void clickMyAccount() {
		jse.executeScript("arguments[0].scrollIntoView();", myAccount_footer);
		myAccount_footer.click();
	}

	public void clickSignIn() {
		signIn.click();
	}

	public void mouseOver_Women() {
		Actions act = new Actions(driver);
		act.moveToElement(women_tb).build().perform();
	}

	public void clickTshirts() {
		tshirts_tb.click();
	}

	public void clickDresses() {
		dresses_tb.click();
	}

	public void clickCasualDrs() {
		casualDrs_tb.click();
	}

	public void clickSmrDrs() {
		smrDrs.click();
	}

	public void clickContactUs() {
		contactUs.click();
	}

}
