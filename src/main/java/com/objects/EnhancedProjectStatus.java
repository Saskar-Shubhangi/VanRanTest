package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepk.BaseClass;

public class EnhancedProjectStatus extends BaseClass{

	
	@FindBy(xpath="(//span[contains(text(),'Reports')])[1]")
	WebElement Reports;
	
	@FindBy(xpath="//span[contains(text(),'Enhanced Project Status')]")
	WebElement EnhancedProjectStatus;
	
	public void clickOnReports()
	{
		Reports.click();
	}
	
	public void clickOnEnhancedProjectStatus() throws InterruptedException
	{
		EnhancedProjectStatus.click();
		driver.get("http://pkharche:Datafortune!2021@172.30.1.121");
		Thread.sleep(2000);
	}
	
	
}

