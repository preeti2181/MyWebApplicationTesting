package com.AjaxTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Bing_Search 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bing.com/");
		
		driver.findElement(By.xpath(".//*[@id='sb_form_q']")).sendKeys("load");
		Sleeper.sleepTightInSeconds(10);
		
		//Identifying the block after entering the load in the search field
		WebElement block = driver.findElement(By.xpath(".//*[@id='sw_as']/div"));
		
		 List<WebElement>blockNames = block.findElements(By.xpath("//*[starts-with(@id,'sa')]/div"));
		 
		 for(int i=0; i<blockNames.size(); i++)
		 {
			 System.out.println(blockNames.get(i).getText());
			
		 }
		 
		 driver.close();
		 
	}

}