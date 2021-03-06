package com.evaluation.automation.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class EvaluatuinUITest {

    public WebDriver driver;
    @Test

    public void main() {

        // Find the element that's ID attribute is 'account'(My Account)

        driver.findElement(By.id("account")).click();

        // Find the element that's ID attribute is 'log' (Username)

        // Enter Username on the element found by above desc.

        driver.findElement(By.id("log")).sendKeys("testuser_1");

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

        driver.findElement(By.id("pwd")).sendKeys("Test@123");

        // Now submit the form. WebDriver will find the form for us from the element

        driver.findElement(By.id("login")).click();

        // Print a Log In message to the screen

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

        // Find the element that's ID attribute is 'account_logout' (Log Out)

        driver.findElement(By.id("account_logout"));

    }

    @BeforeTest
    public void beforeMethod() {

        // Create a new instance of the Firefox driver
        driver = new HtmlUnitDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

       driver.get("https://www.google.com/?gws_rd=ssl");
       // driver.navigate().to("https://www.o2.co.uk/");

    }

    @AfterMethod
    public void afterMethod() {

        // Close the driver

        driver.quit();

    }
}


