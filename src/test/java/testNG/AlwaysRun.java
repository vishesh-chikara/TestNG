package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

/*AlwaysRun=true(When testNG skip execution of a test case whatever is the reason
but when we want to execute that test case any how)*/

public class AlwaysRun {

	@Test(priority=1, enabled=true,alwaysRun=true)
	public void test1()
	{
		System.out.println("This is first case");
		
	}
	
	@Test(priority=2, enabled=true, dependsOnMethods= {"test1"},alwaysRun=true)
	public void test2()
	{
		System.out.println("this is my second case");
		
	}
	
	@Test(priority=3, enabled=true, dependsOnMethods= {"test1","test2"})
	public void test3()
	{
		System.out.println("this is my third case");
	}
	
}
