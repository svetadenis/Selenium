package com.cydeo.avengers.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

import static com.cydeo.utilities.Driver.driver;


public class AboutUsLink01Test {


    public static void main(String[] args) {

    //    1-open a Chrome browser
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //    2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //    3-verify "About us" is displayed
        WebElement aboutUsLink = driver.findElement(By.linkText("About us"));

        if(aboutUsLink.isDisplayed()) {
            System.out.println("About us text verification passed");

        }else{
            System.out.println("About us text verification failed");
        }
//driver.close();
        driver.quit();
}}

// TC001 As a user I should be able to see Login label is displayed
//


