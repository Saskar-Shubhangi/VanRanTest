package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepk.BaseClass;

public class ServiceOrderDashboard extends BaseClass{
	
	
	@FindBy(xpath="(//span[contains(text(),'Reports')])[1]")
	WebElement Reports;
	
	@FindBy(xpath="//span[contains(text(),'Customers Detail')]")
	WebElement ServiceOrderDashboard;
	
	public void clickOnReports()
	{
		Reports.click();
	}
	
	public void clickOnServiceOrderDashboard() throws InterruptedException
	{
		ServiceOrderDashboard.click();
		driver.get("http://pkharche:Datafortune!2021@172.30.1.121");
		Thread.sleep(2000);
	}
	


}
