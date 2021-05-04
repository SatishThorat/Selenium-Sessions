package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasic {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish Thorat\\Documents\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("page title is :" +title);
		
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
		
		else
		{
			System.out.println("incorrect title");
		}
		
	
		
	}

} 





