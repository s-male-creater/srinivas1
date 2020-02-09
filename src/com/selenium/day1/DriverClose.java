/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;

/**
 * @author srirama.murthy
 *
 */
public class DriverClose extends BaseClass {
	@org.testng.annotations.Test(enabled = false)
	public void driverClose() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Data Policy']")).click();
		driver.close();
		
	}
	
	@org.testng.annotations.Test
	public void driverQuit() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Data Policy']")).click();
		driver.quit();
		
	}
	
	

}
