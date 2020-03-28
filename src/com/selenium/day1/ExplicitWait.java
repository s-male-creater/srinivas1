/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class ExplicitWait extends BaseClass {
	
	
	@Test
	public void explicitWait() {
	driver.get("https://www.facebook.com/");	
	WebElement ele=	driver.findElement(By.name("firstname"));
	new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
	ele.sendKeys("srinivas");
	}

}
