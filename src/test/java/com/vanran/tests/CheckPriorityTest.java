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
import com.objects.CheckPriority;
import com.objects.Login;

public class CheckPriorityTest extends BaseClass {

	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();

	}
@Test(priority=1)
public void verifyclickOnApplicationSetting()
{
	CheckPriority p=PageFactory.initElements(driver, CheckPriority.class);
	p.clickOnApplicationSetting();
}

@Test(priority=2)
public void verifyclickOnPriority() throws InterruptedException
{
	CheckPriority p=PageFactory.initElements(driver, CheckPriority.class);
	p.clickOnPriority();
}

@Test(priority=3)
public void verifyaddNewPriority()
{
	CheckPriority p=PageFactory.initElements(driver, CheckPriority.class);
	p.addNewPriority();
}


@Test(priority=4)
public void verifyclickOnAdd() throws InterruptedException
{
	CheckPriority p=PageFactory.initElements(driver, CheckPriority.class);
	p.clickOnAdd();
}
}

