package newToursApplicationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursLogInTest
{
	FirefoxDriver driver;
	
	@Given("^Open FireFox Browser and Navigate to NewTours Application$")
	public void Open_FireFox_Browser_and_Navigate_to_NewTours_Application() 
	 {
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}

	@When("^User Enters Valid \"([^\"]*)\" and \"([^\"]*)\" and Click on SigIn button$")
	public void User_Enters_Valid_and_and_Click_on_SigIn_button(String UserName, String Password) throws Throwable 
	{
	 
		
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
	}

	@Then("^User shoud be able to LogIn Successfully and close the Application$")
	public void User_shoud_be_able_to_LogIn_Successfully_and_close_the_Application()  
	{
	
			String ExpectedTitle="Find";
			String ActualTitle=driver.getTitle();
			
			if(ActualTitle.contains(ExpectedTitle))
			{
				System.out.println("LogIn Successful -- PASS");
			}
			else
			{
				System.out.println("LogIn Failed -- FAIL");
			}
			
			driver.close();
	}
}
