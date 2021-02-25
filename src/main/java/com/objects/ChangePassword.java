package com.objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepk.BaseClass;

public class ChangePassword extends BaseClass {
	
	
	@FindBy(xpath="(//span[contains(text(),'shubhangi.saskar@datafortune.com')])[1]")
	WebElement Email;
	
	@FindBy(xpath="((//span[contains(text(),'Change Password')])[1]")
	WebElement Changepass;
	
	@FindBy(id="mat-input-2")
	WebElement OldPassword;
	
	@FindBy(id="mat-input-3")
	WebElement NewPassword;
	
	@FindBy(id="mat-input-4")
	WebElement ConfirmPassword;
	
	@FindBy(id="login-form")
	WebElement ChangePasswordButton;
	
	@FindBy(xpath="//span[contains(text(),'Change Password')]")
	WebElement ChangePassword;
	
	
	public void changePassword() throws InterruptedException
	{
		Email.click();
		ChangePassword.click();
		
		OldPassword.sendKeys("Test@123");
        NewPassword.sendKeys("Test@1234");
        ConfirmPassword.sendKeys("Test@1234");
        //ChangePasswordButton.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click",ChangePasswordButton);
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(15000);
        js.executeScript("window.scrollBy(1000,0)");

        
       // Alert al= driver.switchTo().alert();
        //al.accept();
	}
	

}
   