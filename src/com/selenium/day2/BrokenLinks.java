/**
 * 
 */
package com.selenium.day2;

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
	public void brokenLinks() throws IOException {
		
		driver.get("https://www.facebook.com/");
		List<WebElement> list =driver.findElements(By.tagName("a"));
		for(WebElement brokenLinks : list)
		{
			String all=brokenLinks.getAttribute("href");
			verifyBrokenLinks(all);
		}
		
	}
	public void verifyBrokenLinks(String url) throws IOException {
		
		URL url1=new URL(url);
		HttpURLConnection httpConn=(HttpURLConnection)url1.openConnection();
		httpConn.connect();
		if(httpConn.getResponseCode()==200)
		{
			System.out.println(url+" - "+httpConn.getResponseMessage());
		}
		if(httpConn.getResponseCode()==httpConn.HTTP_NOT_FOUND)
		{
			System.out.println(url+" - "+httpConn.getResponseMessage() + "  - " + httpConn.HTTP_NOT_FOUND);
		}	
	}
}
