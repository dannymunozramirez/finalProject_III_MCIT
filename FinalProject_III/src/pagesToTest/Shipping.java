package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shipping {

	// TODO click agree box
	// TODO click checkOut BTN
	WebDriver driver;
	By agreeBox = By.id("cgv");
	By proceedBtn = By.name("processCarrier");

	public Shipping(WebDriver driver) {
		this.driver = driver;
	}

	public void clickingBoxAndBtn(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(agreeBox).click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(proceedBtn)).click();
		} catch (Exception e) {
			driver.findElement(proceedBtn).click();
		}

	}

}
