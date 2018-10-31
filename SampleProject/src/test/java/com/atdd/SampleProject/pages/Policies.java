package com.atdd.SampleProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.atdd.SampleProject.Utils.SeleniumUtils;

public class Policies extends SeleniumUtils{
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'car')]")
	public WebElement carpolicytab;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'two wheeler')]")
	public WebElement bikepolicytab;
	
	@FindBy(how=How.LINK_TEXT,using="My Policies")
	public WebElement mypolicies;

	public String verifyallpolicies(String arg1) {
		
		
		
		return smallWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='"+arg1+"']"))).getAttribute("alt");
		// TODO Auto-generated method stub
		
	}

	public void clickoncarpoliciestab() {
		// TODO Auto-generated method stub
	 mediumWait.get().until(ExpectedConditions.visibilityOf(carpolicytab)).click();
	}

	public void clickontwowheelerpolicytab() {
		mediumWait.get().until(ExpectedConditions.visibilityOf(bikepolicytab)).click();
		
	}

	public String verifycarpolicies(String expectedVal) {
		return smallWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='"+expectedVal+"']"))).getAttribute("alt");
		
	}

	public String verifybikepolicies(String expectedVal) {
		return smallWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='"+expectedVal+"']"))).getAttribute("alt");
		
	}

	

}
