/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author srirama.murthy
 *
 */
public class CheckBox extends BaseClass {
	
	public void name() {
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
	WebElement ele=	driver.findElement(By.xpath("//span[@class='control']"));
	
	if(!ele.isSelected())
	{
	

		
		
	}
	}

}
