package com.HiddenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_HeaderBlock {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		WebElement block=driver.findElement(By.id("sc_hdu"));
		List<WebElement>links=block.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			String Name=links.get(i).getText();
			System.out.println(Name);
					
		}
		
		driver.close();

	}

}
