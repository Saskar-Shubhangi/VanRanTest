package com.vanran.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basepk.BaseClass;
import com.objects.Login;

public class LoginTest extends BaseClass{
	
	@Test(priority = 0)
    public void LoginGrade1()throws InterruptedException {
        Login tr1 = PageFactory.initElements(driver,Login.class);
        tr1.login();
    }
	
	

}
