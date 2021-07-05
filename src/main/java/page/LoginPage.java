package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

//  this is the default constructor evoked when we create an object of this page in the LoginTest.java
//  Though this constructor will not be used. was just for demo
	public LoginPage() {

	}

//  I have to parameterize this constructor as I have passed an argument in the LoginTest.java
//  so now we have the capability of accepting what we have passed in the LoginTest.java.
//  In this case we'll accept the driver that was passed as an argument.
//	We'll do that using the below constructor
//  (this) keyword establishes that connection between the driver in the constructor and the driver in the global declaration	
	
	public LoginPage(WebDriver driver) {
        this.driver = driver;
	}

//  Element library
	// WebElement element = driver.findElement(By.xpath("//*[@id=\"username\"]"));
//	gonna fail in the above method
	// By locator = By.xpath("//*[@id=\"username\"]");
//  None of the methods of storing the path is gonna work in the Loginpage.java

// we identify using the below method within the page object model

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_FIELD;

	// interactive methods: Technique 1(individual methods)
	//
	public void enterusername(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_FIELD.click();
	}

	// Technique 2: combined method(creating one single method to do all the
	// actions)
	public void testLoginIn(String userName, String password) {
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(password);
		SIGNIN_FIELD.click();
	}

}
