package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCityNames_FirstColumn 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		
		String part1 = "html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String part2 = "]/td[1]";
		
		for(int i = 1; i<=36; i++)
		{
			String CityName = driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.print(CityName);
			System.out.println();
		}
		
		
		driver.close();

	}

}
