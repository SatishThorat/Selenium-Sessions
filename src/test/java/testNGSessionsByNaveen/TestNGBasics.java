package testNGSessionsByNaveen;

import org.testng.annotations.BeforeSuite;

public class TestNGBasics 
{
	
	@BeforeSuite
	public void createuserinDB()
	{
		System.out.println("test");
	}
	
}