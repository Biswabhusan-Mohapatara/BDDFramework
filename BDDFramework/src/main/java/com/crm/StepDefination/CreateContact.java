package com.crm.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateContact {
	WebDriver driver;
	@Given("^Launch the apllication$")
	public void launch_the_apllication() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "./chrome.exe");
		//System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	}

	@When("^Title of the login page should be display$")
	public void title_of_the_login_page_should_be_display() throws Throwable {
	    driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
	}

	@Then("^Enter username/password$")
	public void enter_username_password() throws Throwable {
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("manager");
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}

	@Then("^Verify home page$")
	public void verify_home_page() throws Throwable {
	   
	}

	@When("^Navigate to contact page$")
	public void navigate_to_contact_page() throws Throwable {
	   
	}

	@Then("^verify contact page$")
	public void verify_contact_page() throws Throwable {
	
	}


}
