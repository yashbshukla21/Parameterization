import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

import POM_PageFactory_DDF.flipkart_home_page;
import POM_PageFactory_DDF.flipkart_login_page;

public class FlipKartTestClass {
	
	
	WebDriver driver;
	@BeforeSuite
	public void Openbrowser()
	{
		Reporter.log("Open Browser",true);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void zoominginbrowser()
	{
		Reporter.log("Zoom in browser",true);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void openapp()
	{
		Reporter.log("Open the Application",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
	}
	@BeforeMethod
	public void login() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\SHRI\\Desktop\\Selenium Files\\Parameterisation\\DEMO.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet4");
        
		String username=sheet.getRow(0).getCell(0).getStringCellValue();
		String password=sheet.getRow(0).getCell(1).getStringCellValue();
		flipkart_login_page lp = new flipkart_login_page  (driver);
	    lp.enterEmail(username);
		lp.enterPass(password);
		lp.login();
		
	}
	
	@Test
	public void testclass() throws InterruptedException
	{
		Reporter.log("Test class is executing",true);
		Thread.sleep(2000);
		flipkart_home_page hp  = new flipkart_home_page  (driver);
		hp.validateusername();
	}
	
	@AfterMethod
	public void logout()
	{
	Reporter.log("Logout Succesfull",true);
	}
	
	@AfterClass
	public void closeapplication()
	{
		Reporter.log("closing application",true);
	}
	@AfterTest
	public void closingbrowser()
	{
		Reporter.log("close the browser",true);
		driver.close();
	}
	
	@AfterSuite
	public void Changebrowser()
	{
		Reporter.log("Changing the browser",true);
	}
}
