package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import pageClasses.ContactUsPage;
import pageClasses.HomePage;

public class ContactUs_001 extends BaseClass {
	
	@Test(description = "Verify functionality of contact us page")
	public void verifyContactPage() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.clickContactUs();
		
		ContactUsPage cp = new ContactUsPage(driver);
		cp.selectSubject();
		cp.enterEmail();
		cp.enterOrder();
		cp.enterMessage();
		cp.uploadFile();
		cp.clickSend();
		String actual_successMsg = cp.getSuccessMsg();
		String expected_successMsg = "Your message has been successfully sent to our team.";
		Assert.assertEquals(actual_successMsg, expected_successMsg);
		
	}

}
