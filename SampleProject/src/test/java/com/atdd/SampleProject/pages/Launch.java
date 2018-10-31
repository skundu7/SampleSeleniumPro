package com.atdd.SampleProject.pages;

import org.openqa.selenium.By;

import com.atdd.SampleProject.Utils.SeleniumUtils;

public class Launch extends SeleniumUtils{

	public void launchapp() {
		driver.get("https://www.policybazaar.com/");
		
	}

	public String verifyapp() {
		
		
		return driver.findElement(By.xpath("//img[@alt='Policybazaar']")).getAttribute("alt");
		
		
	}

}
