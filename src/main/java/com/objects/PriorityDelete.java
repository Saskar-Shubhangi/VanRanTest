package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepk.BaseClass;

public class PriorityDelete extends BaseClass{

	
	@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'Priority')])[1]")
	WebElement Priority;
	
	@FindBy(xpath="/html/body/app/horizontal-layout-1/div/div/div/div/content/priority/div[1]/div[2]/div[2]/mat-card/div/mat-table/mat-row[1]/mat-cell[12]/span/mat-icon[2]")
	WebElement Delete;
	
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement YesButton;
	
public void clickOnApplicationSetting()
{
	ApplicationSetting.click();
}

public void clickOnPriority()
{
	Priority.click();
}

public void clickOnDelete() throws InterruptedException
{
	
	Delete.click();
	Thread.sleep(2000);
	YesButton.click();
	Thread.sleep(5000); 
}	
}	

