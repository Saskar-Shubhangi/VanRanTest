package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepk.BaseClass;

public class UploadFile extends BaseClass{
	
	@FindBy(id="mat-select-0")
	WebElement Search;
	
	@FindBy(xpath="/html/body/app/horizontal-layout-1/div/div/div/div/content/app-dashboard/div/div[2]/div[2]/div/form/div/div[1]/div[2]/span")
	WebElement UploadElement;
	
	
	
	
}
