package newToursApplicationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursLoginTest 
{
	FirefoxDriver driver;
	
	@Given("^open firefoxdriver and navigate to NewTours Application$")
	public void open_firefoxdriver_and_navigate_to_NewTours_Application() 
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}

	@When("^user enters valid username and password and Click on signin button$")
	public void user_enters_valid_username_and_password_and_Click_on_signin_button() 
	{
	   driver.findElement(By.name("userName")).sendKeys("tutorial");
	   driver.findElement(By.name("password")).sendKeys("tutorial");
	   driver.findElement(By.name("login")).click();
	}

	@Then("^user should be able to Login Successfully and close the application$")
	public void user_should_be_able_to_Login_Successfully_and_close_the_application() 
	{
	   String ExpectedTitle = "Find";
	   String ActualTitle = driver.getTitle();
	   
	   if(ActualTitle.contains(ExpectedTitle))
	   {
		   System.out.println("LogIn Successfull - Pass");
	   }
	   
	   else
	   {
		   System.out.println("Login Failed - Fail");
	   }
	   
	   driver.close();
	}

	
}
