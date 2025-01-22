package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	//To compare between two statement "expected and actual"
	//we use assertions
		
	@Test
	public void test()
	{
		String Expected = "vishesh";
		String Actual = "vishesh";
		Assert.assertEquals(Actual, Expected);
		//System.out.println();
	}
}
