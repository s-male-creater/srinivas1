/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class WithOutSendKeys extends BaseClass {
	
	@Test
	public void withOutSendKeyst() {
	driver.get("https://www.facebook.com/");	
	WebElement ele=	driver.findElement(By.id("firstname"));
	//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
	JavascriptExecutor JS = (JavascriptExecutor)driver;
	// To enter username
	JS.executeScript("document.getElementById(‘User').value='srinivas'");


	}


}
