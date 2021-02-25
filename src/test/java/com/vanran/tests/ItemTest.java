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
import com.objects.CheckPriority;
import com.objects.Item;
import com.objects.Login;

public class ItemTest extends BaseClass {

	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();
 
	}
	
	@Test(priority=1)
	public void verifyclickOnApplicationSetting() throws  InterruptedException
	{
		Item i=PageFactory.initElements(driver, Item.class);
	i.clickOnApplicationSetting();
	}
	
	
	@Test(priority=2)
	public void verifyclickOnItems()
	{
		Item i=PageFactory.initElements(driver, Item.class);
	i.clickOnItems();
	}
	

	@Test(priority=3)
	public void verifyclickOnAddNew()
	{
		Item i=PageFactory.initElements(driver, Item.class);
	i.clickOnAddNew();
	}
	
	@Test(priority=4)
	public void verifyclickOnItemsID() throws InterruptedException
	{
		Item i=PageFactory.initElements(driver, Item.class);
	i.clickOnItemsID();
	}
	
	        
	        
	        
	        
	        
	}        
	       
