package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours 

					// Object Repository	
{
	//WebElement register=driver.findElement(By.linkText="REGISTER");
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement contact;
	
	public void Conatct()
	{
		contact.click();
	}
	
	
	@FindBy(name="userName")
	WebElement UserName;
	
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void LogInTest(String UName,String Pwd)
	{
		UserName.sendKeys(UName);
		Password.sendKeys(Pwd);
		SignIn.click();
		
	}
	
	
	
	

}
