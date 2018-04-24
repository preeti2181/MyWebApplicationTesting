package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Google 
{

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.getTitle();
		
		String Actual = driver.getTitle();
		String Expected = "Google";
		
		System.out.println(Actual);
		System.out.println(Expected);
		
		if(Actual.equals(Expected))
		{
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("testcase is fail");
		}
		
		
		driver.close();
	}

}
