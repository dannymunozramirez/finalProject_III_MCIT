package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDescription {

	WebDriver driver;
	By clickAddToCarBtn = By.name("Submit");
	By proceedBtn = By.cssSelector("div.button-container a");

	public ProductDescription(WebDriver driver) {
		this.driver = driver;
	}
	
	

	public void clickAdd(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickAddToCarBtn)).click();
		} catch (Exception e) {
			
			System.out.println("The element is not available!");
		}
		
		
	}

	public void clickSpanProceed(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(proceedBtn)).click();
		} catch (Exception e) {
			driver.findElement(proceedBtn).click();
		}
		

	}

}
