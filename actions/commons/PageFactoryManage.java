package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.AboutUsPageObject;
import pageObjects.CareersPageObject;
import pageObjects.CustomerServicePageObject;
import pageObjects.HomePageObject;
import pageObjects.NewPageObject;

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
		// TODO Auto-generated method stub
		return null;
	}

}
