package POM_WITH_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		
		flipkart_login_page lp = new flipkart_login_page(driver);
		lp.enterEmail();
		lp.enterPass();
		lp.login();
		
		flipkart_home_page hp  = new flipkart_home_page(driver);
		hp.validateusername();
				
		
	}

}
