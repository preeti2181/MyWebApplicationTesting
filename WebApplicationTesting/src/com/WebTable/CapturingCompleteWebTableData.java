package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCompleteWebTableData {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[36]/td[8]
		
		String part1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		for(int a=1;a<=36;a++)
		{
			for(int b=1;b<=8;b++)
			{
				String Data=driver.findElement(By.xpath(part1+a+part2+b+part3)).getText();
				System.out.print(Data+"  ");
			}
			System.out.println();
			
		}
		
		driver.close();

	}

}
