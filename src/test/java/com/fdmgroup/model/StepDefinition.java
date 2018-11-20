package com.fdmgroup.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	DriverUtilities driverutilities;
	WebDriver driver;

	@Given("^I have the browser open$")
	public void openBrowser(){
		driverutilities = DriverUtilities.getInstance();
		driver = driverutilities.getDriver();
	}
	
	@When("^I launch the application$")
	public void launchTheApplication(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/");
	}
	
	@Then("^Login button should exist$")
	public void loginButton(){
		if(driver.findElement(By.name("submit")).isEnabled()){
			System.out.println("Test case Passed!!");
		}else{
			System.out.println("Test case failed");
		}
	}
	
	@When("^I enter username and password$")
	public void enterCredentials(){
		driver.findElement(By.name("j_username")).sendKeys("BradFord1");
		driver.findElement(By.name("j_password")).sendKeys("Montreal8");
	}
	
	@Then("^login to home page$")
	public void clickSubmitButton(){
		driver.findElement(By.name("submit")).click();
	}

}











