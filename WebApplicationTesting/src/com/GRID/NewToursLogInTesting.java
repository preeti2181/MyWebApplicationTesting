package com.GRID;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.jna.Platform;

public class NewToursLogInTesting 
{
	@Parameters("Browser")
	
	@Test
	public void LogInTest(String b) throws MalformedURLException
	{
		System.out.println(b);
		
		DesiredCapabilities cap= null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		}
		
		else
			if(b.equals("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.100:4444/wd/hub"),cap);
		driver.get("http://newtours.demoaut.com");

		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		String ExpectedTitle="Find";
		System.out.println(ExpectedTitle);
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);

		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("LogIn Successfull -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FAIL");
		}

			driver.close();
	}
	
}
