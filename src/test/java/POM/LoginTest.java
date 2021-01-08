package POM;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Listeners(AllureListener.class)
public class LoginTest extends BaseClass {
	
	//username=learn5151
	//password=India123
	
	LoginPage loginpage;
	Homepage homepage;
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	@Severity(SeverityLevel.CRITICAL)
	@Description("This decriopn for Login title from Allure Report")
	@Story("Allure Report User Stories 2 fr login")
	public void loginPagetitleTest()
	{
		//ExtentReport.creaTest("loginPagetitleTest");
		String title = loginpage.getLoginPageTitile();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		
	}
	
	@Test(priority=2,description="Test NG Decription This test case for Logo validation.")
	@Severity(SeverityLevel.NORMAL)
	@Description("This decriopn for logged user from Allure Report")
	@Story("Allure Report User Stories 4")
	public void logovalidation()
	{
		//ExtentReport.creaTest("logovalidation");
		boolean b = loginpage.verifyLogo();
		Assert.assertTrue(b);
	
	}
	
    @Test(priority=3, description="Test NG Decription This test for login.")
    @Severity(SeverityLevel.BLOCKER)
	@Description("This is login test from Allure Report")
	@Story("Allure Report User Stories 5")
    public void login()
    {
    	//ExtentReport.creaTest("login");
    	homepage = loginpage.Login("learn5151", "India123");
    }
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
