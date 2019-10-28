package com.cybertek.tests.d3__webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class d3_vcm_Practice {
    public static void main(String[] args) {
     /*
    Verify confirmation message
            open browser
            go to http://practice.cybertekschool.com/forgot_password
            enter any email
            verify that email is displayed in the input box
            click on Retrieve password
            verify that confirmation message says 'Your e-mail's been sent!'
     */
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("nazifekorkut@gmail.com");
        String expectedEmail="nazifekorkut@gmail.com";
        String actualEmail=emailInput.getAttribute("value");
        if (expectedEmail.equals(actualEmail)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        System.out.println("===========");
        WebElement retrievePassword=driver.findElement(By.id("form_submit"));
        retrievePassword.click();
        String confMsg="Your e-mail's been sent!";
        WebElement messageElement=driver.findElement(By.name("confirmation_message"));
        String actualMsg=messageElement.getText();
        if (confMsg.equals(actualMsg)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Expected message "+confMsg);
            System.out.println("Actual message "+actualMsg);
        }
        driver.quit();
    }
}
