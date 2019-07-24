package commons;

import org.openqa.selenium.WebDriver;

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

public class PageFactoryManage {

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static AboutUsPageObject getAboutUsPage(WebDriver driver) {
		return new AboutUsPageObject(driver);
	}

	public static NewPageObject getNewsPage(WebDriver driver) {
		return new NewPageObject(driver);
	}

	public static CustomerServicePageObject getCustomerServicePage(WebDriver driver) {
		return new CustomerServicePageObject(driver);
	}

	public static CareersPageObject getCareersPage(WebDriver driver) {
		return new CareersPageObject(driver);
	}

	public static FinancePageObject getFinancePage(WebDriver driver) {
		return new FinancePageObject(driver);
	}

	public static UsedCarSearchPageObject getUsedCarSearchPage(WebDriver driver) {
		return new UsedCarSearchPageObject(driver);
	}

	public static NewCarsPageObject getNewCarsPage(WebDriver driver) {
		return new NewCarsPageObject(driver);
	}

	public static CarMaintenancePageObject getCarMaintenancePage(WebDriver driver) {
		return new CarMaintenancePageObject(driver);
	}

	public static PromotionsPageObject getPromotionsPage(WebDriver driver) {
		return new PromotionsPageObject(driver);
	}

	public static BusinessUsersPageObject getBusinessUsersPage(WebDriver driver) {
		return new BusinessUsersPageObject(driver);
	}

	public static SellYourCarPageObject getSellYourCarPage(WebDriver driver) {
		return new SellYourCarPageObject(driver);
	}

	public static DealerLocatorPageObject getDealerLocatorPage(WebDriver driver) {
		return new DealerLocatorPageObject(driver);
	}


}
