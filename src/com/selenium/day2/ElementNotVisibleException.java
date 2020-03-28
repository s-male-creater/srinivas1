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
public class ElementNotVisibleException  extends BaseClass {
	@Test
	public void ElementNotVisible() {
		
		driver.get("https://navyuginfo.com/strategies-interact-dynamic-web-elements-using-selenium/");
		WebElement button =driver.findElement(By.xpath("//a[contains(text(),'December 2017')]"));
		
		System.out.println(button.getText());
		
	}

}
