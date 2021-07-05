package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD;

	// interactive methods
	
	public void enterFullName(String fullName) {
//		Random rnd = new Random();
//		int generatedNumber = rnd.nextInt(999);
		FULL_NAME_FIELD.sendKeys(fullName + generateNumber(999));
	}
	
//  this generateNumber method can be required in other pages or methods as well.
//  so what will be done is that this method is going to be passed on to the base page.	
	
//	  public int generateNumber(int bound) { 
//    Random rnd = new Random(); 
//    int generatedNumber = rnd.nextInt(bound); 
//    return generatedNumber; 
//      
//    }
	 
	 

	public void enterCompany(String company) {
		selectDropdown(COMPANY_FIELD, company);
	}



	
//  for the email, i just have to call the generateNumber
	public void enterEmail(String email) {
		EMAIL_FIELD.sendKeys(generateNumber(999) + email);
	}

}
