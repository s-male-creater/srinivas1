/**
 * 
 */
package com.selenium.day2;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class ReadJS extends BaseClass {
	
	@Test
	public void getTitle() {
		driver.get("https://www.facebook.com/");
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		String title = (String)JS.executeScript("return document.title");
		System.out.println("Title of the webpage : " + title);

	}

}
