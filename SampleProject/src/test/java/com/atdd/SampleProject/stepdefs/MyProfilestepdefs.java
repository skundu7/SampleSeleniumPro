package com.atdd.SampleProject.stepdefs;

import java.util.List;

import org.junit.Assert;

import com.atdd.SampleProject.pages.MyProfile;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyProfilestepdefs {
	
	MyProfile page;
	
	public MyProfilestepdefs(){
		page = new MyProfile();
	}
	
	
	@When("^user clicks on Add Family members button$")
	public void user_clicks_on_Add_Family_members_button() throws Throwable {
	    page.clickonaddfamilymemberbtn();
	    
	}

	@When("^user enters Name for \"([^\"]*)\" of the family$")
	public void user_enters_Name_for_of_the_family(String arg1) throws Throwable {
	    page.entername(arg1);
	}


	@When("^user enters Relation for \"([^\"]*)\" of the family member$")
	public void user_enters_Relation_for_of_the_family_member(String arg1) throws Throwable {
		 page.enterrelation(arg1);
	}

	@When("^user cliks on Save$")
	public void user_cliks_on_Save() throws Throwable {
	    page.clikonsavebutton();
	}

	@Then("^Family member should get saved\\.$")
	public void family_member_should_get_saved() throws Throwable {
	    
		Assert.assertEquals("Dharampal", page.verifyfamilymember());
		
	}

	@Then("^user should see saved family members$")
	public void user_should_see_saved_family_members(List<String> arg1) throws Throwable {
	    for(String member:arg1){
	    	Assert.assertEquals(member, page.verifymembers(member));
	    	;
	    }
	}
	
	@Then("^user should see details of family members$")
	public void user_should_see_details_of_family_members(List<String> arg1) throws Throwable {
		
		for(String memdetails:arg1){
		Assert.assertTrue("Member mathes the values in TestData", page.verifydetailsofmembers(memdetails));
		}
	}


}

