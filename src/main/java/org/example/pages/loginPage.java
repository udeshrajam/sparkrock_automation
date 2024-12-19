package org.example.pages;

import org.example.utility.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage extends testBase {

    By txt_username = By.id("user-name");

    By txt_password = By.id("password");

    By btn_login = By.id("login-button");

    By btn_hamburger = By.id("react-burger-menu-btn");

    By btn_logout = By.id("logout_sidebar_link");


    public loginPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void userNameTextField(String userType) throws InterruptedException {
        element = wait.until(ExpectedConditions.presenceOfElementLocated(txt_username));
        element.sendKeys(getUserName(userType));
        Thread.sleep(3000);
    }

    public void passwordTextField() throws InterruptedException {
        element = wait.until(ExpectedConditions.presenceOfElementLocated(txt_password));
        element.sendKeys(config().getProperty("password"));
        Thread.sleep(3000);
    }

    public void loginButton() throws InterruptedException {
        element = wait.until(ExpectedConditions.elementToBeClickable(btn_login));
        element.click();
        Thread.sleep(3000);
    }

    public void userLogout(){
        element = wait.until(ExpectedConditions.elementToBeClickable(btn_hamburger));
        element.click();
        element =  wait.until(ExpectedConditions.elementToBeClickable(btn_logout));
        element.click();
    }


    private String getUserName(String userType){
        String username = null;
        switch (userType){
            case "problem user" ->{
                username = config().getProperty("problem_user");
            }
            case "standard user"-> {
                username = config().getProperty("standard_user");
            }
        }
        return username;
    }
}
