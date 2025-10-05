package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindDemoWebShopElement {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByCssSelector() {

        driver.findElement(By.cssSelector("[href='/register']")); // Register link

        driver.findElement(By.cssSelector("#small-searchterms")); // search input

        driver.findElement(By.cssSelector(".top-menu [href='/books']")); //header-menu('Books')

        driver.findElement(By.cssSelector(".listbox [href='/books']")); //side panel('Books'// )

        driver.findElement(By.cssSelector(".item-box:nth-child(2) .buttons [type='button']")); //'Add to cart' button(first)
    }
}
