package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {
	
	public static WebDriver driver ;
	
	@Test(dataProvider="create")
	public void loginTest(String Username , String Password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("user-name")).sendKeys(Username);
		System.out.println(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		System.out.println(Password);
		driver.findElement(By.id("login-button")).click();
		}
		
		
	@DataProvider(name="create")
	public Object[][] dataset()
	{
		return new Object[][]
		
		{
			{"vishesh@gmail.com", "pass123"},
			{"vishesh2@gmail.com", "pass321"},
			{"vishesh3@gmail.com", "pass0123"}
		};
		
	}
		
}
