package com.vanran.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.basepk.BaseClass;
import com.objects.Login;
import com.objects.Translations;
import com.objects.UsersRepNameMappingEdit;

public class TranslationsTest extends BaseClass {
	
	
	@Test(priority = 0)
	public void verifyLogin() throws InterruptedException {

		Login login1 = PageFactory.initElements(driver, Login.class);
		login1.login();
 
	}
	
	@Test(priority=1)
	public void verifyclickOnDebug()
	{
		Translations t=PageFactory.initElements(driver, Translations.class);
	t.clickOnDebug();
	}

	@Test(priority=2)
	public void verifyclickOnTranslations() 
	{
		Translations t=PageFactory.initElements(driver, Translations.class);
	t.clickOnTranslations();
	}
	
	@Test(priority=3)
	public void verifyclickOnRootDomain()
	{
		Translations t=PageFactory.initElements(driver, Translations.class);
	t.clickOnRootDomain();
	}
	
	@Test(priority=4)
	public void verfyclickOnCustomer()  
	{
		Translations t=PageFactory.initElements(driver, Translations.class);
	t.clickOnCustomer();
	}
	
	
	@Test(priority=5)
	public void verfyclickOnDialedForm() throws InterruptedException
	{
		Translations t=PageFactory.initElements(driver, Translations.class);
	t.clickOnDialedForm();
	}
	
	       
	        
	        
	        
	      
	        
	       
	        

	        
	        
	}


