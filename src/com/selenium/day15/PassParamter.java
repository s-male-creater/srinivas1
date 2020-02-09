/**
 * 
 */
package com.selenium.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class PassParamter extends BaseClass{

	@Parameters({"firstname","lastname"})
	@Test
	public void passParamter(String first,String last) {
		
		driver.get("https://www.facebook.com/");
	WebElement firstname=	driver.findElement(By.name("firstname"));
	WebElement lastname =driver.findElement(By.name("lastname"));
	firstname.sendKeys(first);
	lastname.sendKeys(last);
	}
}
