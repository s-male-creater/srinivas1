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
public class DoubleClick extends BaseClass {
	
	@Test
	public void doubleClick() {
		driver.get("https://www.facebook.com/");
		WebElement doubleClick=driver.findElement(By.xpath("//i/u[text()='Facebook']"));
		Actions act=new Actions(driver);
		act.doubleClick().build().perform();
		

}
}
