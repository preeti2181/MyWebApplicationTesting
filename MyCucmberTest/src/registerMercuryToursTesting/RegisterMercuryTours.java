package registerMercuryToursTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMercuryTours 
{
	ChromeDriver driver;
	
	@Given("^Firefox browser is opened and new tours application is opened and click on register button to open register page$")
	public void Firefox_browser_is_opened_and_new_tours_application_is_opened_and_click_on_register_button_to_open_register_page() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prree\\Desktop\\PreetiSelenium\\MyCucmberTest\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("http://newtours.demoaut.com");
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.linkText("REGISTER")).click();
	}

	@When("^user enter valid \"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and click on rigister button$")
	public void user_enter_valid_and_and_and_and_and_and_and_and_and_and_and_and_click_on_rigister_button(String FirstName, String LastName, String Phone, String UserName, String Address, String City, String State, String PostalCode, String Country, String Email, String Password, String ConfirmPassword) 
	{
		driver.findElement(By.name("firstName")).sendKeys(FirstName);
		driver.findElement(By.name("lastName")).sendKeys(LastName);
		driver.findElement(By.name("phone")).sendKeys(Phone);
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("address1")).sendKeys(Address);
		driver.findElement(By.name("city")).sendKeys(City);
		driver.findElement(By.name("state")).sendKeys(State);
		driver.findElement(By.name("postalCode")).sendKeys(PostalCode);
		driver.findElement(By.name("country")).sendKeys(Country);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("confirmPassword")).sendKeys(ConfirmPassword);		
		driver.findElement(By.name("register")).click();
	}


	@Then("^user is successfully registered and browser is closed$")
	public void user_is_successfully_registered_and_browser_is_closed() 
	{
	    driver.close();
	}
}
