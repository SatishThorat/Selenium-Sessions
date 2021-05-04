package testNGSessionByNaveen2;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest
{
	@Test (priority = 1)
	
	public void getTitle()
	{
		driver.get("https://www.orangehrm.com/");
		String titelString= driver.getTitle();
		System.out.println(titelString);
		Assert.assertEquals(titelString, "HR Management System | HR Management Software | OrangeHRM");
    }
	
	@Test (priority = 3)
	public void isSpanihLangExistTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right extended-nav']//li/a[text()='ES']")).isDisplayed());
	}
	
	@Test (priority = 2)
	public void getpageUrlTest() 
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm.com/"));
		
	}
	
}
