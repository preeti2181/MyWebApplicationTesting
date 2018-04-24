package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableHandling 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		WebElement tableName = driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		List<WebElement>TabelRows = tableName.findElements(By.tagName("tr"));
		
		for(int r=0; r<TabelRows.size(); r++)
		{
			List<WebElement>TableData = TabelRows.get(r).findElements(By.tagName("td"));
			
			for(int d=0;d<TableData.size();d++)
			{
				String TableText = TableData.get(d).getText();
				System.out.print(TableText + "  ");
				
			}
			System.out.println();
		}
		

		
			driver.close();
	}

}
