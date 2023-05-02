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
}
