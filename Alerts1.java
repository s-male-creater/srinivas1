/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * @author srirama.murthy
 *
 */
public class Alerts1 extends BaseClass {

	@org.testng.annotations.Test
	public void getAlert() throws InterruptedException {
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		
		WebElement ele =driver.findElement(By.xpath("//button[contains(text(),'Generate Alert')]"));
		
		for(int i=0; i<=4; i++)
		{
			ele.click();
		}
		
		
		/*
		 * WebElement ele1
		 * =driver.findElement(By.xpath("//button[contains(text(),'Generate C')]"));
		 * ele1.click();
		 */
		
		/*
		 * Alert alert=driver.switchTo().alert(); System.out.println(alert.getText());
		 * alert.accept();
		 */
		
		
		
		
	}
}
