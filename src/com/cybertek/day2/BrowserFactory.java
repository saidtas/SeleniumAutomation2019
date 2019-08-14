package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browser){
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sait Tas\\Documents\\selenium dependencies\\drivers\\chromedriver.exe") ;
            return new ChromeDriver() ;

        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Sait Tas\\Documents\\selenium dependencies\\drivers\\geckodriver.exe") ;
            return new FirefoxDriver() ;

        } else {
           return null;
        }

    }

}
