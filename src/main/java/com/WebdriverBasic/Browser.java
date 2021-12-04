package com.WebdriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();

        driver.close();
    }
}
