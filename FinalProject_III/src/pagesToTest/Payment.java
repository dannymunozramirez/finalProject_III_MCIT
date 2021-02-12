package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment {

	WebDriver driver;
	By payByCheck = By.xpath("//div[@id=\"HOOK_PAYMENT\"]//div[2]//a");
	By confirmBtn = By.xpath("//p//button");
	By logOut = By.xpath("//a[@class=\"logout\"]");

	public Payment(WebDriver driver) {
		this.driver = driver;
	}

	public void payByCheckAndClicking(WebDriver driver) throws InterruptedException {

		// TODO add if conditional and try catch block
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(payByCheck)).click();
		} catch (Exception e) {
			driver.findElement(payByCheck).click();
		}
		Thread.sleep(2000);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(confirmBtn)).click();
		} catch (Exception e) {
			driver.findElement(confirmBtn).click();
		}

		Thread.sleep(2000);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(logOut)).click();
		} catch (Exception e) {
			driver.findElement(logOut).click();
		}

	}

}
