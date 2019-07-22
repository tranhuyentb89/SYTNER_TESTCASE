package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class AboutUsPageObject extends AbstractPage{
	public AboutUsPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
