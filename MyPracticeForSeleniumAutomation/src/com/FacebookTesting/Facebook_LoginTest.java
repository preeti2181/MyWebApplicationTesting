package com.FacebookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LoginTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("preeti");
		driver.findElement(By.id("pass")).sendKeys("preeti");
		driver.findElement(By.id("u_0_3")).click();
		
		driver.close();

	}

}
