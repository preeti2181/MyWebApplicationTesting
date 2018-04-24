package com.ValidatingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingURL_FaceBook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String ExpectedURL = "facebook.com";
		
		String ActualURL=driver.getCurrentUrl();
		
		System.out.println(ExpectedURL);
		System.out.println(ActualURL);	
		
		if(ActualURL.contains(ExpectedURL))
		{
			System.out.println("URL Matched  -- PASS");
		}
		else
		{
			System.out.println("URL not matched -- FAIL");
		}

		driver.close();
	}

}
