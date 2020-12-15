package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class InvalidPassword {
	WebDriver driver;
	
	public InvalidPassword(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using="/html/body/div/div/div/div[2]") 
	WebElement INVALID_PASSWORD_ELEMENT;
	 //form[@class='login']
	
	
	public void validationPassword() {
		String loginpassword=INVALID_PASSWORD_ELEMENT.getText();
		Assert.assertEquals(loginpassword, " × Invalid Username or Password", "Wrong test");
		
	}
}
