/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;

/**
 * @author srirama.murthy
 *
 */
public class NavigationCommands  extends BaseClass{

	@org.testng.annotations.Test
	public void navigationCommands() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
}
