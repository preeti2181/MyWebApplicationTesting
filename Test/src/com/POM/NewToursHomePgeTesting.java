package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePgeTesting 
{
	FirefoxDriver driver;
	
	@Test
	public void HomePgeTesting()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		WelcomeMercuryTours WMT = PageFactory.initElements(driver,WelcomeMercuryTours.class);
		
		WMT.SignOn();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.close();
		
	}
	
}
