package testNG_example;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	@BeforeSuite
	public void Openbrowser()
	{
		Reporter.log("Open Browser",true);
	}
	
	@BeforeTest
	public void zoominginbrowser()
	{
		Reporter.log("Zoom in browser",true);
	}
	@BeforeClass
	public void openapp()
	{
		Reporter.log("Open the Application",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login Succesfull",true);
	}
	
	@Test
	public void testclass()
	{
		Reporter.log("Test class is executing",true);
	}
	
	@AfterMethod
	public void logout()
	{
	Reporter.log("Logout Succesfull",true);
	}
	
	@Test
	public void testclass2()
	{
		Reporter.log("Test class of groceries",true);
	}
	
	@AfterClass
	public void closeapplication()
	{
		Reporter.log("closing application",true);
	}
	@AfterTest
	public void minimizebrowser()
	{
		Reporter.log("Code for minimizing browser",true);
	}
	
	@AfterSuite
	public void closingbrowser()
	{
		Reporter.log("Closing the browser",true);
	}

}
