package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopingCartSummary {

	// TODO click checkout btn
	WebDriver driver;
	By proceedCheckOut = By.xpath("//div[@id=\"center_column\"]/p[2]/a[1]");

	public ShopingCartSummary(WebDriver driver) {
		this.driver = driver;
	}

	public void clickCheckOutBtn(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(2000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(proceedCheckOut)).click();
		} catch (Exception e) {
			driver.findElement(proceedCheckOut).click();
		}
		
	}

}
