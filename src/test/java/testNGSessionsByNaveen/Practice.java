package testNGSessionsByNaveen;

import org.testng.annotations.Test;

public class Practice
{
	@Test(priority = 1 )
	public void a_test()
	{
		System.out.println("a test");
	}
	
	@Test(priority = 02)
	public void b_test()
	{
		System.out.println("b test");
	}
	
	@Test
	public void c_test()
	{
		System.out.println("c test");
	}
	
	@Test(priority = -1 )
	public void d_test()
	{
		System.out.println("d test");
	}

}
