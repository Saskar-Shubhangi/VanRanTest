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
import org.testng.annotations.Test;

import com.basepk.BaseClass;
import com.objects.Login;
import com.objects.PriorityUpdate;
import com.objects.UserScreen;
import com.objects.UserUpdate;

public class UserUpdateTest extends BaseClass{
	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();

	}

	

	@Test(priority = 1 )
	public void verifyclickOnApplicationSetting() throws InterruptedException {

		UserUpdate up = PageFactory.initElements(driver, UserUpdate.class );
		up.clickOnApplicationSetting();
	}
	
	@Test(priority = 2 )
	public void verifyclickOnUser()  {

		UserUpdate up = PageFactory.initElements(driver, UserUpdate.class );
		up.clickOnUser();
	}
	
	
	@Test(priority = 3 )
	public void verifyclickOnEdit()  {

		UserUpdate up = PageFactory.initElements(driver, UserUpdate.class );
		up.clickOnEdit();
	}
	
	@Test(priority = 4)
	public void verifyclickOnUserAccess()  {

		UserUpdate up = PageFactory.initElements(driver, UserUpdate.class );
		up.clickOnUserAccess();
	}
	
	@Test(priority = 5)
	public void verifyclickOnUpdate() throws InterruptedException  {

		UserUpdate up = PageFactory.initElements(driver, UserUpdate.class );
		up.clickOnUpdate();
	}
	
} 
  
  
  
  
 