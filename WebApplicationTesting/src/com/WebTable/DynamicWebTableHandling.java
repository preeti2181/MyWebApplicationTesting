package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int a=0;a<rows.size();a++)
		{
			List<WebElement>cols=rows.get(a).findElements(By.tagName("td"));
			for(int b=0;b<cols.size();b++)
			{
			  String	data=cols.get(b).getText();
			  System.out.print(data+"  ");
			}
			System.out.println();
		}
		
		driver.close();

	}

}
