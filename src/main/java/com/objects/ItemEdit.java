package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepk.BaseClass;

public class ItemEdit extends BaseClass {

	
	@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'Items')])[1]")
	WebElement Items;
	
	@FindBy(xpath="/html/body/app/horizontal-layout-1/div/div/div/div/content/app-list/div/div[2]/div[2]/mat-table/mat-row[1]/mat-cell[6]/button/span/mat-icon")
	WebElement Edit;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-edit/div/div[1]/form/mat-checkbox[1]/label/div")
	WebElement option1;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-edit/div/div[1]/form/mat-checkbox[2]/label/div")
	WebElement option2;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-edit/div/div[1]/form/mat-checkbox[3]/label/div")
	WebElement option3;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-edit/div/div[2]/button/span/span")
	WebElement Update;
	
	public void clickOnApplicatiOnSetting() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
	       wait.until(ExpectedConditions.visibilityOf(ApplicationSetting));
	   	ApplicationSetting.click(); 
	}
	
	public void clickOnItems()
	{
		Items.click();
	}
	
	public void clickOnEdit()
	{
		Edit.click();
	}
	
	public void clickOnCheckBox()
	{
		option1.click();
		option2.click();
		option3.click();
	}
	
	public void clickOnUpdate() throws InterruptedException
	{
		Update.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
}
