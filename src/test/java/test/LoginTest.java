package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.InvalidPassword;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test(priority = 1)
	public void validUserShouldbealetologin() {
		// LoginPage login1 = new LoginPage();

		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		DashboardPage page = PageFactory.initElements(driver, DashboardPage.class);
		
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSigninButton();
		page.validateDashboard();
		
		BrowserFactory.teardown();

	}
	
	//invalid test case
	@Test(priority = 2)
	public void invalidUserShouldbealetologin() {
		// LoginPage login1 = new LoginPage();

		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		InvalidPassword page = PageFactory.initElements(driver, InvalidPassword.class);
		
		login.enterUserName("demo1@techfios.com");
		login.enterPassword("abc1234");
		login.clickSigninButton();
		page.validationPassword();
		
		
		BrowserFactory.teardown();

	}
}