package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class AutomationForOpera {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver", "C:\\Users\\Sait Tas\\Documents\\selenium dependencies\\drivers\\operadriver.exe") ;
        WebDriver w =new OperaDriver();
        w.get("http://amazon.com");
    }
}
