package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class NewPageObject extends AbstractPage{
	public NewPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
