package com.cybertek.tests.d3__webelement_class;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 *Verify URL not changed
 * open browser
 * go to http://practice.cybertekschool.com/forgot_password
 * click on Retrieve password
 * verify that url did not change
 */
public class VerifyURLNotChanged {
    public static void main(String[] args) {

        // open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save the expected url
        String expectedUrl = driver.getCurrentUrl();

        // click on Retrieve password
// WebElement  --> class that represents elements from the webpage
        // findElement --> method used to find element on a page
        // returns a webelement
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
    //click()--> clics element
        retrievePassword.click();

        // verify that url did not change
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }
}
