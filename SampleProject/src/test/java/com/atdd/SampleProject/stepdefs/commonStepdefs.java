package com.atdd.SampleProject.stepdefs;

import java.util.List;

import org.junit.Assert;

import com.atdd.SampleProject.pages.commonmethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class commonStepdefs {

	commonmethods page;
	
	public commonStepdefs(){
		page = new commonmethods();
	}
	
	@Given("^user clicks on \"([^\"]*)\" tab$")
	public void user_clicks_on_tab(String arg1) throws Throwable {
	    page.clickontab(arg1);
	}
	
	
@Then("^user should see all the below tabs$")
public void user_should_see_all_the_below_tabs(List<String> arg1) throws Throwable {
    
for(String expected:arg1){
	
	        Assert.assertEquals(expected, page.verifyalltabs(expected));
}
}

@When("^user enters date for \"([^\"]*)\" using calendar$")
public void user_enters_date_for_using_calendar(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	page.enterdate(arg1);
}
	



@Then("^user should be on \"([^\"]*)\" page$")
public void user_should_be_on_page(String arg1) throws Throwable {
	
Assert.assertTrue(page.verifycurrentpage(arg1));
    
}


}