package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	
	public void waitforElement(WebDriver driver, int timeInSeconds, WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		  wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void selectFromDropdown(WebElement element,String text) {
		 Select sel = new Select(element);
		  sel.selectByVisibleText(text);
	}
	
	public int randonNumGenerator() {
		Random rnd = new Random();
		int random =rnd.nextInt(999);
		return random;
		
		
	}
}
