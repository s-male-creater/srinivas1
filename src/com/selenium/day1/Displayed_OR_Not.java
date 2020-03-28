/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author srirama.murthy
 *
 */
public class Displayed_OR_Not extends BaseClass{
	
	@org.testng.annotations.Test
	public void isDisplayed() {
		
		driver.get("https://www.facebook.com/");
		WebElement ele =driver.findElement(By.name("websubmit"));
		if(ele.isEnabled())
		{
			System.out.println("test case pass");
		}else
		{
			System.out.println("test case fail");
		}
		
		if(ele.isDisplayed())
		{
			System.out.println("test case pass");
		}else
		{
			System.out.println("test case fail");
		}
		
		if(ele.isDisplayed())
		{
			System.out.println("test case pass");
		}else
		{
			System.out.println("test case fail");
		}
		
	}

}
