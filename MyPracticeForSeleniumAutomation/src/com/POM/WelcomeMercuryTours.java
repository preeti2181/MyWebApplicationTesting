package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours 
{

	@FindBy(linkText ="SIGN-ON")
	WebElement signin;
	
	public void SignIn()
	{
		signin.click();
	}
	
	@FindBy(linkText = "REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}

	@FindBy(linkText = "SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	@FindBy(linkText = "CONTACT")
	WebElement contact;
	
	public void Contact()
	{
		contact.click();
	}
	
	@FindBy(name ="userName")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(name = "login")
	WebElement Login;
	
	public void LogInTest(String Uname, String Pwd)
	{
		username.sendKeys(Uname);
		Password.sendKeys(Pwd);
		Login.click();
	}
	
	@FindBy(linkText = "your destination")
	WebElement UrDestination;
	
	public void urdest()
	{
		UrDestination.click();
	}
	
}
