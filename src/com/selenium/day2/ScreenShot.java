/**
 * 
 */
package com.selenium.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.day1.BaseClass;

/**
 * @author srirama.murthy
 *
 */
public class ScreenShot extends BaseClass{
	
	@Test
	public void getScreenShot() throws IOException {
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\srirama.murthy\\Desktop\\assert.png"));
	}

}
