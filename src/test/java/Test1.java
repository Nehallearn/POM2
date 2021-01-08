import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test1 {
	static WebDriver driver;
	Logger log = Logger.getLogger(Test1.class);
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Leraning\\Seleniumwithjava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
	
	@Test
	public void testmethod1()
	{
		driver.get("https://www.toolsqa.com/selenium-cucumber-framework/read-configurations-from-property-file/");
		System.out.println(driver.getTitle());
		log.info("Hi there, this is log4j");
	}

}
