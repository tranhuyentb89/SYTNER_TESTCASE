package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class NewCarsPageObject extends AbstractPage{
	public NewCarsPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
