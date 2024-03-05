package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Locators_GetText_GetAttribute_Practice {
    public static void main(String[] args) {


//1.Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//2. Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//3. Verify "remember me" label text as expected:
//Expected: Remember me on this computer

        //Find the element that contains the "remember me" label text
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        // Get the text of the "remember me" label
        String actualLabelText = rememberMeLabel.getText();

        // Define the expected label text
        String expectedLabelText = "Remember Me on this cumputer";

        // Compare the actual label text with the expected label text
        if (actualLabelText.equals(expectedLabelText)) {
            System.out.println("Label text is as expected: " + expectedLabelText);
        } else {
            System.out.println("Label text is not as expected. Actual: " + actualLabelText + ", Expected: " + expectedLabelText);
        }

//4. Verify "forgot password" link text is as expected

// Find the element that contains the "forgot password" link text
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

// Get the text of the "forgot password" link
        String actualLinkText = forgotPasswordLink.getText();

// Define the expected link text
        String expectedLinkText = "Forgot your password?";

// Compare the actual link text with the expected link text
        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link text is as expected: " + expectedLinkText);
        } else {
            System.out.println("Link text is not as expected. Actual: " + actualLinkText + ", Expected: " + expectedLinkText);
        }

//5.Verify "forgot password" href attribute's value contains expected
        //Expected: forgot_password=yes
// Find the element that represents the "forgot password" link
        WebElement forgotPasswordLink2 = driver.findElement(By.className("login-link-forgot-pass"));

// Get the value of the href attribute of the "forgot password" link
        String hrefAttributeValue = forgotPasswordLink.getAttribute("href");

// Define the expected value of the href attribute
        String expectedHrefValue = "forgot_password=yes";

// Check if the href attribute's value contains the expected value
        if (hrefAttributeValue.contains(expectedHrefValue)) {
            System.out.println("Href attribute's value contains the expected value: " + expectedHrefValue);
        } else {
            System.out.println("Href attribute's value does not contain the expected value. Actual: " + hrefAttributeValue);
        }

// Close the browser
        driver.quit();


    }
}
/*
Label text is not as expected. Actual: Remember me on this computer, Expected: Remember Me on this cumputer
Link text is not as expected. Actual: FORGOT YOUR PASSWORD?, Expected: Forgot your password?
Href attribute's value contains the expected value: forgot_password=yes
 */