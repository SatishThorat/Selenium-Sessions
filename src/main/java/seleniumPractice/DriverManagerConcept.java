package seleniumPractice;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerConcept {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup(); // ChromeDriver
		//WebDriver driver=new ChromeDriver();     // ChromeDriver
		
		WebDriverManager.firefoxdriver().setup();  // Firefox driver
		WebDriver driver=new FirefoxDriver();      // firefox driver
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
