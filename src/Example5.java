import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("C:\\Users\\SHRI\\Desktop\\Selenium Files\\Parameterisation\\demo.xlsx") ;
		
		
		XSSFWorkbook book =  new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowsize = book.getSheet("Sheet1").getLastRowNum()+1;
		System.out.println(rowsize);
		
		int colsize = book.getSheet("Sheet1").getRow(0).getLastCellNum()+1;
		
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
			{
				String str=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(str+"  ");
			}
			System.out.println();
		}

		
	}

	}
