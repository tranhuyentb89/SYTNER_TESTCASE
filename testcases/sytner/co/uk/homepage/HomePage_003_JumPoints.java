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

public class HomePage_003_JumPoints extends AbstractTest {
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
	public void JumpPoints_001_Alpina() {
		log.info("JumpPoints_001_Alpina: STep 01 - Hover to Alpina");
		homePage.hoverToDynamicJumpPoints(driver, "ALPINA");
		
		log.info("JumpPoints_001_Alpina: STep 02 - Click to to Alpina icon");
		homePage.clickToDynamicJumpPoints(driver, "ALPINA");
		alpinaPge = PageFactoryManage.getAlpinaPage(driver);
		
		log.info("JumpPoints_001_Alpina: STep 03 - Verify Alpina page is displayed");
		verifyEquals(alpinaPge.getPageTitle(driver), "ALPINA Cars | Sytner ALPINA");
	}

	@Test
	public void JumpPoints_002_Audi() {
		log.info("JumpPoints_002_Audi: Step 01 - Back to home page from alpina");
		alpinaPge.back(driver);
		
		log.info("JumpPoints_002_Audi: Step 02 - Hover to auti");
		homePage.hoverToDynamicJumpPoints(driver, "Audi");
		
		log.info("JumpPoints_002_Audi: Step 03 - Click to auti");
		homePage.clickToDynamicJumpPoints(driver, "Audi");
		audiPage = PageFactoryManage.getAudiPage(driver);
		
		log.info("JumpPoints_002_Audi: Step 04 - Verify audi page is displayed");
		verifyEquals(audiPage.getPageTitle(driver), "Audi Dealership | Sytner Audi");
	}

	@Test
	public void JumpPoints_003_Bentley() {
		audiPage.back(driver);
		homePage.hoverToDynamicJumpPoints(driver, "Bentley");
		homePage.clickToDynamicJumpPoints(driver, "Bentley");
		bentleyPage = PageFactoryManage.getBentleyPage(driver);
		verifyEquals(audiPage.getPageTitle(driver), "Bentley Dealership | Sytner Bentley");

	}

	@Test
	public void JumpPoints_004_BMW() {
		bentleyPage.back(driver);
		homePage.hoverToDynamicJumpPoints(driver, "BMW");
	}

	@Test
	public void JumpPoints_005_Ferrari() {
		homePage.hoverToDynamicJumpPoints(driver, "Ferrari");
	}

	@Test
	public void JumpPoints_006_AstonMartin() {
		homePage.hoverToDynamicJumpPoints(driver, "Aston Martin");
	}

	@Test
	public void JumpPoints_007_Jaguar() {
		homePage.hoverToDynamicJumpPoints(driver, "Jaguar");
	}

	@Test
	public void JumpPoints_008_LandRover() {
		homePage.hoverToDynamicJumpPoints(driver, "Land Rover");
	}

	@Test
	public void JumpPoints_009_Lamborghini() {
		homePage.hoverToDynamicJumpPoints(driver, "Lamborghini");
	}

	@Test
	public void JumpPoints_010_Maserati() {
		homePage.hoverToDynamicJumpPoints(driver, "Maserati");
	}

	@Test
	public void JumpPoints_011_Mclaren() {
		homePage.hoverToDynamicJumpPoints(driver, "Mclaren");
	}

	@Test
	public void JumpPoints_012_MercedesBenz() {
		homePage.hoverToDynamicJumpPoints(driver, "Mercedes Benz");
	}

	@Test
	public void JumpPoints_013_MINI() {
		homePage.hoverToDynamicJumpPoints(driver, "MINI");
	}

	@Test
	public void JumpPoints_014_Porsche() {
		homePage.hoverToDynamicJumpPoints(driver, "Porsche");
		homePage.hoverToDynamicJumpPoints(driver, "Rolls Royce");
		homePage.hoverToDynamicJumpPoints(driver, "SEAT");
		homePage.hoverToDynamicJumpPoints(driver, "Smart");
		homePage.hoverToDynamicJumpPoints(driver, "Volkswagen");
		homePage.hoverToDynamicJumpPoints(driver, "Volvo");
		homePage.hoverToDynamicJumpPoints(driver, "Sytner Select");
	}

	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}
}
