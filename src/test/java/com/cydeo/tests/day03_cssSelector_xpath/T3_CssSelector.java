package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class T3_CssSelector {
    public static void main(String[] args) {
//TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        String expectedLoginText = "Log In";

        //Locating loginButton using class attribute's value
        //WebElement loginButton = driver.findElement(By.className("login-btn"));

        //                                  tagName[attribute='value']

        //Locating loginButton using cssSelector using type attribute's value
        //WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        //Locating loginButton using cssSelector using class attribute's value
        //WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        //Locating loginButton using cssSelector using value attribute's value
        //WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        //Locating loginButton using cssSelector using class attribute's value
        //                                        tagName.classValue
        WebElement loginButton = driver.findElement(By.cssSelector("input.login-btn"));


        String actualLoginText = loginButton.getAttribute("value"); //--> Log In

        if (actualLoginText.equals(expectedLoginText)){
            System.out.println("Log In button text verification PASSED!");
        }else {
            System.out.println("Log In button text verification FAILED!");
        }


    }
}
