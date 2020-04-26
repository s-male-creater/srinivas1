package com.orange.Utils;

import cucumber.api.Scenario;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHandle extends Utils {

public int accept(WebDriver driver, Scenario scenario) throws Exception {
    try {
        APP_LOGS.debug("User is able to accept the alert");
        Alert alert=driver.switchTo().alert();
        String alertMessage =alert.getText();
        alert.accept();
        return 1;


    }catch (Exception e)
    {
        APP_LOGS.debug("User is not able to accept the alert :::::::::: "+e);
        getScreenshot(driver,scenario);
        e.printStackTrace();

    }

    return 0;
}



    public int dismiss(WebDriver driver, Scenario scenario) throws Exception {
        try {
            APP_LOGS.debug("User is able to dismiss the alert");
            Alert alert=driver.switchTo().alert();
            String alertMessage =alert.getText();
            alert.dismiss();

            return 1;


        }catch (Exception e)
        {
            APP_LOGS.debug("User is not able to dismiss the alert :::::::::: "+e);
            getScreenshot(driver,scenario);
            e.printStackTrace();

        }

        return 0;
    }

    public int sendKeysInAlert(WebDriver driver,String value, Scenario scenario) throws Exception {
        try {
            APP_LOGS.debug("User is able to send keys into the alert box");
            Alert alert=driver.switchTo().alert();
            String alertMessage =alert.getText();
            alert.accept();
            return 1;


        }catch (Exception e)
        {
            APP_LOGS.debug("User is not able to send keys into the alert box :::::::::: "+e);
            getScreenshot(driver,scenario);
            e.printStackTrace();

        }

        return 0;
    }
}