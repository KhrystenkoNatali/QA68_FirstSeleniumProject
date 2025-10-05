package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class hwTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementsByDifferentTags() {
        // 1. <a> — links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("1) <a> count: " + links.size());

        // 2. <img> — images
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("2) <img> count: " + images.size());

        // 3. <input> — form inputs
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("3) <input> count: " + inputs.size());

        // 4. <button> — buttons
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("4) <button> count: " + buttons.size());

        // 5. <div> — containers
        List<WebElement> divs = driver.findElements(By.tagName("div"));
        System.out.println("5) <div> count: " + divs.size());

        // 6. <h1> — main headers
        List<WebElement> h1 = driver.findElements(By.tagName("h1"));
        System.out.println("6) <h1> count: " + h1.size());

        // 7. <h2> — subheaders
        List<WebElement> h2 = driver.findElements(By.tagName("h2"));
        System.out.println("7) <h2> count: " + h2.size());

        // 8. <li> — list items
        List<WebElement> listItems = driver.findElements(By.tagName("li"));
        System.out.println("8) <li> count: " + listItems.size());

        // 9. <label> — labels for inputs
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        System.out.println("9) <label> count: " + labels.size());

        // 10. <span> — inline text elements
        List<WebElement> spans = driver.findElements(By.tagName("span"));
        System.out.println("10) <span> count: " + spans.size());
    }

    @Test
    public void findElementsByCssSelector_HW() {
        // 1) top menu items
        List<WebElement> s1 = driver.findElements(By.cssSelector("ul.top-menu > li > a"));
        System.out.println("1) top-menu > li > a: " + s1.size());

        // 2) header links (login/register/cart etc.)
        List<WebElement> s2 = driver.findElements(By.cssSelector("div.header-links a"));
        System.out.println("2) header-links a: " + s2.size());

        // 3) product cards
        List<WebElement> s3 = driver.findElements(By.cssSelector("div.product-item"));
        System.out.println("3) .product-item: " + s3.size());

        // 4) product titles (links)
        List<WebElement> s4 = driver.findElements(By.cssSelector(".product-item .product-title a"));
        System.out.println("4) .product-title a: " + s4.size());

        // 5) price blocks
        List<WebElement> s5 = driver.findElements(By.cssSelector(".product-item .prices"));
        System.out.println("5) .prices: " + s5.size());

        // 6) text inputs
        List<WebElement> s6 = driver.findElements(By.cssSelector("input[type='text']"));
        System.out.println("6) input[type='text']: " + s6.size());

        // 7) email inputs (newsletter/search if any)
        List<WebElement> s7 = driver.findElements(By.cssSelector("input[type='email']"));
        System.out.println("7) input[type='email']: " + s7.size());

        // 8) buttons (native <button> or input buttons)
        List<WebElement> s8 = driver.findElements(By.cssSelector("button, input[type='button'], input[type='submit']"));
        System.out.println("8) buttons: " + s8.size());

        // 9) footer links
        List<WebElement> s9 = driver.findElements(By.cssSelector("div.footer a"));
        System.out.println("9) footer a: " + s9.size());

        // 10) images (png/jpg)
        List<WebElement> s10 = driver.findElements(By.cssSelector("img[src$='.png'], img[src$='.jpg']"));
        System.out.println("10) images: " + s10.size());
    }

    @Test
    public void findElementsByXPath_HW() {

        // 1) all menu links
        List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='top-menu']//a"));
        System.out.println("1) menu links: " + menu.size());

        // 2) product blocks
        List<WebElement> products = driver.findElements(By.xpath("//div[contains(@class,'product-item')]"));
        System.out.println("2) products: " + products.size());

        // 3) product titles
        List<WebElement> titles = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        System.out.println("3) titles: " + titles.size());

        // 4) prices
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        System.out.println("4) prices: " + prices.size());

        // 5) add-to-cart buttons
        List<WebElement> addButtons = driver.findElements(By.xpath("//input[@value='Add to cart']"));
        System.out.println("5) add-to-cart buttons: " + addButtons.size());

        // 6) footer links
        List<WebElement> footer = driver.findElements(By.xpath("//div[@class='footer']//a"));
        System.out.println("6) footer links: " + footer.size());

        // 7) images
        List<WebElement> images = driver.findElements(By.xpath("//img[contains(@src,'.jpg') or contains(@src,'.png')]"));
        System.out.println("7) images: " + images.size());

        // 8) search field
        List<WebElement> search = driver.findElements(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("8) search field: " + search.size());

        // 9) newsletter email input
        List<WebElement> email = driver.findElements(By.xpath("//input[@id='newsletter-email']"));
        System.out.println("9) email field: " + email.size());

        // 10) category links (sidebar)
        List<WebElement> categories = driver.findElements(By.xpath("//div[@class='block block-category-navigation']//a"));
        System.out.println("10) category links: " + categories.size());
    }


}
