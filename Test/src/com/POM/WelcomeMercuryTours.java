package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours 
{
	@FindBy(linkText = "SIGN-ON")
	WebElement Signon;
	

	public void SignOn() 
	{
		Signon.click();
		
	}
	
	
}
