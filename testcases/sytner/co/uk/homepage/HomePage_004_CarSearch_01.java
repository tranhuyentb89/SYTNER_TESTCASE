package sytner.co.uk.homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.PageFactoryManage;
import pageObjects.AboutUsPageObject;
import pageObjects.AlpinaPageObject;
import pageObjects.AudiPageObject;
import pageObjects.BentleyPageObject;
import pageObjects.BusinessUsersPageObject;
import pageObjects.CarMaintenancePageObject;
import pageObjects.CareersPageObject;
import pageObjects.CustomerServicePageObject;
import pageObjects.DealerLocatorPageObject;
import pageObjects.FinancePageObject;
import pageObjects.HomePageObject;
import pageObjects.NewCarsPageObject;
import pageObjects.NewPageObject;
import pageObjects.PromotionsPageObject;
import pageObjects.SellYourCarPageObject;
import pageObjects.UsedCarSearchPageObject;

public class HomePage_004_CarSearch_01 extends AbstractTest {
	WebDriver driver;
	String pageTitle;
	HomePageObject homePage;
	AboutUsPageObject aboutUsPage;
	NewPageObject newPage;
	CustomerServicePageObject customerServicePage;
	CareersPageObject careersPage;
	FinancePageObject financePage;
	UsedCarSearchPageObject usedCarSearch;
	NewCarsPageObject newCardPage;
	CarMaintenancePageObject carMaintenancePage;
	PromotionsPageObject promotionsPage;
	BusinessUsersPageObject businessUsersPage;
	SellYourCarPageObject sellYourCarPage;
	DealerLocatorPageObject dealerLocatorPage;
	AlpinaPageObject alpinaPge;
	AudiPageObject audiPage;
	BentleyPageObject bentleyPage;

	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browserName) {
		driver = openBrowser(browserName);
		homePage = PageFactoryManage.getHomePage(driver);
	}
	@Test
	public void CarSearch_001_CarSearchSetion() {
		
	}
	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}
}
