/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class PressEnter  extends BaseClass {
	
	
	@Test
	public void enter() {
	driver.get("https://www.facebook.com/");	
	WebElement ele=	driver.findElement(By.name("firstname"));
	ele.sendKeys(Keys.ENTER);

	}

}
