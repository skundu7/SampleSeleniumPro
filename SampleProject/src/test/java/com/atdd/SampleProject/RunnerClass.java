package com.atdd.SampleProject;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/Features"},
		monochrome=true,
		plugin = { "pretty","html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json"},
		dryRun=false,
		strict=true,
		tags ={"@Regression"}
		
		
		)


public class RunnerClass {


@BeforeClass()
public static void setProperty(){
	
	System.setProperty("BrowserType", "Firefox");
	
}
}

