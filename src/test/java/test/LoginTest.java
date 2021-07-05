package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
    WebDriver driver;
   
//  this web driver driver above is not the same as the web driver in the browserFactory
//  so we need to create a relationship between the two to be able to do a transfer
//  so we return the driver from BrowserFactory and save it in a variable of Webdriver type  
    
//	Line  is not a constructor
//  As we are working with page object model, we are going to be identifying the loginpage.java as an object.
//  so we will be creating an object of the Loginpage.java in order to call the methods of Loginpage.java into LoginTest.java
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		
//I have to pass a string here in the argument as the constructor is parameterized. This will evoke the 2nd constructor.
//		LoginPage loginPage1 = new LoginPage();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterusername("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		
		BrowserFactory.tearDown();
	}

}
