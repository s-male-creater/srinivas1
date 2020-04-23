package com.switchCase;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public WebDriver driver;
	@Before
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
     @org.junit.Test
	public void switchToWindow() {
		  
		  driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		  driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		  
		  Set<String> list =driver.getWindowHandles();
		  Iterator<String> itr=list.iterator();
		  String main=  itr.next();
		  String child =itr.next();
		  String child1=itr.next();
		  if (!main.equals(child)) {
			  driver.switchTo().window(child);
			  System.out.println("child window page title ::::::::::"+driver.getTitle());
			  driver.switchTo().window(main);
			  System.out.println("main window page title :::::::::: " +driver.getTitle());
			  driver.switchTo().window(child1);
			  System.out.println("child window page title ::::::::::"+driver.getTitle());
			
		}
		
		
	}
	
	
}
