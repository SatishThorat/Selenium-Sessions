package testNGSessionByNaveen2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest
{
	
	
	@Test (priority = 1)
	public void getTitle()
	{
		Assert.assertTrue(driver.getTitle().contains("Online Shopping"));
	 }
	
	@Test (priority = 3)
	public void getpageUrlTest() 
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
		
	}
	
}
