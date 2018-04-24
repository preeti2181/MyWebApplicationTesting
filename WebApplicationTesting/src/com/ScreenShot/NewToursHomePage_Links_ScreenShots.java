package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursHomePage_Links_ScreenShots {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int a=0;a<links.size();a++)
		{
				String linkName=links.get(a).getText();
				System.out.println(a+"   "+linkName);
				
				links.get(a).click();
				
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				System.out.println();
				
				File sour=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sour, new File("C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\ScreenShots\\"+linkName+".png"));
				
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
		}
		
		driver.close();


	}

}
