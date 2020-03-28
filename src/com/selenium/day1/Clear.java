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
public class Clear extends BaseClass{
	
	
	@Test
	public void getText() {
	driver.get("https://www.facebook.com/");	
	WebElement ele=	driver.findElement(By.name("firstname"));
	ele.sendKeys("srinivas");
	System.out.println(ele.getText());
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("history.go(0)");

	}


}
