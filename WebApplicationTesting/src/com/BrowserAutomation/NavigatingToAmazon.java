package com.BrowserAutomation;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingToAmazon {

	public static void main(String[] args) 
	{
		FirefoxDriver preeti = new FirefoxDriver();
		preeti.get("http://amazon.com");
		
		preeti.navigate().to("http://facebook.com");
		
		preeti.close();
		
		

	}

}
