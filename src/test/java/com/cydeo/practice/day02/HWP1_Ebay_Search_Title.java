package com.cydeo.practice.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP1_Ebay_Search_Title {

        public static void main(String[] args) {
            //HWP #1: Ebay Title Verification
            //1. Open Chrome browser
            //Setting up our chromedriver using WebDriverManager
            //WebDriverManager.chromedriver().setup();

            //Creating a new ChromeDriver and storing it in "driver"
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            //2. Go to https://www.ebay.com
            driver.get("https://www.ebay.com");

            //3. Search for “folio society”
            WebElement searchBox = driver.findElement(By.id("gh-ac"));

            searchBox.sendKeys("folio society" + Keys.ENTER);

            //4. Verify title:
            //Expected: “Wooden spoon - Etsy”
            String expectedTitle = "folio society for sale";
            String actualTitle = driver.getTitle();

            //create a simple if condition to compare our actual and expected titles
            if (actualTitle.equals(expectedTitle)){
                System.out.println("Etsy title verification PASSED!");
            }else{
                System.out.println("Etsy title verification FAILED!!!");
            }

            //close the browser
            driver.close();
        }
    }

