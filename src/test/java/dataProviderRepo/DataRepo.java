package dataProviderRepo;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataRepo {
	
	@DataProvider
	
	public static Object[][]getData(Method name)
	{
		System.out.println("Test case for the method " + name.getName());
		Object[][] data=new Object[3][4];
		
			data[0][1]="User";
			data[0][2]="101";
			data[0][3]="abc@gmail.com";
			data[0][4]="99999999";
		
			data[1][1]="User1";
			data[1][2]="102";
			data[1][3]="xyz@gmail.com";
			data[1][4]="8888888888";
		
			data[2][1]="User2";
			data[2][2]="103";
			data[2][3]="pqr@gmail.com";
			data[2][4]="7777777777";
		
		return data;
		
	}

}
