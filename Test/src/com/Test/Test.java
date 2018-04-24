package com.Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		driver.close();

	}

}
