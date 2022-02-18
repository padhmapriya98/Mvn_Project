package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_W {

	public static void write_Data() throws Throwable {
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mvn_Project\\Excel\\Excel2.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		w.createSheet("Data1").createRow(0).createCell(0).setCellValue("product");
		
		w.getSheet("Data1").getRow(0).createCell(1).setCellValue("price");
		
		w.getSheet("Data1").createRow(1).createCell(0).setCellValue("computer");

		w.getSheet("Data1").getRow(1).createCell(1).setCellValue("20000");
		
		w.getSheet("Data1").createRow(2).createCell(0).setCellValue("mouse");
		
		w.getSheet("Data1").getRow(2).createCell(1).setCellValue("500");
		
		w.getSheet("Data1").createRow(3).createCell(0).setCellValue("keyboard");
		
		w.getSheet("Data1").getRow(3).createCell(1).setCellValue("1000");
		
		w.getSheet("Data1").createRow(4).createCell(0).setCellValue("laptop");
		
		w.getSheet("Data1").getRow(4).createCell(1).setCellValue("25000");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
			
		System.out.println("Excel can be created successfully");
	}
	
	public static void main(String[] args) throws Throwable {
		
		write_Data();
		
	}
	
}
