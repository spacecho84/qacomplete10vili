package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Browser;

public class PragmaticFooterPage {

	private static final String URL = "http://shop.pragmatic.bg/";
	private static By CUSTOMERSERVICE = By.xpath("html/body/footer/div/div/div[2]");

	private static By CONTACTUS = By.xpath("//a[contains(.,'Contact Us')]");
	private static WebElement contactus;
	private static By RETURNS = By.xpath("//a[contains(.,'Returns')]");
	private static By SITEMAP = By.xpath("//a[contains(.,'Site Map')]");
	

	public static void goTo() {
		Browser.driver.get(URL);
	}

	public static boolean isCustomerserviceDisplayed() {
		return isDisplayed(CUSTOMERSERVICE);
	}

	public static boolean isContactusDisplayed() {
		return isDisplayed(CONTACTUS);
	}

	public static boolean isReturnsDisplayed() {
		return isDisplayed(RETURNS);
	}

	public static boolean isSitemapDisplayed() {
		return isDisplayed(SITEMAP);
	}

	protected static boolean isDisplayed(By locator) {
		return !Browser.driver.findElements(locator).isEmpty();
	}


	public static void clickcontactus() {
		contactus = Browser.driver.findElement(CONTACTUS);
		contactus.click();
	}
}
