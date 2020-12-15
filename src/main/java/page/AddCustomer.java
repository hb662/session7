package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomer extends BasePage {
	
	WebDriver driver;
	
	public AddCustomer(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(how=How.XPATH,using ="//span[contains(text(),'Customers')]") WebElement CUSTOMER_FIELD_LOCATOR;
    @FindBy(how= How.XPATH,using ="//a[contains(text(),'Add Customer')]") WebElement ADDCUSTOMER_FIELD_LOCATOR;
    @FindBy(how=How.XPATH,using ="//input[@id='account']") WebElement FULLNAME_FIELD_LOCATOR;
    @FindBy(how=How.XPATH,using ="//select[@id='cid']") WebElement COMPANY_FIELD_LOCATOR;
    @FindBy(how=How.XPATH,using = "//input[@id='email']")WebElement EMAIL_FIELD_LOCATOR;
    @FindBy(how = How.XPATH,using = "//input[@id='phone']") WebElement PHONE_NUM_FIELD;
    @FindBy(how = How.XPATH,using = "//input[@id='address']") WebElement ADDRESS_FIELD_LOCATOR;
    @FindBy(how = How.XPATH,using = "//select[@id='country']") WebElement COUNTRY_FIELD_LOCATOR;
    
    
    
    public void clickonCustomerButton() {
	  CUSTOMER_FIELD_LOCATOR.click();
	  
  }
  
  public void clickonaddCustomerButton() {
	  waitforElement( driver, 3, ADDCUSTOMER_FIELD_LOCATOR );
	  ADDCUSTOMER_FIELD_LOCATOR.click();
  }
  
  public void enterFullname(String name) {
	  waitforElement(driver, 3, FULLNAME_FIELD_LOCATOR);
	  int random = randonNumGenerator();
	  FULLNAME_FIELD_LOCATOR.sendKeys(name+random);
	  
  }
  
  public void enterCompanyname(String company) {
	 selectFromDropdown(COMPANY_FIELD_LOCATOR, company);
	  
  }
  
  public void enterEmail(String email) {
	  int random = randonNumGenerator();
	  EMAIL_FIELD_LOCATOR.sendKeys(random+email);
	  
  }
  public void enterPhoneNum(String phone) {
	  PHONE_NUM_FIELD.sendKeys(phone);
  }
  
  public void enterAddress(String address) {
	  ADDRESS_FIELD_LOCATOR.sendKeys(address);
	  
  }
  
  public void enterCountry(String country) {
	  selectFromDropdown(COUNTRY_FIELD_LOCATOR, country);
  }
  
}
