package com.IdentifyingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_Google 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
