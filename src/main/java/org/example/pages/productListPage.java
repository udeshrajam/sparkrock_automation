package org.example.pages;

import org.example.utility.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class productListPage extends testBase {

    By dropdown_sort = By.xpath("//*[@id='header_container']/div[2]/div/span/select");
    By productGrid = By.className("inventory_list");
    By lbl_productName = By.cssSelector(".inventory_item_name");

    By btn_shoppingCart = By.xpath("//div[@id='shopping_cart_container']/a");

    List<String> productNames = new ArrayList<>();
    String sortValue;

    public productListPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void dropdownSortOption(String sortBy) throws InterruptedException {
        element = wait.until(ExpectedConditions.elementToBeClickable(dropdown_sort));
        Select select = new Select(element);
        sortValue = sortValue(sortBy);
        select.selectByValue(sortValue);
        Thread.sleep(4000);
    }

    public void verifySortedProductList() {
        WebElement productGridElement = driver.findElement(productGrid);
        productNames.clear();
        List<WebElement> productItems = productGridElement.findElements(lbl_productName);
        for (WebElement productItem : productItems) {
            productNames.add(productItem.getText());
        }

        List<String> expectedOrder = new ArrayList<>(productNames);
        if (sortValue.equals("az")) {
            Collections.sort(expectedOrder);
        } else if (sortValue.equals("za")) {
            Collections.sort(expectedOrder);
            Collections.reverse(expectedOrder);
        }


        System.out.println("UI product list: " + productNames);
        System.out.println("Expected order: " + expectedOrder);
        Assert.assertEquals(productNames, expectedOrder, "Product list is not sorted as expected");
    }

    public void addItemsToCard(String products) throws InterruptedException {
        String [] productList = products.split(",");
        for (String item : productList){
            String formattedId = item.trim().toLowerCase().replace(" ", "-");
            System.out.println("formattedID :" + formattedId);
            WebElement btn_addToCart = driver.findElement(By.id("add-to-cart-"+formattedId));
            btn_addToCart.click();
            Thread.sleep(3000);
        }
    }

    public void shoppingCartButton(){
      element = wait.until(ExpectedConditions.elementToBeClickable(btn_shoppingCart));
      element.click();
    }


    public String sortValue(String sortBy) {
        return switch (sortBy) {
            case "Name (A to Z)" -> "az";
            case "Name (Z to A)" -> "za";
            case "Price (low to high)" -> "lohi";
            case "Price (high to low)" -> "hilo";
            default -> throw new IllegalArgumentException("Invalid sort option: " + sortBy);
        };
    }
}
