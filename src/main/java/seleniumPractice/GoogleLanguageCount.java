package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageCount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");

		List <WebElement> langList = driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
		
		System.out.println(langList.size());
		
		for(WebElement e:langList)
		{
			String textString = e.getText();
			System.out.println(textString);
			
			if(textString.equals("मराठी"))
			{
				e.click();
				
				
			}
		}
	}

}
