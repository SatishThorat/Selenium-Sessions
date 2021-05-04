package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitWebDriverWait 
{
	 static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
	    
	    driver.get("https://classic.crmpro.com/index.html");
	    
	    By username = By.xpath("//input[@type='text']");
	    By password = By.xpath("//input[@type='password']");
	    By login = By.xpath("//input[@value='Login']");
	    
	    waitForElementPresent(username, 10).sendKeys("groupautomation");
	    
	    driver.findElement(password).sendKeys("Test@12345");
	    driver.findElement(login).click();
	 }
	
	public static WebElement waitForElementPresent(By locator, int timeouts)
	{
		 WebDriverWait wait = new WebDriverWait(driver, timeouts);
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

	public  WebElement waitForElementVisible(By locator, int timeouts)
	{
		 WebDriverWait wait = new WebDriverWait(driver, timeouts);
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public  void  waitForElementVisibleWithWebElement(By locator, int timeouts)
	{
		 WebDriverWait wait = new WebDriverWait(driver, timeouts);
		 //return wait.until(ExpectedConditions.v(locator));
	}
}
