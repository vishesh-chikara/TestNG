package tes_tCases;

import org.testng.annotations.Test;

import dataProviderRepo.DataRepo;
//to import the dataproviders class we use "dataProviderClass=classname.class" in annotation

public class Multiple_Testcase {
	
	@Test(dataProviderClass=DataRepo.class, dataProvider="getData")
	public void test1(String Username,int emp_ID, String email, int ph_no)
	{
		System.out.println(Username +""+ emp_ID +""+ email +""+ ph_no );
	}
	
	
	@Test(dataProviderClass=DataRepo.class)
	public void test2(String Username,int emp_ID, String email, int ph_no)
	{
		System.out.println(Username +""+ emp_ID +""+ email +""+ ph_no);
	}
	
	@Test(dataProviderClass=DataRepo.class)
	public void test3(String Username,int emp_ID, String email, int ph_no)
	{
		System.out.println(Username +""+ emp_ID +""+ email +""+ ph_no);
	}
	
	@Test(dataProviderClass=DataRepo.class)
	public void test4(String Username,int emp_ID, String email, int ph_no)
	{
		System.out.println(Username +""+ emp_ID +""+ email +""+ ph_no);
	}
	
	
	

}
