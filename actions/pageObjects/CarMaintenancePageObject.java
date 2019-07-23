package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class CarMaintenancePageObject extends AbstractPage{
	public CarMaintenancePageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
