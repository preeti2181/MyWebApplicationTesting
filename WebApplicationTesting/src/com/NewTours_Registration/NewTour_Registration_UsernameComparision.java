package com.NewTours_Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class NewTour_Registration_UsernameComparision 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();

		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Preeti");
		driver.findElement(By.name("lastName")).sendKeys("Gudidevuni");
		driver.findElement(By.name("phone")).sendKeys("0423248895");
		driver.findElement(By.name("userName")).sendKeys("Preeti2181@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Gandhinagar");
		driver.findElement(By.name("city")).sendKeys("hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("5000080");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.name("email")).sendKeys("Preetiiii");
		driver.findElement(By.name("password")).sendKeys("Preeti");
		driver.findElement(By.name("confirmPassword")).sendKeys("Preeti");
		
		//String actual =driver.findElement(By.name("email")).getText();
		
		
		driver.findElement(By.name("register")).click();

		String expected = "Preetiiii";
		
		String actual=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		
		System.out.println(actual);
		
		if(actual.contains(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
