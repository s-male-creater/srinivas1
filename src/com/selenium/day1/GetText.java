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
public class GetText extends BaseClass {
	
	@Test
	public void getText() {
	driver.get("https://www.facebook.com/");	
	WebElement ele=	driver.findElement(By.xpath("//label[text()='Email or Phone']"));
	System.out.println(ele.getAttribute("for"));

	}

}
