package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_IdentifyingLinks_Count 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>NewTourLinksCount=driver.findElements(By.tagName("a"));
		
		System.out.println(NewTourLinksCount.size());
		
		driver.close();
		

	}

}
