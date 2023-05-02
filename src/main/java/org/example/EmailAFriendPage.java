package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EmailAFriendPage extends Utils{
    private By _typeFriendEmail = By.className("friend-email");
    private By _typeYourEmail = By.className("your-email");
    private By _clickOnSend = By.name("send-email");
    private By _errorMessage =By.xpath("//div[@class='message-error validation-summary-errors']/ul/li");
    private By _printMessage = By.xpath("//div[@class='result']");

    public void emilAFriend(){
        //type friend's email
        typeText(_typeFriendEmail, "hh123@gmail.com");
        //clear emai field
        WebElement email = driver.findElement(_typeYourEmail);
        email.clear();
        //type email
        typeText(_typeYourEmail, "myfirstauto"+datestamp()+"@gmail.com");
        clickOnElement(_clickOnSend);
    }
    public void printAnErrorMessage(){
        String expectedResult = "only Registered user can refer a product to friend";
        //print error message
        String actualResult = getTextFromElement(_errorMessage);
        System.out.println("Error message is: " + actualResult);
        //check if actual result is same as expected
        Assert.assertEquals(actualResult, expectedResult, "Email sent to friend");
    }
}
