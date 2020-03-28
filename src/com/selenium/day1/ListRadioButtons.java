/**
 * 
 */
package com.selenium.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author srirama.murthy
 *
 */
public class ListRadioButtons extends BaseClass {
	
	@org.testng.annotations.Test
	public void nameCookies() {
		driver.get("https://www.facebook.com/");
	List<WebElement> list=	driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'sex')]"));
	
	int size=list.size();
	System.out.println(size);
	
	for(int i=0; i<size; i++)
	{
	boolean isChecked=	list.get(i).isSelected();
	if(!isChecked)
	{
		
	}
	}
	}

}
