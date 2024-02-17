package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class BasicNavigations {
    public static void main(String[] args) throws Throwable{
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create instance of Chrome browser
        WebDriver driver = new ChromeDriver();
        //method to maximize the window of the screen
        driver.manage().window().maximize();

        //method full screen
        driver.manage().window().fullscreen();

        //Go to tesla.com
        driver.get("https://www.tesla.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//driver.getCurrentUrl() = https://www.tesla.com/


        //use navigate back() to go back
        driver.navigate().back();

        //stop execution for 1 src
        Thread.sleep(1000);

        //use navigate forward () to go forward
        driver.navigate().forward();

        //stop execution for 1 src
        Thread.sleep(1000);

        //user navigate the page using navigate.refresh();
        driver.navigate().refresh();

        //navigate to google.com using navigate ().to();
        driver.navigate().to("http://www.google.com");

        //use .getCurrentUrl method to print out current URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());



        //get title of the page
        //we get a title in a google page, not in a tesla page, because
        //we used driver.getTitle().method after google page
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = "+currentTitle);
        /*
        driver.getCurrentUrl() = https://www.google.com/
        driver.getTitle() = Google
        currentTitle = Google
         */

        //closes only the currently focused window
        driver.close();

        //closing all-of-the opened browsers
        //end of the session.
        driver.quit();
        //the sessionID will be different after this command to begin something new





    }
}
