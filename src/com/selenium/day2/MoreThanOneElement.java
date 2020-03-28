/**
 * 
 */
package com.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class MoreThanOneElement extends BaseClass {
	
	@Test
	public void more_Than_One_Element() {
		
		driver.get("https://www.facebook.com/");
		List<WebElement> list =driver.findElements(By.xpath("//label[contains(text(),'a')]"));
		System.out.println(list.size());
		
		for(WebElement all: list)
		{
			System.out.println(all.getText());
		}
		
	}

}
