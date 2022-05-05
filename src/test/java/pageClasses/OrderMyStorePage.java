package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class OrderMyStorePage extends BasePage {

	public OrderMyStorePage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor jse = (JavascriptExecutor) driver;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")
	WebElement order_prcdChckt;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/textarea[1]")
	WebElement textBox;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
	WebElement adr_pcdchckt;

	@FindBy(xpath = "//input[@id='cgv']")
	WebElement TnS_cb;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]")
	WebElement carrier_pcdchckt;

	@FindBy(xpath = "//a[@title = 'Pay by check.']")
	WebElement payment_check;

	@FindBy(xpath = "//button[@type = 'submit' and @class = 'button btn btn-default button-medium']")
	WebElement confirm_btn;

	@FindBy(xpath = "//a[@id='cart_quantity_down_5_23_0_683321']")
	WebElement decSmrDrsQnty;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/h1[1]/span[1]")
	WebElement qntySumry;

	@FindBy(xpath = "//a[@class='cart_quantity_delete' and @id ='3_13_0_683321']")
	WebElement delete1_btn;

	public void clickPrcdChckt() {
		jse.executeScript("arguments[0].scrollIntoView()", order_prcdChckt);
		order_prcdChckt.click();
	}

	public void enterInTxtBx() {
		jse.executeScript("arguments[0].scrollIntoView()", textBox);
		textBox.sendKeys("I want my order to be delivered on time");
	}

	public void clickAdrChckt() {
		jse.executeScript("arguments[0].scrollIntoView()", adr_pcdchckt);
		adr_pcdchckt.click();
	}

	public void selectTnSchkbx() {
		jse.executeScript("arguments[0].scrollIntoView()", TnS_cb);
		if (TnS_cb.isSelected() == false) {
			TnS_cb.click();
		}
	}

	public void clickCarrierPcd() {
		jse.executeScript("arguments[0].scrollIntoView()", carrier_pcdchckt);
		carrier_pcdchckt.click();
	}

	public void clickPayOpt() {
		jse.executeScript("arguments[0].scrollIntoView()", payment_check);
		payment_check.click();
	}

	public void clickCnfrm() throws InterruptedException {
		jse.executeScript("arguments[0].scrollIntoView()", confirm_btn);
		confirm_btn.click();
		Thread.sleep(2000);
	}

	public void clickSubCB() throws InterruptedException {
		jse.executeScript("window.scrollBy(0,200);");
		decSmrDrsQnty.click();
		Thread.sleep(2000);
	}

	public String getPrdtQnty() throws InterruptedException {
		Thread.sleep(2000);
		return qntySumry.getText();
	}

	public void deletePdt() {
		delete1_btn.click();
	}

}
