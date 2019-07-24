package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import sytner.co.uk.homepage.HomePageUI;

public class DealerLocatorPageObject extends AbstractPage{
	public DealerLocatorPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;

	public void clickToSytnerGroupLogo() {
		clickToElement(driver, HomePageUI.SYTNER_GROUP_LOGO);
	}
	

}
