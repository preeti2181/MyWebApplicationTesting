package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePageLinksTesting 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>NewTourLinksCount=driver.findElements(By.tagName("a"));
		
		for(int a=0;a<NewTourLinksCount.size();a++)
		{
			String NewTourLinkNames = NewTourLinksCount.get(a).getText();
			System.out.println(a+" "+NewTourLinkNames);
			NewTourLinksCount.get(a).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			NewTourLinksCount=driver.findElements(By.tagName("a"));
			
			
		}
		driver.close();

	}

}
