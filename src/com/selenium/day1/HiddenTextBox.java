/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class HiddenTextBox extends BaseClass

{
	@org.testng.annotations.Test
	public void Hidden_Text_Box_Problem() {
	
	driver.get("https://www.facebook.com/");
	WebElement reconform_email=	driver.findElement(By.name("reg_email_confirmation__"));
	reconform_email.sendKeys("sr@gmail.com");
		
	}
	
	@org.testng.annotations.Test
	public void Hidden_Text_Box_solution1() {	
	driver.get("https://www.facebook.com/");
	WebElement email=	driver.findElement(By.name("reg_email__"));
	email.sendKeys("sr@gmail.com");
	WebElement reconform_email=	driver.findElement(By.name("reg_email_confirmation__"));
	reconform_email.sendKeys("sr@gmail.com");
		
	}
	
	
	
}
