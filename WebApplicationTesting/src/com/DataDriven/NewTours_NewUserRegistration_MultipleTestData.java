package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration_MultipleTestData
{

 //FirefoxDriver driver ;
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\Library\\chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
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
		FileInputStream file = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\NewUserRegistartionTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		
		for(int a=1;a<=RowCount;a++)
		{
		
			Row r=sheet.getRow(a);
			
			driver.findElement(By.name("firstName")).clear();
			
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		
		driver.findElement(By.name("lastName")).clear();
		
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		driver.findElement(By.name("phone")).clear();
		
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String PhoneNumber=Long.toString(x);
		
		driver.findElement(By.name("phone")).sendKeys(PhoneNumber);
		
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
		
		driver.findElement(By.name("address1")).clear();
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		
		driver.findElement(By.name("city")).clear();		
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		
		driver.findElement(By.name("postalCode")).clear();
		double p=r.getCell(7).getNumericCellValue();
		long y =(long)p;
		String PostalCOde=Long.toString(y);
		
		driver.findElement(By.name("postalCode")).sendKeys(PostalCOde);
		
		//driver.findElement(By.name("country")).clear();
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		
		driver.findElement(By.name("confirmPassword")).clear();
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		
		//String actual =driver.findElement(By.name("email")).getText();
		
		
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
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\src\\com\\ExcelTestResultFiles\\NewUserTestResultFile.xlsx");
		workBook.write(file1);
		
		}

	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
