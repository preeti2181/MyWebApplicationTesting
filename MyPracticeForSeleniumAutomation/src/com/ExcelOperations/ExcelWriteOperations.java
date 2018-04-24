package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperations
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyPracticeForSeleniumAutomation\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Row r = sheet.createRow(4);
		Cell c= r.createCell(5);
		
		c.setCellValue("preeti");
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyPracticeForSeleniumAutomation\\src\\com\\ExcelTestDataFiles\\TestData1.xlsx");
		workbook.write(file1);
	

	}

}
