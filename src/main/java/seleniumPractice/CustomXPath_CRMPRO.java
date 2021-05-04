package seleniumPractice;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXPath_CRMPRO
{
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		selectContactName("David Cris");
		//selectContactName("David Crist");
		System.out.println(selectCompName("David Cris"));
		System.out.println(selectPhoneNumber("David Cris"));
		System.out.println(selectMobileNo("David Cris"));
		System.out.println(selectEmailid("David Cris"));
	
	}

	
	public static String selectContactName(String Name) 
	{
		String xpath = "//a[text()='"+Name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
		return Name;
		
	}
	
	//a[text()='David Cris']/parent/::td/following-sibling::td/a
	public static String selectCompName(String Name) 
	{
		String xpath = "//a[text()='"+Name+"']/parent::td/following-sibling::td/a";
		return driver.findElement(By.xpath(xpath)).getText();
		
	}
	
	public static String selectPhoneNumber(String Name) 
	{
		String xpath = "//a[text()='"+Name+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static String selectMobileNo(String Name) 
	{
		String xpath = "//a[text()='"+Name+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static String selectEmailid(String Name) 
	{
		String xpath = "//a[text()='"+Name+"']/parent::td/following-sibling::td/a";
		return driver.findElement(By.xpath(xpath)).getText();
		
	}
	
	public static List<String> getContactInfo(String Name) {
		String CompName = selectCompName(Name);
		String ContactName = selectContactName(Name);
		String Emailid = selectEmailid(Name);
		String MobileNo = selectMobileNo(Name);
		String PhoneNumber = selectPhoneNumber(Name);
		
		List<String> contactinfoList = new ArrayList<String>();
		contactinfoList.add(PhoneNumber);
		contactinfoList.add(MobileNo);
		contactinfoList.add(Emailid);
		contactinfoList.add(ContactName);
		contactinfoList.add(CompName);
		
		return contactinfoList;
		
		
		
		
		
	}

}
