package com.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepk.BaseClass;

public class UserScreen extends BaseClass{
	
@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'User')])[1]")
	WebElement User;
	
	@FindBy(xpath="(//span[contains(text(),'ADD NEW')])[1]")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement UserEmail;
	
	@FindBy(xpath="(//div[@class='mat-form-field-infix'])[2]")
	WebElement Role;
	
	@FindBy(xpath="(//span[contains(text(),'Admin')])[3]")
	WebElement Admin;
	
	@FindBy(xpath="(//div[@class='mat-form-field-infix'])[3]")
	WebElement UserAccess;
	
	@FindBy(xpath="//mat-option/span[contains(text(),'Ribbon_KBS')]")
	WebElement Ribbon_KBS;
	
	//@FindBy(xpath="//button[@class='save-user-button mat-raised-button ng-tns-c42-73 ng-star-inserted']")
	@FindBy(xpath="//span[contains(text(),'ADD')]")
	WebElement ADD;
	
	public void clickOnApplicationSetting()
	{
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(ApplicationSetting));
		ApplicationSetting.click();
	}
	
	public void clickOnUser() {
		
		User.click();
	}
	
	public void clickOnAddNew() throws InterruptedException
	{
		
		highlightElement(driver, AddNew);
		AddNew.click();
		Thread.sleep(2000);
		
	
		
	    UserEmail.sendKeys("mewaped796@1adir.com");
	    highlightElement(driver, UserEmail);
	}
	public void clickOnRole() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(Role));
	    highlightElement(driver, Role);
	    Role.click();
	   
	    highlightElement(driver, Admin);
	    Admin.click();
	    Thread.sleep(2000);
	    highlightElement(driver, UserAccess);
	    UserAccess.click();
	    highlightElement(driver, Ribbon_KBS);
	    //Ribbon_KBS.click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", Ribbon_KBS);
	}
	public void clickOnAdd() throws InterruptedException
	{
	    //ADD.click();
		
		
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(ADD));
        highlightElement(driver, ADD);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ADD);
	    Thread.sleep(5000); 
	}

	
	
	
	
	
	
	
	
	
	
	

}
