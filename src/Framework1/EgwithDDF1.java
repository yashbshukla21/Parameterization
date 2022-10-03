package Framework1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EgwithDDF1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		FileInputStream file = new FileInputStream("C:\\Users\\SHRI\\Desktop\\Selenium Files\\Parameterisation\\DEMO.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("Sheet4");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		
		String user = sheet.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys(user);
		
		String password= sheet.getRow(0).getCell(1).getErrorCellString();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(2000);
		WebElement login =driver.findElement(By.xpath("(//div[@class=\"exehdJ\"])[1]"));
		String actualID = login.getText();
		System.out.println(actualID);
		String expectedID = "Yash";
		if(actualID.equalsIgnoreCase(expectedID)) {
			
			System.out.println("Test case is Passed");
		}
		else {
			
			System.out.println("Test case is Failed");
			
		}
	}

}


