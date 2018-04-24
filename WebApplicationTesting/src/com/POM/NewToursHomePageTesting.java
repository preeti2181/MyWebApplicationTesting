package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTesting 
{

	@Test
	public void HmePageTesting()
	{
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.Register();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.Support();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.Conatct();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		
		WMT.LogInTest("tutorial", "turorial");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.close();
		
		
		
		
		
	}
}
