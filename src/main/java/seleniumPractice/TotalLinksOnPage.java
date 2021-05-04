package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksOnPage
{
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//List<WebElement> linkList=   driver.findElements(By.tagName("a"));
		
		By linksBy = By.tagName("a");
		List<WebElement> linkList= getElements(linksBy);
		
		System.out.println(linkList.size());
		
		List<String> linksElements = getElementTextList(linksBy);
		for (String e : linksElements)
		{
			System.out.println(e);
		}
		/*
		 * for(int i=0;i<linkList.size();i++)
		 *  { 
		 *  String Linktext=linkList.get(i).getText();
		 * 
		 * if(!Linktext.isEmpty()) 
		 * { 
		 * System.out.println(i+ " " + Linktext);
		 *  }
		 * 
		 * for (WebElement e : linkList)
		 *  { 
		 *  String hrefvalue = e.getAttribute("href");
		 * System.out.println(hrefvalue);
		 * 
		 * }
		 */
		}
		
	
	
	public static List<WebElement> getElements(By loacator) 
	{
		return driver.findElements(loacator);
	}
	
	public static List<String> getElementTextList(By loacator) 
	{
		List<String> eletextList=new ArrayList<String>();
		List<WebElement> elements= getElements(loacator);
		for(WebElement e: elements)
		{
			eletextList.add(e.getText());
		}
		return eletextList;
	}

}
