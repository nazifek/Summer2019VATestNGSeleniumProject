package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();  // bu line onemli every time we want to open
        // without it we get exception

        // webDriver represent browser
        WebDriver driver = new ChromeDriver(); //  this is selenium // import edilmedigi icin kirmizi

    }
}
