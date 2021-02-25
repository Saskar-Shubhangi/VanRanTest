package com.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepk.BaseClass;

public class CheckPriority extends BaseClass{

	
	@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'Priority')])[1]")
	WebElement Priority;
	
	@FindBy(xpath="//span[contains(text(),'ADD NEW')]")
	WebElement ADDNEW;
	
	@FindBy(id="mat-select-10")
			 
	WebElement drop;
	
	@FindBy(xpath="//mat-option/span[contains(text(),'High')]")
	WebElement drop1;
	
	@FindBy(xpath="(//div[@class='mat-form-field-infix'])[3]")
	WebElement severity;
	
	@FindBy(xpath="//span[contains(text(),' 1 ')]")
	WebElement one;
	
    @FindBy(xpath="(//div[@class='mat-select-value'])[4]")
    WebElement status;
    
    @FindBy(xpath="/html/body/div[3]/div[4]/div/div/div/mat-option[1]/span")
    WebElement closed;
    
    @FindBy(xpath="//input[@id='mat-input-2']")
    WebElement colour;
    
    @FindBy(xpath="//input[@id='mat-input-3']")
    WebElement StartRange;
    
    @FindBy(xpath="//input[@id='mat-input-4']")
    WebElement EndRange;
    
    @FindBy(xpath="//input[@id='mat-input-5']")
    WebElement Order ;
    
  
	
    
    @FindBy(xpath="(//span[contains(text(),'Add')])[2]")
    WebElement Add;
    
   public void clickOnApplicationSetting()
   {

   	WebDriverWait wait = new WebDriverWait(driver, 60);
       wait.until(ExpectedConditions.visibilityOf(ApplicationSetting));
   	ApplicationSetting.click(); 
   }
   
   public void clickOnPriority() throws InterruptedException
   {
	  // Priority.click();
	   JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].click()", Priority);
	   //Thread.sleep(5000);
   }
   
   public void addNewPriority()
   {
	   ADDNEW.click();
   }
   
    public void addPriority() throws InterruptedException
    {
    	
    	 highlightElement(driver, drop);
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].click()", drop);
    	 //drop.click();
    	 Thread.sleep(3000);
    	 
    	 js.executeScript("arguments[0].click()", drop1);
    	 Thread.sleep(3000);
    	 //drop1.click();
    	 severity.click();
    	 one.click();
    	 
    	 highlightElement(driver, status);
    	 status.click();
    	 closed.click();
    	 colour.click();
    	 colour.clear();
    	colour.sendKeys("#e52b2b");
    	StartRange.sendKeys("120");
    	EndRange.sendKeys("220");
    	Order.sendKeys("2");
    	
    }
    

   public void clickOnAdd() throws InterruptedException
   {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", Add);
        Thread.sleep(2000);
    	
    }
    
    
    
	
    
}
