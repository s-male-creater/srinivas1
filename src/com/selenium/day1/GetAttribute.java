/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class GetAttribute extends BaseClass {

	
	@Test
	public void getAttribute() {
	driver.get("https://www.facebook.com/");	
	Cookie cookie=new Cookie("name", "srinivas");
	driver.manage().addCookie(cookie);
	driver.manage().deleteCookie(cookie);
	driver.manage().deleteCookieNamed("name");
	driver.manage().deleteAllCookies();
	
	
	}
}
