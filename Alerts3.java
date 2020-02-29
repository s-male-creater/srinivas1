/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author srirama.murthy
 *
 */
public class Alerts3 extends BaseClass{

	@org.testng.annotations.Test
	public void chidl() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement element =driver.findElement(By.name("proceed"));
		element.click();
	     isAlertPresent(driver, 30);
	     String str= driver.switchTo().alert().getText();
	     System.out.println(str);
	     switchToAlert(driver, true);	
	}
	
	public static boolean isAlertPresent(WebDriver driver, int timeout) {
	    try {
	        Alert a = new WebDriverWait(driver, timeout).until(ExpectedConditions.alertIsPresent());
	        if (a != null) {
	            return true;
	        } else {
	            throw new TimeoutException();
	        }
	    } catch (TimeoutException e) {
	        // log the exception;
	        
	    }
		return false;	
	}
	
	public void switchToAlert(WebDriver driver, boolean accept) {
		if(accept)
		{
			driver.switchTo().alert().accept();
		}else
		{
			driver.switchTo().alert().dismiss();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
