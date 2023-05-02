package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends Utils{
    private By _clickOnGood = By.xpath("//label[@for='pollanswers-2']");
    private By _clickOnVote = By.xpath("//button[@id='vote-poll-1']");
    private By _errorMessage = By.xpath("//div[@class='poll-vote-error']");
    private By _product1 = By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[3]");
    private By _compareList = By.xpath("//*[@id=\"bar-notification\"]/div/p/a");
    private By _product2 = By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[4]");
    private By _clickOnProduct =By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    private By _electronics = By.xpath("(//a[@title='Show products in category Electronics'])[1]");
    private By _registerButton = By.className("ico-register");
    private By _clickOnLogin = By.className("ico-login");
    private By _totalVote = By.className("poll-total-votes");
    public void communityPoll(){
        //click on good
        clickOnElement(_clickOnGood);
        //click on vote
        clickOnElement(_clickOnVote);
    }
    public void communityPollErrorMessage(){
        String expectedResult = "Non Registered User Cannot Vote";
        //add wait time till print the message
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_errorMessage));
        //get and print the message
        String actualResul = getTextFromElement(_errorMessage);
        System.out.println(actualResul);
        //check if actual result is same as expected
        Assert.assertEquals(actualResul, expectedResult, "Test Fail");
    }
    public void communityPollVoteMessage(){
        String expectedResult = "18 vote(s)";
        String actualResult = getTextFromElement(_totalVote);
        System.out.println(actualResult);
        //check if actual result is same as expected
        Assert.assertEquals(actualResult, expectedResult, "Total votes");
    }
    public void addProductsInCompareList(){
        //add Item 1 in compare list
        clickOnElement(_product1);
        //add wait time
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(_compareList));
        //add another product to compare list
        clickOnElement(_product2);
        //go to compare list
        clickOnElement(_compareList);
    }
    public void clickOnProduct(){
        //click on product
        clickOnElement(_clickOnProduct);
    }
    public void clickOnElectronics(){
     clickOnElement(_electronics);
    }
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnLoginButton(){
        //click on login Button
        clickOnElement(_clickOnLogin);
    }
}
