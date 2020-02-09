/**
 * 
 */
package com.selenium.day1;

/**
 * @author srirama.murthy
 *
 */
public class GetCurrentUrl extends BaseClass {
	@org.testng.annotations.Test
	public void getCurrentUrl() {
		driver.get("https://www.facebook.com/");
        System.out.println(driver.getCurrentUrl());
		
	}

}
