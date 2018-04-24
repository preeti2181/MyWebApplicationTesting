package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest 
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
				
	}
	
	@Test(priority=1)
	public void LogInTest() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyPracticeForSeleniumAutomation\\src\\com\\ExcelTestDataFiles\\LogInTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int RowCount = sheet.getLastRowNum();
		for(int i=1; i<=RowCount;i++)
		{
			Row r = sheet.getRow(i);
			
			FileInputStream file1 = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyPracticeForSeleniumAutomation\\NewTours.properties");
			Properties pr = new Properties();
			pr.load(file1);
			
			driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.xpath(pr.getProperty("Signin"))).click();
			 
			String ExpectedTitle = "Find";
			String ActualTitle = driver.getTitle();
			
			System.out.println(ExpectedTitle);
			System.out.println(ActualTitle);
			
			if(ActualTitle.contains(ExpectedTitle))
			{
				System.out.println("Pass");
				r.createCell(2).setCellValue("This is Correct Title - Pass" );
			
			}
			else
			{
				System.out.println("Fail");
				r.createCell(2).setCellValue("This is InCorrect Title - Fail" );
			}
		
			driver.navigate().back();
			
			FileOutputStream file2 = new FileOutputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyPracticeForSeleniumAutomation\\src\\com\\ExcelTestResultFiles\\LoginTestResult.xlsx");
			workbook.write(file2);
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
