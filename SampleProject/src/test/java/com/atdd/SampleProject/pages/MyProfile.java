package com.atdd.SampleProject.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.atdd.SampleProject.Utils.SeleniumUtils;
import com.atdd.SampleProject.Utils.XmlUtil;

public class MyProfile extends SeleniumUtils {
	
	@FindBy(how=How.CLASS_NAME,using="add_member_button")
	public WebElement addfammember;
	

	@FindBy(how=How.XPATH,using="//select[@ng-model='AddFamily.Prefix']")
	public WebElement Title;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='AddFamily.Name']")
	public WebElement membername;
	
	@FindBy(how=How.XPATH,using="//select[@ng-model='AddFamily.Relation']")
	public WebElement memberrelation;
	
	@FindBy(how=How.XPATH,using="//button[contains(@ng-click,'SaveAddMember')]")
	public WebElement savebutton;
	
	@FindBy(how=How.XPATH,using="//em[@class='ng-binding']")
	public WebElement fammember;
	
	@FindBy(how=How.XPATH,using="//span[@class='ng-binding']")
	public WebElement membernumber;
	
	
	
	
	public void clickonaddfamilymemberbtn() {
		smallWait.get().until(ExpectedConditions.visibilityOf(addfammember)).click();
		
	}

	public void entername(String member) {
		scrollbarvertically();
		
		String Titlefromtestdata = XmlUtil.getTestData("Family/"+member, "Title");
		
		mediumWait.get().until(ExpectedConditions.visibilityOf(Title));
		new Select(Title).selectByVisibleText(Titlefromtestdata);
		
		
		mediumWait.get().until(ExpectedConditions.visibilityOf(membername)).sendKeys(XmlUtil.getTestData("Family/"+member, "Name"));
		
	}

	

	public void enterrelation(String member) {
		mediumWait.get().until(ExpectedConditions.visibilityOf(memberrelation)).sendKeys(XmlUtil.getTestData("Family/"+member, "Relation"));
		
	}

	public void clikonsavebutton() {
		mediumWait.get().until(ExpectedConditions.visibilityOf(savebutton)).click();
	}

	public String verifyfamilymember() {
		 String actualfammember =mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[contains(text(),'Dharampal')]"))).getText();
        return actualfammember;
}

	public String verifymembers(String member) {
		
	String Memberactual = mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ng-binding' and contains(text(),'"+member+"')]"))).getText();
	System.out.println("Member name of website   "+Memberactual);
	return Memberactual;

		
			}

	public boolean verifydetailsofmembers(String arg1) {
		
		
		
		String actualRelation = XmlUtil.getTestData("Family/"+arg1,"Relation");
		String actualDOB = XmlUtil.getTestData("Family/"+arg1,"DOB");
		
		
		String epetdRelation= mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'"+actualRelation+"')]"))).getText();
		String epetdDOB= mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'"+actualDOB+"')]"))).getText();
		System.out.println("Relation in tstdata is  "+actualRelation);
		System.out.println("Relation in website is "+epetdRelation);
		System.out.println("DOB in tstdata is  "+actualDOB);
		System.out.println("DOB in website is "+epetdDOB);
		
		if(actualRelation.equalsIgnoreCase(epetdRelation)&&actualDOB.equalsIgnoreCase(epetdDOB))
			return true;
		else			
		return false;
		
		
		
	}
}
