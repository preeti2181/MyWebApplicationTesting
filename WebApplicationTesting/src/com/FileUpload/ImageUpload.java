package com.FileUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageUpload {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://imgur.com");
		
		driver.findElement(By.id("create-dropdown-button")).click();
		
		driver.findElement(By.linkText("Upload Images")).click();
		
		driver.findElement(By.xpath(".//*[@id='upload-modal']/div[2]/div[2]/label")).click();
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\prree\\Desktop\\FileUpload.exe");
		

	}

}
