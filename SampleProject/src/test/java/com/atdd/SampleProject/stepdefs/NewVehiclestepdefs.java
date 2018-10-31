package com.atdd.SampleProject.stepdefs;

import com.atdd.SampleProject.pages.NewVehicle;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewVehiclestepdefs {

	NewVehicle page;
	public NewVehiclestepdefs(){
		page = new NewVehicle();
	}
	
	@When("^user adds  \"([^\"]*)\" in the vehile list$")
	public void user_adds_in_the_vehile_list(String arg1) throws Throwable {
		  page.addnewvehicle(arg1);
	}

	@Then("^vehile \"([^\"]*)\" should get added$")
	public void vehile_should_get_added(String arg1) throws Throwable {
		page.verifynewvehiceisadded();
	}
	
	@When("^user enters \"([^\"]*)\" for  type \"([^\"]*)\" and model \"([^\"]*)\" using Calendar$")
	public void user_enters_for_type_and_model_using_Calendar(String arg1, String arg2, String arg3) throws Throwable {
	    page.enterexpirydate(arg1,arg2,arg3);
	}

	@Then("^vehicle \"([^\"]*)\" should get added$")
	public void vehicle_should_get_added(String arg1) throws Throwable {
	   System.out.println("Needs to be implented");
	}

	
}
