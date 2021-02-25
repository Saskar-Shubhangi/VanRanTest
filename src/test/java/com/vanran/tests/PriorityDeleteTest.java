package com.vanran.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basepk.BaseClass;
import com.objects.CheckPriority;
import com.objects.Login;
import com.objects.PriorityDelete;
import com.objects.PriorityUpdate;

public class PriorityDeleteTest extends BaseClass {
	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();

	}
	
	@Test(priority = 1 )
	public void verifyclickOnApplicationSetting() throws InterruptedException {

		PriorityDelete pd = PageFactory.initElements(driver, PriorityDelete.class );
		pd.clickOnApplicationSetting();
	}
	
	@Test(priority = 2 )
	public void verifyclickOnPriority() throws InterruptedException {

		PriorityDelete pd = PageFactory.initElements(driver, PriorityDelete.class);
		pd.clickOnPriority();
	}
	
	@Test(priority = 3 )
	public void verifyclickOnDelete() throws InterruptedException {

		PriorityDelete pd = PageFactory.initElements(driver, PriorityDelete.class);
		pd.clickOnDelete();
	}
	
	
	}
	


