package com.MultipleOptionsSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monseter_Industry_Select {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		
		WebElement Industry = driver.findElement(By.id("id_industry"));
		Select selection = new Select(Industry);
		
		selection.selectByIndex(2);
		selection.selectByIndex(3);
		selection.selectByVisibleText("Any");
		
		

	}

}
