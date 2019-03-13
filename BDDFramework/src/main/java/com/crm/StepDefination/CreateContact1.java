package com.crm.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateContact1 {
	WebDriver driver;
	
	
	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
		  
	}
	
	
	@When("^login to app with valid \"(.*)\" and \"(.*)\"$")
	public void login_to_app_with_valid_and(String username ,String password) throws Throwable {
		driver.findElement(By.name("user_name")).sendKeys(username);
	    driver.findElement(By.name("user_password")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}

	@Then("^Home page should be Display$")
	public void home_page_should_be_Display() throws Throwable {
    System.out.println("Home page");
	}

	@When("^click on contact link$")
	public void click_on_contact_link() throws Throwable {
		driver.findElement(By.linkText("Contacts")).click();

	}

	@Then("^contact page should be display$")
	public void contact_page_should_be_display() throws Throwable {
	 
	}

	@When("^click on create new contact page$")
	public void click_on_create_new_contact_page() throws Throwable {
	   
	}

	@Then("^create contact page should be display$")
	public void create_contact_page_should_be_display() throws Throwable {
	 
	}

	@When("^create a contact then contact should be created$")
	public void create_a_contact_then_contact_should_be_created() throws Throwable {
	   
	}

	@When("^Verify the contact details$")
	public void verify_the_contact_details() throws Throwable {
	  
	}

	@When("^Verify the successful message$")
	public void verify_the_successful_message() throws Throwable {
	   
	}

	@Then("^Logout$")
	public void logout() throws Throwable {
	   
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	   
	}



}
