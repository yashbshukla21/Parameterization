import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\SHRI\\Desktop\\Selenium Files\\Parameterisation\\demo.xlsx") ;
		
		
		XSSFWorkbook book =  new XSSFWorkbook(file);
		
		boolean b = book.getSheet("Sheet3").getRow(0).getCell(2).getBooleanCellValue();
		
		System.out.println(b);
		
	}

}
