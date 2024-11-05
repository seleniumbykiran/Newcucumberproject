package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
@Given("user is on login page")
    public void user_is_on_login_page() 
{
	{
		System.out.println("Hello world"); 
	}
}
	
	@When("user enter username and password")
	public void loginPage1() 
	{
		System.out.println("Hello");
	}
	@And("clicks on login button")
	public void loginPage2()
	{
		System.out.println("Hello yaar");
	}
	@Then("user navigate to homepage")
	public void loginPage3()
	{
		System.out.println("Hello yaar kya hua");
	}
}
