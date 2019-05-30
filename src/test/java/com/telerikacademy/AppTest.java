package com.telerikacademy;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void openGoogleSearch()
    {
		System.setProperty("webdriver.gecko.driver", "D:\\Work\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.xpath("//img[@id='hplogo']"));
		driver.close();
    }
}
