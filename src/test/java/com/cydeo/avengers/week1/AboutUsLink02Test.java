package com.cydeo.avengers.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AboutUsLink02Test {

//       ** TC002 As a user I should be able to see the login page
//
//   1- Setup the "browser driver"
//   2- Go to "https://vytrack.com"
//   3- Click "About us" link
//   4- Verify the url contains "about-us"

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //   1- Setup the "browser driver"
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  2- Go to "https://vytrack.com"
        driver.get("https://vytrack.com");
    }

    @Test
    public void verifyUrl() throws InterruptedException {
        //   3- Click "About us" link
        // cssSelector syntax : tagName[attribute='value']
        //                      a[href='https://vytrack.com/about-us/'] -->WE can not use index with css.
        // xpath syntax       : //tagName[@attribute='value']
        //                    : (//a[@href='https://vytrack.com/about-us/'])[1]

        //driver.findElement(By.xpath("(//a[@href='https://vytrack.com/about-us/'])[1] ")).click();

        WebElement aboutUsLink =driver.findElement(By.xpath("(//a[@href='https://vytrack.com/about-us/'])[1] "));
        aboutUsLink.click();

        Thread.sleep(3000);

        //   4- Verify the Url contains "about-us"

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl="about-us";
        Assert.assertTrue(actualUrl.contains(expectedUrl),"About us link url verification failed!");

    }}

