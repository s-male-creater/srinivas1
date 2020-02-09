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
public class MouseHover extends BaseClass {
	
	@Test
	public void name() {
		driver.get("https://www.amazon.in/");
		WebElement best=driver.findElement(By.xpath("//a[contains(text(),'Best')]"));
		WebElement gift=driver.findElement(By.xpath("//a[contains(text(),'Gift Ideas')]"));
		WebElement newR=driver.findElement(By.xpath("//a[contains(text(),'New')]"));
		Actions action=new Actions(driver);
		action.moveToElement(best).build().perform();
		action.moveToElement(gift).build().perform();
		action.moveToElement(newR).build().perform();


		
	}

}
