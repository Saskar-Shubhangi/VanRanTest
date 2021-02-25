package com.vanran.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basepk.BaseClass;
import com.objects.EnhancedProjectStatus;
import com.objects.Login;
import com.objects.Translations;

public class EnhancedProjectStatusTest extends BaseClass{
	

	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();
 
	}
	
	@Test(priority=1)
	public void verifyclickOnReports()
	{
		EnhancedProjectStatus eps=PageFactory.initElements(driver, EnhancedProjectStatus.class);
	eps.clickOnReports();
	}
	
	@Test(priority=3)
	public void verifyclickOnEnhancedProjectStatus() throws InterruptedException
	{
		EnhancedProjectStatus eps=PageFactory.initElements(driver, EnhancedProjectStatus.class);
	eps.clickOnEnhancedProjectStatus();
	}

}
