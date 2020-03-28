/**
 * 
 */
package com.selenium.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class With_Out_Send_Keys extends BaseClass {
	
@org.testng.annotations.Test	
public void usingJavaScriptExecuter()  {
	
	      driver.get("https://www.facebook.com/");
	      WebElement ele =driver.findElement(By.name("firstname"));
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].value='srinivas'", ele);
	
}

@Test
public void usingRobotClass() throws AWTException {
	
	driver.get("https://www.facebook.com/");
	WebElement ele =driver.findElement(By.name("firstname"));
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_R);
	r.keyRelease(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_SHIFT);
}
}
