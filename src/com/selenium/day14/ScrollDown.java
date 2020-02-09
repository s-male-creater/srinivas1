/**
 * 
 */
package com.selenium.day14;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class ScrollDown  extends BaseClass{

	@Test
	public void reSize() {
		
		driver.get("https://www.facebook.com/");
		Dimension d=new Dimension(500, 500);
		driver.manage().window().setSize(d);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	
	
	@Test
	public void scrollUp() {
		
		driver.get("https://www.facebook.com/");
		
		Dimension d=new Dimension(500, 500);
		driver.manage().window().setSize(d);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,0)");
		
	}
	
	
	
}
