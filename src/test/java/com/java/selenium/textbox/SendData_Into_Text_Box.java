package com.java.selenium.textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SendData_Into_Text_Box {

    public WebDriver driver;

    @BeforeTest
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\srirama.murthy\\Downloads\\chromedriver_win32 (old)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void byUsingSendKeys()
    {
         driver.findElement(By.name("firstname")).sendKeys("srinivas");

    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
