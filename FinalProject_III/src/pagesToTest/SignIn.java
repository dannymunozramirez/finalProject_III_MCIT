package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignIn {

	// TODO fill out email to register
	// TODO click create an account
	// TODO fill out register form (zip code 85055)
	WebDriver driver;
	By emailField = By.id("email_create");
	By submitCreateBtn = By.id("SubmitCreate");

	// Fields in the form (Personal Information)
	By ratioMr = By.id("uniform-id_gender1");
	By firstNameField = By.id("customer_firstname");
	By lastNameField = By.id("customer_lastname");
	By passwordField = By.id("passwd");
	By dayFieldSelect = By.id("days");
	By monthFieldSelect = By.id("months");
	By yearFieldSelect = By.id("years");

	// Fields in the form (Address Information)
	By addressFirstNameField = By.id("firstname");
	By addressLastNameField = By.id("lastname");
	By addressCompanyField = By.id("company");
	By addressField = By.id("address1");
	By cityField = By.id("city");
	By stateFieldSelect = By.id("id_state");
	By postalCodeField = By.id("postcode");
	By homePhoneField = By.id("phone");
	By mobilePhoneField = By.id("phone_mobile");
	
	By submitFormBtn = By.id("submitAccount");
	
	// Info to fill out Personal Information
	String email = "d11@ddd.com";
	String firstName = "Test";
	String lastName = "Test";
	String password = "Test@Test12345";
	String dayToPick = "16";
	String month = "December";
	String year = "1980";
	
	// Address info
	String company = "Testing QA";
	String address = "9 NDG";
	String city = "Montreal";
	String state = "Massachusetts";
	String postalCode = "85055";
	String homePhone = "15554449900";
	String mobilePhone = "14443338899";
	
	

	public SignIn(WebDriver driver) {
		this.driver = driver;
	}

	public void fillOutEmail(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(emailField).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(submitCreateBtn).click();

	}

	public void fillingOutSignIn(WebDriver driver) throws InterruptedException {
		//TODO fill out form and add Thread.sleep
		
		Select op = new Select(driver.findElement(dayFieldSelect));
		
		driver.findElement(ratioMr).click();
		Thread.sleep(2000);
		driver.findElement(firstNameField).sendKeys(firstName);
		Thread.sleep(2000);
		driver.findElement(lastNameField).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(passwordField).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(dayFieldSelect).click();
		op.selectByValue(dayToPick);
		Thread.sleep(2000);
		

		driver.findElement(monthFieldSelect).sendKeys("June");;
		Thread.sleep(2000);
		

		driver.findElement(yearFieldSelect).sendKeys(year);;
		Thread.sleep(2000);
		
		driver.findElement(addressFirstNameField).sendKeys(firstName);
		Thread.sleep(2000);
		driver.findElement(addressLastNameField).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(addressCompanyField).sendKeys(company);
		Thread.sleep(2000);
		driver.findElement(addressField).sendKeys(address);
		Thread.sleep(2000);
		driver.findElement(cityField).sendKeys(city);
		Thread.sleep(2000);
		
		driver.findElement(stateFieldSelect).sendKeys(state);;
		Thread.sleep(2000);
		
		driver.findElement(postalCodeField).sendKeys(postalCode);
		Thread.sleep(2000);
		driver.findElement(homePhoneField).sendKeys(homePhone);
		Thread.sleep(2000);
		driver.findElement(mobilePhoneField).sendKeys(mobilePhone);
		
		Thread.sleep(2000);
		driver.findElement(submitFormBtn).click();

	}

}
