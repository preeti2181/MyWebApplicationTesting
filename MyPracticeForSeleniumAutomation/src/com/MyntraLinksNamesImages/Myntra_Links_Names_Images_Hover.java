package com.MyntraLinksNamesImages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Myntra_Links_Names_Images_Hover {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://myntra.com");
		
		driver.manage().window().maximize();
		
		//WebElement HeaderLinks = driver.findElement(By.className("desktop-navbar"));
		List<WebElement>HeaderLinkNames = driver.findElements(By.className("desktop-main"));				
		System.out.println(HeaderLinkNames.size());
		
		for(int i=0; i<HeaderLinkNames.size(); i++)
		{
			String name = HeaderLinkNames.get(i).getText();
			System.out.println(i+"  "+name);
			HeaderLinkNames.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			
			File MainLinkImages = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(MainLinkImages, new File("C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyPracticeForSeleniumAutomation\\MyntraMainLinksImages\\"+name+".png"));
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(10);
			HeaderLinkNames = driver.findElements(By.className("desktop-main"));
			
		}
		
		driver.close();

	}

}
