package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdcompReportsTotalLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://4.municipal.cc/adcomp/DashBoard.aspx");
		
		
		//driver.findElement(By.xpath("//div")
				
		driver.findElement(By.xpath("//div[@class='bCAAsb']/child::input[@type='email']")).sendKeys("");
		//driver.findElement(By.xpath("//input[contains(@name,'identifier']"));
		//driver.findElement(By.xpath("//input[@name='identifier']/../../../../..")).sendKeys("abc.com");
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("");
		
		//#identifierId
		//driver.findElement(By.xpath("//input[contains(@class,'VfPpkd-RLmnJb')]")).click();
		/*
		 * List <WebElement> headersElements = driver.findElements(By.tagName("a"));
		 * 
		 * System.out.println(headersElements.size());
		 * 
		 * for(int i=0;i<headersElements.size();i++) { String linkstextElements =
		 * headersElements.get(i).getText(); if(!linkstextElements.isEmpty()) {
		 * System.out.println(linkstextElements); } }
		 */
		//*[@id="identifierId"]
		
	}

}//input[@type='email']/../../../../..
//input[@type='email']
