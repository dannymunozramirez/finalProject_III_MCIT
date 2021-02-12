package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author dannymunoz
 * 
 *         Steps: 1.Open URL http://automationpractice.com/index.php 2.Select
 *         product and add to Cart 3. Click on checkout and fill information for
 *         Registration. 4.Make sure to use US address to register 5.Click on
 *         Next and continue 6. Select terms and conditions and click on Next
 *         6.Select Pay by check and continue 7. Select Select Back to Orders
 *         and click on Home link 8. Click on Signout
 *
 * 
 */

//TODO click product
public class HomePage {
	WebDriver driver;
	By productToAdd = By.xpath("//ul[@id=\"homefeatured\"]/li[4]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickProduct(WebDriver driver) {
		driver.findElement(productToAdd).click();
	}

}
