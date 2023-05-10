package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ShippingPage extends Utils{
    public void selectShippingOptionAndClickOnContinue(){
        //select shipping option
        clickOnElement(By.xpath("(//input[@name='shippingoption'])[2]"));
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
    }
}
