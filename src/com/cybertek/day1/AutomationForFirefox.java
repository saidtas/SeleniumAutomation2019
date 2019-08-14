package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationForFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sait Tas\\Documents\\selenium dependencies\\drivers\\geckodriver.exe") ;
        WebDriver driver=new FirefoxDriver();
        driver.get("http://amazon.com") ;
       // Thread.sleep(millis;3000) ;  //
        driver.close();
    }
}
