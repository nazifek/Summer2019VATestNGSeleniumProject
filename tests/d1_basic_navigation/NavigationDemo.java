package com.cybertek.tests.d1_basic_navigation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://cybertekschool.com/");
        Thread.sleep(1000);
        driver.navigate().to("https://amazon.com");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        //driver.navigate().back();-->goes back to previous page
        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        //driver.navigate().refresh();-->reloads the current page
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

    }
}