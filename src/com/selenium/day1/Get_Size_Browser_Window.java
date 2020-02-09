/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

/**
 * @author srirama.murthy
 *
 */
public class Get_Size_Browser_Window  extends BaseClass

{
	@org.testng.annotations.Test
	public void getBrowserWindow() {
		driver.get("https://www.facebook.com/");
		int height=driver.manage().window().getSize().height;
		int width=driver.manage().window().getSize().width;
		
		System.out.println(height);
		System.out.println(width);
		
	int he=	driver.manage().window().getSize().getHeight();
	int wd=driver.manage().window().getSize().getWidth();
	
	System.out.println(he);
	System.out.println(wd);
		
driver.manage().window().setSize(new Dimension(1000, 1000));

	}


}
