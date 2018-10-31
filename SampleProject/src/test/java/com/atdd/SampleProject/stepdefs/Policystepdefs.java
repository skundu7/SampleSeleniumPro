package com.atdd.SampleProject.stepdefs;

import java.util.List;

import org.junit.Assert;

import com.atdd.SampleProject.pages.Policies;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Policystepdefs {

	Policies page;
	public Policystepdefs(){
		
		page = new Policies();
		
	}
	
	

	@Then("^user should see all his policies$")
	public void user_should_see_all_his_policies(List<String> arg1) throws Throwable {
	   for(String ExpectedPolicy:arg1){
		   
		   page.verifyallpolicies(ExpectedPolicy);
	   }
	}

	

	@When("^user selects the car tab$")
	public void user_selects_the_car_tab() throws Throwable {
	   page.clickoncarpoliciestab();
	}



	@When("^user selects the Two Wheeler tab$")
	public void user_selects_the_Two_Wheeler_tab() throws Throwable {
	    page.clickontwowheelerpolicytab();
	}

	
	

@Then("^user should see all his car policies$")
public void user_should_see_all_his_car_policies(List<String> arg1) throws Throwable {
   for(String expectedVal:arg1){
	   Assert.assertTrue(expectedVal.equalsIgnoreCase(page.verifycarpolicies(expectedVal)));
	 
   }
}

@Then("^user should see all his two wheeler policies$")
public void user_should_see_all_his_two_wheeler_policies(List<String> arg1) throws Throwable {
    for(String expectedVal:arg1){
    	page.verifybikepolicies(expectedVal);
    }
}


}
