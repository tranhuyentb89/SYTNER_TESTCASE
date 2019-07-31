package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class BentleyPageObject extends AbstractPage{
	public BentleyPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
