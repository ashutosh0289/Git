package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.TestBase.TestBase;



public class Util extends TestBase{

	 public static long PAGE_LOAD_TIMEOUT=50;
	 public static long IMPLICIT_WAIT=50;
	 //public static long EXPLICIT_WAIT=30;
	 public static String TestData_Sheet_Path="G:/TestNewData.xlsx";
	 static Workbook book;
	 static Sheet sheet;
	
	 
	 
	 
	 
	 public static Object[][] getTestData(String sheetName) {
			FileInputStream file = null;
			try {
				file = new FileInputStream(TestData_Sheet_Path);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				book = WorkbookFactory.create(file);
			} catch (InvalidFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sheet = book.getSheet(sheetName);
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			// System.out.println(sheet.getLastRowNum() + "--------" +
			// sheet.getRow(0).getLastCellNum());
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
					// System.out.println(data[i][k]);
				}
			}
			return data;
	}
	 
	 
	 
	 
	 public static String getExcelData() throws IOException {
		 
		 File src=new File(TestData_Sheet_Path);
		 FileInputStream fis=new FileInputStream(src);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet sheet1=wb.getSheetAt(2);
			//String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
			String data66=sheet1.getRow(1)	.getCell(11).getStringCellValue();
			
			return data66;
			
		 
	 }
	 
	 
	 public static String takeScreenshotAtEndOfTest() throws IOException {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String DateName=new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date());
			String currentDir = System.getProperty("user.dir");
			
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + DateName + ".png"));
			return currentDir;
			
			}

}
