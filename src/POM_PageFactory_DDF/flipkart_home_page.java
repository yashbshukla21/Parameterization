package POM_PageFactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_home_page {
	@FindBy(xpath="(//div[@class=\"exehdJ\"])[1]")private  WebElement username;


    public flipkart_home_page(WebDriver driver)
{
  	  PageFactory.initElements(driver, this);
  	  
}
    
    public void validateusername()
    {
  	 String actual = username.getText();
  	 String expected = "Yash";
  	 if (actual.equalsIgnoreCase(expected)) {
  		 System.out.println("Test case is Failed");
  	 }
  	 else {
  		 System.out.println("Test case is Pass");
  	 }
    }
    

}
