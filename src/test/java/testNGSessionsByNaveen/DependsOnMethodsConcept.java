package testNGSessionsByNaveen;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept
{
	@Test
	public void loginTest()
	{
		System.out.println("login Test");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods ="loginTest" )
	public void homeTest()
	{
		System.out.println("home Test");
	}
	
	@Test(dependsOnMethods ="loginTest" )
	public void searchTest()
	{
		System.out.println("search Test");
	}

}
