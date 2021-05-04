package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSession {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> linkList=   driver.findElements(By.xpath("//*[@id=\"gbwa\"]/div/a"));
		
		System.out.println(linkList.size());
		
		for (WebElement e : linkList)
		{
			String text = e.getText();
			System.out.println(text);
		}
	}
	}



