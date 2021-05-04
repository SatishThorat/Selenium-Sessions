package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country  = By.id("Form_submitForm_Country");
		
		//Select select_Indus = new Select(driver.findElement(industry));
		//select_Indus.selectByIndex(4);
		//select_Indus.selectByVisibleText("Computer / Technology - Reseller (inc VAR)");
		//select_Indus.selectByValue("Government-National/Federal");
		
		//Select select_Counrty = new Select(driver.findElement(country));
		//select_Counrty.selectByIndex(3);
		
		//doSelectDropdownbyIndex(country, 3);
		//doSelectDropdownbyIndex(industry, 5);
		//doSelectDropDownByVisibleText(industry,"Agriculture / Forestry");
		doSelectDropDownByVisibleText(country, "Algeria");
		doSelectDropDownByValue(industry, "Automotive");
		//doSelectDropdownbyIndex(country, 6);
    }
	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator, int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String visibletext) 
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibletext);
	}
	
	public static void doSelectDropDownByValue(By locator, String Value) 
	{
		Select select = new Select(getElement(locator));
		select.selectByValue(Value);
	}
}
