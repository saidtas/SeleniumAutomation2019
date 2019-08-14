package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationForEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Sait Tas\\Documents\\selenium dependencies\\drivers\\MicroSoftWebDriver.exe");
        WebDriver driver = new EdgeDriver() ;
        driver.get("https://www.microsoft.com");
        driver.close();
    }
}
