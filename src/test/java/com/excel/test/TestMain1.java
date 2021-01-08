package com.excel.test;

public class TestMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelReader reader = new ExcelReader("D:\\Leraning\\Seleniumwithjava\\Testdata.xlsx");
		int x = reader.getRowCount("Sheet1");
		int z = reader.getColumnCount("Sheet1");
		System.out.println("Number of row count is   "+x);
		String y = reader.getCellData("Sheet1", "username", 2);
		System.out.println(y);
		reader.addColumn("Sheet1", "Status");
		for(int a=2;a<=x;a++)
		{
			for(int b=0;b<z;b++)
			{
				String data = reader.getCellData("Sheet1", b,a);
				System.out.println(data);
				reader.setCellData("Sheet1", "Status", a, "Pass");
			}
		}

	}

}
