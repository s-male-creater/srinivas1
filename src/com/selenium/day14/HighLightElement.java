/**
 * 
 */
package com.selenium.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class HighLightElement extends BaseClass {
	@Test
	public void highLight() {	
	driver.get("https://www.facebook.com/");
	WebElement firstname =driver.findElement(By.name("firstname"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('style','background:yellow; border:12px solid:red;')", firstname);
	}

}
