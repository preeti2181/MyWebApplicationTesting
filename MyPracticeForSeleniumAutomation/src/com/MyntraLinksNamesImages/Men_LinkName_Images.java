package com.MyntraLinksNamesImages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Men_LinkName_Images 
{

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://myntra.com");
		
		/*Alert notify = driver.switchTo().alert();
		System.out.println(notify.getText());
		Sleeper.sleepTightInSeconds(10);
		
		notify.accept();*/
		
		WebElement men = driver.findElement(By.linkText("Men"));
		
		Actions menHover = new Actions(driver);
		menHover.moveToElement(men).perform(); 
		
		WebElement menLinks = driver.findElement(By.className("desktop-categoryContainer"));
		List<WebElement>menLinkSize = menLinks.findElements(By.className("desktop-categoryLink"));
		
		System.out.println(menLinkSize.size());
		
		for(int i=0; i<menLinkSize.size(); i++)
		{
			System.out.println(menLinkSize.get(i).getText());
		}
		
		
		driver.close();

		

	}

}
