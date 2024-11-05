package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class LoginDemo
{
	WebDriver driver = null;
	
	@Given("Browser is open in new")
	public void browser_is_open_in_new() 
	{
		
	    driver = new ChromeDriver ();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	}
	@And("user is on login page in new project")
	public void user_is_on_login_page_in_new_project() 
	{
		 driver.navigate().to("https://www.saucedemo.com/v1/");
	}


	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
	   driver.findElement(By.id("user-name")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("user clicks on Login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("login-button")).click();
	   
	}

	@Then("user navigates to Login Page")
	public void user_navigates_to_login_page()
	{
		driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		
		driver.close();
		driver.quit();
		
	}


}
