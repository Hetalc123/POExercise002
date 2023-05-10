package org.example;

import org.openqa.selenium.By;

public class CheckoutPage extends Utils{
    public void clickOnCheckoutAsGuest(){
        //click on checkout
        clickOnElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']"));
    }
}
