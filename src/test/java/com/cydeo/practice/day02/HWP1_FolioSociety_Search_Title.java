package com.cydeo.practice.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP1_FolioSociety_Search_Title {

        public static void main(String[] args) {
            //HWP #1: Folio Society Title Verification
            //1. Open Chrome browser
            //Setting up our chromedriver using WebDriverManager
            //WebDriverManager.chromedriver().setup();

            //Creating a new ChromeDriver and storing it in "driver"
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            //2. Go to https://www.foliosociety.com/usa
            driver.get("https://www.foliosociety.com/usa");

            //3. Search for “folio society”
            WebElement searchBox = driver.findElement(By.id("search"));

            searchBox.sendKeys("Dune" + Keys.ENTER);

            //4. Verify title:
            //Expected: “dune"
            String expectedTitle = "dune";
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



