package com.client.vtiger.generic.excelUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable {
		
		
		// if we have multiple excel sheet, so we can pass that as an argument/parameter
		
		FileInputStream fis = new FileInputStream("./Test_Data/Test script data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		wb.close();
		return data;
		
	}
		
		public int getRowCount(String sheetName) throws Throwable {
			
			FileInputStream fis = new FileInputStream("./Test_Data/Test script data.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			
			int rowCount = wb.getSheet(sheetName).getLastRowNum();	
			
			wb.close();
			return rowCount;
			
			
		}
		
		
		
		public void setDataIntoExcel(String sheetName, int rowNum, int cellNum, String data) throws Throwable {
			
			FileInputStream fis = new FileInputStream("./Test_Data/Test script data.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			
			wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum);
			
			FileOutputStream fos = new FileOutputStream("./Test_Data/Test script data.xlsx");
			
			wb.write(fos);
			wb.close();
			
			
			
		}
		
		
		
	}

