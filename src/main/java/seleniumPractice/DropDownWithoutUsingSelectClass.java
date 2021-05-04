package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutUsingSelectClass
{
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country  = By.id("Form_submitForm_Country");
		By countryOptions = By.cssSelector("select#Form_submitForm_Country option");
		
		Select select = new Select(driver.findElement(industry));
		System.out.println(select.isMultiple());
		
		//List <WebElement> list = driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
		
		doSelectDropDownWithoutSelect(countryOptions, "India");
		
	}
	
	public static void doSelectDropDownWithoutSelect(By locator, String value) 
	{
		
		List<WebElement> list = driver.findElements(locator);
		
		for(WebElement e : list)
		{
			if(e.getText().equals(value))
			{
				e.click();
				break;
			}
			
			
		}
		
	}

}
