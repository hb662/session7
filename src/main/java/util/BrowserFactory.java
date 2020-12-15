package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BrowserFactory {

	static WebDriver driver;

	@Test
	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_1.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		// remove cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
		
	}

	@AfterTest
	public static void teardown() {

		driver.close();// close the

	}
}
