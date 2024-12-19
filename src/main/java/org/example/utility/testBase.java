package org.example.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.util.Properties;

public class testBase {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebElement element;



    public Properties config(){
        Properties properties = new Properties();
        try {
            FileInputStream inputFile = new FileInputStream("src/main/resources/config.properties");
            properties.load(inputFile);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return properties;
    }
}
