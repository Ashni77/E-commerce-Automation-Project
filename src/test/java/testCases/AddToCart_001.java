package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.FadedShrtSleevTshirtPage;
import pageClasses.HomePage;
import pageClasses.LoginMyStorePage;
import pageClasses.OrderMyStorePage;
import pageClasses.TshirtsPage;

public class AddToCart_001 extends BaseClass {
	
	@Test(priority = 1 )
	public void verifyAddCrt() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.mouseOver_Women();
		hp.clickTshirts();
		String tshirt_actualtitle = driver.getTitle();
		System.out.println("Actual title is: " + tshirt_actualtitle);
		String tshirt_expectedtitle = "T-shirts - My Store";
		Assert.assertEquals(tshirt_actualtitle, tshirt_expectedtitle);

		TshirtsPage tp = new TshirtsPage(driver);
		tp.clickImgTxt();
		String fadedTshirt_actualtitle = driver.getTitle();
		System.out.println("Actual title is: " + fadedTshirt_actualtitle);
		String fadedTshirt_expectedtitle = "Faded Short Sleeve T-shirts - My Store";
		Assert.assertEquals(fadedTshirt_actualtitle, fadedTshirt_expectedtitle);

		FadedShrtSleevTshirtPage fp = new FadedShrtSleevTshirtPage(driver);
		fp.clickIncQuantity();
		fp.selectSize();
		fp.clickBlueCol();
		fp.clickAddToCart();
		fp.handleCheckoutWindow();
		String orderPage_actualtitle = driver.getTitle();
		System.out.println("Actual title is: " + orderPage_actualtitle);
		String orderPage_expectedtitle = "Order - My Store";
		Assert.assertEquals(orderPage_actualtitle, orderPage_expectedtitle);

		OrderMyStorePage op = new OrderMyStorePage(driver);
		op.clickPrcdChckt();
		String loginPage_actualtitle = driver.getTitle();
		System.out.println("Actual title is: " + loginPage_actualtitle);
		String loginPage_expectedtitle = "Login - My Store";
		Assert.assertEquals(loginPage_actualtitle, loginPage_expectedtitle);
	}
	
	@Test(priority = 2, dependsOnMethods = { "verifyAddCrt" })
	public void verifyChkoutSuccess() throws InterruptedException {

		LoginMyStorePage lp = new LoginMyStorePage(driver);
		lp.enterSigninEmail();
		lp.enterSigninPwd();
		lp.clickSignInBtn();
		String orderPage2_actualtitle = driver.getTitle();
		System.out.println("Actual title is: " + orderPage2_actualtitle);
		String orderPage2_expectedtitle = "Order - My Store";
		Assert.assertEquals(orderPage2_actualtitle, orderPage2_expectedtitle);

		OrderMyStorePage op = new OrderMyStorePage(driver);
		op.enterInTxtBx();
		op.clickAdrChckt();
		op.selectTnSchkbx();
		op.clickCarrierPcd();
		op.clickPayOpt();
		String myStorePage_actualtitle = driver.getTitle();
		System.out.println("Actual title is: " + myStorePage_actualtitle);
		String myStorePage_expectedtitle = "My Store";
		Assert.assertEquals(myStorePage_actualtitle, myStorePage_expectedtitle);
		op.clickCnfrm();
		String orderCnfrm_actualtitle = driver.getTitle();
		System.out.println("Actual title is: " + orderCnfrm_actualtitle);
		String orderCnfrm_expectedtitle = "Order confirmation - My Store";
		Assert.assertEquals(orderCnfrm_actualtitle, orderCnfrm_expectedtitle);
	
	}
		


}
