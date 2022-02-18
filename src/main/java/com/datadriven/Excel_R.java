package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_R {

	private static void particular_Data() throws Throwable  {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mvn_Project\\Excel\\Excel2.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
        Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(3);
		
		Cell cell = row.getCell(1);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)){
			
			String scv = cell.getStringCellValue();
			
			System.out.println(scv);
			
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			
			double ncv = cell.getNumericCellValue();
			
			int value = (int) ncv;
			
			System.out.println(value);
		}
	}
           private static void multiple_Value() throws Throwable {

		
    	   File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mvn_Project\\Excel\\Excel2.xlsx");
    	   
    	   FileInputStream fis1 = new FileInputStream(f);
    	   
    	   Workbook w = new XSSFWorkbook(fis1);
    	   
    	   Sheet sheetAt1 = w.getSheetAt(0);
    	   
    	   
    	   for (int i = 0; i < sheetAt1.getPhysicalNumberOfRows(); i++) {
			
    		   Row row1 = sheetAt1.getRow(i);
    		   
    		   for (int j = 0; j < row1.getPhysicalNumberOfCells(); j++) {
				
    			   Cell cell = row1.getCell(j);
    			   
    			   CellType cellType1 = cell.getCellType();
    			   
    			   if (cellType1.equals(CellType.STRING)) {
					
    				   String scv1 = cell.getStringCellValue();
    				   
    				   System.out.println(scv1);
    				   
				}
    			   
    			   else if (cellType1.equals(CellType.NUMERIC)) {
					
    				   double ncv1 = cell.getNumericCellValue();
    				   
    				   int val = (int) ncv1;
    				   
    				   System.out.println(val);
				}
    			   
   			}
				
		}
    	   
	}	
		public static void main(String[] args) throws Throwable {
			
			particular_Data();
			
			multiple_Value();
			
			
			
		}
}
