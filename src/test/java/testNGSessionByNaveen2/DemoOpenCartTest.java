package testNGSessionByNaveen2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoOpenCartTest extends BaseTest
{
	
	@Test (priority = 1)
	public void getTitle()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String titelString= driver.getTitle();
		System.out.println(titelString);
		Assert.assertEquals(titelString, "Account Login");
    }
	
	@Test (priority = 2)
	public void getpageUrlTest() 
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));
		
	}
	
}
