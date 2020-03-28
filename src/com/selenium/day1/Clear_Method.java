/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author srirama.murthy
 *
 */
public class Clear_Method  extends BaseClass{
	
	@org.testng.annotations.Test
	public void clear() {
		
		driver.get("https://www.facebook.com/");
		
		/*
		 * WebElement ele =driver.findElement(By.name("firstname"));
		 * ele.sendKeys("srinivas"); ele.clear(); ele.sendKeys("male");
		 * ele.sendKeys(Keys.CONTROL+"a"); ele.sendKeys(Keys.BACK_SPACE);
		 
		 */
		
		WebElement ele =driver.findElement(By.name("firstname"));
		
		driver.navigate().refresh();
		driver.navigate().to(driver.getCurrentUrl());
		driver.get(driver.getCurrentUrl());
		ele.sendKeys(Keys.F5);
		ele.sendKeys(Keys.CONTROL+"r");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		
	}

}
