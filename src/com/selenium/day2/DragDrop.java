/**
 * 
 */
package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class DragDrop extends BaseClass {
	@Test
	public void dragDrop() {
		driver.get("https://www.facebook.com/");
		WebElement drag=driver.findElement(By.xpath("//i/u[text()='Facebook']"));
		WebElement drop=driver.findElement(By.id("email"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}

}
