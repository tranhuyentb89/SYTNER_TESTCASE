package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class CustomerServicePageObject extends AbstractPage{
	public CustomerServicePageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
