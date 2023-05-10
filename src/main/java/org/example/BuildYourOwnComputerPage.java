package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BuildYourOwnComputerPage extends Utils{
    public void addDetails(){
        //click on product
        selectElementValue(By.id("product_attribute_1"),"1");
        //select ram
        selectElementByText(By.id("product_attribute_2"),"8GB [+$60.00]");
        //click on checkbox
        clickOnElement(By.xpath("(//input[@name='product_attribute_3'])[1]"));
        clickOnElement(By.xpath("//input[@id='product_attribute_4_9']"));
        clickOnElement(By.xpath("//input[@id='product_attribute_5_10']"));
        clickOnElement(By.xpath("//input[@id='product_attribute_5_11']"));
        clickOnElement(By.xpath("//input[@id='product_attribute_5_12']"));
    }
    public void addProductToCart(){
        //click on add to cart
        clickOnElement(By.xpath("//button[@type='button']"));
    }
    public void clickOnShoppingCart(){
        //go to shopping cart
        clickOnElement(By.partialLinkText("shopping cart"));
    }
}
