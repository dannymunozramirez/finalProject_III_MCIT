package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressConfirm {

	// TODO click proceed checkOut
	WebDriver driver;
	By proceedToCheckOutBtn = By.name("processAddress");

	public AddressConfirm(WebDriver driver) {
		this.driver = driver;
	}

	public void clickProceedBtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOutBtn)).click();
		} catch (Exception e) {
			driver.findElement(proceedToCheckOutBtn).click();
		}

	}

}
