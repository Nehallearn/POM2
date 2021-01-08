package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;



public class Homepage extends BaseClass {
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),\"User: Learnfirst Learnlast\")]")
	@CacheLookup
	WebElement loggedUser;
	
	@FindBy(css="a[title='Contacts']")
	@CacheLookup
	WebElement contactLink;
	
	@FindBy(css="a[title='New Contact']")
	@CacheLookup
	WebElement newContactLink;
	
	@FindBy(css="a[title='Deals']")
	@CacheLookup
	WebElement dealLink;
	
	
	   
	@Step("Verifying home page title for Allure Report")
	public String verifyHomepagetitle()
	{
		return driver.getTitle();
	}
	
	
	@Step("Cliccking on new Contact link for Allure Report")
	public void clickOnNewContactsLink()
	{
		Actions action  = new Actions(driver);
		action.moveToElement(contactLink).build().perform();
		newContactLink.click();
		//return new ContactsPage();
	}
	
	@Step("Verifying Logged user for Allure Report")
	public String verifyLoggedUser()
	{
		return loggedUser.getText();
	}

}
