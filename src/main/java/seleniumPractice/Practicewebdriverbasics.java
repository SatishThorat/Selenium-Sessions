package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicewebdriverbasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish Thorat\\Documents\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gworkassign.co.in/Index.aspx");
		String titele=driver.getTitle();
		driver.getCurrentUrl();
		System.out.println("title of the page is:"+titele);
		
		if(titele.equals("Graficali Work Assignments"))
		{
			System.out.println("correct title");
		}
		
		else {
			System.out.println("wrong title");
		}
		
		//driver.quit();
	}

}
