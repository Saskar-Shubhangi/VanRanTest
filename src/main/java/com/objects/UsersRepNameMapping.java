package com.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepk.BaseClass;

public class UsersRepNameMapping extends BaseClass{

	@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'Users-RepNames Mapping')])[1]")
	WebElement UserNameRepName;
	
	@FindBy(xpath="(//span[contains(text(),'ADD NEW')])[1]")
	WebElement AddNew;
	
	@FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[2]")
	WebElement drop;
	
	@FindBy(xpath="//span[contains(text(),' Admin1@admin.com')]")
	WebElement drop1;
	
	@FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[3]")
	WebElement drop2;
	
	@FindBy(xpath="//span[contains(text(),' Emily Steczo')]")
	WebElement drop3;
	
	@FindBy(xpath="//span[contains(text(),' Web Portal ')]")
	WebElement drop4;
	
	@FindBy(xpath="(//span[contains(text(),'Add')])[2]")
	WebElement Add;
	
	public void clickOnApplicationSetting()
	{
		ApplicationSetting.click();
	}
	
	public void clickOnUserNameRepName()
	{
		UserNameRepName.click();
	}
	
	public void clickOnAddNew() throws InterruptedException
	{
		AddNew.click();
		//drop.click();
		
		highlightElement(driver, drop);
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", drop);
        WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(drop));
        
		
		
	}
	
	public void clickOndrop1()
	{
		drop1.click();
		highlightElement(driver, drop1);
		
		drop2.click();
		highlightElement(driver, drop2);
		drop3.click();
		highlightElement(driver, drop3);
		drop4.click();
		highlightElement(driver, drop4);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(drop4));
		
	}
	public void clickOnAdd()
	{
		highlightElement(driver, Add);
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", Add);
        WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(Add));
	}
	
	
	
	
	
	
}
