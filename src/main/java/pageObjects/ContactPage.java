package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Browser;

public class ContactPage {
	
	
	private static By NAME = By.id("input-name");
	private static WebElement name;
	private static By EMAIL = By.id("input-email");
	private static WebElement email;
	private static By ENQUIRY = By.id("input-enquiry");
	private static WebElement enquiry;
	private static By SUBMITBUTTON = By.xpath(".//*[@id='content']/form/div/div/input");
	private static WebElement submitButton;
	
	public static void writeForm(String username, String emailaddress,String text) {
		name= Browser.driver.findElement(NAME);
		email=Browser.driver.findElement(EMAIL);
		enquiry = Browser.driver.findElement(ENQUIRY);
		name.sendKeys(username);
		email.sendKeys(emailaddress);
		enquiry.sendKeys(text);
		submitButton = Browser.driver.findElement(SUBMITBUTTON);
		submitButton.click();
	}
	
	
}
