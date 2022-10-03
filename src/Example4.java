import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\SHRI\\Desktop\\Selenium Files\\Parameterisation\\demo.xlsx") ;
		XSSFWorkbook book =  new XSSFWorkbook(file);
		// get rowsize
		
		int rowsize = book.getSheet("Sheet1").getLastRowNum()+1;
		System.out.println(rowsize);
		
		// get cellsize
		
		int colsize = book.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(colsize);
	}

}
