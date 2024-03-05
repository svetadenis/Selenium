package com.cydeo.officeHours.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VytrackLoginPage {

    public static void main(String[] args) throws InterruptedException {

        //1- Setup the "browser driver"
        // selenium 3 versions had to have WebDriverManager for setting up browser type
        // WebDriverManager.chromedriver().setup();

        // Selenium 4 versions coming with setting up browser type automatically,
        // that is why we don't have to use WebDriverManager with using selenium 4 versions
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2- Go to "https://vytrack.com"
        driver.get("https://vytrack.com");

        // 3- Click Login label
        WebElement login = driver.findElement(By.linkText("LOGIN"));
        //xpath
        WebElement login2 = driver.findElement(By.xpath("//a[text()='LOGIN']"));
        login.click();

        //Thread.sleep is coming from Java and using whatever you passed in method
        Thread.sleep(3000);


        // 4- Verify the title contains "Login"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }

    }}