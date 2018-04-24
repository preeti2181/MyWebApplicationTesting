package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1 
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to launch Firefox Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("Testing LogIn Functionality");
	}
	
	@Test(priority=3)
	public void InBox()
	{
		System.out.println("Testing INBox Functionality");
	}
	
	@Test(enabled=false)
	public void ComposeMail()
	{
		System.out.println("Testing Compose Mail FUnctionality");
	}
}
