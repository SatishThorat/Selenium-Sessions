package testNGSessionByNaveen2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//Accounts Page Class
public class OpenCartAccountsPageAssignment extends OpenCartClassBaseTest
{
	@Test
	public void getPageTitle()
	{
		String titleString = driver.getTitle();
		Assert.assertEquals(titleString, "My Account");
	}
	
	@Test
	public void isSearchExist()
	{
		driver.findElement(By.xpath("//span[@id='cart-total']")).isDisplayed();
	}
	
	@Test
	public void getPageUrl()
	{
		String urlString = driver.getCurrentUrl();
		Assert.assertEquals(urlString, "account/account");
	}
}
