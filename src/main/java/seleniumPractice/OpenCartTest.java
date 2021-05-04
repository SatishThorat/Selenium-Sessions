package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
   public class OpenCartTest {
     public static void main(String[] args)
	{
		BrowserUtility br =new BrowserUtility();
		WebDriver driver = br.init_driver("chrome");
		br.launchurl("https://demo.opencart.com/index.php?route=account/register");
	
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailid =By.id("input-email"); 
		By telephone = By.id("input-telephone");
		By password=By.id("input-password");
		By conPass = By.id("input-confirm");
		ElementUtil elementUtil=new ElementUtil(driver);
		elementUtil.doSendKeys(firstName, "Satish");
		elementUtil.doSendKeys(lastName, "Thorat");
		elementUtil.doSendKeys(emailid, "satish@gmail.com");
		elementUtil.doSendKeys(telephone, "9876543210");
		elementUtil.doSendKeys(password, "satish@123");
		elementUtil.doSendKeys(conPass,  "satish@123");
		String title=br.gettitle();
		System.out.println(title);
		if(title.equals("Register Account"))
		{
			System.out.println("correct title");
		}
		else 
		{
			System.out.println("wrong title");
		}
		if(password.equals(conPass))
		{
			System.out.println("this is valid password");
		}
		else
		{
			System.out.println("password not matched");
		}
		//br.closebrowser();
		br.quitbrowser();
		
		
		
		
	}

}
