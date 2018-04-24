package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.findElement(By.className("gb_P")).click();
		
		String ActualTitle = "Gmail";
		String ExpectedTitle = driver.getTitle();
		
		System.out.println("ActualTitle");
		System.out.println("ExpectedTitle");
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.close();

	}

}
