package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class CareersPageObject extends AbstractPage{
	public CareersPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
