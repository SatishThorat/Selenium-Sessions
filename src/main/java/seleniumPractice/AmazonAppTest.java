package seleniumPractice;

public class AmazonAppTest {

	public static void main(String[] args) {
		
		BrowserUtility br=new BrowserUtility();
		br.init_driver("chrome");
		br.launchurl("https://www.amazon.com");
		String tittle=br.gettitle();
		System.out.println(tittle);
		if(tittle.contains("Online Shopping"))
		{
			System.out.println("correct title");
		}
		else 
		{
			System.out.println("invalid title");
		}
		br.closebrowser();
	}

}
