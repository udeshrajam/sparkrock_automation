package org.example.pages;

import org.example.utility.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class checkoutPage extends testBase {

    By btn_checkout = By.id("checkout");

    By txt_firstName = By.id("first-name");

    By txt_lastName = By.id("last-name");

    By txt_postalCode = By.id("postal-code");

    By btn_continue = By.id("continue");

    By btn_finish = By.id("finish");

    Random random = new Random();
    public checkoutPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void checkoutButton(){
        element = wait.until(ExpectedConditions.elementToBeClickable(btn_checkout));
        element.click();
    }

    public void textBoxLastName(){
        element = wait.until(ExpectedConditions.presenceOfElementLocated(txt_lastName));
       element.sendKeys("Automation LastName" + RandomNumber());
    }

    public void textBoxPostalCode(){
        element = wait.until(ExpectedConditions.presenceOfElementLocated(txt_postalCode));
        element.sendKeys(String.valueOf(RandomNumber()));
    }

    public void textBoxFirstName(){
        element = wait.until(ExpectedConditions.presenceOfElementLocated(txt_firstName));
        element.sendKeys("Automation FirstName" + RandomNumber());
    }

    public void clickContinueButton(){
        element = wait.until(ExpectedConditions.elementToBeClickable(btn_continue));
        element.click();
    }

    public void clickFinishButton(){
        element = wait.until(ExpectedConditions.elementToBeClickable(btn_finish));
        element.click();
    }
    public int RandomNumber(){
        return  random.nextInt(100);
    }
}
