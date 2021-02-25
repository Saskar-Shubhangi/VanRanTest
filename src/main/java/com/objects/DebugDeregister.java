package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepk.BaseClass;

public class DebugDeregister extends BaseClass {
	
	@FindBy(xpath="//span[contains(text(),'Debug')]")
	WebElement Debug;
	
	@FindBy(xpath="//span[contains(text(),'Deregister Debug')]")
	WebElement DeregisterDebug;
	
	@FindBy(xpath="(//div[@class='mat-select-trigger'])[1]")
	WebElement RootDomain;
	
	@FindBy(xpath="//span[contains(text(),'vrgsol.com')]")
	WebElement vrgsol;
	
	@FindBy(xpath="(//div[@class='mat-select-trigger'])[2]")
	WebElement Customer;
	
	@FindBy(xpath="//span[contains(text(),' VanRan Internal')]")
	WebElement vanran;
	
	@FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[3]")
	WebElement Subscriber;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span")
	WebElement vrgsol1;
	
	@FindBy(xpath="(//div[@class='mat-slide-toggle-thumb'])[1]")
	WebElement Register;
	
	@FindBy(xpath="//span[contains(text(),'OK')]")
	WebElement OK;
	
	public void clickOnDebug() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
	       wait.until(ExpectedConditions.visibilityOf(Debug));
	   	Debug.click(); 
	}
	
	public void clickOnDeregisterDebug() 
	{
		
	       DeregisterDebug.click(); 
	}
	
	
	public void clickOnRootDomain() 
	{
		
		RootDomain.click();
		highlightElement(driver,RootDomain);
		vrgsol.click();
	}
	
	public void clickOnCustomer() 
	{
		
		Customer.click();
		highlightElement(driver,Customer);
		vanran.click();
	}
	public void clickOnSubscriber()
	{
		Subscriber.click();
		highlightElement(driver,Customer);
		vrgsol1.click();
		highlightElement(driver,Customer);
		Register.click();
	}
	
	public void clickOnOK()
	{
		OK.click();
	}
}
