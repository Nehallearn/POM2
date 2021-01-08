package com.excel.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMain2 {
	static ExcelReader reader = new ExcelReader("D:\\Leraning\\Seleniumwithjava\\Testdata.xlsx") ;
	static int a = 2;
	
	@Test(dataProvider="data1")
	public void testing1(String A, String B)
	{
		System.out.println(A+ "*****"+B);
		
		reader.setCellData("Sheet1", "Status", a, "BonusId");
		a++;
		
	}
	
	@DataProvider
	public Iterator<Object[]> data1()
	{
		ArrayList<Object[]> data3 = new ArrayList<Object[]>();
		data3 = GetDataUtility.getData();
		return data3.iterator();
		
	}

}
