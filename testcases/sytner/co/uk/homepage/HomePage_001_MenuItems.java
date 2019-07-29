package sytner.co.uk.homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.PageFactoryManage;
import pageObjects.AboutUsPageObject;
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

public class HomePage_001_MenuItems extends AbstractTest {
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

	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browserName) {
		driver = openBrowser(browserName);
		homePage = PageFactoryManage.getHomePage(driver);
	}

	// @Test
	public void MenuItems_001_AboutUs() {
		log.info("MenuItems_001_AboutUs_Step_01: Click To About Us");
		homePage.clickToDynamicMenuItem(driver, "About Us");
		aboutUsPage = PageFactoryManage.getAboutUsPage(driver);

		log.info("MenuItems_001_AboutUs_Step_02: Verify About Us page is displayed");
		verifyEquals(aboutUsPage.getPageTitle(driver), "About Us | Sytner Group Limited");
	}

	// @Test
	public void MenuItems_002_News() {
		log.info("MenuItems_002_News- Step 01 : Click to News");
		homePage.clickToDynamicMenuItem(driver, "News");
		newPage = PageFactoryManage.getNewsPage(driver);

		log.info("MenuItems_002_News- Step 02 : Verify News page is displayed");
		verifyEquals(newPage.getPageTitle(driver), "Latest News | About Us | Sytner Group");
	}

	// @Test
	public void MenuItems_003_CustomerService() {
		log.info("MenuItems_003_CustomerService- Step 01 : Click to Customer Service");
		homePage.clickToDynamicMenuItem(driver, "Customer Service");
		customerServicePage = PageFactoryManage.getCustomerServicePage(driver);

		log.info("MenuItems_003_CustomerService- Step 02 : Verify Customer Service page is displayed");
		verifyEquals(customerServicePage.getPageTitle(driver), "Customer Service | Sytner Group");
	}

	// @Test
	public void MenuItems_004_Careers() {
		log.info("MenuItems_004_Careers- Step 01 : Click to Careers");
		homePage.clickToDynamicMenuItem(driver, "Careers");
		homePage.switchWindowByTitle(driver, "Home - Sytner Careers");
		careersPage = PageFactoryManage.getCareersPage(driver);

		log.info("MenuItems_004_Careers- Step 02 : Verify Careers page is displayed");
		verifyEquals(careersPage.getPageTitle(driver), "Home - Sytner Careers");
		careersPage.switchWindowByTitle(driver, "Car Dealership | Sytner Group");
		careersPage.closeChildWindow(driver);

	}

	// @Test
	public void MenuItems_005_Finance() {
		log.info("MenuItems_005_Finance- Step 01 : Click to Finance Menu item");
		homePage.clickToDynamicMenuItem(driver, "Finance");
		financePage = PageFactoryManage.getFinancePage(driver);

		log.info("MenuItems_005_Finance- Step 02 : Verify Finance page is displayed");
		verifyEquals(financePage.getPageTitle(driver), "Finance | Sytner Group Limited");
	}

	// @Test
	public void MenuItems_006_SavedVehicles() {

	}

	// @Test
	public void MenuItems_007_UsedCarSearch() {
		log.info("MenuItems_007_UsedCarSearch- Step 01 : Click to Used Car Search Menu item");
		homePage.clickToDynamicPrimaryMenuItem(driver, "Used Car Search");
		usedCarSearch = PageFactoryManage.getUsedCarSearchPage(driver);

		log.info("MenuItems_007_UsedCarSearch- Step 02 : Verify Used Car Search page is displayed");
		verifyEquals(usedCarSearch.getPageTitle(driver), "Sytner Vehicle Search");
	}

	@Test
	public void MenuItems_008_NewCars() {
		log.info("MenuItems_008_NewCars- Step 01 : Click to New Cars Menu item");
		homePage.clickToDynamicPrimaryMenuItem(driver, "New Cars");
		newCardPage = PageFactoryManage.getNewCarsPage(driver);

		log.info("MenuItems_008_NewCars- Step 02 : Verify New Cars page is displayed");
		verifyEquals(newCardPage.getPageTitle(driver), "New Cars | Sytner Group");
	}

	@Test
	public void MenuItems_009_CarMaintenance() {
		log.info("MenuItems_009_CarMaintenance- Step 01 : Click to Car Maintenance Menu item");
		homePage.clickToDynamicPrimaryMenuItem(driver, "Car Maintenance");
		carMaintenancePage = PageFactoryManage.getCarMaintenancePage(driver);

		log.info("MenuItems_009_CarMaintenance- Step 02 : Verify Car Maintenance page is displayed");
		verifyEquals(carMaintenancePage.getPageTitle(driver), "Car Servicing & Maintenance | Sytner Group");
	}

	@Test
	public void MenuItems_010_Promotions() {
		log.info("MenuItems_010_Promotions- Step 01 : Click to Promotions Menu item");
		homePage.clickToDynamicPrimaryMenuItem(driver, "Promotions");
		promotionsPage = PageFactoryManage.getPromotionsPage(driver);

		log.info("MenuItems_010_Promotions- Step 02 : Verify Promotions page is displayed");
		verifyEquals(promotionsPage.getPageTitle(driver), "Special Car Offers & Promotions | Sytner");
	}

	@Test
	public void MenuItems_011_BusinessUsers() {
		log.info("MenuItems_011_BusinessUsers- Step 01 : Click to Business Users Menu item");
		homePage.clickToDynamicPrimaryMenuItem(driver, "Business Users");
		businessUsersPage = PageFactoryManage.getBusinessUsersPage(driver);

		log.info("MenuItems_011_BusinessUsers- Step 02 : Verify Business Users page is displayed");
		verifyEquals(businessUsersPage.getPageTitle(driver), "Business & Fleet Cars | Sytner Group");
	}

	@Test
	public void MenuItems_012_SellYourCar() {
		log.info("MenuItems_012_SellYourCar- Step 01 : Click to Sell your car Users Menu item");
		homePage.clickToDynamicPrimaryMenuItem(driver, "Sell your car");
		sellYourCarPage = PageFactoryManage.getSellYourCarPage(driver);

		log.info("MenuItems_012_SellYourCar- Step 02 : Verify Sell your car page is displayed");
		verifyEquals(sellYourCarPage.getPageTitle(driver), "Sell Your Car | Sytner Group");
	}

	@Test
	public void MenuItems_013_DealerLocator() {
		log.info("MenuItems_013_DealerLocator- Step 01 : Click to Dealer Locator Menu item");
		homePage.clickToDynamicPrimaryMenuItem(driver, "Dealer Locator");
		dealerLocatorPage = PageFactoryManage.getDealerLocatorPage(driver);

		log.info("MenuItems_013_DealerLocator- Step 02 : Verify Dealer Locator page is displayed");
		verifyEquals(dealerLocatorPage.getPageTitle(driver), "Our Locations | Sytner Group");
	}

	@Test
	public void MenuItems_014_HomeIcon() {
		log.info("MenuItems_014_HomeIcon- Step 01 : Click to Dealer Locator");
		homePage.clickToDynamicPrimaryMenuItem(driver, "Dealer Locator");
		dealerLocatorPage = PageFactoryManage.getDealerLocatorPage(driver);
		
		log.info("MenuItems_014_HomeIcon- Step 02 : Click to Home Icon");
		businessUsersPage.clickToDynamicPrimaryMenuItem(driver, "Home");
		homePage = PageFactoryManage.getHomePage(driver);
		
		log.info("MenuItems_014_HomeIcon- Step 03 : Verify Home page is displayed");
		verifyEquals(homePage.getPageTitle(driver), "Car Dealership | Sytner Group");
	}
	
	@Test
	public void MenuItems_015_SytnerGroupLogo() {
		log.info("MenuItems_015_SytnerGroupLogo- Step 01 : Click to Dealer Locator Menu item");
		homePage.clickToDynamicPrimaryMenuItem(driver, "Dealer Locator");
		dealerLocatorPage = PageFactoryManage.getDealerLocatorPage(driver);
		
		dealerLocatorPage.clickToSytnerGroupLogo();
		homePage = PageFactoryManage.getHomePage(driver);
		log.info("MenuItems_015_SytnerGroupLogo- Step 02 : Verify Home page is displayed");
		verifyEquals(homePage.getPageTitle(driver), "Car Dealership | Sytner Group");
	}

	@Test
	public void ImageScroll_001_ImageScrollDisplay() {
		verifyEquals(homePage.verifyImageScrollIsDisplayed(), 6);
	}
	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}
}
