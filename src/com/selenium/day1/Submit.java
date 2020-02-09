/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class Submit extends BaseClass {

	@Test
	public void submit() {
	driver.get("https://www.facebook.com/");	
	WebElement ele=	driver.findElement(By.id("u_0_4"));
	ele.submit();

	}
}
