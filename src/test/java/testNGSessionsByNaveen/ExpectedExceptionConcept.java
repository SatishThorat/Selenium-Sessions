package testNGSessionsByNaveen;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept 
{
	String name;
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void testmethodTest()
	{
		System.out.println("this is the test method");
		//int i=9/0;
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj=null;
		obj.name="login test";
		System.out.println(obj.name);
	}

}
