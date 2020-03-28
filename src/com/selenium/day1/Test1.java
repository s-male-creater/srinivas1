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
public class Test1 extends BaseClass {
	
	@Test(enabled = false)
	public void hidden() {
		
		driver.get("file:///C:/Users/srirama.murthy/Desktop/max.html");
		WebElement ele =driver.findElement(By.id("demo-div"));
		System.out.println(ele.getAttribute("innerHTML"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("return arguments[0].innerHTML", ele);
		System.out.println(ele.getAttribute("textContent"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("return arguments[0].textContent", ele);
	}
	
	@Test
	public void java() {
		
		driver.get("https://www.facebook.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.getElementsByName('reg_email_confirmation__').value='sreema@gmail.com'");
        
        
		
	}

}
