package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;



public class LoginPage extends BaseClass{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(xpath="//a[normalize-space()='Sign Up']")
	@CacheLookup
	WebElement signupButton;
	
	@FindBy(xpath="//img[@src='https://classic.freecrm.com/img/logo.png']")
	@CacheLookup
	WebElement appLogo;
	@Step("Getting Login page title for Allure Report")
	public String getLoginPageTitile()
	{
		String title= driver.getTitle();
		return title;
	}
	@Step("Verifying Logo login for Allure Report")
	public boolean verifyLogo()
	{
		boolean logo= appLogo.isDisplayed();
		return logo;
	}
	@Step("Entring login credentialsa for Allure Report username: {0} and Password is: {1}")
	public Homepage Login(String u, String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		loginButton.click();
		return new Homepage();
	}

}
