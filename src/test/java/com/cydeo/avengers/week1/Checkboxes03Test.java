package com.cydeo.avengers.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

    public class Checkboxes03Test {
//    **  TC003: As a user I should be able to click checkboxes
//
//  1-Setup and open a Chrome browser
//  2-goto https://practice.cydeo.com/
//  3-click Checkboxes
//  4-verify title equals Checkboxes
//  5-click Checkbox 1
//  6-verify the Checkbox 1 is selected
//  7-click Checkbox 2
//  8-verify the Checkbox 2 is not selected

        WebDriver driver;

        @BeforeMethod
        public void setup(){
            //  1-Setup and open a Chrome browser
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @Test
        public void verifyCheckboxesSelection (){

            //  2-goto https://practice.cydeo.com/
            driver.get("https://practice.cydeo.com/");

            //  3-click Checkboxes
            driver.findElement(By.linkText("Checkboxes")).click();

            //  4-verify title equals Checkboxes
            Assert.assertEquals(driver.getTitle(),"Checkboxes");

            //  5-click Checkbox 1
            WebElement checkbox1 = driver.findElement(By.id("box1"));
            checkbox1.click();

            //  6-verify the Checkbox 1 is selected
            Assert.assertTrue(checkbox1.isSelected(),"checkbox1 is not selected!");

            //  7-click Checkbox 2
            WebElement checkbox2 = driver.findElement(By.cssSelector("#box2"));
            checkbox2.click();

            //  8-verify the Checkbox 2 is not selected
            Assert.assertTrue(!checkbox2.isSelected(), "checkbox2 is selected");
            //Assert.assertFalse(checkbox2.isSelected(), "checkbox2 is selected");

        }
    }

