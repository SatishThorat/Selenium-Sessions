package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		// 1st..
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("satish@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("satish@123");
		 */
		
		// 2nd..
		/*
		 * WebElement email=driver.findElement(By.id("input-email")); 
		 * WebElement password= driver.findElement(By.id("input-password"));
		 * email.sendKeys("satish@mgail.com"); 
		 * password.sendKeys("satish@123");
		 */
		// By Locators :
		/*
		 * By email=By.id("input-email"); 
		 * By password=By.id("input-password");
		 * driver.findElement(email).sendKeys("satish@gmail.com");
		 * driver.findElement(password).sendKeys("satish");
		 */
		
		// By Locators + WebElement
		
		/*
		 * By emailid =By.id("input-email"); 
		 * By password=By.id("input-password");
		 * WebElement emailele=driver.findElement(emailid); WebElement
		 * passele=driver.findElement(password); emailele.sendKeys("satish@gmail.com");
		 * passele.sendKeys("satish@123");
		 */
		
		/*
		 * // Generic Methods.. 
		 * By emailid =By.id("input-email");
		 * By password=By.id("input-password"); 
		 * getElement(emailid, "satish@gmail.com");
		 * getElement(password, "satish@gmil.com");
		 */
		By emailid =By.id("input-email");
		By password=By.id("input-password"); 
		By registerLink = By.linkText("Register");
		
		doSendKeys(emailid,"satish@gmail.com");
		doSendKeys(password, "satish@123");
		DoClick(registerLink);
		
		By header = By.tagName("h1");
		String text = doGetText(header);
		System.out.println(text);
		
		System.out.println(doIsDisplayed(header));
		System.out.println(doIsDisplayed(registerLink));
	}
	
	//generic method only
	/*
	 * public static void getElement(By Locator, String value) 
	 * {
	 * driver.findElement(Locator).sendKeys(value);
	 *  }
	 */
	
	
	
	public static WebElement getElement (By locator)
	{
		
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) 
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void DoClick(By locator) 
	{
		getElement(locator).click();
	}
	
	public static String  doGetText(By locator)
	{
		return getElement(locator).getText();
	}
	
	public static boolean doIsDisplayed(By locator) 
	{
		return getElement(locator).isDisplayed();
	}
}
