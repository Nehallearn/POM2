package com.excel.test;

import java.util.ArrayList;

public class GetDataUtility {
	static ExcelReader reader;
	
	public static ArrayList<Object[]> getData(){
	ArrayList<Object[]> data = new ArrayList<Object[]>();
	reader = new ExcelReader("D:\\Leraning\\Seleniumwithjava\\Testdata.xlsx");
	
	for(int rowcount =2;rowcount<=reader.getRowCount("Sheet1");rowcount++)
	{
		String username = reader.getCellData("Sheet1", "username", rowcount);
		String password = reader.getCellData("Sheet1", "password", rowcount);
		Object ob[] = {username,password};
		data.add(ob);
	}
	return data;
	
	}

}
