package seleniumPractice;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GraficaliGwork {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gworkassign.co.in/Index.aspx");
		
		String titleString = driver.getTitle();
		System.out.println(titleString);
		
		By username = (By.xpath("//input[@name='txtUser']"));
		By password = (By.xpath("//input[@type='password']"));
		By login = (By.xpath("//input[@id='btnLogin']"));
		
		driver.findElement(username).sendKeys("satish");
		driver.findElement(password).sendKeys("satishgraf");
		driver.findElement(login).click();
		
		List <WebElement> gwork = driver.findElements(By.xpath("//span[@class='LargeText' and @style=\"font-weight:bold;\"]"));
		System.out.println(gwork.size());
		
		for (WebElement e : gwork) 
		{
			String work= e.getText();
			System.out.println(work);
			
		}
		

	}

}
