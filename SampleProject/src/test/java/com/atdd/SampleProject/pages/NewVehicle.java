package com.atdd.SampleProject.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.atdd.SampleProject.Utils.SeleniumUtils;
import com.atdd.SampleProject.Utils.XmlUtil;

public class NewVehicle extends SeleniumUtils{
	
	@FindBy(how = How.XPATH,using="//Select[@name='product']")
	public WebElement vehicleType;
	
	@FindBy(how = How.XPATH,using="//input[@name='regNo']")
	public WebElement regNo;
	
	@FindBy(how = How.XPATH,using="//Select[@name='make']")
	public WebElement vehicleMake;
	
	@FindBy(how = How.XPATH,using="//Select[@name='model']")
	public WebElement vehicleModel;
	
	@FindBy(how = How.XPATH,using="//Select[@name='verient']")
	public WebElement vehicleVariant;
	
	@FindBy(how = How.XPATH,using="//Select[@ng-model='VehicleFuleType']")
	public WebElement fuelType;
	
	@FindBy(how = How.XPATH,using="//Select[@name='registrationYear']")
	public WebElement regYear;
	
	@FindBy(how = How.XPATH,using="//Select[@name='expiry']")
	public WebElement policyExpDate;
	
	@FindBy(how = How.XPATH,using="//button[@type='submit']")
	public WebElement submitBtn;
	
	@FindBy(how = How.XPATH,using="//label[@class='glyphicon glyphicon-calendar blank_icon']")
	public WebElement calendar;
	
	@FindBy(how=How.XPATH,using="//div[@class='datetimepicker-days']/table/thead/tr/th[@class='switch']")
	public WebElement monthyear;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='datetimepicker-months']/table/thead/tr/th[@class='switch']")
	public WebElement currentyear;
	
	@FindBy(how=How.XPATH,using="//div[@class='datetimepicker-years']/table/thead/tr/th[@class='switch']")
	public WebElement yearRange;
	
	@FindBy(how=How.XPATH,using="//div[@class='datetimepicker-years']/table/thead/tr/th[@class='prev']")
	public WebElement backwardcursor;
			
	public void addnewvehicle(String arg1) throws InterruptedException {
		
	
		//input vehile type
		smallWait.get().until(ExpectedConditions.visibilityOf(vehicleType));
           
		new Select(vehicleType).selectByVisibleText(XmlUtil.getTestData("Vehicles/Cars/"+arg1, "VehicleType"));
         
         
          
        //input reg no
           mediumWait.get().until(ExpectedConditions.visibilityOf(regNo)).sendKeys(XmlUtil.getTestData("Vehicles/Cars/"+arg1, "RegNo"));
           
           //input vehicle make
           mediumWait.get().until(ExpectedConditions.visibilityOf(vehicleMake));
           new Select(vehicleMake).selectByVisibleText(XmlUtil.getTestData("Vehicles/Cars/"+arg1, "VehicleMake"));
          
        
           
           //select vehicle model
           
           smallWait.get().until(ExpectedConditions.visibilityOf(vehicleModel));
          new Select(vehicleModel).selectByVisibleText(XmlUtil.getTestData("Vehicles/Cars/"+arg1, "VehicleModel"));
           
           
           
           //Select variant
           
           smallWait.get().until(ExpectedConditions.visibilityOf(vehicleVariant));
           new Select(vehicleVariant).selectByVisibleText(XmlUtil.getTestData("Vehicles/Cars/"+arg1, "VehicleVariant"));
           
          
           
           mediumWait.get().until(ExpectedConditions.visibilityOf(fuelType));
           new Select(fuelType).selectByVisibleText(XmlUtil.getTestData("Vehicles/Cars/"+arg1, "FuelType"));
           
           
           mediumWait.get().until(ExpectedConditions.visibilityOf(regYear));
          new Select(regYear).selectByVisibleText(XmlUtil.getTestData("Vehicles/Cars/"+arg1, "RegYear"));
           
         
          
          
        //div[@class='datetimepicker-years']/table/tbody/tr/td/span[text()="expYear"]
          
     
          
           
         //  smallWait.get().until(ExpectedConditions.visibilityOf(policyExpDate)).sendKeys(arg0);
	}

	public void verifynewvehiceisadded() {
		// TODO Auto-generated method stub
		
	}

	public void enterexpirydate(String arg1, String arg2, String arg3) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String expiryDate=null;
		
		
		 expiryDate = XmlUtil.getTestData("Vehicles/"+arg2+"/"+arg3, arg1);
		 System.out.println(expiryDate);
	
		
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
        
        mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datetimepicker-years']/table/tbody/tr/td/span[contains(text(),'"+expYear+"')]"))).click();
        mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datetimepicker-months']/table/tbody/tr/td/span[contains(text(),'"+finalmth+"')]"))).click();
        mediumWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datetimepicker-days']/table/tbody/tr/td[@class='day' and text()='"+expDay+"']"))).click();
        
		
		
	}

}
