package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{
	@BeforeTest
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("Browser Launch and LogIn");
	}
	
	@Test(priority=3)
	public void SentMail()
	{
		System.out.println("Testing SentMail Functionality");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("Testing INBox Functionality");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("Testing Compose Mail FUnctionality");
	}
	
	@AfterTest
	public void ApplicationCLose()
	{
		System.out.println("Browser Close");
	}
}
