package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderConfirmationPage extends Utils{
    public void verifyOrderisSubmittedOrNot(){
        //confirm order

    String s1 = getTextFromElement(By.cssSelector("div.page-title h1"));
        System.out.println(s1);
        Assert.assertNotEquals(s1,"Build your own computer");
        //print order number
        String s2 = getTextFromElement(By.cssSelector("div.order-number strong"));
        System.out.println(s2);
        //verify if order is submitted and print message
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='section order-completed']/div/strong")),"Order submitted");
}
}
