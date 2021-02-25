package com.objects;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepk.BaseClass;

public class UserUpdate extends BaseClass {
	
	
	@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'User')])[1]")
	WebElement User;
	
	@FindBy(xpath="/html/body/app/horizontal-layout-1/div/div/div/div/content/app-list/div/div[2]/div[2]/mat-table/mat-row[1]/mat-cell[8]/button[1]/span/mat-icon")
	WebElement Edit;
	
	@FindBy(xpath="(//div[@class='mat-form-field-infix'])[3]")
	WebElement UserAccess;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option[1]/mat-pseudo-checkbox")
	WebElement Ribbon_KBS;
	
	@FindBy(xpath="//span[contains(text(),'Update')]")
	WebElement Update;
	
	public void clickOnApplicationSetting() 
	{
		ApplicationSetting.click();
	}
	public void clickOnUser()
	{
		User.click();
	}
	public void clickOnEdit()
	{
		Edit.click();
	}
	public void clickOnUserAccess()
	{
		UserAccess.click();
		highlightElement(driver,UserAccess);
		Ribbon_KBS.click();
		highlightElement(driver,Ribbon_KBS);
	}
	public void clickOnUpdate() throws InterruptedException
	{
		Update.click();
		highlightElement(driver,Update);
		Thread.sleep(2000); 
	}
	

}
