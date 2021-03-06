package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlockLinks_DisplayingNames 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderBlockLinks.size());
		
		for(int a=0; a<HeaderBlockLinks.size(); a++)
		{
			String HeaderBlockLinkNames = HeaderBlockLinks.get(a).getText();
			System.out.println(a+" "+HeaderBlockLinkNames);
		}
		
		driver.close();

	}

}
