package com.cybertek.tests.d3__webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    /*
    Verify confirmation message
            open browser
            go to http://practice.cybertekschool.com/forgot_password
            enter any email
            verify that email is displayed in the input box
            click on Retrieve password
            verify that confirmation message says 'Your e-mail's been sent!'
     */
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInput= driver.findElement(By.name("email"));
        emailInput.sendKeys("xierin_liebe@hotmail.com");
        String expectedEmail="xierin_liebe@hotmail.com";

        //verify that email is displayed in the input box
        //getAttribute("value") --> get text from input box
        String actualEmail=emailInput.getAttribute("value");
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected email "+expectedEmail);
            System.out.println("Actual email "+actualEmail);
        }


        WebElement retrievePassword =driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        //verify that confirmation message says 'Your e-mail's been sent!'
        String ConMsg="Your e-mail's been sent!";
        WebElement messageElement=driver.findElement(By.name("confirmation_message"));
        String actualMsg=messageElement.getText();
        if(ConMsg.equals(actualMsg)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected message "+ConMsg);
            System.out.println("Actual message "+actualMsg);
        }

        driver.quit();


    }
}
