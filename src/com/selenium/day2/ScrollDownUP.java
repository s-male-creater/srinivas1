 /**
 * 
 */
package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class ScrollDownUP extends BaseClass {
	@Test
	public void scrollDown() {
		
		driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.xpath("//i/u[text()='Facebook']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", link);
		
	}
	
	@Test
	public void scrollUp() {
		
		driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.xpath("//i/u[text()='Facebook']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,0)", link);
		
	}

}
