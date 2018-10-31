package com.atdd.SampleProject.stepdefs;

import org.junit.Assert;

import com.atdd.SampleProject.pages.Launch;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Launchstepdfs {

	Launch page;
	
	public Launchstepdfs(){
		
		page = new Launch();
	}
	
	@Given("^user enters the url for the app$")
	public void user_enters_the_url_for_the_app() throws Throwable {
	   page.launchapp();
	}
	@Then("^Application should get displayed$")
	public void application_should_get_displayed() throws Throwable {
	  Assert.assertEquals("Policybazaar", page.verifyapp());
	}

}
