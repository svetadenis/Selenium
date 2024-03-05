package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_NextBaseCRM {
    public static void main(String[] args) {

        //1. Open Chrome browser
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com
        driver.get("https://login1.nextbasecrm.com");

        //3 -Find a search box
        WebElement LoginInput = driver.findElement(By.name("USER_LOGIN"));

        //4-Enter incorrect username into the username field: "incorrect"
         LoginInput.sendKeys("incorrect");

        //5-Enter incorrect passsword into the password field: "incorrect"
        WebElement PasswordInput = driver.findElement(By.name("USER_PASSWORD"));

        //6-Enter incorrect password into the username field: "incorrect"
        PasswordInput.sendKeys("incorrect");

        //Find the login button by its ID, name, XPath, or CSS selector
        WebElement loginButton = driver.findElement(By.className("login-btn"));

        // Click on the login button
        loginButton.click();

        //verify error message text is as expected:
        //expected: Incorrect login or password
        // Find the error message element by its ID, name, XPath, or CSS selector
        WebElement errorMessageElement = driver.findElement(By.className("errortext"));

        // Get the text of the error message
        String actualErrorMessage = errorMessageElement.getText();

        // Define the expected error message
        String expectedErrorMessage = "Incorrect login or password";

        // Compare the actual error message with the expected error message
        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message is as expected: " + expectedErrorMessage);
        } else {
            System.out.println("Error message is not as expected. Actual: " + actualErrorMessage + ", Expected: " + expectedErrorMessage);
        }
        // Close the browser
        driver.quit();









        //
    }
}
