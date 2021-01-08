package com.Log4j.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2forLog4j {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Leraning\\Seleniumwithjava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/selenium-cucumber-framework/read-configurations-from-property-file/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
