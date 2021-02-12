package utilClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pagesToTest.AddressConfirm;
import pagesToTest.HomePage;
import pagesToTest.Payment;
import pagesToTest.ProductDescription;
import pagesToTest.Shipping;
import pagesToTest.ShopingCartSummary;
import pagesToTest.SignIn;

public class UtilClassProject_III {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.geckodriver.driver",
				"/Users/dannymunoz/Develop/eclipse/development/FinalProject_III/geckodriver");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		HomePage home = new HomePage(driver);
		ProductDescription producDescription = new ProductDescription(driver);
		ShopingCartSummary shopCartSum = new ShopingCartSummary(driver);
		SignIn signIn = new SignIn(driver);
		AddressConfirm addressConfirm = new AddressConfirm(driver);
		Shipping shipping = new Shipping(driver);
		Payment payments = new Payment(driver);

		home.clickProduct(driver);
		producDescription.clickAdd(driver);
		producDescription.clickSpanProceed(driver);
		shopCartSum.clickCheckOutBtn(driver);
		signIn.fillOutEmail(driver);
		signIn.fillingOutSignIn(driver);
		addressConfirm.clickProceedBtn(driver);
		shipping.clickingBoxAndBtn(driver);
		payments.payByCheckAndClicking(driver);

	}

}
