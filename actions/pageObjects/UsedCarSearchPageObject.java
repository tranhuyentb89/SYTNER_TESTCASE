package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class UsedCarSearchPageObject extends AbstractPage{
	public UsedCarSearchPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
