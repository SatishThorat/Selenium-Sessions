package seleniumPractice;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	static WebDriver driver=null;
	public static void main(String[] args) {
		
		String browser="Firefox";
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Satish Thorat\\Documents\\Selenium Training\\chromedriver_win32\\chromedriver.exe\\");
			driver=new ChromeDriver();
		}
		else if (browser.equals("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Satish Thorat\\Documents\\Selenium Training\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else 
		{
			System.out.println("kindly provide browser name");
		}
		driver.get("https://www.google.com");
		driver.getCurrentUrl();
		String title=driver.getTitle();
		if (title.equals("Google"))
		{
			System.out.println("correct title");
		}
		
		else 
		{
			System.out.println("in correct title");
		}
		driver.close();
		
	}


}
