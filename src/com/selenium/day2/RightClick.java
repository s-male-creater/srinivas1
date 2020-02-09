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
public class RightClick extends BaseClass {

	@Test
	public void rightClick() {
		driver.get("https://www.facebook.com/");
		WebElement rightClick=driver.findElement(By.xpath("//i/u[text()='Facebook']"));
		Actions act=new Actions(driver);
		act.contextClick(rightClick).build().perform();
		

}
}
