package com.FacebookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Preeti");
		driver.findElement(By.id("pass")).sendKeys("Password");
		
		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();

	}

}
