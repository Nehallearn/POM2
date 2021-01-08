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
public class Homepagetest extends BaseClass{
	
	LoginPage loginpage;
	Homepage homepage;
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.Login("learn5151", "India123");
		
	}
	
	@Test(priority=1, description="Test NG Decription This test case is to verify Homepage Title.")
	@Severity(SeverityLevel.NORMAL)
	@Description("This decriopn for homepage title from Allure Report")
	@Story("Allure Report User Stories 1")
	public void verifyHomePageTitle()
	{
		String title = homepage.verifyHomepagetitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"CRMPRO","Home page title is not matching please check." );
		
		
		
	}
	@Test(priority=2, description="Test NG Decription Logged user validation.")
	@Severity(SeverityLevel.NORMAL)
	@Description("This decriopn for logged user validation from Allure Report")
	@Story("Allure Report User Stories 3")
	public void loggeduserValidation()
	{
		driver.switchTo().frame("mainpanel");
		String user = homepage.verifyLoggedUser();
		Assert.assertEquals("  User: XLearnfirst Learnlast", user);
		
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
