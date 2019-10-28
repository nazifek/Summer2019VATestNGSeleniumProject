package com.cybertek.tests.Assignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vytrack {
    /**
     •Go to the login page of VyTrack •
     Enter valid credential (can be any role)•
     Click login button •
     Verify that the user login successfully
     */
    public static void main(String[] args) throws InterruptedException {
        //Go to the login page of VyTrack
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        // Enter valid credential (can be any role)

        WebElement userName=driver.findElement(By.name("_username"));
        userName.sendKeys("user17");
        WebElement passWord=driver.findElement(By.name("_password"));
        passWord.sendKeys("UserUser123");

        //Click login button
        WebElement login=driver.findElement(By.id("_submit"));
        login.click();

        //  Verify that the user login successfully
        String title=driver.getTitle();
        String expectedtitle="Dashboard";
        if (title.equals(expectedtitle)){
            System.out.println("Login successful");
        }else {
            System.out.println("Login unsuccessful");
        }
        Thread.sleep(4000);
        driver.quit();
    }
}
