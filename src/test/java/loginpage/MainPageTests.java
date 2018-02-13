package loginpage;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import pageObjects.ContactPage;
import pageObjects.PragmaticFooterPage;
import utilities.Browser;

public class MainPageTests {
	
	
	@BeforeClass
	public static void setup() {
		Browser.start();
	}
	
	@Test
	public void test1() throws Throwable {
		Thread.sleep(2000);
		PragmaticFooterPage.goTo();
		Assert.assertTrue(PragmaticFooterPage.isCustomerserviceDisplayed());	
		System.out.println("Customer service is displayed");
		Assert.assertTrue(PragmaticFooterPage.isContactusDisplayed());
		System.out.println("Contact us is displayed");
		Assert.assertTrue(PragmaticFooterPage.isReturnsDisplayed());
		System.out.println("Returns is displayed");
		Assert.assertTrue(PragmaticFooterPage.isSitemapDisplayed());
		System.out.println("Site map is displayed");
		PragmaticFooterPage.clickcontactus();
		Assert.assertEquals("Contact Us",Browser.driver.getTitle());
	}
	
	@Test
	public void test2() throws Throwable {
		Thread.sleep(2000);
		ContactPage.writeForm("vili", "space_bg_84@abv.bg", "Alabalanicatest 2");
		Assert.assertTrue("Test failed", Browser.driver.getPageSource().contains("http://shop.pragmatic.bg/index.php?route=information/contact/success"));
	System.out.println("Success");
	}
	
	
	@AfterClass
	public static void after() throws Throwable {
		Browser.stop();
	}
	
	
	

}
