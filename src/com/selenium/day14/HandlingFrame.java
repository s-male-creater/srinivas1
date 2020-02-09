/**
 * 
 */
package com.selenium.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class HandlingFrame extends BaseClass {

	@Test
	public void handlingFrame() throws InterruptedException {
	
	driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
	WebElement ele =driver.findElement(By.xpath("//frame[contains(@src,'overview-frame.html')]"));

	driver.switchTo().frame(ele);
    WebElement el1 =	driver.findElement(By.xpath("(//a[contains(text(),'thoughtworks')])[1]"));
    el1.click();
	//System.out.println(ele.getText());
    
    driver.switchTo().defaultContent();
    Thread.sleep(5000);
    driver.switchTo().frame("classFrame");
  WebElement span=  driver.findElement(By.name("//span[text()='Packages']"));
  span.click();
	
}
}
