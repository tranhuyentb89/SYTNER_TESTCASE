package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class AudiPageObject extends AbstractPage{
	public AudiPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
