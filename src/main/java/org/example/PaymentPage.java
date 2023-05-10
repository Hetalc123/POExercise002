package org.example;

import org.openqa.selenium.By;

public class PaymentPage extends Utils{
    public void selectPaymentOption(){
        //select payment method
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        clickOnElement(By.xpath("(//button[@name='save'])[2]"));
    }
}
