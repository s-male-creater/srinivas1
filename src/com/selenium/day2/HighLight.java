/**
 * 
 */
package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class HighLight extends BaseClass {
	
	@Test
	public void highLight() {
		
		driver.get("https://www.facebook.com/");
		
	WebElement ele =	driver.findElement(By.name("firstname"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);

}
	
	public void highLight_Method(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);

	}
	@Test
	public void customFuction() {
	
	driver.get("https://www.facebook.com/");
	WebElement ele =	driver.findElement(By.name("firstname"));
	highLight_Method(driver, ele);
		
		
	}

}
