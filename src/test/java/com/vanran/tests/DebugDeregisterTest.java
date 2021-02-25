package com.vanran.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.basepk.BaseClass;
import com.objects.DebugDeregister;
import com.objects.Login;
import com.objects.Translations;

public class DebugDeregisterTest extends BaseClass {
	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();
 
	}
	
	@Test(priority=1)
	public void verifyclickOnDebug()
	{
		DebugDeregister dd=PageFactory.initElements(driver, DebugDeregister.class);
	dd.clickOnDebug();
	}
	
	@Test(priority=2)
	public void verifyclickOnDeregisterDebug()
	{
		DebugDeregister dd=PageFactory.initElements(driver, DebugDeregister.class);
	dd.clickOnDeregisterDebug();
	}
		
			
	@Test(priority=3)
	public void verifyclickOnRootDomain()
	{
		DebugDeregister dd=PageFactory.initElements(driver, DebugDeregister.class);
	dd.clickOnRootDomain();
	}	   
	
	
	@Test(priority=4)
	public void verifyclickOnCustomer()
	{
		DebugDeregister dd=PageFactory.initElements(driver, DebugDeregister.class);
	dd.clickOnCustomer();
	}	   
	      
	@Test(priority=5)
	public void verifyclickOnSubscriber()
	{
		DebugDeregister dd=PageFactory.initElements(driver, DebugDeregister.class);
	dd.clickOnSubscriber();
	}
	
	@Test(priority=6)
	public void verifyclickOnOK()
	{
		DebugDeregister dd=PageFactory.initElements(driver, DebugDeregister.class);
	dd.clickOnOK();
	}
	}



