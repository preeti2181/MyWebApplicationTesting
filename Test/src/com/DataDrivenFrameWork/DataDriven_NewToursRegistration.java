package com.DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriven_NewToursRegistration 
{

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		FileInputStream file = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\Test\\src\\com\\ExcelInputFile\\NewUserRegistartionTestData.xlsx");
		XSSFWorkbook WorkBook = new XSSFWorkbook(file);
		XSSFSheet Sheet = WorkBook.getSheet("Sheet1");
		
		int RowCount = Sheet.getLastRowNum();
		
		for(int i=1; i<=RowCount; i++)
		{
			Row r = Sheet.getRow(i);
			
			driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
			
			double d = r.getCell(2).getNumericCellValue();
			long l = (long)d;
			String PhoneNumber = Long.toString(l);
			driver.findElement(By.name("phone")).sendKeys(PhoneNumber);
			
			driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
			
			double f =r.getCell(7).getNumericCellValue();
			long p = (long)f;
			String PostCode = Long.toString(p);
			driver.findElement(By.name("postalCode")).sendKeys(PostCode);
			
			driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
			driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
			
			driver.findElement(By.name("register")).click();
			
			String Actual=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText(); 
			String Expected = r.getCell(9).getStringCellValue();
			
			if(Actual.contains(Expected))
			{
				r.createCell(12).setCellValue(Expected + "Pass");
				System.out.println("Pass");
			}
			else
			{
				r.createCell(12).setCellValue("Fail");
				System.out.println("Fail");
			}
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\Test\\src\\com\\ExcelTestResultFiles\\NewUserTestResultFile.xlsx");
			WorkBook.write(file1);
			
			driver.navigate().back();
			
		}
		
		
		driver.close();
	}

}
