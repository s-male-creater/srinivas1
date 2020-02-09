/**
 * 
 */
package com.selenium.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class WebBasedPopUp  extends BaseClass{
	@Test
	public void webBasedPopUp() {
		
		driver.get("https://www.tsrtconline.in/oprs-web/");
	    WebElement button=	driver.findElement(By.id("searchBtn"));
	    button.click();
	    
	    Alert alert=driver.switchTo().alert();
	    
	       System.out.println(alert.getText());
	       alert.accept();
	}

}
