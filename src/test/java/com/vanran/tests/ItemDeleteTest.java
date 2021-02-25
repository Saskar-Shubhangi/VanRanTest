package com.vanran.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basepk.BaseClass;
import com.objects.ItemDelete;
import com.objects.Login;
import com.objects.PriorityDelete;

public class ItemDeleteTest extends BaseClass {
	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();

	}
	
	@Test(priority = 1 )
	public void verifyclickOnApplicationSetting() throws InterruptedException {

		ItemDelete id = PageFactory.initElements(driver, ItemDelete.class );
		id.clickOnApplicationSetting();
	}
	
	@Test(priority = 2 )
	public void verifyclickOnItems()  {

		ItemDelete id = PageFactory.initElements(driver, ItemDelete.class );
		id.clickOnItems();
	}
	
	@Test(priority = 2 )
	public void verifyclickOnDelete() throws InterruptedException  {

		ItemDelete id = PageFactory.initElements(driver, ItemDelete.class );
		id.clickOnDelete();
	}
	

}
