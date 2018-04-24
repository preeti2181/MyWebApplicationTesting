package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogIN {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		// data-testid="royal_email"
		
		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Hello");
		
		// class="inputtext"
		
		driver.findElement(By.xpath("//*[@class='inputtext']")).sendKeys("Hello");
		
		//driver.findElement(By.xpath("//*[@class='inputtext' and @data-testid='royal_pass']")).sendKeys("hiii");
		
		//data-testid="royal_pass"
		
		driver.findElement(By.cssSelector("input[data-testid=royal_pass]")).sendKeys("Hii");

	}

}
