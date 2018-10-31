package com.atdd.SampleProject.stepdefs;

import org.junit.Assert;

import com.atdd.SampleProject.pages.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdefs {

	Login page;
	
	public Loginstepdefs(){
		page = new Login();
	}
	
	@Given("^user clicks on Myaccount link$")
	public void user_clicks_on_Myaccount_link() throws Throwable {
	  page.clickonMyaccount();
	}

	@When("^user enters the mobile number$")
	public void user_enters_the_mobile_number() throws Throwable {
	    page.enterMobnumber();
	}

	@When("^user clicks on the proceed button$")
	public void user_clicks_on_the_proceed_button() throws Throwable {
	   page.clickonproceedbtn();
	}

	@When("^user enters the password$")
	public void user_enters_the_password() throws Throwable {
	   page.enterpassword();
	}

	@When("^user clicks on the proceed link again$")
	public void user_clicks_on_the_proceed_link_again() throws Throwable {
	   page.clickonproceedagain();
	}

	@Then("^user should get logged in$")
	public void user_should_get_logged_in() throws Throwable {
		Thread.sleep(5000);
		Assert.assertEquals("Dashboard", page.verifylogin());
	}

}
