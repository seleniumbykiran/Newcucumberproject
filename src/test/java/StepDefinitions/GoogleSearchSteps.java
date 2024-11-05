package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
	    System.out.println("Inside Steps: browser is open");
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		 System.out.println("user is on google search page");
		 driver.navigate().to("https://www.google.com");
	}

	@When("user enter the text on search field")
	public void user_enter_the_text_on_search_field() throws InterruptedException {
		 System.out.println("user enter the text on search field");
		 Thread.sleep(2000);
		 driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}

	@And("hits the enter button")
	public void hits_the_enter_button() throws InterruptedException {
		 System.out.println("hits the enter button");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 
	}

	@Then("user navigate to search result")
	public void user_navigate_to_search_result() throws InterruptedException {
		 System.out.println("user navigate to search result");
		 driver.getPageSource().contains("Online Courses");
		 Thread.sleep(1000);
		 
		 driver.close();
		 driver.quit();
	}




}
