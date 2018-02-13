package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver driver;
	

	public static void start() {
		System.out.println("Browser starting");
		System.setProperty("webdriver.chrome.driver", "C:/selenium_drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void stop() {
		System.out.println("Stoping browser");
		driver.close();
	}
	
	

}
