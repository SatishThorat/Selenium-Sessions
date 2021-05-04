package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConcepts {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		JavaScriptUtils jsUtil = new JavaScriptUtils(driver);
		System.out.println(jsUtil.getTitleByJS());
		
		// refresh the browser
		//jsUtil.refreshBrowserByJS();
		//To generate the alert
		//jsUtil.generateAlert("this is  my js alert");
		// To get the all page text
		System.out.println(jsUtil.getPageInnerText()); 
		
		WebElement loginElement = driver.findElement(By.xpath("//input[@type='submit']"));
		jsUtil.drawBorder(loginElement);
		//driver.quit();
	}
}
