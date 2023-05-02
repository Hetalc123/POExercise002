package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    private By _clickOnCameraAndPhoto = By.xpath("//img[@alt='Picture for category Camera & photo']");
    private By _clickOnAddToCart = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    private By _getTextFromCamera = By.partialLinkText("Leica T Mirrorless Digital Camera");
    private By _clickOnShoppingCart = By.partialLinkText("shopping cart");
    public void addProductToCart(){
        //click on camera and photo
        clickOnElement(_clickOnCameraAndPhoto);
        //click on add to art
        clickOnElement(_clickOnAddToCart);
        //print name of product
        String name1 = getTextFromElement(_getTextFromCamera);
        System.out.println("Product added in cart is => " + name1);
        //go to shopping cart
        clickOnElement(_clickOnShoppingCart);
    }
}
