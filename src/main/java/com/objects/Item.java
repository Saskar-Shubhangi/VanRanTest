package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepk.BaseClass;

public class Item extends BaseClass {

	
	@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'Items')])[1]")
	WebElement Items;
	

	@FindBy(xpath="//span[contains(text(),'ADD NEW')]")
	WebElement ADDNEW;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-edit/div/div[1]/form/mat-form-field[1]/div/div[1]/div[3]/input")
	WebElement ItemsID;
	
	@FindBy(xpath="//span[contains(text(),'219221 ')]")
	WebElement drop;
	
	@FindBy(id="mat-checkbox-4")
	WebElement check;
	
	@FindBy(xpath="(//span[contains(text(),'Add')])[2]")
	WebElement ADD;
	
	public void clickOnApplicationSetting() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
	       wait.until(ExpectedConditions.visibilityOf(ApplicationSetting));
	   	ApplicationSetting.click(); 
	}
	
	public void clickOnItems()
	{
		Items.click();
	}
	public void clickOnAddNew()
	{
		ADDNEW.click();
	}
	public void clickOnItemsID() throws InterruptedException 
	{
		 ItemsID.sendKeys("221");
		 drop.click();
		 check.click();
		 ADD.click();
Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	
}
