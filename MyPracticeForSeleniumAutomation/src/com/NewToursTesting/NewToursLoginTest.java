package com.NewToursTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursLoginTest 
{

	public static void main(String[] args)
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "http://newtours.demoaut.com/mercuryreservation.php";
		
		System.out.println(ActualURL);
		System.out.println(ExpectedURL);
		
		if(ActualURL.contains(ExpectedURL))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		driver.close();

	}

}
