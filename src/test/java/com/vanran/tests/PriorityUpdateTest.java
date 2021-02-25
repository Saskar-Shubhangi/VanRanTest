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
import com.objects.Login;
import com.objects.PriorityUpdate;

public class PriorityUpdateTest extends BaseClass{
	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();

	}
	
	@Test(priority = 1 )
	public void verifyclickOnApplicationSetting() throws InterruptedException {

		PriorityUpdate pu = PageFactory.initElements(driver, PriorityUpdate.class);
		pu.clickOnApplicationSetting();
	}
	
	
	@Test(priority = 2 )
	public void verifyclickOnPriority() throws InterruptedException {

		PriorityUpdate pu = PageFactory.initElements(driver, PriorityUpdate.class);
		pu.clickOnPriority();
	}
	
	@Test(priority = 3 )
	public void verifyclickOnUpdate() throws InterruptedException {

		PriorityUpdate pu = PageFactory.initElements(driver, PriorityUpdate.class);
		pu.clickOnUpdate();
	}
	
	@Test(priority = 4 )
	public void verifyclickOnStartRange() throws InterruptedException {

		PriorityUpdate pu = PageFactory.initElements(driver, PriorityUpdate.class);
		pu.clickOnStartRange();
	}
	
	@Test(priority = 4 )
	public void clickOnLastRange() throws InterruptedException {

		PriorityUpdate pu = PageFactory.initElements(driver, PriorityUpdate.class);
		pu.clickOnLastRange();
	}
	
	@Test(priority = 5 )
	public void clickOnUpdateButton() throws InterruptedException {

		PriorityUpdate pu = PageFactory.initElements(driver, PriorityUpdate.class);
		pu.clickOnUpdateButton();
	}

	
	
	
}
