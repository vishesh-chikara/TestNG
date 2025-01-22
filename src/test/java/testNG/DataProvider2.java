package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider2 {
	
	
	public static WebDriver driver; //create global WebDriver
	public static SoftAssert softassert = new SoftAssert();
	
	@Test(dataProvider="Login")
	public void login(String Username , String Password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		softassert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
		softassert.assertAll();
		driver.close();
	}
	
			@DataProvider(name="Login")
		public 	Object[][]getdata()
		{
			
			Object[][]data=
				{
						{"student","Password123"},
						{"incorrectUser ","Password123 "},
						{"student ","incorrectPassword "}};
						
						return data;
				
		}
		
		}

