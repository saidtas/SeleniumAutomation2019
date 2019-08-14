package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationForChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sait Tas\\Documents\\selenium dependencies\\drivers\\chromedriver.exe") ;
        WebDriver driver=new ChromeDriver();
        driver.get("http://walmart.com") ;
    }
}
