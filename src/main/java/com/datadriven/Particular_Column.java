package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Column {
	
	public static void particular_Column() throws Throwable {
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mvn_Project\\Excel\\Excel2.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(2);
		
		int pnc = row.getPhysicalNumberOfCells();
		
		for (int i = 0; i < pnc; i++) {
			
			Cell cell = row.getCell(i);
			
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
		
		particular_Column();
		
		System.out.println("particular column");
		
	}
}
