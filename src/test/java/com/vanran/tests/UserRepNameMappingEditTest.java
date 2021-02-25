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
import com.objects.Login;
import com.objects.UsersRepNameMapping;
import com.objects.UsersRepNameMappingEdit;

public class UserRepNameMappingEditTest extends BaseClass {
	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();
 
	}
	
	@Test(priority=1)
	public void verifyclickOnApplicationSetting() throws  InterruptedException
	{
		UsersRepNameMappingEdit ume=PageFactory.initElements(driver, UsersRepNameMappingEdit.class);
	ume.clickOnApplicationSetting();
	}
	
	@Test(priority=2)
	public void verifyclickOnUserNameRepName()
	{
		UsersRepNameMappingEdit ume=PageFactory.initElements(driver, UsersRepNameMappingEdit.class);
	ume.clickOnUserNameRepName();
	}
	
	@Test(priority=3)
	public void verifyclickOnEdit()
	{
		UsersRepNameMappingEdit ume=PageFactory.initElements(driver, UsersRepNameMappingEdit.class);
	    ume.clickOnEdit();
	}
	
	@Test(priority=4)
	public void verifyclickOndrop2()
	{
		UsersRepNameMappingEdit ume=PageFactory.initElements(driver, UsersRepNameMappingEdit.class);
	    ume.clickOndrop2();
	}
	
	@Test(priority=5)
	public void verifyclickUpdate() throws InterruptedException
	{
		UsersRepNameMappingEdit ume=PageFactory.initElements(driver, UsersRepNameMappingEdit.class);
	    ume.clickOnUpdate();
	}
	
}
	