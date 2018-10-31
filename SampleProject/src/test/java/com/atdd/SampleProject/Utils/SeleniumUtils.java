package com.atdd.SampleProject.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;




public class SeleniumUtils {
	
	public  WebDriver driver = null;
	
	public static final int Small_Wait_Time =5;
	public static final int Medium_Wait_Time =20;
	public static final int Long_Wait_Time =40;
	
	public static ThreadLocal<WebDriverWait> smallWait = new ThreadLocal<WebDriverWait>();
	public static ThreadLocal<WebDriverWait> mediumWait = new ThreadLocal<WebDriverWait>();
	public static ThreadLocal<WebDriverWait> longWait = new ThreadLocal<WebDriverWait>();
	
	
	
	
	
	public SeleniumUtils(){
		
		try{
			if(driver==null){
				
				driver = DriverFactory.Createandgetdevicedriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				PageFactory.initElements(driver, this);
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
	}
		
		
}

	public void scrollToElement(WebElement element){
		
		try{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		System.out.println("<<<<<<<Sroll till element visisble>>>>>>>>");
	}catch(Exception e){
		System.out.println("Element no found"+e);
	}
	}
	
	public void scrollbarvertically(){
		try{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,1000)");
			
		}catch(Exception e){
			System.out.println("Vertialy not srollong");
			
		}
	}


}