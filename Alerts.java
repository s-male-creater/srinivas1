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
public class Alerts extends BaseClass {

	//static Alert alert;
	@org.testng.annotations.Test(enabled = false)
	public void handlingAlerts() {
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement element =driver.findElement(By.name("proceed"));
		element.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("srinivas");;
		alert.accept();
		
	}
	@org.testng.annotations.Test(enabled = false)
	public void checkAlertPresent() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement element =driver.findElement(By.name("proceed"));
		element.click();
		
		Alert alert =new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent());
		if(alert!=null)
		{
			String text =alert.getText();
			System.out.println(text);
		}
		
	}
	
	public static void resolveAlert(WebDriver driver, boolean accept) {
		
		if(accept)
		{
			driver.switchTo().alert().accept();;
		}else
		{
			driver.switchTo().alert().dismiss();
		}
		
	}
	
	private static boolean isAlertPresent(WebDriver driver, int timeout) {
	    try {
	        Alert a = new WebDriverWait(driver, timeout).until(ExpectedConditions.alertIsPresent());
	        if (a != null) {
	            return true;
	        } else {
	            throw new TimeoutException();
	        }
	    } catch (TimeoutException e) {
	        // log the exception;
	        return false;
	    }
	
}
	
	@org.testng.annotations.Test
	public static void resolveAllAlerts() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement element =driver.findElement(By.name("proceed"));
		element.click();
	    isAlertPresent(driver, 30);
	    String value =driver.switchTo().alert().getText();
	    System.out.println(value);	
	    resolveAlert(driver, true);
	}
	
	
}
