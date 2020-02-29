/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author srirama.murthy
 *
 */
public class Alerts4 extends BaseClass{
	
	@org.testng.annotations.Test
	public void chidl() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		int retrives =5;
		while(retrives>0)
		{
			WebElement element =driver.findElement(By.name("proceed"));
			element.click();
			Alert alert=driver.switchTo().alert();
			alert.accept();
			retrives--;
			System.out.println(retrives);
			break;
			
		}
		
		//System.out.println(element.getText());
	
	     
	     
		
	}

}
