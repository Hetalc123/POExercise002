package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailSentPage extends Utils{
    private By _printMessage = By.xpath("//div[@class='result']");
    public void printEmailSentMessage(){
        String expectedResult = "Your message has been sent";
//Get the message
        String actualResult = getTextFromElement(_printMessage);
        System.out.println(actualResult);
        //check if actual result is same as expected
        Assert.assertEquals(actualResult, expectedResult, "Refered a friend");
    }
}
