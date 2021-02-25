package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepk.BaseClass;

public class Translations extends BaseClass {
	
	@FindBy(xpath="//span[contains(text(),'Debug')]")
	WebElement Debug;
	
	@FindBy(xpath="//span[contains(text(),'Translations')]")
	WebElement Translations;
	
	@FindBy(xpath="(//div[@class='mat-select-trigger'])[1]")
	WebElement RootDomain;
	
	
	@FindBy(xpath="//span[contains(text(),'vrgsol.com')]")
	WebElement vrgsol;
	
	@FindBy(xpath="(//div[@class='mat-select-trigger'])[2]")
	WebElement Customer;
	
	@FindBy(xpath="//span[contains(text(),' VanRan Internal')]")
	WebElement vanran;
	
	@FindBy(xpath="(//div[@class='mat-select-trigger'])[3]")
	WebElement DialedForm;
	
    @FindBy(xpath="(//span[contains(text(),'10000@vrgsol.com')])[1]")
    WebElement vrgsol1;
    
    @FindBy(xpath="//input[@id='mat-input-0']")
    WebElement DialedNo;
    
    @FindBy(xpath="//span[contains(text(),'OK')]")
    WebElement OK;
    
    public void clickOnDebug() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
	       wait.until(ExpectedConditions.visibilityOf(Debug));
	   	Debug.click(); 
	}
    
    
	public void clickOnTranslations()
	{
		Translations.click();
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
	
	public void clickOnDialedForm() throws InterruptedException
	{
		DialedForm.click();
		highlightElement(driver,DialedForm);
		vrgsol1.click();
		DialedNo.sendKeys("32");
		highlightElement(driver,DialedNo);
		OK.click();
		highlightElement(driver,OK);
		Thread.sleep(2000);
		
	}
	
    
}
