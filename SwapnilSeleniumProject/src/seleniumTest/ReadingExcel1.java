package seleniumTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel1 {

	public static void main(String[] args) throws Exception {
		
		//Specify Location of the file
		
		File src = new File("D:\\TestExcel.xlsx");
		
       //Load File
		FileInputStream fis = new FileInputStream(src);
		 
		//Load WorkBook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// Load Worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//Print the loaded sheet name
		System.out.println(sh.getSheetName());
		
		
		System.out.println(sh.getRow(2).getCell(2));
		

		System.out.println(sh.getRowSumsBelow());
	
		
	}

}
