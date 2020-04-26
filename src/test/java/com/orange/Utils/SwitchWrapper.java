package com.orange.Utils;

import cucumber.api.Scenario;
import org.openqa.selenium.JavascriptExecutor;

public class SwitchWrapper extends Utils {

Scenario scenario;
String handle;

        public int switchWindow(String value,Scenario scenario) throws Exception {
            try {
                handle=driver.getWindowHandle();
                if (value!="N/A")
                {
                  String str=  "window.open(\""+value+"\",'_blank');";
                    System.out.println("The value of "+str);
                    ((JavascriptExecutor)driver).executeScript(str);
                }
                Thread.sleep(5000);
                for (String handle1:driver.getWindowHandles()) {

                    if (!handle1.equalsIgnoreCase(handle))
                    {
                        driver.switchTo().window(handle1);
                        return 1;
                    }

                }
            }catch (Exception e)
            {
               APP_LOGS.debug("User is not able to switch window"+value+"::::::::::"+e);
               getScreenshot(driver,scenario);
               e.printStackTrace();
            }
            return 0;
        }
}
