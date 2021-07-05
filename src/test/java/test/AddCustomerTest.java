package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToCreateCustomer() {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterusername("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();

		dashboardPage.clickCustomersButton();

		dashboardPage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.enterFullName("selenium");
		addCustomerPage.enterCompany("Techfios");
		addCustomerPage.enterEmail("abc@techfios.com");
		
		BrowserFactory.tearDown();
	}

}
