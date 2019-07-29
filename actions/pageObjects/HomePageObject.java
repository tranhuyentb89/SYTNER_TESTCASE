package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.AbstractPage;
import sytner.co.uk.homepage.HomePageUI;

public class HomePageObject extends AbstractPage{
	public HomePageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver;
	
	public int verifyImageScrollIsDisplayed() {
		List<WebElement> element = driver.findElements(By.xpath(HomePageUI.HOME_PAGE_SCROLL_IMAGE));
		return element.size();
	}
}
