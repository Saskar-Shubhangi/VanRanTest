package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepk.BaseClass;

public class CustomerDetails extends BaseClass {
	

	@FindBy(xpath="(//span[contains(text(),'Reports')])[1]")
	WebElement Reports;
	
	@FindBy(xpath="//span[contains(text(),'Customers Detail')]")
	WebElement CustomerDetails;
	
	public void clickOnReports()
	{
		Reports.click();
	}
	
	public void clickOnCustomerDetails() throws InterruptedException
	{
		CustomerDetails.click();
		driver.get("http://pkharche:Datafortune!2021@172.30.1.121");
		Thread.sleep(2000);
	}
	

}
