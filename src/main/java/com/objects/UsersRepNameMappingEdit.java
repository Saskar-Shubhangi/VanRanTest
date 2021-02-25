package com.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepk.BaseClass;

public class UsersRepNameMappingEdit extends BaseClass {
	
	
	@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'Users-RepNames Mapping')])[1]")
	WebElement UserNameRepName;
	
	@FindBy(xpath="/html/body/app/horizontal-layout-1/div/div/div/div/content/app-user-name-rep-name/div/div[2]/div[2]/mat-table/mat-row[1]/mat-cell[3]/button[1]/span/mat-icon")
	WebElement Edit;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-edit-user-name-rep-name/div/div[1]/form/mat-form-field[2]/div/div[1]/div[3]/mat-select/div")
	WebElement drop2;
	
	@FindBy(xpath="//span[contains(text(),' Emily Steczo')]")
	WebElement drop3;
	
	@FindBy(xpath="//span[contains(text(),' Web Portal ')]")
	WebElement drop4;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-edit-user-name-rep-name/div/div[2]/button/span/span")
	WebElement Update;
	

	public void clickOnApplicationSetting()
	{
		ApplicationSetting.click();
	}
	
	public void clickOnUserNameRepName()
	{
		UserNameRepName.click();
	}
	
	public void clickOnEdit()
	{
		Edit.click();
	}
	
	public void clickOndrop2()
	{
		
		drop2.click();
		highlightElement(driver, drop2);
		drop3.click();
		highlightElement(driver, drop3);
		drop4.click();
		highlightElement(driver, drop4);
	}
	public void clickOnUpdate() throws InterruptedException
	{
		highlightElement(driver, Update);
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", Update);
        Thread.sleep(2000);
	}
	
	
	
	

}
