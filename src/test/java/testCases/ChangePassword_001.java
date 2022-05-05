package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.HomePage;
import pageClasses.IdentityMyStorePage;
import pageClasses.LoginMyStorePage;
import pageClasses.MyAccountMyStorePage;

public class ChangePassword_001 extends BaseClass {
	
	@Test(priority =1, description = "Verify successful navigation to identity page")
	public void navigateToIdentityPage() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		String actualTitle_loginPage = driver.getTitle();
		String expectedTitle_loginPage = "Login - My Store";
		Assert.assertEquals(actualTitle_loginPage, expectedTitle_loginPage);
		LoginMyStorePage lp = new LoginMyStorePage(driver);
		lp.enterSigninEmail();
		lp.enterSigninPwd();
		lp.clickSignInBtn();
		String actualTitle_MyAccPage = driver.getTitle();
		String expectedTitle_MyAccPage = "My account - My Store";
		Assert.assertEquals(actualTitle_MyAccPage, expectedTitle_MyAccPage);
		MyAccountMyStorePage map = new MyAccountMyStorePage(driver);
		map.clickPI();
		String actualTitle_IdentityPage = driver.getTitle();
		String expectedTitle_IdentityPage = "Identity - My Store";
		Assert.assertEquals(actualTitle_IdentityPage, expectedTitle_IdentityPage);
		}
	
	@Test(priority = 2 , dependsOnMethods = { "navigateToIdentityPage" }, description = "Verify password changed successfully")
	public void verifyChangePwd() throws InterruptedException {
		
IdentityMyStorePage ip = new IdentityMyStorePage(driver);
		
		ip.enterCrntPwd();
		ip.enterNewPwd();
		ip.confirmPwd();
		ip.selectNewsltrCB();
		ip.selectOffersCB();
		ip.clickSave();
		String actual_successMsg = ip.checkMsg();
		String expected_successMsg = "Your personal information has been successfully updated.";
		Assert.assertEquals(actual_successMsg, expected_successMsg);
	}

}
