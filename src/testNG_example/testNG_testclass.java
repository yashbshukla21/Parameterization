package testNG_example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG_testclass {
	
	@Test
	public void openapp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("Opening Amazon Application");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.close();
		Reporter.log("Close Browser");
		
	}
	
	public void openamazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		
		
	}

}
