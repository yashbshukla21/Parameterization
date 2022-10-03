package Crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTestinEg {
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	
	@Parameters("browser")
	@Test
	public void m1(String browser) throws InterruptedException
	{
		WebDriver driver = null;
		if (browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
			driver = new ChromeDriver();
	    }
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		     driver = new ChromeDriver();
        }
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new ChromeDriver();
	    }
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.close();
	}
		
	

}
