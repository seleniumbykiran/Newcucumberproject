package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
  {
	WebDriver driver;
	
	By txt_username = By.id("user-name");
	
	By txt_password = By.id("password");
	
	By btn_Login     = By.id("login-button");
	
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void enterPassword (String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
    public void enterLogin (String login)
    {
    	driver.findElement(btn_Login).click();
    }
  }
