package com.Jabong;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jabong_Links_Images 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jabong.com");
		
		
		WebElement Wumen= driver.findElement(By.linkText("women"));
		
		Actions WomenHover = new Actions(driver);
		WomenHover.moveToElement(Wumen).perform();
		
		driver.close();
	}

}
