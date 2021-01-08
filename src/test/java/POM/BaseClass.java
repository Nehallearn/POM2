package POM;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BaseClass {
	
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	
	
	public static WebDriver initialization()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Leraning\\Seleniumwithjava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
			
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//ExtentLogger.info("Brwser Launched successfully info added in base class");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html");
		tdriver.set(driver);
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

}
