package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadOperations2 
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyPracticeForSeleniumAutomation\\src\\com\\ExcelTestDataFiles\\MultipleTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		for(int i=0; i<=rowCount; i++)
		{
			Row r = sheet.getRow(i);
			int cellCount = r.getLastCellNum();
			
			for(int a=0;a<cellCount;a++)
			{
				Cell c = r.getCell(a);
				String data = c.getStringCellValue();
				System.out.print(data + " ");
			}
			System.out.println();
		}

		
		
	}

}
