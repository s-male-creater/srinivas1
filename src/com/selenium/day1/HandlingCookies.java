/**
 * 
 */
package com.selenium.day1;

import java.util.Set;

import org.openqa.selenium.Cookie;

/**
 * @author srirama.murthy
 *
 */
public class HandlingCookies extends BaseClass {
	
	@org.testng.annotations.Test
	public void nameCookies() {
		driver.get("https://www.facebook.com/");
		Set<Cookie> all =driver.manage().getCookies();
		System.out.println(all);
		System.out.println("-----------------------------------------------------------------");
		
		Cookie add=new Cookie("my name is", "srinivasrao");
		driver.manage().addCookie(add);
		
		Set<Cookie> afteradding =driver.manage().getCookies();
		System.out.println(afteradding);
		
		System.out.println("-----------------------------------------------------------------");

		
		

	}

}
