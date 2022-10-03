import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example2 {

	public static void main(String[] args) throws IOException {
		FileInputStream file =  new FileInputStream ("C:\\Users\\SHRI\\Desktop\\Selenium Files\\Parameterisation\\demo.xlsx");
        
		XSSFWorkbook book =  new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("Sheet2");
		
		//XSSFRow row = sheet.getRow(0);
		//XSSFCell col = row.getCell(1);
		//double d = col.getNumericCellValue();
		
		//Combine the steps
		
		double d = sheet.getRow(0).getCell(2).getNumericCellValue();
	    
	    System.out.println(d);
		
		}


	}


