package POM_PageFactory_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_PageFactory_DDF.flipkart_home_page;
import POM_PageFactory_DDF.flipkart_login_page;

public class Testclass {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRI\\Desktop\\Selenium Files\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		FileInputStream file = new FileInputStream("C:\\Users\\SHRI\\Desktop\\Selenium Files\\Parameterisation\\DEMO.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet4");
        
		String username=sheet.getRow(0).getCell(0).getStringCellValue();
		String password=sheet.getRow(0).getCell(1).getStringCellValue();
		
		
		flipkart_login_page lp = new flipkart_login_page  (driver);
	    lp.enterEmail(username);
		lp.enterPass(password);
		lp.login();
		Thread.sleep(2000);
		flipkart_home_page hp  = new flipkart_home_page  (driver);
		hp.validateusername();
	}

}
