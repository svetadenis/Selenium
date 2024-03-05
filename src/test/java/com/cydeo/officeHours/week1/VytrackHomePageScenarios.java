package com.cydeo.officeHours.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class VytrackHomePageScenarios {

        WebDriver driver; // declare globally

        @BeforeClass
        public void TestSetUp(){
            // instantiate the object here
            driver = new ChromeDriver();
            // common steps that are valid for all test cases in this class
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // handling synchronization issues
            driver.get("https://vytrack.com");
        }
        @AfterClass
        public void TestTearDown(){
            driver.quit();
        }

        @Test(priority = 1)
        public void MainPageElementsTest(){
            // verify Home, About us, Our Approach, Products and Services, Contact and LOGIN labels are displayed
            List<String> expectedMenuItems = new ArrayList<>(Arrays.asList("Home", "About us", "Our Approach", "Products and Services", "Contact", "LOGIN"));

            // I need to locate the menu items with a single locator that represents all of them

            List<WebElement> menuItemElements = driver.findElements(By.cssSelector("ul#top-menu>li>a"));

            List<String> actualMenuItems = new ArrayList<>();

            for (WebElement menuItemElement : menuItemElements) {
                actualMenuItems.add(menuItemElement.getText());
            }

            //  System.out.println("expectedMenuItems = " + expectedMenuItems);
            //  System.out.println("actualMenuItems = " + actualMenuItems);

            Assert.assertEquals(actualMenuItems,expectedMenuItems,"Menu Items Do NOT match expected");
        }
        @Test(priority = 2)
        public void LoginLinkTest()  {
            // Verify the title contains "Login" after we click login link
            // Locate login link
            driver.findElement(By.linkText("LOGIN")).click();

            String actualTitle = driver.getTitle();
            String expectedTitle = "Login";

            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);

            String actualURL = driver.getCurrentUrl();

            Assert.assertTrue(actualURL.contains("login"));

            Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

        }



    }

