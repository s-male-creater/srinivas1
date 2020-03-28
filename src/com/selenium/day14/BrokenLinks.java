/**
 * 
 */
package com.selenium.day14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class BrokenLinks extends BaseClass {
	
	@Test
	public void broken() throws IOException {
		driver.get("https://www.facebook.com/");
	    List<WebElement> list=	driver.findElements(By.tagName("a"));
	    System.out.println(list.size());
	    
	    for(WebElement all : list)
	    {	
	   String allvalues= 	all.getAttribute("href");
	   verifyLinks(allvalues);
	   
	    }
	}
	public void verifyLinks(String url) throws IOException {
		URL newUrl=new URL(url);
		
		HttpURLConnection conn=(HttpURLConnection)newUrl.openConnection();
		if(conn.getResponseCode()==200)
		{
			System.out.println(newUrl +" = "+conn.getResponseMessage());
		}if(conn.getResponseCode()==404)
		{
			System.out.println(newUrl + " = "+conn.getResponseMessage());
		}
		
	}

}
