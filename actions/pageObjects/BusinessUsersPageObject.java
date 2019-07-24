package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class BusinessUsersPageObject extends AbstractPage{
	public BusinessUsersPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
