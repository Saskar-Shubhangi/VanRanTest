package com.vanran.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.basepk.BaseClass;
import com.objects.Login;
import com.objects.PriorityDelete;
import com.objects.UserScreen;

public class UserScreenTest extends BaseClass{
	
	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();

	}
	
	@Test(priority = 1 )
	public void verifyclickOnApplicationSetting() throws InterruptedException {

		UserScreen us = PageFactory.initElements(driver, UserScreen.class );
		us.clickOnApplicationSetting();
	}
	
	@Test(priority = 2 )
	public void verifyclickOnUser() throws InterruptedException {

		UserScreen us = PageFactory.initElements(driver, UserScreen.class );
		us.clickOnUser();
	}
	
	@Test(priority = 3)
	public void verifyclickOnAddNew() throws InterruptedException {

		UserScreen us = PageFactory.initElements(driver, UserScreen.class );
		us.clickOnAddNew();
	}
	
	
	@Test(priority = 4)
	public void verifyclickOnRole() throws InterruptedException {

		UserScreen us = PageFactory.initElements(driver, UserScreen.class );
		us.clickOnRole();
	}
	
	@Test(priority = 5)
	public void verifyclickOnAdd() throws InterruptedException {

		UserScreen us = PageFactory.initElements(driver, UserScreen.class );
		us.clickOnAdd();
	}
	
	
	
	
	
	
	        
	}

	
	
	
	

