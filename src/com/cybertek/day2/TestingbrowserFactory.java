package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

public class TestingbrowserFactory {
    public static void main(String[] args) {
        WebDriver driver=BrowserFactory.getDriver("chrome") ;
        driver.manage().window().maximize();  //  driver.manage  has some attributes like maximizing the window etc ..

        driver.get("http://practice.cybertekschool.com/");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        String actualTitle=driver.getTitle();
        String expectedTitle="Practice" ;
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
            System.out.println("Expected title :"+ expectedTitle);
            System.out.println("Actual title :"+actualTitle);
        }
        driver.close();
    }

}
