package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest 
{

	//FirefoxDriver driver;
	
	EdgeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.edge.driver","C:\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		
		//driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogInTest() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\NewTours.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
		
		String ExpectedTitle = "Find";
		String ActualTitle = driver.getTitle();
		
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("LogIn Successfull -- PASS");
		}
		else
		{
			System.out.println("Failed to LogIn -- FAIL");
		}
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
