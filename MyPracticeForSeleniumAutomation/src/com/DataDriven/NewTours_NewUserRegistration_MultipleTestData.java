package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration_MultipleTestData 
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=2)
	public void UserRegisitration() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyPracticeForSeleniumAutomation\\src\\com\\ExcelTestDataFiles\\NewUserRegistartionTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int RowCount = sheet.getLastRowNum();
		
		for(int i=1; i<=RowCount; i++)
		{
			Row r = sheet.getRow(i);
			
			driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
			
			double d=r.getCell(2).getNumericCellValue();
			long x = (long)d;
			String PhoneNumber = Long.toString(x);
			
			driver.findElement(By.name("phone")).sendKeys(PhoneNumber);
			
			driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
			
			double p = r.getCell(7).getNumericCellValue();
			long y= (long)p;
			String PostCode = Long.toString(y);
			
			driver.findElement(By.name("postalCode")).sendKeys(PostCode);
			driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
			driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
			driver.findElement(By.name("register")).click();
			String expected = r.getCell(9).getStringCellValue();
			
			String actual=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			
			
			System.out.println(actual);
			
			if(actual.contains(expected))
			{
				System.out.println("Pass");
				
				r.createCell(12).setCellValue("User Registered Successfully -  PASS");
			}
			else
			{
				System.out.println("Fail");
				
				r.createCell(12).setCellValue("User Not Registed - FAIL");
			}
			
			driver.navigate().back();
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyPracticeForSeleniumAutomation\\src\\com\\ExcelTestResultFiles\\NewUserTestResultFile.xlsx");
			workbook.write(file1);
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
