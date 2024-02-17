package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {
       // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //   2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3. Verify URL contains Expected: cydeo
        String expectedInURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedInURL)) {
            System.out.println("URL verification passed!");

        }else{
            System.out.println("URL verification failed!");
        }
        // 4. Verify title: Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();//returns "Practice"

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is passed!");
        }else{
            System.out.println("Title verification is failed!");
        }



    }
}


/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
 */