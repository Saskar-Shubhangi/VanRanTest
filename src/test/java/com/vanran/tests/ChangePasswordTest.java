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
import com.objects.ChangePassword;
import com.objects.Login;

public class ChangePasswordTest extends BaseClass {
	
	@Test(priority = 0)
    public void LoginGrade1()throws InterruptedException {
        Login tr1 = PageFactory.initElements(driver,Login.class);
        tr1.login();
    }
	
	
	@Test(priority = 1)
    public void verifychangePassword()throws InterruptedException {
        
        ChangePassword cp = PageFactory.initElements(driver, ChangePassword.class);
        cp.changePassword();
        
        
    }
	}
	

