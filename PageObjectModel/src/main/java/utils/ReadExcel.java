package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel {

	public static String[][]  getExceldata(String name) throws IOException  {
			
		XSSFWorkbook wbook = new XSSFWorkbook("data/"+name+".xlsx");
		
		XSSFSheet sheetno = wbook.getSheetAt(0);
		
		//int rowcount = sheetno.getPhysicalNumberOfRows();	
		
		int rowcount = sheetno.getLastRowNum();
		
		System.out.println(rowcount);		
		int columscount = sheetno.getRow(0).getLastCellNum();
		
		System.out.println(columscount);
		
		String array[] [] = new String[rowcount][columscount];
		
		for(int i = 1 ; i <= rowcount ; i ++)
		{
			XSSFRow row = sheetno.getRow(i);
			for(int j = 0 ; j < columscount ; j ++)
			{
				array[i-1][j] = row.getCell(j).getStringCellValue();
			}
			 
		}
		return array;
	}

}
