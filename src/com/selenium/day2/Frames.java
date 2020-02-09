/**
 * 
 */
package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class Frames extends BaseClass {
	@Test
	public void switchFrames() {
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		driver.switchTo().frame("iframeResult");
	    WebElement ele=	driver.findElement(By.xpath("//h1[contains(text(),'This')]"));
	    System.out.println(ele.getText());
		
		
	}

}
