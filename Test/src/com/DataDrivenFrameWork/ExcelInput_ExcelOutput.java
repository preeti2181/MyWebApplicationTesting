package com.DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelInput_ExcelOutput 
{

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\Test\\src\\com\\ExcelInputFile\\MultipleTestData.xlsx");
		XSSFWorkbook WorkBook = new XSSFWorkbook(file);
		XSSFSheet Sheet = WorkBook.getSheet("Sheet1");
		
		int RowCount = Sheet.getLastRowNum();
		
		for(int r=0; r<=RowCount;r++)
		{
			
			Row rowValue = Sheet.getRow(r);
			
			int CellCount = rowValue.getLastCellNum();
			for(int c=0; c<CellCount; c++)
			{
				Cell cellValue = rowValue.getCell(c);
				String CellData = cellValue.getStringCellValue();
				System.out.print(CellData+" ");
			}
			System.out.println();
		}

	}

}
