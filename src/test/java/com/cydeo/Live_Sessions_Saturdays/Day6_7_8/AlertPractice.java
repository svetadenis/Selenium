package com.cydeo.Live_Sessions_Saturdays.Day6_7_8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // 1. Open browser
        // WebDriverManager.chromedriver().setup(); // We have to use in selenium 3
        driver = new ChromeDriver(); // Selenium 4 is already including Webdrivermanager automatically
        // That is why we don't need to setup webdrivermanager
        driver.manage().window().maximize();

        // it is going to give time whenever app. need time for looking/findElement element
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void alert_test() throws InterruptedException {
        // TC : Alert practice
// 1. Open browser
        // WebDriverManager.chromedriver().setup(); // We have to use in selenium 3
//        WebDriver driver = new ChromeDriver(); // Selenium 4 is already including Webdrivermanager automatically
//                                               // That is why we don't need to setup webdrivermanager
//        driver.manage().window().maximize();
//
//        // it is going to give time whenever app. need time for looking/findElement element
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// 2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");

// 3. Click to “Click for JS Prompt” button
        WebElement alertBtn = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        alertBtn.click();

        Thread.sleep(3000);

// 4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());

        alert.sendKeys("hello");
        Thread.sleep(3000);

// 5. Click to OK button from the alert
        alert.accept();

// 6. Verify “You entered: hello” text is displayed.
        WebElement resultText = driver.findElement(By.id("result")); // cssSelector("p#result")

        String actualText = resultText.getText(); // it is coming from selenium
        String expectedText = "You entered: hello"; // it is coming from req.

        Assert.assertEquals(actualText,expectedText,"Text verification failed!");

    }

    @AfterMethod
    public void teardown(){
        driver.quit();

    }
}