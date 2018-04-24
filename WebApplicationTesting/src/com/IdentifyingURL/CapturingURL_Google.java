package com.IdentifyingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL_Google 
{

	public static void main(String []args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
	
}
