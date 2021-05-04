package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> imagecount = driver.findElements(By.tagName("img"));
		
		System.out.println(imagecount.size());
		
		for (WebElement e : imagecount)
		{
			String alvalue = e.getAttribute("alt");
			String srcvalue = e.getAttribute("src");
			System.out.println(alvalue);
			System.out.println(srcvalue);
		}

	}

}
