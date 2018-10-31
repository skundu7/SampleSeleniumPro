package com.atdd.SampleProject.Utils;

import java.util.Collection;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class HookDefinition {

	@After
	public void afterhook(Scenario scn){
		System.out.println("Scenario ended");
		DriverFactory.closeDeviceDriver();
	
	}
}
