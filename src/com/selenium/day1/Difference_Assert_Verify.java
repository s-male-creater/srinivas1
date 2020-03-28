/**
 * 
 */
package com.selenium.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class Difference_Assert_Verify extends BaseClass {
	
	@Test
	public void Using_Assert() throws IOException {
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\srirama.murthy\\Desktop\\assert.png"));
	}
	
    @Test
	public void Using_Verify() throws IOException {
		String actualTitle="Facebook – log in or sign up";
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		
		if(actualTitle.equals(title))
		{
			System.out.println("Test case pass");
		}else
		{
			System.out.println("test case fail");
		}
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\srirama.murthy\\Desktop\\verify.png"));
	}

}
