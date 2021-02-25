package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepk.BaseClass;

public class PriorityUpdate extends BaseClass {

	@FindBy(xpath = "(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;

	@FindBy(xpath = "(//span[contains(text(),'Priority')])[1]")
	WebElement Priority;

	

	@FindBy(xpath = "/html/body/app/horizontal-layout-1/div/div/div/div/content/priority/div[1]/div[2]/div[2]/mat-card/div/mat-table/mat-row[1]/mat-cell[12]/span/mat-icon[1]")
	WebElement Update;

	@FindBy(xpath = "//input[@id='mat-input-116']")
	WebElement SDays;

	@FindBy(xpath = "//input[@id='mat-input-117']")
	WebElement SHour;

	@FindBy(xpath = "//input[@id='mat-input-118']")
	WebElement SMinute;

	@FindBy(xpath = "//input[@id='mat-input-119']")
	WebElement LDays;

	@FindBy(xpath = "//input[@id='mat-input-120']")
	WebElement LHour;

	@FindBy(xpath = "//input[@id='mat-input-121']")
	WebElement LMinute;

	@FindBy(xpath = "(//span[contains(text(),'Update')]) [2]")
	WebElement Update1;

	public void clickOnApplicationSetting() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(ApplicationSetting));
		ApplicationSetting.click();
	}

	public void clickOnPriority() {
		Priority.click();
	}

	public void clickOnUpdate() {
		Update.click();
	}

	public void clickOnStartRange() {
		
		SDays.click();
		SDays.clear();
		SDays.sendKeys("120");
		SHour.click();
		SHour.clear();
		SHour.sendKeys("12");
		SMinute.click();
		SMinute.clear();
		SMinute.sendKeys("45");
	}

	public void clickOnLastRange() throws InterruptedException {
		
		LDays.click();
		LDays.clear();
		LDays.sendKeys("130");
		LHour.click();
		LHour.clear();
		LHour.sendKeys("21");
		LMinute.click();
		LMinute.clear();
		LMinute.sendKeys("55");
	}
	public void clickOnUpdateButton() throws InterruptedException {
		Update1.click();
		Thread.sleep(2000);

	}

}
