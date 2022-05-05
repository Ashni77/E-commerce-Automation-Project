package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import pageClasses.CasualDrsMyStorePage;
import pageClasses.DressesMyStorePage;
import pageClasses.HomePage;
import pageClasses.OrderMyStorePage;
import pageClasses.PrintedDressMyStorePage;
import pageClasses.PrintedSummerDressPage;

public class AddToCart_002 extends BaseClass {

	
	@Test(priority = 1, description = "Verify if printed dress is added")
	public void addCasualDrs() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		hp.clickDresses();
		String dresses_actualtitle = driver.getTitle();
		String dresses_expectedtitle = "Dresses - My Store";
		Assert.assertEquals(dresses_actualtitle, dresses_expectedtitle);

		DressesMyStorePage dp = new DressesMyStorePage(driver);
		dp.clickCasualDrs();
		String casualDrs_actualtitle = driver.getTitle();
		String casualDrs_expectedtitle = "Casual Dresses - My Store";
		Assert.assertEquals(casualDrs_actualtitle, casualDrs_expectedtitle);

		CasualDrsMyStorePage cp = new CasualDrsMyStorePage(driver);
		cp.clickPrntdDrs();
		String casualPrntdDrs_actualtitle = driver.getTitle();
		String casualPrntdDrs_expectedtitle = "Printed Dress - My Store";
		Assert.assertEquals(casualPrntdDrs_actualtitle, casualPrntdDrs_expectedtitle);

		PrintedDressMyStorePage pdp = new PrintedDressMyStorePage(driver);
		pdp.selSize();
		pdp.clickAddToCrt();
		pdp.handleproductwindow();
	}

	@Test(priority = 2, description = "Verify if summer dress is added")
	public void addSmrDrs() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		hp.mouseOver_Women();
		hp.clickSmrDrs();
		String smrDrs_actualtitle = driver.getTitle();
		String smrDrs_expectedtitle = "Summer Dresses - My Store";
		Assert.assertEquals(smrDrs_actualtitle, smrDrs_expectedtitle);

		PrintedSummerDressPage psp = new PrintedSummerDressPage(driver);
		psp.clickSmrDrs();
		String prntdSmrDrs_actualtitle = driver.getTitle();
		String PrntdSmrDrs_expectedtitle = "Printed Summer Dress - My Store";
		Assert.assertEquals(prntdSmrDrs_actualtitle, PrntdSmrDrs_expectedtitle);
		psp.clickPlusCB();
		psp.selSizeSmrDrs();
		psp.selBlueCol();
		psp.clickSmrDrsAtc();
		psp.clickCancel();
		psp.clickShopngCrt();

		OrderMyStorePage op = new OrderMyStorePage(driver);
		String actualSummary = op.getPrdtQnty();
		String expectedSummary = "Your shopping cart contains: 3 Products";
		Assert.assertEquals(actualSummary, expectedSummary);
	}

}
