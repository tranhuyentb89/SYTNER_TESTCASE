package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.AboutUsPageObject;
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

}
