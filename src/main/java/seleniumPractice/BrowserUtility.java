package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility 
{
	WebDriver driver;
	
	/**
	 * 
	 * @param browsername
	 * @return this method returns the driver.
	 */
	public WebDriver init_driver (String browsername)
	{
		System.out.println("Browser Name:"+browsername );
		switch (browsername)
		{
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish Thorat\\Documents\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Satish Thorat\\Documents\\Selenium Training\\chromedriver_win32\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			System.out.println("Kindly provide broser name:" +browsername);
			break;
		}
		
		return driver;
	}
	
	public void launchurl(String url)
	{
		driver.get(url);
	}
	
	public String gettitle()
	{
		return driver.getTitle();
	}
	
	public void getpageurl(String url) 
	{
		driver.getCurrentUrl();
	}
	
	public  void closebrowser() 
	{
		driver.close();
	}
	
	public void quitbrowser() 
	{
		driver.quit();
		
	}
	
}
