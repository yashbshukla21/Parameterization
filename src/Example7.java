import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

FileInputStream file = new FileInputStream("C:\\Users\\SHRI\\Desktop\\Selenium Files\\Parameterisation\\demo.xlsx") ;
		
		
		XSSFWorkbook book =  new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
	
		
		sheet.getRow(2).getCell(1).getCellType();
		
		System.out.println(sheet);
	}

}
