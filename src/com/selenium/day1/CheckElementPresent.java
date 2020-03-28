/**
 * 
 */
package com.selenium.day1;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author srirama.murthy
 *
 */
public class CheckElementPresent extends BaseClass {

	@org.testng.annotations.Test
	public void isElementPresent() {
		
		driver.get("https://www.facebook.com/");
		checkElementNotEmpty();
	}
		
	
	public void checkElementNotEmpty() {
		if(!driver.findElements(By.name("firstname")).isEmpty())
		{
			System.out.println(driver.getTitle());
		}
	}
	
	public void elementPresent() {
		if(driver.findElements(By.name("firstname")).size()!=0)
		{
			String title =driver.getTitle();
			System.out.println(title);
		}
		
		if(driver.findElement(By.name("firstname"))!=null)
		{
			String title =driver.getTitle();
			System.out.println(title);
		}
		
		if(driver.findElements(By.name("firstname")).size()>0)
		{
			String title =driver.getTitle();
			System.out.println(title);
		}
	}
	}
