package com.basepk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {

	
	
	public static WebDriver driver;
    public static Properties prop;
		
		public BaseClass() {
	        try {
	            prop = new Properties();
	            FileInputStream IP = new FileInputStream("C:\\Users\\shubhangi.saskar\\Desktop\\Eclipse Project\\ScreenTestCases\\src\\main\\java\\com\\properties\\config.properties");
	           
	            prop.load(IP);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
		
		@BeforeSuite

		 

	    public void OpenBrowserGrade() throws InterruptedException {
	        String browser = prop.getProperty("Browser");
	        if (browser.equals("chrome")) {

	 

	            // System.setProperty("webdriver.chrome.driver", currentDirectory +
	            // "\\Driver\\chromedriver.exe");
	            System.setProperty("webdriver.chrome.driver",
	                    "C:\\Users\\shubhangi.saskar\\Desktop\\chromedriver.exe");

	 

	            driver = new ChromeDriver();
	            driver.get(prop.getProperty("URL"));
	            Thread.sleep(5000);

	 

	            System.out.println("Chrome browser is opened successfully");

	 

	        }
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	 

	        Thread.sleep(5000);
	    }

	 

	    @AfterSuite()
	    public void finish() {
	        driver.quit();
	    }
	    
	    public void highlightElement(WebDriver driver, WebElement element) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
}

		
}
