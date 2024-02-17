package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4_Class_Locator_Practice {
    public static void main(String[] args) throws InterruptedException {
        //HWP #4: Practice Cydeo – Class locator practice
        //PS: Locate “Home” link using “className” locator

        //1- Open a Chrome browser
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        //Locating the "Home" link web element
        //WebElement homeLink = driver.findElement(By.linkText("Home"));
        WebElement homeLink = driver.findElement(By.className("nav-link"));

        //click to the link
        Thread.sleep(1000);
        homeLink.click();

        //4- Verify title is as expected:
        // Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }
    }
}