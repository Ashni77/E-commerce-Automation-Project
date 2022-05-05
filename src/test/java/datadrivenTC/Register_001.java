package datadrivenTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import pageClasses.HomePage;
import pageClasses.LoginMyStorePage;
import pageClasses.RegisterPage;

public class Register_001 extends BaseClass {

	@Test(priority = 1, description = "Verify create account is selected")
	public void CreateAccount() {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		String loginPage_actualtitle = driver.getTitle();
		String loginPage_expectedtitle = "Login - My Store";
		Assert.assertEquals(loginPage_actualtitle, loginPage_expectedtitle);
		LoginMyStorePage lp = new LoginMyStorePage(driver);
		lp.enterEmail();
		lp.clickCreate_Btn();
	}

	@Test(priority = 2,dependsOnMethods = { "CreateAccount" }, dataProviderClass = utilities.Dataprovider.class, dataProvider = "RegisterData", description = "Verify data is entered from excel")
	public void verifyRegister(String firstName_PI, String lastName_PI, String email, String password,
			String firstName_Add, String lastName_Add, String company, String address_line1, String address_line2,
			String city, String zip, String additional_info, String homePhone, String mobilePhone, String alias)
			throws InterruptedException {

		RegisterPage rp = new RegisterPage(driver);
		rp.enterFirstNamePI(firstName_PI);
		rp.enterLastNamePI(lastName_PI);
		rp.enterEmail(email);
		rp.enterPwd(password);
		rp.enterAdd_firstName(firstName_Add);
		rp.enterAdd_lastName(lastName_Add);
		rp.enterComapany(company);
		rp.enterAdd1(address_line1);
		rp.enterAdd2(address_line2);
		rp.enterCity(city);
		rp.enterZip(zip);
		rp.enterAddInfo(additional_info);
		rp.enterHomePhone(homePhone);
		rp.enterMobilePhone(mobilePhone);
		rp.enterAlias(alias);
	}

	@Test(priority = 3,dependsOnMethods = { "CreateAccount","verifyRegister" }, description = "Verify if the account is registered")
	public void verifyAccountRegisteration() throws InterruptedException {

		RegisterPage rp = new RegisterPage(driver);
		rp.selectBday();
		rp.selectBmonth();
		rp.selectByear();
		rp.selectNewsletter();
		rp.selectOffers();
		rp.selectState();
		rp.selectState();
		rp.clickRegister();
		String myAccPage_actualtitle = driver.getTitle();
		String myAccPage_expectedtitle = "My Account - My Store";
		Assert.assertEquals(myAccPage_actualtitle, myAccPage_expectedtitle);
		rp.clickSignOut();
	}

}
