/**
 * 
 */
package com.selenium.day1;

/**
 * @author srirama.murthy
 *
 */
public class Maximize extends BaseClass {
	@org.testng.annotations.Test
	public void maximize() {
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

}
