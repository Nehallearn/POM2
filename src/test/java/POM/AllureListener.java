package POM;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class AllureListener implements ITestListener {
	
	private static String getTestMethodName(ITestResult result)
	{
		return result.getMethod().getConstructorOrMethod().getName();
	}
	//Text attachment for allure
	@Attachment(value = "Page Screenshot",type = "image/png")
	public byte[] allurescreenshot(WebDriver driver)
	{
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	//Text attachment for allure
	@Attachment(value = "{0}", type = "text/plain")
	public static String alluretextLog(String message)
	{
		return message;
	}
	
	//html attachment
	@Attachment(value = "{0}", type = "text/html")
	public static String allureattachHtml(String html)
	{
		return html;
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I amon success method"+getTestMethodName(result)+" passed");
		Object testClass = result.getInstance();
		WebDriver driver = BaseClass.getDriver();
		// Allure ScreenShotRobot and SaveTestLog
				if (driver instanceof WebDriver) {
					System.out.println("Screenshot captured for test case:" + getTestMethodName(result));
					 allurescreenshot(driver);
				}
				// Save a log on allure.
				alluretextLog(getTestMethodName(result) + " passed and screenshot taken!");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I amon failure method"+getTestMethodName(result)+" failed");
		Object testClass = result.getInstance();
		WebDriver driver = BaseClass.getDriver();
		// Allure ScreenShotRobot and SaveTestLog
				if (driver instanceof WebDriver) {
					System.out.println("Screenshot captured for test case:" + getTestMethodName(result));
					 allurescreenshot(driver);
				}
				// Save a log on allure.
				alluretextLog(getTestMethodName(result) + " failed and screenshot taken!");	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
