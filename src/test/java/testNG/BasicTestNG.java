package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNG {
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is before Suite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is before Suite");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is before Suite");
	}
	
	@Test
	public void Case1()
	{
		System.out.println("This is before Suite");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is before Suite");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is before Suite");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is before Suite");
	}
	
}
