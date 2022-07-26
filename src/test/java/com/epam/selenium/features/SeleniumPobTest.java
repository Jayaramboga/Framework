package com.epam.selenium.features;

import com.epam.pom.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumPobTest {
    WebDriver driver;
    @BeforeTest
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void testWithoutPOM()
    {
        driver.get("https://www.selenium.dev/");
        //step-1
        WebElement documentation=driver.findElement(By.linkText("Documentation"));
        documentation.click();
        //step-2
        WebElement downloads=driver.findElement(By.linkText("Downloads"));
        downloads.click();
        //step-3
        WebElement webDriverEleme= driver.findElement(By.xpath("//a[text()='WebDriver']"));
        webDriverEleme.click();
    }
    @Test
    public  void testWithPOM()
    {
        // Home Page-documenatation  & downloads
       String actualValue = new HomePage(driver)
               .clickOnDocumentationLink()
               .verifyingThatWearOnDocumentationPage();
              Assert.assertEquals(actualValue,"Documentation");
    }


}

