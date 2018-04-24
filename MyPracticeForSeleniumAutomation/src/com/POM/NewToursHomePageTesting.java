package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTesting 
{
	
	@Test
	public void HomePgeTesting()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.SignIn();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.Register();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.Support();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.Contact();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.LogInTest("tutorial", "tutorial");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.urdest();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.close();
		
		
	}

}
