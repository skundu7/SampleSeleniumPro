package com.atdd.SampleProject.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.atdd.SampleProject.Utils.SeleniumUtils;
import com.atdd.SampleProject.Utils.XmlUtil;

public class commonmethods extends SeleniumUtils {

	@FindBy(how=How.LINK_TEXT,using="My Policies")
	public WebElement mypolicies;
	
	@FindBy(how = How.XPATH,using="//div[@class='member_block']//label[@class='glyphicon glyphicon-calendar blank_icon']")
	public WebElement calendar;
	
	@FindBy(how=How.XPATH,using="//div[contains(@style,'left: 582.517px; z-index: 1020; display: block')]//div[@class='datetimepicker-days']/table/thead/tr/th[@class='switch']")
	public WebElement monthyear;
	
	
	@FindBy(how=How.XPATH,using="//div[contains(@style,'left: 582.517px; z-index: 1020; display: block')]//div[@class='datetimepicker-months']/table/thead/tr/th[@class='switch']")
	public WebElement currentyear;
	
	@FindBy(how=How.XPATH,using="//div[contains(@style,'display: block')]//div[@class='datetimepicker-years']/table/thead/tr/th[@class='switch']")
	public WebElement yearRange;
	
	@FindBy(how=How.XPATH,using="//div[contains(@style,'display: block')]//div[@class='datetimepicker-years']/table/thead/tr/th[@class='prev']")
	public WebElement backwardcursor;
	
	public String verifyalltabs(String expected) {
		// TODO Auto-generated method stub
		
		 String tab =driver.findElement(By.linkText(expected)).getText();
		 System.out.println(tab);
		 return tab;
	}

	public void clickontab(String arg1) {
		//smallWait.get().until(ExpectedConditions.visibilityOf(mypolicies)).click();
		smallWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.linkText(arg1))).click();
	}

	public void enterdate(String arg1) throws InterruptedException {
		
		String expiryDate=null;
		
		
		 expiryDate = XmlUtil.getTestData("Family/"+arg1, "DOB");
	
		
		int expDay;
		int  expMonth;
		int expYear;
		
		//expiryDate.split("/", 2);
		
		String[] array = expiryDate.split("/");
	int[] integercal = new int[array.length];
	
	for(int i=0;i<integercal.length;i++){
		integercal[i] = Integer.parseInt(array[i]);
	}
	
	expDay = integercal[0];
	expMonth = integercal[1];
	expYear = integercal[2];
	
		
		System.out.println("value of day "+expDay+"Value of month"+expMonth+"value of year"+expYear);
		
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
		Calendar calendarwa = new GregorianCalendar(expYear,expMonth-1,expDay);
		String finaldate= sdf.format(calendarwa.getTime());
		System.out.println(finaldate);
		
		String[] finaldatearr = finaldate.split(" ");
		
		String finalmth = finaldatearr[1];

		System.out.println(finalmth);
		
	     Thread.sleep(5000);
	     
	     
	     
	     mediumWait.get().until(ExpectedConditions.elementToBeClickable(calendar)).click();
         
         String monthyeartext = mediumWait.get().until(ExpectedConditions.visibilityOf(monthyear)).getText();
         System.out.println(monthyeartext);
         smallWait.get().until(ExpectedConditions.visibilityOf(monthyear)).click();
         
         
         
         mediumWait.get().until(ExpectedConditions.visibilityOf(currentyear)).click();
         String yearrangetxet = mediumWait.get().until(ExpectedConditions.visibilityOf(yearRange)).getText();
         System.out.println(yearrangetxet);
         String subyear = yearrangetxet.substring(0, 4);
         int lowerrange = Integer.parseInt(subyear);
         System.out.println("Lower range is"+lowerrange);
         
         
         /*
         do{
        	 mediumWait.get().until(ExpectedConditions.visibilityOf(backwardcursor)).click();
        	 Thread.sleep(5000);
        	 yearrangetxet = mediumWait.get().until(ExpectedConditions.visibilityOf(yearRange)).getText();
             System.out.println(yearrangetxet);
              subyear = yearrangetxet.substring(0, 4);
              lowerrange = Integer.parseInt(subyear);
             System.out.println("Lower range is"+lowerrange);
         }while(expYear<lowerrange);
       */
         
         while(expYear<lowerrange){
      	   mediumWait.get().until(ExpectedConditions.visibilityOf(backwardcursor)).click();
           	 Thread.sleep(5000);
           	 yearrangetxet = mediumWait.get().until(ExpectedConditions.visibilityOf(yearRange)).getText();
           	 Thread.sleep(5000);
                System.out.println(yearrangetxet);
                 subyear = yearrangetxet.substring(0, 4);
                 lowerrange = Integer.parseInt(subyear);
                System.out.println("Lower range is"+lowerrange);
         }
        
         
         mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style,'display: block')]//div[@class='datetimepicker-years']/table/tbody/tr/td/span[contains(text(),'"+expYear+"')]"))).click();
         mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style,'display: block')]//div[@class='datetimepicker-months']/table/tbody/tr/td/span[contains(text(),'"+finalmth+"')]"))).click();
         mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style,'display: block')]//div[@class='datetimepicker-days']/table/tbody/tr/td[@class='day' and text()='"+expDay+"']"))).click();
         
         
	     
		
	}

	public boolean  verifycurrentpage(String arg1) {
		
		String CurrentTitle= driver.getTitle();
		
		System.out.println("current Title"+CurrentTitle);
		System.out.println("Epeted page"+arg1);
	
		if(CurrentTitle.contains(arg1)){
			return true;
		}
		return false;
	
		
	}

}
