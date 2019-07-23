package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class FinancePageObject extends AbstractPage{
	public FinancePageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	

}
