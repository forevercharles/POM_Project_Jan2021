package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
//  for a specific dropdown from the many dropdowns in the Add Customer	
	public void selectDropdown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
		
	}
	
	public int generateNumber(int bound) {
		Random rnd = new Random();
		int generatedNumber = rnd.nextInt(bound);
		return generatedNumber;
	}

}
