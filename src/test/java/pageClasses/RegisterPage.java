package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "id_gender1")
	WebElement mr_radiobtn;

	@FindBy(id = "id_gender2")
	WebElement mrs_radiobtn;

	@FindBy(id = "customer_firstname")
	WebElement first_name_PI;

	@FindBy(id = "customer_lastname")
	WebElement last_name_PI;

	@FindBy(id = "email")
	WebElement email_PI;

	@FindBy(id = "passwd")
	WebElement password_PI;

	@FindBy(id = "newsletter")
	WebElement newsletter_cb;

	@FindBy(id = "optin")
	WebElement offers_cb;

	@FindBy(id = "firstname")
	WebElement first_name_add;

	@FindBy(id = "lastname")
	WebElement last_name_add;

	@FindBy(id = "company")
	WebElement company_add;

	@FindBy(id = "address1")
	WebElement add_line1;

	@FindBy(id = "address2")
	WebElement add_line2;

	@FindBy(id = "city")
	WebElement add_city;

	@FindBy(id = "id_state")
	WebElement state_drpdwn;

	@FindBy(id = "postcode")
	WebElement zipcode;

	@FindBy(id = "other")
	WebElement add_info;

	@FindBy(id = "phone")
	WebElement home_phone;

	@FindBy(id = "phone_mobile")
	WebElement mobile_phone;

	@FindBy(id = "alias")
	WebElement alias_add;

	@FindBy(id = "submitAccount")
	WebElement register_btn;
	
	@FindBy(id = "days")
	WebElement birthDay;
	
	@FindBy(id = "months")
	WebElement birthMonth;
	
	@FindBy(id = "years")
	WebElement birthYear;
	
	@FindBy(id = "id_state")
	WebElement state;
	
	@FindBy(id = "id_country")
	WebElement country;
	
	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	WebElement signOut;
			
	public void clickMr_rbt() {

		if (mr_radiobtn.isSelected() == false) {
			mr_radiobtn.click();
		}
	}

	public void clickMrs_rbtn() {

		if (mrs_radiobtn.isSelected() == false) {
			mrs_radiobtn.click();
		}

	}

	public void enterFirstNamePI(String firstName_PI) throws InterruptedException {
		first_name_PI.clear();
		first_name_PI.sendKeys(firstName_PI);
		Thread.sleep(1000);
	}

	public void enterLastNamePI(String lastName_PI) throws InterruptedException {
		last_name_PI.clear();
		last_name_PI.sendKeys(lastName_PI);
		Thread.sleep(1000);
	}

	public void enterEmail(String email) throws InterruptedException {
		email_PI.clear();
		email_PI.sendKeys(email);
		Thread.sleep(1000);
	}

	public void enterPwd(String password) throws InterruptedException {
		password_PI.clear();
		password_PI.sendKeys(password);
		Thread.sleep(1000);
	}

	public void enterAdd_firstName(String firstName_Add) throws InterruptedException {
		first_name_add.clear();
		first_name_add.sendKeys(firstName_Add);
		Thread.sleep(1000);
	}

	public void enterAdd_lastName(String lastName_Add) throws InterruptedException {
		last_name_add.clear();
		last_name_add.sendKeys(lastName_Add);
		Thread.sleep(1000);
	}

	public void enterComapany(String company) throws InterruptedException {
		company_add.clear();
		company_add.sendKeys(company);
		Thread.sleep(1000);
	}

	public void enterAdd1(String address_line1) throws InterruptedException {
		add_line1.clear();
		add_line1.sendKeys(address_line1);
		Thread.sleep(1000);
	}

	public void enterAdd2(String address_line2) throws InterruptedException {
		add_line2.clear();
		add_line2.sendKeys(address_line2);
		Thread.sleep(1000);
	}

	public void enterCity(String city) throws InterruptedException {
		add_city.clear();
		add_city.sendKeys(city);
		Thread.sleep(1000);
	}

	public void enterZip(String zip) throws InterruptedException {
		zipcode.clear();
		zipcode.sendKeys(zip);
		Thread.sleep(1000);
	}

	public void enterAddInfo(String additional_info) throws InterruptedException {
		add_info.clear();
		add_info.sendKeys(additional_info);
		Thread.sleep(1000);
	}

	public void enterHomePhone(String homePhone) throws InterruptedException {
		home_phone.clear();
		home_phone.sendKeys(homePhone);
		Thread.sleep(1000);
	}

	public void enterMobilePhone(String mobilePhone) throws InterruptedException {
		mobile_phone.clear();
		mobile_phone.sendKeys(mobilePhone);
		Thread.sleep(1000);
	}

	public void enterAlias(String alias) throws InterruptedException {
		alias_add.clear();
		alias_add.sendKeys(alias);
		Thread.sleep(1000);
	}
	
	public void selectBday() throws InterruptedException {
		Select sel = new Select(birthDay);
		sel.selectByIndex(12);
		Thread.sleep(1000);
	}
	
	public void selectBmonth() throws InterruptedException {
		Select sel = new Select(birthMonth);
		sel.selectByIndex(2);	
		Thread.sleep(1000);
	}
	
	public void selectByear() throws InterruptedException {
		 Select sel = new Select(birthYear);
		 sel.selectByValue("1994");
		 Thread.sleep(1000);
	 }
	
	public void selectNewsletter() {
		if(newsletter_cb.isSelected()==false) {
			newsletter_cb.click();
		}
	}
	
	public void selectOffers() {
		if(offers_cb.isSelected()==false) {
			offers_cb.click();
		}
	}
	
	public void selectState() {
		Select sel = new Select(state);
		sel.selectByIndex(5);
	}
	
	public void selectCountry() {
		Select sel = new Select(country);
		sel.selectByValue("United States");
	}
	
	public void clickRegister() throws InterruptedException {
		register_btn.click();
		Thread.sleep(1000);
	}
	
	public void clickSignOut() {
		signOut.click();
	}

}
