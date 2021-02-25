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
import com.objects.Item;
import com.objects.ItemEdit;
import com.objects.Login;

public class ItemsEditTest extends BaseClass{

	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();
 
	}
	
	
	
	@Test(priority=1)
	public void verifyclickOnApplicationSetting() throws  InterruptedException
	{
		ItemEdit ie=PageFactory.initElements(driver, ItemEdit.class);
	ie.clickOnApplicatiOnSetting();
	}
	
	
	@Test(priority=2)
	public void verifyclickOnItems()
	{
		ItemEdit ie=PageFactory.initElements(driver, ItemEdit.class);
	ie.clickOnItems();
	}
 
	
	@Test(priority=3)
	public void verifyclickOnEdit()
	{
		ItemEdit ie=PageFactory.initElements(driver, ItemEdit.class);
	ie.clickOnEdit();
	}
	
	@Test(priority=4)
	public void verifyclickOnCheckBox()
	{
		ItemEdit ie=PageFactory.initElements(driver, ItemEdit.class);
	ie.clickOnCheckBox();
	}
 
	@Test(priority=5)
	public void verifyclickOnUpdate() throws InterruptedException
	{
		ItemEdit ie=PageFactory.initElements(driver, ItemEdit.class);
	ie.clickOnUpdate();
	}    
  }

