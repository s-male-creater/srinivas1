/**
 * 
 */
package com.selenium.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class FindElement_And_FindElements extends BaseClass{
	@Test
	public void findElement() {
	driver.get("https://www.facebook.com/");
	WebElement all=	driver.findElement(By.xpath("//input[@type='text']"));
	all.sendKeys("srinivas");
	System.out.println(all.getAttribute("name"));
	List<WebElement> list=driver.findElements(By.xpath("//input[@type='text1']"));
	for(WebElement elements : list)
	{
		System.out.println(elements.getText());
		elements.getCssValue("color");
		elements.getCssValue("background-color");
		elements.getCssValue("font-size");
		elements.getCssValue("letter-spacing");
		elements.getCssValue("text-align");
		elements.getCssValue("border");
		elements.getCssValue("border-botton");
		elements.getCssValue("border-color");
		elements.getCssValue("border-left");
		elements.getCssValue("border-right");
		
		
	}
		
	
	
	}

}
