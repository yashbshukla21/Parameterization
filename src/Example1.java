import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example1 {

	public static void main(String[] args) throws IOException {
		
	// Create a new object of FileInputStream Class. Provide the path of excel sheet as an argument to constructor of this class. Store it in a variable for ex, file. 
	FileInputStream file = new FileInputStream("C:\\Users\\SHRI\\Desktop\\Selenium Files\\Parameterisation\\demo.xlsx") ;
			
	//Use create new object of XSSFWorkbook and provide above file variable as input. This will open the excel sheet. 
	//XSSF-XML SpreadSheet format
	
	XSSFWorkbook book = new XSSFWorkbook(file);

	//To navigate on particular sheet use method get sheet(“Sheet Name”). 
	
	XSSFSheet Sheet = book.getSheet("Sheet1");
	
	//to go to particular row use method getRow(int value). 
	
    XSSFRow row = Sheet.getRow(0);
    
    //To go to particular column use method getCell(int value) 
    
    XSSFCell Cell= row.getCell(0);
    
    //To get string value present in sheet use method getStringCellValue(). 
    
    String str =  Cell.getStringCellValue();
    
    System.out.println(str);
    
	}

}
