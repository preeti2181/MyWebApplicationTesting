package com.DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\Test\\src\\com\\ExcelInputFile\\TestData.xlsx");
		XSSFWorkbook WorkBook = new XSSFWorkbook(file);
		XSSFSheet Sheet = WorkBook.getSheet("Sheet1");
		
		Row r = Sheet.createRow(2);
		Cell c = r.createCell(3);
		c.setCellValue("preeti roy");
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\Test\\src\\com\\ExcelInputFile\\TestData1.xlsx");
		WorkBook.write(file1);
		
	}

}
