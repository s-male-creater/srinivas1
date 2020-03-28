/**
 * 
 */
package com.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

/**
 * @author srirama.murthy
 *
 */
public class BaseClass {
	
	public WebDriver driver;
	@BeforeClass
	public void name() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\srirama.murthy\\Downloads\\chromedriver_win32 (old)\\chromedriver.exe");
		driver=new ChromeDriver();
		
}

}
