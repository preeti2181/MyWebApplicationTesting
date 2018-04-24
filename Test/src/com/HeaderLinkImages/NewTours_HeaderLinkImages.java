package com.HeaderLinkImages;

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

public class NewTours_HeaderLinkImages 
{

	public static void main(String[] args) throws IOException 
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WebElement HeaderBlock = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		List<WebElement>HeaderLinks = HeaderBlock.findElements(By.tagName("a"));
		
		for(int i=0;i<HeaderLinks.size();i++)
		{
			String HeaderLinkName = HeaderLinks.get(i).getText();
			System.out.println(HeaderLinkName);
			HeaderLinks.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("C:\\Users\\prree\\Desktop\\PreetiSelenium\\Test\\HeaderBlockLinkImage\\"+ HeaderLinkName +".png"));
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(10);
			HeaderBlock = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
			HeaderLinks = HeaderBlock.findElements(By.tagName("a"));
		}
		
		driver.close();

	}

}
