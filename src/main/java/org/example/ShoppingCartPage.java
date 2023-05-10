package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    private By _printName = By.className("product-name");
    public void confirmTheProductInShoppingCart(){
        String expectedResult = "Leica T-Mirrorless Digital Camera";
        //print product name which is in cart
        String actualResult = getTextFromElement(_printName);
        System.out.println("Product in Cart is => " + actualResult);
        //check if actual result is same as expected
        Assert.assertEquals(actualResult, expectedResult, "Same Product in cart");
    }
    public void verifyBuildYourOwnComputerIsAddedToCart(){
        //verify product in cart
        if(driver.findElement(By.cssSelector("a.product-name")).isDisplayed()) {
            String text = getTextFromElement(By.cssSelector("a.product-name"));
            System.out.println(text);
        }else{
            System.out.println("Product is not in shopping cart");
        }
    }
    public void clickOnTermsAndConditionsAndCheckout(){
        //click on terms and conditions
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        //click on ckeckout
        clickOnElement(By.xpath("//button[@id='checkout']"));
    }
}
