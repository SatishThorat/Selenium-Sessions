package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DifferentLocatorsAssignment {

	public static void main(String[] args) {
		
		BrowserUtility br = new BrowserUtility();
		WebDriver driver = br.init_driver("chrome");
		br.launchurl("https://demo.opencart.com/index.php?route=account/register");
		
		By firstName  = By.name("input-firstname"); 
		By lastname = By.className("form-control");
		By email = By.xpath("//*[@id=\"input-email\"]");
		
		ElementUtil eu =new ElementUtil(driver);
		 eu.doSendKeys(firstName, "viju");
		 eu.doSendKeys(lastname, "test");
		 eu.doSendKeys(email, "viju@gmail.com");
		

	}

}
