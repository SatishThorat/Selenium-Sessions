package testNGSessionByNaveen2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


//Search Product Class
public class OpenCartSearchProdAssignment extends OpenCartClassBaseTest
{
	@Test
	public void isSearchExistTest()
	{
		driver.findElement(By.xpath("//span[@id='cart-total']")).isDisplayed();
	}
	
	@Test
	public void searchProductTest()
	{
		driver.findElement(By.xpath("//span[@id='cart-total']")).sendKeys("imac");
		driver.findElement(By.xpath("//div[@id='search']//button[@type='button']")).click();
	}

}
