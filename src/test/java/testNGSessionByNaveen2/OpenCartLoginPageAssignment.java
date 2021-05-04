package testNGSessionByNaveen2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
// Login Page Class
public class OpenCartLoginPageAssignment extends OpenCartClassBaseTest
{
	@Test
	public void getTitleTest()
	{
		String titleString = driver.getTitle();
		Assert.assertEquals(titleString, "Account Login");
	}
	
	@Test
	public void getHeaderTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='col-sm-4']//a")).isDisplayed());
	}

	@Test
	public void doLogin()
	{
		driver.findElement(By.name("email")).sendKeys("tester@yahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("Tester123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
