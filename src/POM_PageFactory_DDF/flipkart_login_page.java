package POM_PageFactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_login_page {
	
	@FindBy(xpath="//input[@class=\"_2IX_2- VJZDxU\"]") private WebElement user;
	@FindBy(xpath="//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")private WebElement  Paasword;
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]") private WebElement Login;
	
	// create constructor to run the driver method
	
	
	public flipkart_login_page (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	// Utlize within a method with access level public
	
	public void enterEmail(String email)
	{
		user.sendKeys(email);
	}
	public void enterPass(String pass)
	{
		Paasword.sendKeys(pass);
	}
	public void login()
	{
		Login.click();
	}


}
