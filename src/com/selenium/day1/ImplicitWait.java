/**
 * 
 */
package com.selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class ImplicitWait extends BaseClass {
	
	@Test
	public void implicitWait() {
		
	driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement username=	driver.findElement(By.name("firstname"));
	username.sendKeys("srinivas");
	
	
	

		
	}

}
