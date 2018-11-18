package StepDefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefn {
	
	WebDriver driver;
	
	@Given("^user is already on the page$")
	public void user_is_already_on_the_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://wwww.freecrm.com");
	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
		 driver.findElement(By.name("username")).sendKeys("testuser_1");
		 driver.findElement(By.name("password")).sendKeys("test@123");
	}

	@Then("^enters the login button$")
	public void enters_the_login_button() throws Throwable {
		 driver.findElement(By.id("login")).click();   
	}

/*	@Then("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
	    
	}
*/

}
