package com.atdd.SampleProject.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.deps.com.thoughtworks.xstream.InitializationException;

public class DriverFactory {

 private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	


public static  WebDriver Createandgetdevicedriver(){
	if(driver.get()!=null){
		return driver.get();
	}
	
	String BrowserType = System.getProperty("BrowserType");
	
	if(BrowserType.equalsIgnoreCase("Firefox")){
		
		FirefoxProfile ffprofile = new FirefoxProfile();
		ffprofile.setPreference("dom.disable_open_during_load", false);
		ffprofile.setPreference("dom.webnotifications.enabled", false);
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, ffprofile);
		capabilities.setCapability("marionette", true);
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		setDriver(new FirefoxDriver(capabilities));
		
		SeleniumUtils.smallWait.set(new WebDriverWait(getDeviceDriver(), SeleniumUtils.Small_Wait_Time));
		SeleniumUtils.mediumWait.set(new WebDriverWait(getDeviceDriver(), SeleniumUtils.Medium_Wait_Time));
		SeleniumUtils.longWait.set(new WebDriverWait(getDeviceDriver(), SeleniumUtils.Long_Wait_Time));
		
	}
	
	return getDeviceDriver();
	
	
}



private static void setDriver(WebDriver inputdriver) {
	// TODO Auto-generated method stub
	driver.set(inputdriver);
	
}



private static WebDriver getDeviceDriver() {
	if(driver!=null){
		return driver.get();
	}
	throw new InitializationException("Browser not initialized");
}



public static boolean closeDeviceDriver() {
	// TODO Auto-generated method stub
	try{
		
		WebDriver currentDriver = getDeviceDriver();
		if(currentDriver!=null){
			setDriver(null);
			currentDriver.quit();
		}
		return getDeviceDriver()==null;
	}catch (Exception e){
		return true;
	}
	
}


}