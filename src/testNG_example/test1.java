package testNG_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}
