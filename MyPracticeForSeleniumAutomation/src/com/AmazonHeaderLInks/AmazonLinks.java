package com.AmazonHeaderLInks;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLinks 
{

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com.au/");
		
		WebElement HeaderLinks = driver.findElement(By.id("nav-xshop"));
		List<WebElement>HeaderlinkNames = HeaderLinks.findElements(By.tagName("a"));
		
		for(int i=0; i<HeaderlinkNames.size();i++)
		{
			System.out.println(HeaderlinkNames.get(i).getText());

		}
		
		driver.close();

	}

}
