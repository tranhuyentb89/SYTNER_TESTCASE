package sytner.co.uk.homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.PageFactoryManage;
import pageObjects.AboutUsPageObject;
import pageObjects.CareersPageObject;
import pageObjects.CustomerServicePageObject;
import pageObjects.HomePageObject;
import pageObjects.NewPageObject;

public class HomePage_001_MenuItems extends AbstractTest {
	WebDriver driver;
	String pageTitle ;
	HomePageObject homePage;
	AboutUsPageObject aboutUsPage;
	NewPageObject newPage;
	CustomerServicePageObject customerServicePage;
	CareersPageObject careersPage;

	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browserName) {
		driver = openBrowser(browserName);
		homePage = PageFactoryManage.getHomePage(driver);
	}

	@Test
	public void MenuItems_001_AboutUs() {
		log.info("MenuItems_001_AboutUs_Step_01: Click To About Us");
		homePage.clickToDynamicMenuItem(driver, "About Us");
		aboutUsPage = PageFactoryManage.getAboutUsPage(driver);
		
		log.info("MenuItems_001_AboutUs_Step_02: Verify About Us page is displayed");
		verifyEquals(aboutUsPage.getPageTitle(driver), "About Us | Sytner Group Limited");
	}
	
	@Test
	public void MenuItems_002_News() {
		log.info("MenuItems_002_News- Step 01 : Click to News");
		homePage.clickToDynamicMenuItem(driver, "News");
		newPage = PageFactoryManage.getNewsPage(driver);
		
		log.info("MenuItems_002_News- Step 02 : Verify News page is displayed");
		verifyEquals(newPage.getPageTitle(driver), "Latest News | About Us | Sytner Group");
	}
	
	@Test
	public void MenuItems_003_CustomerService() {
		log.info("MenuItems_003_CustomerService- Step 01 : Click to Customer Service");
		homePage.clickToDynamicMenuItem(driver, "Customer Service");
		customerServicePage = PageFactoryManage.getCustomerServicePage(driver);
		
		log.info("MenuItems_003_CustomerService- Step 02 : Verify Customer Service page is displayed");
		verifyEquals(customerServicePage.getPageTitle(driver), "Customer Service | Sytner Group");
	}
	
	@Test
	public void MenuItems_004_Careers() {
		log.info("MenuItems_004_Careers- Step 01 : Click to Careers");
		homePage.clickToDynamicMenuItem(driver, "Careers");
		careersPage = PageFactoryManage.getCareersPage(driver);
		
		log.info("MenuItems_004_Careers- Step 02 : Verify Careers page is displayed");
		verifyEquals(customerServicePage.getPageTitle(driver), "Customer Service | Sytner Group");

	}
	

	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}
}
