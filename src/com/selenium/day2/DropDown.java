/**
 * 
 */
package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class DropDown extends BaseClass{
	
	@Test
	public void selectElement() {
		
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.id("day"));
		Select select=new Select(day);
		select.selectByIndex(1);
		select.selectByValue("6");
		select.selectByVisibleText("4");
		
	}

}
