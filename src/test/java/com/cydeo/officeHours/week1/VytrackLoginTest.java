package com.cydeo.officeHours.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VytrackLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //1- Setup the "browser driver"
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- Go to "https://vytrack.com"
        driver.get("https://vytrack.com");

    }

    @Test
    public void vytrack_login_test() throws InterruptedException {
//        //1- Setup the "browser driver"
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // 2- Go to "https://vytrack.com"
//        driver.get("https://vytrack.com");

        // 3- Click Login label
        driver.findElement(By.cssSelector("a[href='http://app.vytrack.com']")).click();

        // 4- Login to application with username as "user1" and password as "UserUser123"
        driver.findElement(By.id("prependedInput")).sendKeys("user1");
        driver.findElement(By.cssSelector("input#prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);

        // 5- Verify the title is "Dashboard"
        Thread.sleep(10000);

        Assert.assertEquals(driver.getTitle(),"Dashboard","Title verification failed!");

        // driver.close(); // closing only currently open page/window
        //driver.quit(); // closing all open pages/windows

    }

    @Test
    public void hidden_password_test(){
//      //1- Setup the "browser driver"
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//        // 2- Go to "https://vytrack.com"
//        driver.get("https://vytrack.com");

        // 3- Click Login label
        driver.findElement(By.cssSelector("a[href='http://app.vytrack.com']")).click();

        // 4- Login to application with username as "User1" and password as "UserUser123"
        // 5- Verify the password is hidden
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));

        String actualHiddenPassword = password.getAttribute("type");// it will return value of attribute name
        String expectedHiddenPassword = "password";

        Assert.assertEquals(actualHiddenPassword,expectedHiddenPassword);

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}