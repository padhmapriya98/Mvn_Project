package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Row {
	
	public static void particula_Row() throws Throwable {
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mvn_Project\\Excel\\Excel2.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int pnc = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < pnc; i++) {
			
			Row row = sheetAt.getRow(i);
			
			Cell cell = row.getCell(1);
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				
				String scv = cell.getStringCellValue();
				
				System.out.println(scv);
				
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				
				double ncv = cell.getNumericCellValue();
				
				int val = (int) ncv;
				
				System.out.println(val);
				
			}
		}
	}
	public static void main(String[] args) throws Throwable {
		
		particula_Row();
		
	}
	
}
