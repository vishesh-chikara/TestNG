package testNG;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void test1()
	{
		SoftAssert Softassert = new SoftAssert();
		int i=10 ;
		int j=34;
		System.out.println("Sum is :"+ ""+ (i+j) );
		
	}

}
