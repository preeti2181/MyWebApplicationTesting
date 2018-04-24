package com.Profile;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Facebook_Profile {

	public static void main(String[] args)
	{
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("PreetiProfile");
		
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("http://facebook.com");

	}

}
