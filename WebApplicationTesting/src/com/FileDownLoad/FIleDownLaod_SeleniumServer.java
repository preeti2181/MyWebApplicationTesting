package com.FileDownLoad;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIleDownLaod_SeleniumServer 
{

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\prree\\Desktop\\FileDownload.exe");
		
		//driver.close();
	}
	
	

}
