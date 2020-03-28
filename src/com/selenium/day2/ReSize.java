/**
 * 
 */
package com.selenium.day2;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class ReSize extends BaseClass {
	
	@Test
	public void reSize() {
		driver.get("https://www.facebook.com/");
		Dimension d=new Dimension(500, 500);
		driver.manage().window().setSize(d);

	}

}
