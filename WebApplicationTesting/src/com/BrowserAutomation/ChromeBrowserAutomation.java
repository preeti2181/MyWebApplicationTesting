package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ChromeBrowserAutomation
{

	public static void main(String[] args)
	{
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\Library\\geckodriver.exe");
		
		//FirefoxDriver driver = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\Library\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.edge.driver","C:\\MicrosoftWebDriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\prree\\Desktop\\PreetiSelenium\\WebApplicationTesting\\Library\\IEDriverServer.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		
		driver.get("my.monsterindia.com/sponsered_popup.html");
		
		driver.close();

	}

}
