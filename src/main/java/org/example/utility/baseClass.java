package org.example.utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClass extends testBase{


    @Before(order = 0)
    public void browserConfig(){
        switch (config().getProperty("browser")){
            case "chrome" ->{
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                driver = new ChromeDriver(options);
            }
            case "firefox"->{
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions options = new FirefoxOptions();
                driver = new FirefoxDriver(options);
            }
        }
        String baseUrl = config().getProperty("url");
        System.out.println("url: " + baseUrl);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @After
    public void quitBrowser(){
        driver.quit();
    }
}
