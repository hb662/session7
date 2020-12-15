package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomer;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	@Test
	public void usershouldbeabletoaddcustomer() {

		driver = BrowserFactory.init();

		// LoginPage login1 = new LoginPage(driver);
		// argument
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSigninButton();

		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.validateDashboard();
		
		AddCustomer addcustomer = PageFactory.initElements(driver, AddCustomer.class);
		addcustomer.clickonCustomerButton();
		addcustomer.clickonaddCustomerButton();
		addcustomer.enterFullname("Junetf");
		addcustomer.enterCompanyname("Techfios");
		addcustomer.enterEmail("june@techfios.com");
		addcustomer.enterPhoneNum("333555777");
		addcustomer.enterAddress("NewYork");
		addcustomer.enterCountry("Belgium");
		
		
	}

	
}
