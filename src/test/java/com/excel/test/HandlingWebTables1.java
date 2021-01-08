package com.excel.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables1 {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Leraning\\Seleniumwithjava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");

	}

}
