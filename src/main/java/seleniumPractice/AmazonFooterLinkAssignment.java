package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterLinkAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		List <WebElement> footerlink = driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//a"));
		
		System.out.println(footerlink.size());
		
		for (WebElement e : footerlink) 
		{
			String textString = e.getText();
			System.out.println(textString);
		}
		

	}

}
