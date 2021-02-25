package com.vanran.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileTest {

@Test
	
	public void uploadfile() throws InterruptedException, IOException {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhangi.saskar\\Desktop\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get(" http://172.30.1.130:8002");
	        Thread.sleep(2000);
	        WebElement Email = driver.findElement(By.id("mat-input-0"));
	        WebElement Password = driver.findElement(By.id("mat-input-1"));
	        WebElement LOGIN = driver.findElement(By.xpath(
	        		"/html/body/app/horizontal-layout-1/div/div/div/div/content/login/div/div/div/form/button"));
	        Email.sendKeys("Admin1@admin.com");
	        Password.sendKeys("Test@123");
	        LOGIN.click();
	        Thread.sleep(20000);
	        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	        
	        WebElement search = driver.findElement(By.id("mat-select-0"));//finding the web element using name locator
	        search.sendKeys(new String[]{"Ribbon_KBS"});
	       // elem.submit();
	        Thread.sleep(2000);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        Actions actions1 = new Actions(driver);
	        WebElement uploadElement = driver.findElement(By.xpath("\r\n"
	        		+ "/html/body/app/horizontal-layout-1/div/div/div/div/content/app-dashboard/div/div[2]/div[2]/div/form/div/div[1]/div[2]/span"));
	        uploadElement.click();
	        Runtime.getRuntime().exec("C:\\Users\\shubhangi.saskar\\Desktop\\Autoit\\UploadFiles.exe");
	        
	        
		      
	       
	        
	        Thread.sleep(2000);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	}        

}
