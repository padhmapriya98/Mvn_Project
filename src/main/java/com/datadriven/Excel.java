package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void read_Excel() throws Throwable {
       
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mvn_Project\\Excel\\Excel2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String scv = cell.getStringCellValue();
					System.out.println(scv);
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double ncv = cell.getNumericCellValue();
					int value = (int) ncv;
					System.out.println(value);
				}
			}
		}
	}
    public static void main(String[] args) throws Throwable {
	read_Excel();
}
}
