package com.vanran.tests;

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
import com.objects.Item;
import com.objects.Login;
import com.objects.UsersRepNameMapping;

public class UsersRepNameMappingTest extends BaseClass{
	
	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();
 
	}
	
	@Test(priority=1)
	public void verifyclickOnApplicationSetting() throws  InterruptedException
	{
		UsersRepNameMapping um=PageFactory.initElements(driver, UsersRepNameMapping.class);
	um.clickOnApplicationSetting();
	}
	
	@Test(priority=2)
	public void verifyclickOnUserNameRepName()
	{
		UsersRepNameMapping um=PageFactory.initElements(driver, UsersRepNameMapping.class);
	um.clickOnUserNameRepName();
	}
	
	@Test(priority=3)
	public void verifyclickOnAddNew() throws InterruptedException
	{
		UsersRepNameMapping um=PageFactory.initElements(driver, UsersRepNameMapping.class);
	um.clickOnAddNew();
	}
	
	@Test(priority=4)
	public void verifyclickOndrop1()
	{
		UsersRepNameMapping um=PageFactory.initElements(driver, UsersRepNameMapping.class);
	um.clickOndrop1();
	}
	
	@Test(priority=5)
	public void verifyclickOnAdd()
	{
		UsersRepNameMapping um=PageFactory.initElements(driver, UsersRepNameMapping.class);
	um.clickOnAdd();
	}
	
	
	      
	}
	


  

