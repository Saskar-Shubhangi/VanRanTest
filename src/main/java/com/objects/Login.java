package com.objects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.basepk.BaseClass;

public class Login extends BaseClass {
	
		
		 
	       @FindBy(id="mat-input-0")
	       WebElement Email;
	       
	       @FindBy(id="mat-input-1")
	       WebElement Password;
	       
	       @FindBy(xpath="//span[contains(text(),'LOGIN')]")
	       WebElement LOGIN;
	       
	      public void login() throws InterruptedException
	      
	      {
	    	  Email.sendKeys(prop.getProperty("Email"));
		        Password.sendKeys(prop.getProperty("Password"));
		        LOGIN.click();
		        Thread.sleep(2000); 
	      }
	       
	       
	        
	      
}
