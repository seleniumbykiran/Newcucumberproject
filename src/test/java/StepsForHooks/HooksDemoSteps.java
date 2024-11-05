package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HooksDemoSteps {
	WebDriver driver = null;
	
	@Before
	public void browserSetup()
	{
		System.out.println("I am inside browser setup");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@After
	public void teardown()
	{
		System.out.println("I am inside the teardown");
		driver.close();
		driver.quit();
	}
	@BeforeStep
	public  void beforeSteps()
	{
		System.out.println("I am inside before steps");
	}
	
	@AfterStep
	public  void aeforeSteps()
	{
		System.out.println("I am inside after steps");
	}
	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	}
	@And("click on login button")
	public void click_on_login_button() {
	}
	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
	}




}
