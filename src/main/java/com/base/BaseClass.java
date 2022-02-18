package com.base;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseClass {
	
	public static WebDriver driver;
	
	public static  String value;
	
	public static WebDriver getBrowser(String name) {

		if (name.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver1\\chromedriver.exe");
		
			driver = new ChromeDriver();
		}
	
		return driver;
		
	}
    public static void geturl(String url) {

    	driver.get(url);
    	
	}
	public static void elementclick(WebElement element ) {

		element.click();
		
	}
	public static void inputvalue(WebElement element, String value) {

		element.sendKeys(value);
		
	}
   
    public static void close() {
      
    	driver.close();
    	
	}
    public  static String particular_value(String path, int row_Index, int cell_Index) throws Throwable  {

    File f = new File(path);
    
    FileInputStream fis = new FileInputStream(f);
    
    Workbook w1 = new XSSFWorkbook(fis);
    
    Sheet sheet = w1.getSheet("Sheet3");
    	
    Row row = sheet.getRow(row_Index);
    
    Cell cell = row.getCell(cell_Index);
    
    CellType cellType = cell.getCellType();
    
    if (cellType.equals(CellType.STRING)) {
		
    	value = cell.getStringCellValue();
	}
    else if (cellType.equals(CellType.NUMERIC)) {
    	
    	double ncv = cell.getNumericCellValue();
		
    	int val = (int) ncv;
    	
    	value = String.valueOf(val);
	}
         return value;
    
 
    	
	}
}
