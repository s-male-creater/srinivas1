/**
 * 
 */
package com.selenium.day14;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class DropDown extends BaseClass {

	@Test
	public void dropDown() {
		driver.get("https://www.facebook.com/");
		WebElement day =driver.findElement(By.id("day"));
		Select select=new Select(day);
		WebElement first =select.getFirstSelectedOption();
		System.out.println("get the first selected option :"+first.getText());
		List<WebElement> all =select.getAllSelectedOptions();
		System.out.println(all.size());
		
	   List<WebElement> allOptions=	select.getOptions();
	   System.out.println(allOptions.size());
	   
	   select.selectByIndex(0);
	   select.deselectByValue("2");
	   select.selectByVisibleText("4");	
	   
	   FirefoxProfile pr=new FirefoxProfile();
	   pr.setAcceptUntrustedCertificates(true);
	
	   driver.manage().window().maximize();
	   
	   Dimension d=new Dimension(100, 2000);
	   driver.manage().window().setSize(d);
	   driver.manage().window().getSize().getHeight();
	   driver.manage().window().getSize().getWidth();
	   
	   
	}
}
