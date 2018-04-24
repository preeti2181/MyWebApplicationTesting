package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot_Bing {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		Thread.sleep(5000);
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\ScreenShots\\bing.png"));
		
		driver.close();

	}

}
