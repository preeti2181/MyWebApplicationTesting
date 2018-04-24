package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxBrowserAutomation 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}

	@Test
	public void TitleVerification()
	{
		String Expected = "Mercury";
		String Actual = driver.getTitle();
		
		System.out.println(Actual);
		
		if(Actual.contains(Expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

	@AfterTest
	public void TearDown()
	{
		driver.close();
	}

}
