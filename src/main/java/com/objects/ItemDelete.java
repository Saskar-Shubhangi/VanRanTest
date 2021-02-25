package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemDelete {
	

	@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'Items')])[1]")
	WebElement Items;
	
	@FindBy(xpath="/html/body/app/horizontal-layout-1/div/div/div/div/content/app-list/div/div[2]/div[2]/mat-table/mat-row[4]/mat-cell[6]/button[2]/span/mat-icon")
	WebElement Delete;
	
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement YesButton;
	
	public void clickOnApplicationSetting()
	{
		ApplicationSetting.click();
	}

	public void clickOnItems()
	{
		Items.click();
	}

	public void clickOnDelete() throws InterruptedException
	{
		
		Delete.click();
		Thread.sleep(2000);
		YesButton.click();
		Thread.sleep(5000); 
	}	
	
	
	

}
