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
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_Links_Screenshots {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderBlockLinks.size());
		
		for(int a=0;a<HeaderBlockLinks.size();a++)
		{
			String HeaderLinkName=HeaderBlockLinks.get(a).getText();
			System.out.println(a+"  "+HeaderLinkName);
			HeaderBlockLinks.get(a).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
		    File ImageSc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ImageSc, new File("C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\HeaderBlockLinksImages\\"+HeaderLinkName+".png"));
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(10);
			
			HeaderBlock=driver.findElement(By.className("menu-wrap"));
			HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
			
		}
		
		
		driver.close();

	}

}

