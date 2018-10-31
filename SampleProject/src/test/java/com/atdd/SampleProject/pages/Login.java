package com.atdd.SampleProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.atdd.SampleProject.Utils.SeleniumUtils;

public class Login extends SeleniumUtils {
	
	@FindBy(how=How.XPATH,using="//div[@id='navbar']//a[contains(text(),'My Account')]")
	public WebElement myaccount;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Mobile No']")
	public WebElement mobnumber;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Proceed')]")
	public WebElement proceed;

	@FindBy(how=How.XPATH, using="//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(how=How.LINK_TEXT,using="Later")
	public WebElement later;
	
	@FindBy(how=How.LINK_TEXT,using="Dashboard")
	public WebElement Dashboard;
	
	public void clickonMyaccount() {
		myaccount.click();
		
	}

	public void enterMobnumber() {
		smallWait.get().until(ExpectedConditions.visibilityOf(mobnumber)).sendKeys("8375964621");
		
	}

	public void clickonproceedbtn() {
		proceed.click();
		
	}

	public void enterpassword() throws InterruptedException {
		Thread.sleep(3000);
		password.sendKeys("Abcd1234!");
		
	}

	public void clickonproceedagain() {
		proceed.click();
		
	}

	public String verifylogin() {
		
		return Dashboard.getText();
		
		
	}

}
